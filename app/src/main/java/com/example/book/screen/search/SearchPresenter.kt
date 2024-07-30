package com.example.book.screen.search

import com.example.book.utils.MockDataUtil

class SearchPresenter : SearchContract.Presenter {

    private var view: SearchContract.View? = null

    override fun onStart() {
        view?.onGetBookSuccess(MockDataUtil.generateMockBooks())
    }

    override fun onStop() {
    }

    override fun setView(view: SearchContract.View?) {
        this.view = checkNotNull(view)
    }

}