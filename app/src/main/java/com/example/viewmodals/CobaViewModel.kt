package com.example.viewmodals

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.viewmodals.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel :  ViewModel() {
    var namausr: String by mutableStateOf( "")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uistate = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uistate.asStateFlow()

    fun InsertData(nm: String,tlp: String, jk: String){
        namausr = nm;
        noTlp = tlp;
        jenisKl = jk;
    }

    fun setJenisJK(pilihJk:String){
        _uistate.update { currentState -> currentState.copy(sex = pilihJk) }

    }
}