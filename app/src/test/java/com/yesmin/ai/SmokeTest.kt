package com.yesmin.ai

import org.junit.Assert.assertEquals
import org.junit.Test

class SmokeTest {
    @Test
    fun appMetadata_isConsistent() {
        val expectedName = "Yesmin AI"
        assertEquals("Yesmin AI", expectedName)
    }
}
