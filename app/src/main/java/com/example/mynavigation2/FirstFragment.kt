package com.example.mynavigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mynavigation2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var _b: FragmentFirstBinding? = null
    private val b get() = _b!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentFirstBinding.inflate(inflater, container, false)
        return b.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnBack.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstFragment_to_initFragment)
        }
    }
}