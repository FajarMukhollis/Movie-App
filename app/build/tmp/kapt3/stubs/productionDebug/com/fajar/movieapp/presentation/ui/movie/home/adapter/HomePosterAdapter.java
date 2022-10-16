package com.fajar.movieapp.presentation.ui.movie.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0016\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/home/adapter/HomePosterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fajar/movieapp/presentation/ui/movie/home/adapter/HomePosterAdapter$HomePosterViewHolder;", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/fajar/movieapp/data/network/model/MovieItem;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "movie", "", "Companion", "HomePosterViewHolder", "app_productionDebug"})
public final class HomePosterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fajar.movieapp.presentation.ui.movie.home.adapter.HomePosterAdapter.HomePosterViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.fajar.movieapp.data.network.model.MovieItem, kotlin.Unit> itemClickListener;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.fajar.movieapp.data.network.model.MovieItem> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.fajar.movieapp.data.network.model.MovieItem> differ = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.movieapp.presentation.ui.movie.home.adapter.HomePosterAdapter.Companion Companion = null;
    private static final java.lang.String IMAGE_URL = "https://image.tmdb.org/t/p/w500";
    
    public HomePosterAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.fajar.movieapp.data.network.model.MovieItem, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.fajar.movieapp.data.network.model.MovieItem, kotlin.Unit> p0) {
    }
    
    public final void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.MovieItem> movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fajar.movieapp.presentation.ui.movie.home.adapter.HomePosterAdapter.HomePosterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fajar.movieapp.presentation.ui.movie.home.adapter.HomePosterAdapter.HomePosterViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/home/adapter/HomePosterAdapter$HomePosterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fajar/movieapp/databinding/ItemPosterBinding;", "(Lcom/fajar/movieapp/presentation/ui/movie/home/adapter/HomePosterAdapter;Lcom/fajar/movieapp/databinding/ItemPosterBinding;)V", "bind", "", "item", "Lcom/fajar/movieapp/data/network/model/MovieItem;", "app_productionDebug"})
    public final class HomePosterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fajar.movieapp.databinding.ItemPosterBinding binding = null;
        
        public HomePosterViewHolder(@org.jetbrains.annotations.NotNull()
        com.fajar.movieapp.databinding.ItemPosterBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.fajar.movieapp.data.network.model.MovieItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fajar/movieapp/presentation/ui/movie/home/adapter/HomePosterAdapter$Companion;", "", "()V", "IMAGE_URL", "", "app_productionDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}