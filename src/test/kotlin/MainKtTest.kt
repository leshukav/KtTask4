import org.junit.Test

import org.junit.Assert.*

class MainKtTest {



    @Test
    fun calcCommissionMAESTROTrue() {
        val MAESTRO ="Maestro"
        val translateMonth  = 200_000
        val translate = 100_000

        val result = calcCommission(MAESTRO, translateMonth, translate)
        assertEquals(620, result)
    }
    @Test
    fun calcCommissionMAESTROFalse() {
        val MAESTRO ="Maestro"
        val translateMonth  = 200_000
        val translate = 100_000

        val result = calcCommission(MAESTRO, translateMonth, translate)
        assertEquals(600, result)
    }

    @Test
    fun calcCommissionMASTERCARDTrue() {
        val MASTERCARD = "MasterCard"
        val translateMonth  = 0
        val translate = 76_000

        val result = calcCommission(MASTERCARD, translateMonth, translate)
        assertEquals(476, result)
    }
    @Test
    fun calcCommissionMASTERCARDFalse() {
        val MASTERCARD = "MasterCard"
        val translateMonth  = 0
        val translate = 76_000

        val result = calcCommission(MASTERCARD, translateMonth, translate)
        assertEquals(470, result)
    }

    @Test
    fun calcCommissionVISATrue() {
        val VISA = "VISA"
        var translateMonth  = 150_000
        var translate = 50_000

        val result = calcCommission(VISA, translateMonth, translate)
        assertEquals(375, result)
    }
    @Test
    fun calcCommissionVISAFalse() {
        val VISA = "VISA"
        var translateMonth  = 150_000
        var translate = 50_000

        val result = calcCommission(VISA, translateMonth, translate)
        assertEquals(370, result)
    }

    @Test
    fun calcCommissionWorldTrue() {
        val WORLD = "Мир"
        var translateMonth  = 15_000
        var translate = 20_000

        val result = calcCommission(WORLD, translateMonth, translate)
        assertEquals(150, result)
    }
    @Test
    fun calcCommissionWorldFalse() {
        val WORLD = "Мир"
        var translateMonth  = 15_000
        var translate = 20_000

        val result = calcCommission(WORLD, translateMonth, translate)
        assertEquals(250, result)
    }

    @Test
    fun calcCommissionVK_PAYTrue() {
        val VK_PAY = "VK Pay"
        var translateMonth  = 15_000
        var translate = 20_000

        val result = calcCommission(VK_PAY, translateMonth, translate)
        assertEquals(0, result)
    }
    @Test
    fun calcCommissionVK_PAYFalse() {
        val VK_PAY = "VK Pay"
        var translateMonth  = 15_000
        var translate = 20_000

        val result = calcCommission(VK_PAY, translateMonth, translate)
        assertEquals(10, result)
    }
    @Test
    fun printTranslateF() {
    val VK_PAY = "VK Pay"
        var translate = 20_000
        val result = printTranslate(VK_PAY, translate)
        assertEquals(100, result)
    }

}

