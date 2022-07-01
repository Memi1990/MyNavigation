package com.example.mynavigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.mynavigation2.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _b:FragmentInitBinding? = null
    private val b get() = _b!!
    private var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentInitBinding.inflate(inflater,container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnNextFst.setOnClickListener {
            val bundle = bundleOf("Contador" to cont.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment, bundle)
        }
        b.tvCount.setOnClickListener {
            cont ++
            b.tvCount.setText(cont.toString())
        }
    }


}