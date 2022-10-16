package com.fajar.movieapp.presentation.ui.user.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/user/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/movieapp/data/repository/UserRepository;", "(Lcom/fajar/movieapp/data/repository/UserRepository;)V", "_updateResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fajar/movieapp/resource/Resource;", "", "_userByIdResult", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "updateResult", "Landroidx/lifecycle/LiveData;", "getUpdateResult", "()Landroidx/lifecycle/LiveData;", "userByIdResult", "getUserByIdResult", "getUserById", "", "id", "", "getUserId", "setIfUserLogin", "userLoggedIn", "", "updateUser", "note", "app_productionDebug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.movieapp.data.repository.UserRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.resource.Resource<java.lang.Number>> _updateResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.data.local.database.user.UserEntity> _userByIdResult = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.resource.Resource<java.lang.Number>> getUpdateResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.data.local.database.user.UserEntity> getUserByIdResult() {
        return null;
    }
    
    public final long getUserId() {
        return 0L;
    }
    
    public final void getUserById(long id) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity note) {
    }
    
    public final void setIfUserLogin(boolean userLoggedIn) {
    }
}