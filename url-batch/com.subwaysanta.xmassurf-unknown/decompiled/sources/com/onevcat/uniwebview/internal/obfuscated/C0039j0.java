package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039j0 extends Toolbar {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public InterfaceC0043k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039j0(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = IntCompanionObject.MAX_VALUE;
        setTitle("");
        setElevation(5.0f);
        setBackgroundColor(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        linearLayout.setLayoutParams(layoutParams);
        TextView a = a("❮");
        this.b = a;
        TextView a2 = a("❯");
        this.c = a2;
        TextView a3 = a("Done");
        this.a = a3;
        a(false, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(24, 0, 24, 0);
        linearLayout.addView(a, layoutParams2);
        linearLayout.addView(a2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(48, 0, 24, 0);
        linearLayout.addView(a3, layoutParams3);
        addView(linearLayout);
    }

    public final void a(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setBackgroundColor(Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setTitleTextColor(Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final InterfaceC0043k0 getDelegate() {
        return this.d;
    }

    public final int getMaxHeight() {
        return this.e;
    }

    @Override // android.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e < getMeasuredHeight()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        }
    }

    public final void setDelegate(InterfaceC0043k0 interfaceC0043k0) {
        this.d = interfaceC0043k0;
    }

    public final void setDoneButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.a.setText(text);
    }

    public final void setGoBackButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.b.setText(text);
    }

    public final void setGoForwardButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.c.setText(text);
    }

    public final void setMaxHeight(int i) {
        this.e = Math.max(0, i);
        requestLayout();
    }

    public final void setNavigationButtonsShow(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void a(boolean z, boolean z2) {
        this.b.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.3f);
        this.c.setEnabled(z2);
        this.c.setAlpha(z2 ? 1.0f : 0.3f);
    }

    public final TextView a(String str) {
        final TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.j0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0039j0.a(C0039j0.this, textView, view);
            }
        });
        return textView;
    }

    public static final void a(C0039j0 this$0, TextView button, View view) {
        InterfaceC0043k0 interfaceC0043k0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(button, "$button");
        if (Intrinsics.areEqual(button, this$0.a)) {
            InterfaceC0043k0 interfaceC0043k02 = this$0.d;
            if (interfaceC0043k02 != null) {
                C0031h0 c0031h0 = (C0031h0) interfaceC0043k02;
                c0031h0.c.a(c0031h0.v.getName(), P2.WebViewDone, "");
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(button, this$0.b)) {
            InterfaceC0043k0 interfaceC0043k03 = this$0.d;
            if (interfaceC0043k03 != null) {
                ((C0031h0) interfaceC0043k03).v.b();
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(button, this$0.c) || (interfaceC0043k0 = this$0.d) == null) {
            return;
        }
        C0092z c0092z = ((C0031h0) interfaceC0043k0).v;
        C0092z c0092z2 = c0092z.d.i;
        if (c0092z2 != null) {
            if (c0092z2.canGoForward()) {
                c0092z2.goForward();
            }
        } else if (c0092z.canGoForward()) {
            c0092z.goForward();
        }
    }
}
