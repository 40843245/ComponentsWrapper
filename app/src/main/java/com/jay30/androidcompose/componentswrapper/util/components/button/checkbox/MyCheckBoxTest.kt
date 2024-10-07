package com.jay30.androidcompose.componentswrapper.util.components.button.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jay30.androidcompose.componentswrapper.stringresources.StringResourcesSingleton
import com.jay30.androidcompose.componentswrapper.util.components.button.checkbox.MyCheckBox

object MyCheckBoxTest {
    @Composable
    fun test1(){
        Column {
            val isChecked = remember { mutableStateOf(false) }
            val myCheckBox = MyCheckBox(
                StringResourcesSingleton.NOT,
                checked = isChecked,
                onCheckedChange = { isChecked.value = it }
            )
            myCheckBox.popUp()

            Spacer(modifier = Modifier.height(40.dp).fillMaxWidth())

            Text(
                if (isChecked.value) "Checked" else "Not checked"
            )
        }
    }
}