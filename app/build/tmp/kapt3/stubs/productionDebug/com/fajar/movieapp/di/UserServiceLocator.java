package com.fajar.movieapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/fajar/movieapp/di/UserServiceLocator;", "", "()V", "provideAppDatabase", "Lcom/fajar/movieapp/data/local/database/AppDatabase;", "context", "Landroid/content/Context;", "provideUserDao", "Lcom/fajar/movieapp/data/local/database/user/UserDao;", "provideUserDataSource", "Lcom/fajar/movieapp/data/local/database/user/UserDataSource;", "provideUserPreference", "Lcom/fajar/movieapp/data/local/preference/UserPreference;", "provideUserPreferenceDataSource", "Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSource;", "provideUserRepository", "Lcom/fajar/movieapp/data/repository/UserRepository;", "app_productionDebug"})
public final class UserServiceLocator {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.di.UserServiceLocator INSTANCE = null;
    
    private UserServiceLocator() {
        super();
    }
    
    private final com.fajar.movieapp.data.local.preference.UserPreference provideUserPreference(android.content.Context context) {
        return null;
    }
    
    private final com.fajar.movieapp.data.local.preference.UserPreferenceDataSource provideUserPreferenceDataSource(android.content.Context context) {
        return null;
    }
    
    private final com.fajar.movieapp.data.local.database.AppDatabase provideAppDatabase(android.content.Context context) {
        return null;
    }
    
    private final com.fajar.movieapp.data.local.database.user.UserDao provideUserDao(android.content.Context context) {
        return null;
    }
    
    private final com.fajar.movieapp.data.local.database.user.UserDataSource provideUserDataSource(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.movieapp.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}