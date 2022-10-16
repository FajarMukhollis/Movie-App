package com.fajar.movieapp.resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0011\u0012\u0013\u0014B1\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\tR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/fajar/movieapp/resource/Resource;", "T", "", "payload", "message", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "getPayload", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Empty", "Error", "Loading", "Success", "Lcom/fajar/movieapp/resource/Resource$Empty;", "Lcom/fajar/movieapp/resource/Resource$Error;", "Lcom/fajar/movieapp/resource/Resource$Loading;", "Lcom/fajar/movieapp/resource/Resource$Success;", "app_productionDebug"})
public abstract class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final T payload = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Exception exception = null;
    
    private Resource(T payload, java.lang.String message, java.lang.Exception exception) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getPayload() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception getException() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/fajar/movieapp/resource/Resource$Success;", "T", "Lcom/fajar/movieapp/resource/Resource;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_productionDebug"})
    public static final class Success<T extends java.lang.Object> extends com.fajar.movieapp.resource.Resource<T> {
        private final T data = null;
        
        public Success(T data) {
            super(null, null, null);
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/fajar/movieapp/resource/Resource$Empty;", "T", "Lcom/fajar/movieapp/resource/Resource;", "data", "(Ljava/lang/Object;)V", "app_productionDebug"})
    public static final class Empty<T extends java.lang.Object> extends com.fajar.movieapp.resource.Resource<T> {
        
        public Empty() {
            super(null, null, null);
        }
        
        public Empty(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u000e\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fajar/movieapp/resource/Resource$Error;", "T", "Lcom/fajar/movieapp/resource/Resource;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "(Ljava/lang/Exception;Ljava/lang/Object;)V", "app_productionDebug"})
    public static final class Error<T extends java.lang.Object> extends com.fajar.movieapp.resource.Resource<T> {
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/fajar/movieapp/resource/Resource$Loading;", "T", "Lcom/fajar/movieapp/resource/Resource;", "data", "(Ljava/lang/Object;)V", "app_productionDebug"})
    public static final class Loading<T extends java.lang.Object> extends com.fajar.movieapp.resource.Resource<T> {
        
        public Loading() {
            super(null, null, null);
        }
        
        public Loading(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
}