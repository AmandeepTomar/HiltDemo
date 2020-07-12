package com.example.hiltdemo.di.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Singleton
@InstallIn(ApplicationComponent::class)
@Module
class ApplicationModule {



}