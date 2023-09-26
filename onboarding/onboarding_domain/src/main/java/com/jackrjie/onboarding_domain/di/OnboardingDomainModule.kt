package com.jackrjie.onboarding_domain.di

import com.jackrjie.onboarding_domain.ValidateNutrients
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object OnboardingDomainModule {

    @Provides
    @ViewModelScoped
    fun provideValidateNutrients(): ValidateNutrients {
        return ValidateNutrients()
    }
}