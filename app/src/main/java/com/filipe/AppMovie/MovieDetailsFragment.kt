package com.filipe.AppMovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.filipe.AppMovie.databinding.FragmentMovieDetailsBinding

class MovieDetailsFragment : Fragment(), MovieListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMovieDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onItemSelected(position: Int) {
        TODO("Not yet implemented")
    }

}