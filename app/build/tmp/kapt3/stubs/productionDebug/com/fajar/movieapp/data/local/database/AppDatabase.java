package com.fajar.movieapp.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.fajar.movieapp.data.local.database.user.UserEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/fajar/movieapp/data/local/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/fajar/movieapp/data/local/database/user/UserDao;", "Companion", "app_productionDebug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.data.local.database.AppDatabase.Companion Companion = null;
    private static final java.lang.String DB_NAME = "noteTaking.db";
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Volatile()
    private static volatile com.fajar.movieapp.data.local.database.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fajar.movieapp.data.local.database.user.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/fajar/movieapp/data/local/database/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Lcom/fajar/movieapp/data/local/database/AppDatabase;", "getINSTANCE", "()Lcom/fajar/movieapp/data/local/database/AppDatabase;", "setINSTANCE", "(Lcom/fajar/movieapp/data/local/database/AppDatabase;)V", "getInstance", "context", "Landroid/content/Context;", "app_productionDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.fajar.movieapp.data.local.database.AppDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        com.fajar.movieapp.data.local.database.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fajar.movieapp.data.local.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}