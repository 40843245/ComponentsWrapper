package com.jay30.androidcompose.componentswrapper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jay30.androidcompose.componentswrapper.ui.theme.ComponentsWrapperTheme
import com.jay30.androidcompose.componentswrapper.util.components.progressindicator.circularprogressindicator.MyCircularIndeterminateProgressIndicatorTest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentsWrapperTheme {
                MyCircularIndeterminateProgressIndicatorTest.test1()
            }
        }
    }
}