package com.fajar.movieapp.data.local.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/fajar/movieapp/data/local/preference/UserPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "loginKeyValue", "getLoginKeyValue", "()Z", "setLoginKeyValue", "(Z)V", "preference", "Landroid/content/SharedPreferences;", "", "userIdKeyValue", "getUserIdKeyValue", "()J", "setUserIdKeyValue", "(J)V", "Companion", "app_productionDebug"})
public final class UserPreference {
    private final android.content.SharedPreferences preference = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.data.local.preference.UserPreference.Companion Companion = null;
    private static final java.lang.String NAME = "LoginAuth";
    private static final int MODE = android.content.Context.MODE_PRIVATE;
    
    public UserPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean getLoginKeyValue() {
        return false;
    }
    
    public final void setLoginKeyValue(boolean value) {
    }
    
    public final long getUserIdKeyValue() {
        return 0L;
    }
    
    public final void setUserIdKeyValue(long value) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/fajar/movieapp/data/local/preference/UserPreference$Companion;", "", "()V", "MODE", "", "NAME", "", "app_productionDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}