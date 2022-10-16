package com.fajar.movieapp.data.local.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/fajar/movieapp/data/local/preference/UserPreferenceDataSource;", "", "getIfUserLogin", "", "getUserId", "", "setIfUserLogin", "", "userLoggedIn", "setUserId", "id", "app_productionDebug"})
public abstract interface UserPreferenceDataSource {
    
    public abstract boolean getIfUserLogin();
    
    public abstract void setIfUserLogin(boolean userLoggedIn);
    
    public abstract void setUserId(long id);
    
    public abstract long getUserId();
}