package com.fajar.movieapp.presentation.ui.user.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/user/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/movieapp/data/repository/UserRepository;", "(Lcom/fajar/movieapp/data/repository/UserRepository;)V", "_checkIsUserLoginValid", "Landroidx/lifecycle/MutableLiveData;", "", "_getIfUserExistResult", "_userByUsernameResult", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "checkIsUserLoginValid", "Landroidx/lifecycle/LiveData;", "getCheckIsUserLoginValid", "()Landroidx/lifecycle/LiveData;", "getIfUserExistResult", "getGetIfUserExistResult", "userByUsernameResult", "getUserByUsernameResult", "checkIfUserLoggedIn", "", "username", "", "password", "getIfUserExist", "getUserByUsername", "setIfUserLogin", "userLoggedIn", "setUserId", "id", "", "app_productionDebug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.movieapp.data.repository.UserRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _checkIsUserLoginValid;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _getIfUserExistResult;
    private androidx.lifecycle.MutableLiveData<com.fajar.movieapp.data.local.database.user.UserEntity> _userByUsernameResult;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCheckIsUserLoginValid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getGetIfUserExistResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.data.local.database.user.UserEntity> getUserByUsernameResult() {
        return null;
    }
    
    public final void checkIsUserLoginValid(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void getIfUserExist(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final boolean checkIfUserLoggedIn() {
        return false;
    }
    
    public final void setIfUserLogin(boolean userLoggedIn) {
    }
    
    public final void getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final void setUserId(long id) {
    }
}