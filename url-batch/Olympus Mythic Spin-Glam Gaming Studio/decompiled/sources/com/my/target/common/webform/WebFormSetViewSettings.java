package com.my.target.common.webform;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class WebFormSetViewSettings {

    @ColorInt
    public final int actionBarColor;

    @ColorInt
    public final int navigationBarColor;

    @Nullable
    public final String statusBarStyle;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusBarStyle {
        public static final String DARK = "dark";
        public static final String LIGHT = "light";
    }

    public WebFormSetViewSettings(@Nullable String str, @ColorInt int i, @ColorInt int i2) {
        this.statusBarStyle = str;
        this.actionBarColor = i;
        this.navigationBarColor = i2;
    }
}
