package com.example.johnmachahuay.reportit.Utils;

import android.util.Patterns;

/**
 * Created by jmachahuay on 2/3/2017.
 */

public class RegularExpressionValidator {
    public static boolean isValidEmail(CharSequence target) {
        return Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
