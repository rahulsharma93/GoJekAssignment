package openapi.rahul.com.gojekassignment.di

import android.app.Application
import com.gojek.assignment.GoJekAssignmentApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import openapi.rahul.com.gojekassignment.GojekApp
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(goJekAssignmentApp: GoJekAssignmentApp)
}
