// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.glebalekseevjk.common.App


fun main() = application {
    val windowState = rememberWindowState(width = 1480.dp, height = 960.dp)

    Window(onCloseRequest = ::exitApplication, state = windowState, title = "Лабораторная работа 2", resizable = false) {
        App()
    }
}
