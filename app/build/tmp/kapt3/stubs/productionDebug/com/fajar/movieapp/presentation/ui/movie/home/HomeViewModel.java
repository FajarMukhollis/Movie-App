package com.fajar.movieapp.presentation.ui.movie.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/fajar/movieapp/data/repository/MovieRepository;", "userRepository", "Lcom/fajar/movieapp/data/repository/UserRepository;", "(Lcom/fajar/movieapp/data/repository/MovieRepository;Lcom/fajar/movieapp/data/repository/UserRepository;)V", "_homeMovieListResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fajar/movieapp/resource/Resource;", "", "Lcom/fajar/movieapp/data/network/model/HomeMovie;", "_searchResult", "Lcom/fajar/movieapp/data/network/model/search/Search;", "_userByIdResult", "Lcom/fajar/movieapp/data/local/database/user/UserEntity;", "homeMovieListResult", "Landroidx/lifecycle/LiveData;", "getHomeMovieListResult", "()Landroidx/lifecycle/LiveData;", "listStateParcel", "Landroid/os/Parcelable;", "getListStateParcel", "()Landroid/os/Parcelable;", "setListStateParcel", "(Landroid/os/Parcelable;)V", "searchResult", "getSearchResult", "userByIdResult", "getUserByIdResult", "getHomeMovieList", "", "getUserById", "id", "", "getUserId", "saveListState", "parcel", "searchMovie", "query", "", "app_productionDebug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.movieapp.data.repository.MovieRepository movieRepository = null;
    private final com.fajar.movieapp.data.repository.UserRepository userRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.search.Search>> _searchResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.search.Search>> searchResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.HomeMovie>>> _homeMovieListResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.data.local.database.user.UserEntity> _userByIdResult = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.Parcelable listStateParcel;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.MovieRepository movieRepository, @org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.search.Search>> getSearchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.resource.Resource<java.util.List<com.fajar.movieapp.data.network.model.HomeMovie>>> getHomeMovieListResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.data.local.database.user.UserEntity> getUserByIdResult() {
        return null;
    }
    
    public final void getHomeMovieList() {
    }
    
    public final long getUserId() {
        return 0L;
    }
    
    public final void getUserById(long id) {
    }
    
    public final void searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Parcelable getListStateParcel() {
        return null;
    }
    
    public final void setListStateParcel(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable p0) {
    }
    
    public final void saveListState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable parcel) {
    }
}