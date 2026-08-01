package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import defpackage.m60;
import defpackage.y2;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView f;
    public Button g;
    public Button h;
    public final TimeInterpolator i;
    public int j;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = m60.U(context, R.attr.motionEasingEmphasizedInterpolator, y2.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f.getPaddingTop() == i2 && this.f.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.g;
    }

    public Button getCloseView() {
        return this.h;
    }

    public TextView getMessageView() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView) findViewById(R.id.snackbar_text);
        this.g = (Button) findViewById(R.id.snackbar_action);
        this.h = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.j <= 0 || this.g.getMeasuredWidth() <= this.j) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.j = i;
    }
}
