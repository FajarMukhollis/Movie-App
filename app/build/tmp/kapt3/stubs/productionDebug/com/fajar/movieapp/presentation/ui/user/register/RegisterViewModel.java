package com.fajar.movieapp.presentation.ui.user.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/user/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/movieapp/data/repository/UserRepository;", "(Lcom/fajar/movieapp/data/repository/UserRepository;)V", "_getIfUserExistResult", "Lcom/fajar/movieapp/data/utils/SingleLiveEvent;", "", "getIfUserExistResult", "getGetIfUserExistResult", "()Lcom/fajar/movieapp/data/utils/SingleLiveEvent;", "getIfUserExist", "", "username", "", "registerUser", "user", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "app_productionDebug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.movieapp.data.repository.UserRepository repository = null;
    private com.fajar.movieapp.data.utils.SingleLiveEvent<java.lang.Boolean> _getIfUserExistResult;
    
    public RegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.movieapp.data.utils.SingleLiveEvent<java.lang.Boolean> getGetIfUserExistResult() {
        return null;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity user) {
    }
    
    public final void getIfUserExist(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
}