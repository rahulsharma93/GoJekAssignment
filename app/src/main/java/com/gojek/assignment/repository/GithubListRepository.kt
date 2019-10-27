package com.gojek.assignment.repository

import androidx.lifecycle.LiveData
import com.gojek.assignment.data.RepoDTO
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class GithubListRepository @Inject constructor(

) {
    fun getGithubTrendingRepos() : LiveData<List<RepoDTO>> {

    }

}