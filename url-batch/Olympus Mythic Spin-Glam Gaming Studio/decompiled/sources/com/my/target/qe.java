package com.my.target;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.common.models.ImageData;
import com.my.target.i;
import com.my.target.o;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class qe extends LinearLayout implements o.a, i, View.OnClickListener {
    private WeakReference a;
    private final TextView b;
    private TextView c;
    private TextView d;
    private FrameLayout e;
    private final Button f;
    private final v5 g;
    private final hg h;
    private final w2 i;
    private final i.a j;

    public qe(Context context, i.a aVar) {
        super(context);
        hg a = hg.a(context);
        this.h = a;
        w2 a2 = w2.a(context);
        this.i = a2;
        this.j = aVar;
        setOrientation(1);
        setBackground(b());
        this.b = c(context);
        this.g = a(context);
        addView(d(context));
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, qi.a(1, context));
        int a3 = a.a(hg.v);
        int i = hg.r;
        int a4 = a.a(i);
        layoutParams.setMargins(a4, a3, a4, 0);
        view.setLayoutParams(c());
        view.setBackgroundColor(a2.a(w2.F));
        addView(view);
        LinearLayout b = b(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        b.setLayoutParams(layoutParams2);
        addView(b);
        Button button = new Button(context);
        this.f = button;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int a5 = a.a(i);
        int a6 = a.a(hg.n);
        layoutParams3.setMargins(a5, a6, a5, a6);
        button.setLayoutParams(layoutParams3);
        button.setTextColor(a2.a(w2.y));
        button.setBackground(a2.a(a2.a(w2.B), a2.a(w2.A), a2.a(w2.C), a.a(r3)));
        button.setOnClickListener(this);
        addView(button);
    }

    private TextView c(Context context) {
        TextView textView = new TextView(context);
        textView.setTextAlignment(4);
        textView.setTextColor(this.i.a(w2.s));
        textView.setTextSize(this.h.a(hg.X));
        textView.setTypeface(null, 1);
        textView.setPadding(this.h.a(hg.k), 0, 0, 0);
        return textView;
    }

    private LinearLayout d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.b.setLayoutParams(layoutParams);
        linearLayout.addView(this.b);
        return linearLayout;
    }

    private ImageView e(Context context) {
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a = this.h.a(hg.y);
        layoutParams.setMargins(a, 0, a, 0);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(b2.a(this.h.a(hg.F), context));
        imageView.setColorFilter(this.i.a(w2.G));
        return imageView;
    }

    @Override // com.my.target.i
    public View a() {
        return this;
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        this.e = frameLayout;
        frameLayout.addView(this, -1, -1);
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
    }

    @Override // com.my.target.i
    public void dismiss() {
        o oVar;
        WeakReference weakReference = this.a;
        if (weakReference == null || (oVar = (o) weakReference.get()) == null) {
            return;
        }
        oVar.dismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.o.a
    public void m() {
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            weakReference.clear();
            this.a = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
        this.j.b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.i.a(w2.r));
        float a = this.h.a(hg.n);
        gradientDrawable.setCornerRadii(new float[]{a, a, a, a, 0.0f, 0.0f, 0.0f, 0.0f});
        return gradientDrawable;
    }

    @Override // com.my.target.i
    public void a(String str, String str2, String str3, ImageData imageData, String str4, List list) {
        TextView textView = this.b;
        if (TextUtils.isEmpty(str)) {
            str = fi.a;
        }
        textView.setText(str);
        TextView textView2 = this.c;
        if (textView2 != null) {
            if (TextUtils.isEmpty(str3)) {
                str3 = fi.f;
            }
            textView2.setText(str3);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            if (TextUtils.isEmpty(str2)) {
                str2 = fi.g;
            }
            textView3.setText(str2);
        }
        Button button = this.f;
        if (TextUtils.isEmpty(str4)) {
            str4 = fi.i;
        }
        button.setText(str4);
        try {
            o a = o.a(this, getContext());
            this.a = new WeakReference(a);
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int a = this.h.a(hg.y);
        linearLayout.setPadding(a, a, a, a);
        ImageView e = e(context);
        int a2 = this.h.a(hg.F);
        e.setLayoutParams(new ViewGroup.LayoutParams(a2, a2));
        linearLayout.addView(e);
        this.c = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, this.h.a(hg.n), 0, 0);
        this.c.setTextSize(this.h.a(hg.X));
        this.c.setTypeface(null, 1);
        this.c.setTextColor(this.i.a(w2.s));
        this.c.setTextAlignment(4);
        this.c.setLayoutParams(layoutParams);
        linearLayout.addView(this.c);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, this.h.a(hg.k), 0, 0);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(this.h.a(hg.S));
        this.d.setTextColor(this.i.a(w2.v));
        this.d.setTextAlignment(4);
        this.d.setLayoutParams(layoutParams2);
        linearLayout.addView(this.d);
        return linearLayout;
    }

    private LinearLayout.LayoutParams c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.h.a(hg.d));
        int a = this.h.a(hg.g);
        int a2 = this.h.a(hg.r);
        layoutParams.setMargins(a2, a, a2, 0);
        return layoutParams;
    }

    private v5 a(Context context) {
        v5 v5Var = new v5(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.h.a(hg.D), this.h.a(hg.E));
        layoutParams.setMarginStart(this.h.a(hg.g));
        v5Var.setLayoutParams(layoutParams);
        v5Var.a(this.h.a(hg.m), this.h.a(hg.k));
        v5Var.a(m1.a(this.h.a(hg.w), this.i.a(w2.G), context), false);
        v5Var.setOnClickListener(this);
        return v5Var;
    }
}
