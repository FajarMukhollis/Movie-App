package com.fajar.movieapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/fajar/movieapp/data/repository/MovieRepository;", "", "getDetail", "Lcom/fajar/movieapp/resource/Resource;", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopular", "", "Lcom/fajar/movieapp/data/network/model/MovieItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRated", "getUpcoming", "searchMovie", "Lcom/fajar/movieapp/data/network/model/search/Search;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_productionDebug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopular(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopRated(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUpcoming(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.MovieItem>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.search.Search>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.detail.DetailMovie>> continuation);
}