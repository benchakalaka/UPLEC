//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.uplec.electronics.utils;

import android.content.Context;
import android.content.SharedPreferences;
import org.androidannotations.api.sharedpreferences.BooleanPrefEditorField;
import org.androidannotations.api.sharedpreferences.BooleanPrefField;
import org.androidannotations.api.sharedpreferences.EditorHelper;
import org.androidannotations.api.sharedpreferences.IntPrefEditorField;
import org.androidannotations.api.sharedpreferences.IntPrefField;
import org.androidannotations.api.sharedpreferences.SharedPreferencesHelper;

public final class AppPref_
    extends SharedPreferencesHelper
{

    private Context context_;

    public AppPref_(Context context) {
        super(context.getSharedPreferences("AppPref", 0));
        this.context_ = context;
    }

    public AppPref_.AppPrefEditor_ edit() {
        return new AppPref_.AppPrefEditor_(getSharedPreferences());
    }

    public IntPrefField maxValue() {
        return intField("maxValue", 199);
    }

    public BooleanPrefField writeAutomatically() {
        return booleanField("writeAutomatically", false);
    }

    public final static class AppPrefEditor_
        extends EditorHelper<AppPref_.AppPrefEditor_>
    {


        AppPrefEditor_(SharedPreferences sharedPreferences) {
            super(sharedPreferences);
        }

        public IntPrefEditorField<AppPref_.AppPrefEditor_> maxValue() {
            return intField("maxValue");
        }

        public BooleanPrefEditorField<AppPref_.AppPrefEditor_> writeAutomatically() {
            return booleanField("writeAutomatically");
        }

    }

}
