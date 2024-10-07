package com.jay30.androidcompose.componentswrapper.util.components.button.roundedbutton

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jay30.androidcompose.componentswrapper.componentsattr.button.basebutton.BaseButtonAttr
import com.jay30.androidcompose.componentswrapper.componentsattr.icon.IconAttr
import com.jay30.androidcompose.componentswrapper.util.components.button.iconbutton.MyButtonWithIcon

class MyOwnRoundedButton(
    val buttonAttr: BaseButtonAttr,
    val iconAttr: IconAttr,
    val buttonSize : Dp = 20.dp,
    val iconSize : Dp = 20.dp,
    val boxPaddingHorizontalDp: Dp,
) {
    @Composable
    fun popUp(){
        var count by remember { mutableStateOf(0) }
        val newButtonAttr = BaseButtonAttr(
            onClick = buttonAttr.onClick,
            shape = buttonAttr.shape,
            modifier = Modifier.size(buttonSize),
            contentPadding = buttonAttr.contentPadding
        )

        val newIconAttr = IconAttr(
            id = iconAttr.id,
            contentDescription = iconAttr.contentDescription,
            modifier = Modifier.size(iconSize),
        )
        val myButtonWithIcon =  MyButtonWithIcon(newButtonAttr,newIconAttr)
        Box(modifier = Modifier.padding(boxPaddingHorizontalDp)) {
            myButtonWithIcon.popUp()
        }
    }
}