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
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestCase4 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCase4() {
        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editPaino), withText("20"),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("65"));

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.editPaino), withText("65"),
                        isDisplayed()));
        appCompatEditText4.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.laskeButton), withText("Laske"),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.tulosTitleView), withText("Painoindeksisi on:"),
                        isDisplayed()));
        textView2.check(matches(withText("Painoindeksisi on:")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.resultView), withText("22.5"),
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
    }
}
