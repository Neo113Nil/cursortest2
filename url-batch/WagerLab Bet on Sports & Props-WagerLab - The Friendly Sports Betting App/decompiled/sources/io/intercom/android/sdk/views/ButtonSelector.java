package io.intercom.android.sdk.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

/* loaded from: classes8.dex */
public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i, int i2) {
        this.color = i2;
        addState(new int[]{R.attr.state_enabled}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_focused}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_pressed}, context.getResources().getDrawable(i));
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919 || i == 16842908) {
                z = true;
            }
        }
        if (z) {
            setColorFilter(darken(this.color, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(this.color, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }

    private static int darken(int i, double d) {
        return Color.argb(255, (int) (Color.red(i) * d), (int) (Color.green(i) * d), (int) (Color.blue(i) * d));
    }
}
