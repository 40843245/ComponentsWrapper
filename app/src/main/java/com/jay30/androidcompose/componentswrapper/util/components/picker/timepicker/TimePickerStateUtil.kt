package com.jay30.androidcompose.componentswrapper.util.components.picker.timepicker

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TimePickerState

/**
 * TimePickerStateUtil
 *
 * an util object for TimePickerDialogTest class
 */

object TimePickerStateUtil {
    @OptIn(ExperimentalMaterial3Api::class)
    fun format(timePickerState: TimePickerState):String{
        var text = ""
        text += timePickerState.hour
        text += ":"
        text += timePickerState.minute
        return text
    }
}