package com.jay30.androidcompose.componentswrapper.util.components.dropdown.dropmenu

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.TextFieldValue
import com.jay30.androidcompose.componentswrapper.componentsattr.box.BoxAttr
import com.jay30.androidcompose.componentswrapper.componentsattr.dropdownmenu.DropdownMenuAttr
import com.jay30.androidcompose.componentswrapper.componentsattr.textfield.TextFieldAttr

/**
 * MyDropdownMenu
 *
 * a class that can pop up these components (about DropdownMenu):
 * + an OutlinedTextField
 * + a DropdownMenu
 * + a list of DropdownMenuItem under the DropdownMenu component
 */

class MyDropdownMenu(
    val items: MutableList<String>,
    val textFieldAttr: TextFieldAttr,
    val boxAttr: BoxAttr,
    val dropdownMenuAttr: DropdownMenuAttr,
){
    @Composable
    fun popUp() {
        var expanded by remember { mutableStateOf(true) }
        OutlinedTextField(
            value = textFieldAttr.value,
            onValueChange = textFieldAttr.onValueChange ,
            label = textFieldAttr.label,
            readOnly = true,
            singleLine = true,
            modifier = textFieldAttr.modifier.clickable {  }.onFocusChanged {
                if (it.isFocused){
                    expanded = !expanded
                }
            }
        )
        Box(
            modifier = boxAttr.modifier
        ) {
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = dropdownMenuAttr.onDismissRequest,
                modifier = dropdownMenuAttr.modifier
            ) {
                for (item in items) {
                    DropdownMenuItem(
                        text = { Text(item) },
                        onClick = {
                            textFieldAttr.value = TextFieldValue(item)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}