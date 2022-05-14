package com.nlv2022.rcviewrazbor

import android.app.Application
import com.nlv2022.rcviewrazbor.model.UserService

class App : Application() {
    val userService = UserService()
}