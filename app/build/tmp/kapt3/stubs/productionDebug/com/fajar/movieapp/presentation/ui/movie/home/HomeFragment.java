package com.fajar.movieapp.presentation.ui.movie.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\u00020\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/fajar/movieapp/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/fajar/movieapp/databinding/FragmentHomeBinding;", "viewModel", "Lcom/fajar/movieapp/presentation/ui/movie/home/HomeViewModel;", "getViewModel", "()Lcom/fajar/movieapp/presentation/ui/movie/home/HomeViewModel;", "viewModel$delegate", "Lcom/fajar/movieapp/data/utils/LazyViewModelDelegate;", "getInitialUser", "", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setErrorState", "isError", "", "message", "", "setHomeRecyclerView", "movie", "", "Lcom/fajar/movieapp/data/network/model/HomeMovie;", "setLoadingState", "isLoading", "app_productionDebug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.fajar.movieapp.databinding.FragmentHomeBinding _binding;
    private final com.fajar.movieapp.data.utils.LazyViewModelDelegate viewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.fajar.movieapp.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.fajar.movieapp.presentation.ui.movie.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getInitialUser() {
    }
    
    private final void setHomeRecyclerView(java.util.List<com.fajar.movieapp.data.network.model.HomeMovie> movie) {
    }
    
    private final void observeData() {
    }
    
    private final void setErrorState(boolean isError, java.lang.String message) {
    }
    
    private final void setLoadingState(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}