package com.fajar.movieapp.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.fajar.movieapp.data.network.datasource.MovieDataSource
import com.fajar.movieapp.data.network.datasource.MovieRemoteDataSourceImpl
import com.fajar.movieapp.data.network.service.MovieApiService
import com.fajar.movieapp.data.repository.MovieRepository
import com.fajar.movieapp.data.repository.MovieRepositoryImpl

object MovieServiceLocator {

    private fun provideChucker(appContext: Context): ChuckerInterceptor {
        return ChuckerInterceptor.Builder(appContext).build()
    }

    private fun provideApiService(chuckerInterceptor: ChuckerInterceptor): MovieApiService {
        return MovieApiService.invoke(chuckerInterceptor)
    }

    private fun provideDataSource(apiService: MovieApiService): MovieDataSource {
        return MovieRemoteDataSourceImpl(apiService)
    }

    fun provideMovieRepository(context: Context): MovieRepository {
        return MovieRepositoryImpl(provideDataSource(provideApiService(provideChucker(context))))
    }
}