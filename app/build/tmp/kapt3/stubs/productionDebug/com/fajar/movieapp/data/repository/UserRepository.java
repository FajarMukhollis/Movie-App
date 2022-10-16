package com.fajar.movieapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u000eH&J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH&J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/fajar/movieapp/data/repository/UserRepository;", "", "checkIfUserLoggedIn", "", "checkIsUserLoginValid", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIfUserExists", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByUsername", "getUserId", "registerUser", "Lcom/fajar/movieapp/resource/Resource;", "", "user", "(Lcom/fajar/movieapp/data/local/database/user/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIfUserLogin", "", "userLoggedIn", "setUserId", "updateUser", "app_productionDebug"})
public abstract interface UserRepository {
    
    public abstract boolean checkIfUserLoggedIn();
    
    public abstract void setIfUserLogin(boolean userLoggedIn);
    
    public abstract long getUserId();
    
    public abstract void setUserId(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.lang.Number>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.lang.Number>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkIsUserLoginValid(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getIfUserExists(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.local.database.user.UserEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.local.database.user.UserEntity> continuation);
}