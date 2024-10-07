package com.jay30.androidcompose.componentswrapper.util.components.button.roundedbutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jay30.androidcompose.componentswrapper.R
import com.jay30.androidcompose.componentswrapper.componentsattr.button.basebutton.BaseButtonAttr
import com.jay30.androidcompose.componentswrapper.componentsattr.icon.IconAttr

object MyOwnRoundedButtonTest {
    @Composable
    fun test1(){
        Column {
            var count by remember { mutableStateOf(0) }
            val buttonAttr = BaseButtonAttr(
                onClick = { count++},
                shape = CircleShape,
                modifier = Modifier.height(40.dp).width(20.dp),
                contentPadding = PaddingValues(2.dp)
            )

            val iconAttr = IconAttr(
                R.drawable.plus,
                contentDescription = "plus",
                modifier = Modifier.height(40.dp).width(20.dp)
            )

            val buttonSize = 20.dp
            val boxPaddingHorizontalDp = 10.dp

            val myOwnRoundedButton = MyOwnRoundedButton(
                buttonAttr = buttonAttr,
                iconAttr = iconAttr,
                buttonSize = buttonSize,
                boxPaddingHorizontalDp = boxPaddingHorizontalDp,
            )

            myOwnRoundedButton.popUp()

            Text("You clicked ${count} times.")

            Spacer(modifier = Modifier.height(20.dp).fillMaxWidth())
        }
    }
}