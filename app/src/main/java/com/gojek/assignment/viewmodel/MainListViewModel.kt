package com.gojek.assignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gojek.assignment.data.RepoDTO
import com.gojek.assignment.repository.GithubListRepository


class MainListViewModel internal constructor(githubListRepository: GithubListRepository) :
    ViewModel() {

    val githubTrendingRepos: LiveData<List<RepoDTO>> =
        githubListRepository.getGithubTrendingRepos()



}