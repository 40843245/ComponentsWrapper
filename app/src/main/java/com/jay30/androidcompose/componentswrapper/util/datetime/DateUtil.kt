package com.jay30.androidcompose.componentswrapper.util.datetime

import com.jay30.androidcompose.componentswrapper.util.dateformatter.DateFormatterPattern
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * DateUtil
 *
 * util object for date
 */
object DateUtil {
    fun isValidDate(dateStr:String):Boolean{
        try {
            val formatter = SimpleDateFormat(DateFormatterPattern.pattern, Locale.getDefault())
            val date = formatter.parse(dateStr)
            return true
        }catch (ex:Exception){
            return false
        }
    }
}