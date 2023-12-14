package com.example;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.projetoi.FormCadastro;
import com.example.projetoi.FormLogin;
import com.example.projetoi.R;
import com.google.android.material.snackbar.Snackbar;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.Normalizer;

public class ActivityLoginTest {
    public void testLogin() {


        //Matheus vaz
        ActivityScenario.launch(FormLogin.class);

        Espresso.onView(withId(R.id.edit_email))
                .perform(ViewActions.typeText("matheus@email"), ViewActions.closeSoftKeyboard());

        Espresso.onView(withId(R.id.edit_senha))
                .perform(ViewActions.typeText("123456"), ViewActions.closeSoftKeyboard());

        Espresso.onView(withId(R.id.bt_entrar))
                .perform(ViewActions.click());

    }
}
