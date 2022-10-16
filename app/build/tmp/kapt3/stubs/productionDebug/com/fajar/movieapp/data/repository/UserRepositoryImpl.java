package com.fajar.movieapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J!\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0013H\u0016J;\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u00192\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00182\u0006\u0010!\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001f\u0010\'\u001a\b\u0012\u0004\u0012\u00020 0\u00182\u0006\u0010!\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/fajar/movieapp/data/repository/UserRepositoryImpl;", "Lcom/fajar/movieapp/data/repository/UserRepository;", "userPreferenceDataSource", "Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSource;", "userDataSource", "Lcom/fajar/movieapp/data/local/database/user/UserDataSource;", "(Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSource;Lcom/fajar/movieapp/data/local/database/user/UserDataSource;)V", "checkIfUserLoggedIn", "", "checkIsUserLoginValid", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIfUserExists", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByUsername", "getUserId", "proceed", "Lcom/fajar/movieapp/resource/Resource;", "T", "coroutine", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "", "user", "(Lcom/fajar/movieapp/data/local/database/user/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIfUserLogin", "", "userLoggedIn", "setUserId", "updateUser", "app_productionDebug"})
public final class UserRepositoryImpl implements com.fajar.movieapp.data.repository.UserRepository {
    private final com.fajar.movieapp.data.local.preference.UserPreferenceDataSource userPreferenceDataSource = null;
    private final com.fajar.movieapp.data.local.database.user.UserDataSource userDataSource = null;
    
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.preference.UserPreferenceDataSource userPreferenceDataSource, @org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserDataSource userDataSource) {
        super();
    }
    
    @java.lang.Override()
    public boolean checkIfUserLoggedIn() {
        return false;
    }
    
    @java.lang.Override()
    public void setIfUserLogin(boolean userLoggedIn) {
    }
    
    @java.lang.Override()
    public long getUserId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setUserId(long id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.database.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkIsUserLoginValid(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getIfUserExists(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.local.database.user.UserEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.local.database.user.UserEntity> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object proceed(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> coroutine, kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<T>> continuation) {
        return null;
    }
}