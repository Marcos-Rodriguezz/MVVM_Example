package com.devtests.mvvm_example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devtests.mvvm_example.model.QuoteModel
import com.devtests.mvvm_example.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}