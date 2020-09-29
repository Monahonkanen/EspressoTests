package fi.jamk.bmiapp;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
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
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.startsWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestCase5 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    public void testCase5() {
        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Navigate up"),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.editPituus),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("160"), closeSoftKeyboard());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.editPaino),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("35"), closeSoftKeyboard());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.tulosTitleView), withText("Painoindeksisi on:"),
                        isDisplayed()));
        textView5.check(matches(withText("Painoindeksisi on:")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.resultView), withText("13.7"),
                        isDisplayed()));
        textView6.check(matches(withText("13.7")));

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
