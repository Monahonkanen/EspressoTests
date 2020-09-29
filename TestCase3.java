package fi.jamk.bmiapp;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasErrorText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestCase3 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCase3() {
        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("20"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        editText2.check(matches(hasErrorText("30 - 220")));

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.editPituus), withText("170"),
                        isDisplayed()));
        editText3.check(matches(withText("170")));

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.editPaino), withText("20"),
                        isDisplayed()));
        editText4.check(matches(withText("20")));
    }
}
