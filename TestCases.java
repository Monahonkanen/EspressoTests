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
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestCases {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCase1() {
        /*ViewInteraction textView = onView(
                allOf(withId(R.id.titleText), withText("Laske painoindeksisi"),
                        isDisplayed()));
        textView.check(matches(withText("Laske painoindeksisi")));*/

        ViewInteraction editText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        editText.check(matches(withText("")));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        editText2.check(matches(withText("")));

        ViewInteraction button = onView(
                allOf(withId(R.id.laskeButton),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }
    @Test
    public void testCase2() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("170"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction editText1 = onView(
                allOf(withId(R.id.editPituus), withText("170"),
                        isDisplayed()));
        editText1.check(matches(withText("170")));

        ViewInteraction editText = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        editText.check(matches(hasErrorText("Kirjoita paino!")));
    }

    @Test
    public void testCase3() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("170"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("20"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.editPituus), withText("170"),
                        isDisplayed()));
        editText3.check(matches(withText("170")));

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.editPaino), withText("20"),
                        isDisplayed()));
        editText4.check(matches(withText("20")));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        editText2.check(matches(hasErrorText("30 - 220")));
    }

    @Test
    public void testCase4() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("170"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("65"),closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.resultView), withText("22,5"),
                        isDisplayed()));
        textView3.check(matches(withText("22.5")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.labelView), withText("\nOlet normaalipainoinen."),
                        isDisplayed()));
        textView4.check(matches(withText("\nOlet normaalipainoinen.")));

        ViewInteraction imageView = onView(
                allOf(withId(R.id.imageView2),
                        isDisplayed()));
        imageView.check(matches(isDisplayed()));

        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Navigate up"),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction editText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        editText.check(matches(withText("")));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        editText2.check(matches(withText("")));

        ViewInteraction button = onView(
                allOf(withId(R.id.laskeButton),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    @Test
    public void testCase5() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("160"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("35"));

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.resultView), withText("13.7"),
                        isDisplayed()));
        textView6.check(matches(withText("13,7")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.labelView), withText("\n \n\nNormaali painosi tulisi olla: \n47.4 - 64 kg.\n\nNormaalipainoon - 12.4 kg."),
                        isDisplayed()));
        textView7.check(matches(withText("\nOlet alipainoinen.")));

        ViewInteraction imageView3 = onView(
                allOf(withId(R.id.imageView2),
                        isDisplayed()));
        imageView3.check(matches(isDisplayed()));
    }
}
