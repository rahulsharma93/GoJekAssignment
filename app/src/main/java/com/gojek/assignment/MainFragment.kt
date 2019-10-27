package com.gojek.assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.gojek.assignment.adapter.GithubListAdapter
import com.gojek.assignment.databinding.FragmentMainBinding
import com.gojek.assignment.viewmodel.MainListViewModel


class MainFragment : Fragment() {

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
        mMainListViewModel = ViewModelProviders.of(this).get(MainListViewModel::class.java)
        mAdapter = GithubListAdapter()
        mBinding.repoList.adapter = mAdapter
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getGithubList()
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

    }

}