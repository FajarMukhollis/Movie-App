package com.fajar.movieapp.presentation.ui.movie.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/movieapp/data/repository/MovieRepository;", "(Lcom/fajar/movieapp/data/repository/MovieRepository;)V", "_detailResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fajar/movieapp/resource/Resource;", "Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "detailResult", "Landroidx/lifecycle/LiveData;", "getDetailResult", "()Landroidx/lifecycle/LiveData;", "getDetail", "", "id", "", "app_productionDebug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.movieapp.data.repository.MovieRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.detail.DetailMovie>> _detailResult = null;
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.data.repository.MovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.movieapp.resource.Resource<com.fajar.movieapp.data.network.model.detail.DetailMovie>> getDetailResult() {
        return null;
    }
    
    public final void getDetail(int id) {
    }
}