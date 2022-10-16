package com.fajar.movieapp.data.network.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fajar/movieapp/data/network/service/ApiEndPoints;", "", "()V", "DETAIL_END_POINT", "", "POPULAR_END_POINT", "SEARCH_END_POINT", "TOP_RATED_END_POINT", "UPCOMING_END_POINT", "app_productionDebug"})
public final class ApiEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.data.network.service.ApiEndPoints INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_END_POINT = "movie/popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOP_RATED_END_POINT = "movie/top_rated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPCOMING_END_POINT = "movie/upcoming";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_END_POINT = "search/movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DETAIL_END_POINT = "movie/{movieId}";
    
    private ApiEndPoints() {
        super();
    }
}