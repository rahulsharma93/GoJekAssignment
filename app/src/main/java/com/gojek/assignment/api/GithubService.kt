package openapi.rahul.com.gojekassignment.api

import androidx.lifecycle.LiveData
import com.gojek.assignment.data.RepoDTO
import retrofit2.http.GET

interface GithubService {

    @GET("repositories")
    fun getGithubTrendingRepos(): LiveData<ApiResponse<List<RepoDTO>>>

}