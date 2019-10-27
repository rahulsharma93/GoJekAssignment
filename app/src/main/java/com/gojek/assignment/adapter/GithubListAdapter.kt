package com.gojek.assignment.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gojek.assignment.data.RepoDTO
import com.gojek.assignment.databinding.ListItemGitRepoBinding


class GithubListAdapter : ListAdapter<RepoDTO, RecyclerView.ViewHolder>(GithubListCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GithubRepoViewHolder(ListItemGitRepoBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val repo = getItem(position)
        (holder as GithubRepoViewHolder).bind(repo)
    }

    class GithubRepoViewHolder(private val binding: ListItemGitRepoBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {

            }
        }

        private fun navigateToRepo(
            repo: RepoDTO,
            it: View
        ) {
            //val direction = HomeViewPagerFragmentDirections.actionViewPagerFragmentToPlantDetailFragment(repo.plantId)
            //it.findNavController().navigate(direction)
        }

        fun bind(item: RepoDTO) {
            binding.apply {
                executePendingBindings()
            }
        }
    }

}

private class GithubListCallback : DiffUtil.ItemCallback<RepoDTO>() {

    override fun areItemsTheSame(oldItem: RepoDTO, newItem: RepoDTO): Boolean {
        return oldItem.url == newItem.url
    }

    override fun areContentsTheSame(oldItem: RepoDTO, newItem: RepoDTO): Boolean {
        return oldItem == newItem
    }

}