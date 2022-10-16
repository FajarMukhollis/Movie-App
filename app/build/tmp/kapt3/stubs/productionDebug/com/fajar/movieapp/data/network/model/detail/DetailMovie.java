package com.fajar.movieapp.data.network.model.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bI\b\u0086\b\u0018\u00002\u00020\u0001B\u00d1\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010%J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000bH\u00c6\u0003J\u0013\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010Q\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0013\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010X\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0010\u0010Y\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0013\u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00da\u0002\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000b2\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010bJ\u0013\u0010c\u001a\u00020\u00032\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010e\u001a\u00020\tH\u00d6\u0001J\t\u0010f\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010*R \u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00101R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b?\u0010.R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b@\u0010.R \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bE\u0010\'R\u001a\u0010#\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\bF\u00109R\u001a\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\bG\u0010.\u00a8\u0006g"}, d2 = {"Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "", "adult", "", "backdropPath", "", "belongsToCollection", "Lcom/fajar/movieapp/data/network/model/detail/BelongsToCollection;", "budget", "", "genres", "", "Lcom/fajar/movieapp/data/network/model/detail/Genre;", "homepage", "id", "imdbId", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "productionCompanies", "Lcom/fajar/movieapp/data/network/model/detail/ProductionCompany;", "productionCountries", "Lcom/fajar/movieapp/data/network/model/detail/ProductionCountry;", "releaseDate", "revenue", "runtime", "spokenLanguages", "Lcom/fajar/movieapp/data/network/model/detail/SpokenLanguage;", "status", "tagline", "title", "video", "voteAverage", "voteCount", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/fajar/movieapp/data/network/model/detail/BelongsToCollection;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAdult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackdropPath", "()Ljava/lang/String;", "getBelongsToCollection", "()Lcom/fajar/movieapp/data/network/model/detail/BelongsToCollection;", "getBudget", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "()Ljava/util/List;", "getHomepage", "getId", "getImdbId", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath", "getProductionCompanies", "getProductionCountries", "getReleaseDate", "getRevenue", "getRuntime", "getSpokenLanguages", "getStatus", "getTagline", "getTitle", "getVideo", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/fajar/movieapp/data/network/model/detail/BelongsToCollection;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/fajar/movieapp/data/network/model/detail/DetailMovie;", "equals", "other", "hashCode", "toString", "app_productionDebug"})
public final class DetailMovie {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "adult")
    private final java.lang.Boolean adult = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "belongs_to_collection")
    private final com.fajar.movieapp.data.network.model.detail.BelongsToCollection belongsToCollection = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "budget")
    private final java.lang.Integer budget = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<com.fajar.movieapp.data.network.model.detail.Genre> genres = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private final java.lang.String imdbId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private final java.lang.String originalLanguage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCompany> productionCompanies = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCountry> productionCountries = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private final java.lang.Integer revenue = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private final java.lang.Integer runtime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private final java.util.List<com.fajar.movieapp.data.network.model.detail.SpokenLanguage> spokenLanguages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "video")
    private final java.lang.Boolean video = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private final java.lang.Double voteAverage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private final java.lang.Integer voteCount = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.movieapp.data.network.model.detail.DetailMovie copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    com.fajar.movieapp.data.network.model.detail.BelongsToCollection belongsToCollection, @org.jetbrains.annotations.Nullable()
    java.lang.Integer budget, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.Genre> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCompany> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCountry> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.SpokenLanguage> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DetailMovie() {
        super();
    }
    
    public DetailMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    com.fajar.movieapp.data.network.model.detail.BelongsToCollection belongsToCollection, @org.jetbrains.annotations.Nullable()
    java.lang.Integer budget, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.Genre> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCompany> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCountry> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.fajar.movieapp.data.network.model.detail.SpokenLanguage> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fajar.movieapp.data.network.model.detail.BelongsToCollection component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fajar.movieapp.data.network.model.detail.BelongsToCollection getBelongsToCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.Genre> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCompany> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCompany> getProductionCompanies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCountry> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.ProductionCountry> getProductionCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRevenue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.SpokenLanguage> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fajar.movieapp.data.network.model.detail.SpokenLanguage> getSpokenLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
}