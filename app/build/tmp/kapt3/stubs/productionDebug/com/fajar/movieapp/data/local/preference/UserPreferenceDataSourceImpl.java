package com.fajar.movieapp.data.local.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSourceImpl;", "Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSource;", "userPreference", "Lcom/fajar/movieapp/data/local/preference/UserPreference;", "(Lcom/fajar/movieapp/data/local/preference/UserPreference;)V", "getIfUserLogin", "", "getUserId", "", "setIfUserLogin", "", "userLoggedIn", "setUserId", "id", "app_productionDebug"})
public final class UserPreferenceDataSourceImpl implements com.fajar.movieapp.data.local.preference.UserPreferenceDataSource {
    private final com.fajar.movieapp.data.local.preference.UserPreference userPreference = null;
    
    public UserPreferenceDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.local.preference.UserPreference userPreference) {
        super();
    }
    
    @java.lang.Override()
    public boolean getIfUserLogin() {
        return false;
    }
    
    @java.lang.Override()
    public void setIfUserLogin(boolean userLoggedIn) {
    }
    
    @java.lang.Override()
    public void setUserId(long id) {
    }
    
    @java.lang.Override()
    public long getUserId() {
        return 0L;
    }
}