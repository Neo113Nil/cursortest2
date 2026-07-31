package com.google.android.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes13.dex */
public abstract class RippleUtils {
    public static final boolean USE_FRAMEWORK_RIPPLE = true;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] HOVERED_FOCUSED_STATE_SET = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] FOCUSED_STATE_SET = {R.attr.state_focused};
    private static final int[] HOVERED_STATE_SET = {R.attr.state_hovered};
    private static final int[] SELECTED_PRESSED_STATE_SET = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] SELECTED_FOCUSED_STATE_SET = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] SELECTED_HOVERED_STATE_SET = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] SELECTED_STATE_SET = {R.attr.state_selected};
    private static final int[] ENABLED_PRESSED_STATE_SET = {R.attr.state_enabled, R.attr.state_pressed};
    static final String LOG_TAG = RippleUtils.class.getSimpleName();

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
                Log.w(LOG_TAG, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
