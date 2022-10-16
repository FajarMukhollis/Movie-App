package com.fajar.movieapp.data.network.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/fajar/movieapp/data/network/datasource/MovieRemoteDataSourceImpl;", "Lcom/fajar/movieapp/data/network/datasource/MovieDataSource;", "apiService", "Lcom/fajar/movieapp/data/network/service/MovieApiService;", "(Lcom/fajar/movieapp/data/network/service/MovieApiService;)V", "getDetail", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopular", "Lcom/fajar/movieapp/data/network/model/popular/Popular;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRated", "Lcom/fajar/movieapp/data/network/model/toprated/TopRated;", "getUpcoming", "Lcom/fajar/movieapp/data/network/model/upcoming/Upcoming;", "searchMovie", "Lcom/fajar/movieapp/data/network/model/search/Search;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_productionDebug"})
public final class MovieRemoteDataSourceImpl implements com.fajar.movieapp.data.network.datasource.MovieDataSource {
    private final com.fajar.movieapp.data.network.service.MovieApiService apiService = null;
    
    public MovieRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.network.service.MovieApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopular(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.popular.Popular> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopRated(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.toprated.TopRated> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUpcoming(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.upcoming.Upcoming> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.search.Search> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.detail.DetailMovie> continuation) {
        return null;
    }
}