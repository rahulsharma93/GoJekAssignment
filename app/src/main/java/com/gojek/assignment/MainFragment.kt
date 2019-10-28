package com.gojek.assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.gojek.assignment.adapter.GithubListAdapter
import com.gojek.assignment.databinding.FragmentMainBinding
import com.gojek.assignment.viewmodel.MainListViewModel
import openapi.rahul.com.gojekassignment.di.Injectable
import javax.inject.Inject


class MainFragment : Fragment(),Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var mMainListViewModel: MainListViewModel
    private lateinit var mBinding: FragmentMainBinding
    private lateinit var mAdapter: GithubListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMainBinding.inflate(inflater, container, false)
        mBinding.shimmerViewContainer.startShimmerAnimation()
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mMainListViewModel = ViewModelProviders.of(this,viewModelFactory).get(MainListViewModel::class.java)
        getGithubList()
        mAdapter = GithubListAdapter()
        mBinding.repoList.adapter = mAdapter
    }
    override fun onResume() {
        super.onResume()
        mBinding.shimmerViewContainer.startShimmerAnimation()
    }

    override fun onStart() {
        super.onStart()
        mBinding.shimmerViewContainer.stopShimmerAnimation()
    }

    private fun getGithubList() {
        mMainListViewModel.githubTrendingRepos.observe(viewLifecycleOwner) { result ->
            mBinding.shimmerViewContainer.stopShimmerAnimation()
            mBinding.shimmerViewContainer.visibility = View.GONE;
        }
    }

}