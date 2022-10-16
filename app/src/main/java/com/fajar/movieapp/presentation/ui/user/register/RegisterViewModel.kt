package com.fajar.movieapp.presentation.ui.user.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fajar.movieapp.data.local.database.user.UserEntity
import com.fajar.movieapp.data.repository.UserRepository
import com.fajar.movieapp.data.utils.SingleLiveEvent
import kotlinx.coroutines.launch

class RegisterViewModel(private val repository: UserRepository) : ViewModel() {

    private var _getIfUserExistResult = SingleLiveEvent<Boolean>()
    val getIfUserExistResult: SingleLiveEvent<Boolean> get() = _getIfUserExistResult

    fun registerUser(user: UserEntity) {
        viewModelScope.launch {
            repository.registerUser(user)
        }
    }

    fun getIfUserExist(username: String){
        viewModelScope.launch {
            _getIfUserExistResult.value = repository.getIfUserExists(username)
        }
    }
}