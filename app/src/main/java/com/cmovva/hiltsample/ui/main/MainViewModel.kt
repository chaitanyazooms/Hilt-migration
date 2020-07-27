package com.cmovva.hiltsample.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.cmovva.hiltsample.RemoteConfigService

class MainViewModel @ViewModelInject constructor(val remoteConfigService: RemoteConfigService) :
    ViewModel() {
    // TODO: Implement the ViewModel
}