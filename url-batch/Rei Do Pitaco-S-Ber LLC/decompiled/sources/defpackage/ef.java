package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ef {
    public final TextView a;
    public final FrameLayout b;
    public final View c;
    public final Button d;
    public final View e;
    public final View f;
    public final TextView g;
    public final View h;

    public ef(CardView cardView, CardView cardView2, CheckBox checkBox, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.b = cardView;
        this.c = cardView2;
        this.d = checkBox;
        this.e = view;
        this.a = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
    }

    public ef(ScrollView scrollView, Button button, Button button2, LinearLayout linearLayout, LinearLayout linearLayout2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView) {
        this.b = scrollView;
        this.c = button;
        this.d = button2;
        this.e = linearLayout;
        this.f = linearLayout2;
        this.g = textInputEditText;
        this.h = textInputLayout;
        this.a = textView;
    }
}
