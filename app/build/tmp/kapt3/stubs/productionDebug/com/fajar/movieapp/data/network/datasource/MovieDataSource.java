package com.fajar.movieapp.data.network.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/fajar/movieapp/data/network/datasource/MovieDataSource;", "", "getDetail", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopular", "Lcom/fajar/movieapp/data/network/model/popular/Popular;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRated", "Lcom/fajar/movieapp/data/network/model/toprated/TopRated;", "getUpcoming", "Lcom/fajar/movieapp/data/network/model/upcoming/Upcoming;", "searchMovie", "Lcom/fajar/movieapp/data/network/model/search/Search;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_productionDebug"})
public abstract interface MovieDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopular(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.popular.Popular> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopRated(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.toprated.TopRated> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUpcoming(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.upcoming.Upcoming> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.search.Search> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.detail.DetailMovie> continuation);
}