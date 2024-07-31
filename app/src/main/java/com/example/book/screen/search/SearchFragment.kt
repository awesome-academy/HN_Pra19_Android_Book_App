package com.example.book.screen.search

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.book.R
import com.example.book.data.model.Book
import com.example.book.databinding.FragmentSearchBinding
import com.example.book.screen.search.adapter.SearchAdapter
import com.example.book.utils.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>(), SearchContract.View {

    private val presenter: SearchContract.Presenter by lazy {
        SearchPresenter()
    }

    private val searchAdapter : SearchAdapter by lazy {
        SearchAdapter(listBook = mutableListOf())
    }

    private lateinit var _binding: FragmentSearchBinding

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSearchBinding {
        _binding = FragmentSearchBinding.inflate(inflater)
        return _binding
    }

    override fun initView() {
        initSearchView()
        presenter.setView(this)
    }

    override fun initData() {
        presenter.onStart()
        _binding.rvSearch.layoutManager = GridLayoutManager(requireContext(), 3)
        _binding.rvSearch.adapter = searchAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    fun initSearchView() {
        val searchView = _binding.searchView
        val searchText = searchView.findViewById<TextView>(androidx.appcompat.R.id.search_src_text)
        searchText.setHintTextColor(ContextCompat.getColor(requireContext(), R.color.color_search_hint))
        searchText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
        searchText.typeface = ResourcesCompat.getFont(requireContext(), R.font.montserrat_black_italic)
        searchText.hint = getString(R.string.search_hint)
    }

    companion object {
        fun newInstance() = SearchFragment()
    }

    override fun onGetBookSuccess(book: List<Book>) {
        searchAdapter.updateData(book)
    }

    override fun onError(exception: Exception?) {
        Toast.makeText(requireContext(), exception?.message, Toast.LENGTH_SHORT).show()
    }
}
