package com.jay30.androidcompose.componentswrapper.util.components.picker.datepicker

import android.annotation.SuppressLint
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import com.jay30.androidcompose.componentswrapper.stringresources.StringResourcesSingleton
import com.jay30.androidcompose.componentswrapper.util.dateformatter.DateFormatterPattern
import java.text.SimpleDateFormat
import java.util.Date

/**
 * MyDatePickerDialogUtil
 *
 * a util object for MyDatePickerDialog class
 */

object MyDatePickerDialogUtil {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun popUp(
        _selectableDates : SelectableDates? = null,
        onDateSelected: (String) -> Unit,
        onDismiss: () -> Unit
    ){
        var selectableDates: SelectableDates? = null
        if(_selectableDates == null){
            selectableDates = object : SelectableDates {
                override fun isSelectableDate(utcTimeMillis: Long): Boolean {
                    return utcTimeMillis <= System.currentTimeMillis()
                }
            }
        }else {
            selectableDates = _selectableDates
        }
        val datePickerState = rememberDatePickerState(
            selectableDates = selectableDates
        )

        val selectedDate = datePickerState.selectedDateMillis?.let {
            convertMillisToDate(it)
        } ?: ""

        DatePickerDialog(
            onDismissRequest = { onDismiss() },
            confirmButton = {
                Button(onClick = {
                    onDateSelected(selectedDate)
                    onDismiss()
                }

                ) {
                    Text(text = StringResourcesSingleton.OK)
                }
            },
            dismissButton = {
                Button(onClick = {
                    onDismiss()
                }) {
                    Text(text = StringResourcesSingleton.CANCEL)
                }
            }
        ) {
            DatePicker(
                state = datePickerState
            )
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun convertMillisToDate(millis: Long): String {
        val formatter = SimpleDateFormat(DateFormatterPattern.pattern)
        return formatter.format(Date(millis))
    }
}