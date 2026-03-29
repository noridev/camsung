package moe.noridev.camsung

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.ClassRule
import org.junit.Test
import org.junit.runner.RunWith
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.locale.LocaleTestRule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @ClassRule
    val localeTestRule: LocaleTestRule = LocaleTestRule()

    @Test
    fun testTakeScreenshot() {
        Screengrab.screenshot("main")
    }

//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        assertEquals("moe.noridev.camsung", appContext.packageName)
//    }
}