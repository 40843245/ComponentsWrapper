package com.jay30.androidcompose.componentswrapper.util.validator

import com.jay30.androidcompose.componentswrapper.string.isValidString
import com.jay30.androidcompose.componentswrapper.util.datetime.DateUtil
import com.jay30.androidcompose.componentswrapper.util.datetime.TimeUtil

object Validator {
     fun isValid(date:String,time:String,vararg strings:String): Boolean{
        if(!DateUtil.isValidDate(date)){
            return false
        }
        if(!TimeUtil.isValidTime(time)){
            return false
        }

        for(string in strings){
            if(!string.isValidString()){
                return false
            }
        }
        return true
    }
}