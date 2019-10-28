package openapi.rahul.com.gojekassignment.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gojek.assignment.viewmodel.GithubViewModelFactory
import com.gojek.assignment.viewmodel.MainListViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainListViewModel::class)
    abstract fun bindGithubViewModel(mainViewModel: MainListViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: GithubViewModelFactory): ViewModelProvider.Factory
}