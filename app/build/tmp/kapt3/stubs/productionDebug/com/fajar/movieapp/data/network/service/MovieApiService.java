package com.fajar.movieapp.data.network.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ9\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/fajar/movieapp/data/network/service/MovieApiService;", "", "getDetail", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "id", "", "language", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopular", "Lcom/fajar/movieapp/data/network/model/popular/Popular;", "page", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRated", "Lcom/fajar/movieapp/data/network/model/toprated/TopRated;", "getUpcoming", "Lcom/fajar/movieapp/data/network/model/upcoming/Upcoming;", "searchMovie", "Lcom/fajar/movieapp/data/network/model/search/Search;", "query", "include", "", "(Ljava/lang/String;Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_productionDebug"})
public abstract interface MovieApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.data.network.service.MovieApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract java.lang.Object getPopular(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.popular.Popular> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/top_rated")
    public abstract java.lang.Object getTopRated(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.toprated.TopRated> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/upcoming")
    public abstract java.lang.Object getUpcoming(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.upcoming.Upcoming> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/movie")
    public abstract java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query", encoded = true)
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "include_adult")
    boolean include, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.search.Search> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{movieId}")
    public abstract java.lang.Object getDetail(@retrofit2.http.Path(value = "movie_id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.movieapp.data.network.model.detail.DetailMovie> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static com.fajar.movieapp.data.network.service.MovieApiService invoke(@org.jetbrains.annotations.NotNull()
    com.chuckerteam.chucker.api.ChuckerInterceptor chuckerInterceptor) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fajar/movieapp/data/network/service/MovieApiService$Companion;", "", "()V", "INCLUDE_ADULT", "", "LANGUAGE_US", "", "PAGE", "", "invoke", "Lcom/fajar/movieapp/data/network/service/MovieApiService;", "chuckerInterceptor", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "app_productionDebug"})
    public static final class Companion {
        private static final java.lang.String LANGUAGE_US = "en-US";
        private static final int PAGE = 1;
        private static final boolean INCLUDE_ADULT = false;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.fajar.movieapp.data.network.service.MovieApiService invoke(@org.jetbrains.annotations.NotNull()
        com.chuckerteam.chucker.api.ChuckerInterceptor chuckerInterceptor) {
            return null;
        }
    }
}