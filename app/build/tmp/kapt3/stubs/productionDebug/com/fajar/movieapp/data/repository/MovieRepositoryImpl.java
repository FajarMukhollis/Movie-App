package com.fajar.movieapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ;\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0006\"\u0004\b\u0000\u0010\u00122\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/fajar/movieapp/data/repository/MovieRepositoryImpl;", "Lcom/fajar/movieapp/data/repository/MovieRepository;", "dataSource", "Lcom/fajar/movieapp/data/network/datasource/MovieDataSource;", "(Lcom/fajar/movieapp/data/network/datasource/MovieDataSource;)V", "getDetail", "Lcom/fajar/movieapp/resource/Resource;", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopular", "", "Lcom/fajar/movieapp/data/network/model/MovieItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRated", "getUpcoming", "proceed", "T", "coroutines", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovie", "Lcom/fajar/movieapp/data/network/model/search/Search;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_productionDebug"})
public final class MovieRepositoryImpl implements com.fajar.movieapp.data.repository.MovieRepository {
    private final com.fajar.movieapp.data.network.datasource.MovieDataSource dataSource = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.network.datasource.MovieDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopular(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopRated(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUpcoming(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.search.Search>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.detail.DetailMovie>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object proceed(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> coroutines, kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<T>> continuation) {
        return null;
    }
}