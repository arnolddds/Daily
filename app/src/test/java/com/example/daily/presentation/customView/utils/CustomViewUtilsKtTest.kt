package com.example.daily.presentation.customView.utils

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class CustomViewUtilsKtTest {

    @Test
    fun `Is start time less than zero`() {
        val valueMoreThanZero = 10
        val valueLessThanZero = -2

        val resultMore = isStartTimeLessThanZero(valueMoreThanZero)
        val resultLess = isStartTimeLessThanZero(valueLessThanZero)

        assertFalse(resultMore)
        assertTrue(resultLess)
    }

    @Test
    fun `is start time more or same end time`() {
        val endTimeLessValue = 8
        val endTimeSameValue = 12
        val value = 12
        val valueLessEndTime = 8

        val resultLess = isStartTimeMoreOrSameEndTime(value, endTimeLessValue)
        val resultSame = isStartTimeMoreOrSameEndTime(value, endTimeSameValue)
        val resultMore = isStartTimeMoreOrSameEndTime(valueLessEndTime, endTimeSameValue)

        assertTrue(resultLess)
        assertTrue(resultSame)
        assertFalse(resultMore)
    }

    @Test
    fun `Is end time more than maxValue`() {
        val valueMore = 25
        val valueLess = 21

        val resultMore = isEndTimeMoreThanMaxValue(valueMore)
        val resultLess = isEndTimeMoreThanMaxValue(valueLess)

        assertTrue(resultMore)
        assertFalse(resultLess)
    }
}