package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.my.target.common.models.ImageData;
import com.my.target.i;
import com.my.target.o;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class j extends FrameLayout implements o.a, i {
    private final hg a;
    private w2 b;
    private WeakReference c;
    private final ListView d;
    private final TextView e;
    private final TextView f;
    private FrameLayout g;
    private final i.a h;
    private final LinearLayout i;

    public j(Context context, i.a aVar) {
        super(context);
        hg a = hg.a(context);
        this.a = a;
        this.b = w2.a(context);
        this.h = aVar;
        int a2 = a.a(hg.m);
        setPadding(a2, a2, a2, a2);
        setBackgroundColor(0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setBackground(b());
        addView(linearLayout);
        int i = hg.r;
        int a3 = a.a(i);
        int i2 = hg.k;
        int a4 = a.a(i2);
        linearLayout.setElevation(a.a(hg.f));
        linearLayout.setPadding(0, a3, 0, a4);
        TextView a5 = a(context, true);
        this.e = a5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a6 = a.a(i);
        layoutParams.setMargins(a6, 0, a6, 0);
        a5.setLayoutParams(layoutParams);
        linearLayout.addView(a5);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(a6, a.a(i2), a6, 0);
        TextView a7 = a(context, false);
        this.f = a7;
        a7.setLayoutParams(layoutParams2);
        linearLayout.addView(a7);
        ListView listView = new ListView(context);
        this.d = listView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, a.a(i), 0, 0);
        listView.setLayoutParams(layoutParams3);
        listView.setDivider(null);
        linearLayout.addView(listView);
    }

    @Override // com.my.target.i
    public View a() {
        return this;
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        this.g = frameLayout;
        frameLayout.addView(this, -1, -2);
        c();
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
    }

    public void c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }

    @Override // com.my.target.i
    public void dismiss() {
        o oVar;
        WeakReference weakReference = this.c;
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
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
            this.c = null;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b = w2.a(getContext());
        this.i.setBackground(b());
        dismiss();
    }

    @Override // android.widget.FrameLayout, android.view.View
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
        gradientDrawable.setColor(this.b.a(w2.r));
        gradientDrawable.setCornerRadius(this.a.a(hg.n));
        return gradientDrawable;
    }

    @Override // com.my.target.i
    public void a(String str, String str2, String str3, ImageData imageData, String str4, List list) {
        this.e.setText(str);
        this.f.setText(str2);
        if (list == null) {
            return;
        }
        c cVar = new c(list);
        i.a aVar = this.h;
        Objects.requireNonNull(aVar);
        cVar.a(new c2$$ExternalSyntheticLambda2(aVar));
        this.d.setAdapter((ListAdapter) cVar);
        try {
            o a = o.a(this, getContext());
            this.c = new WeakReference(a);
            a.show();
            Window window = a.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    private TextView a(Context context, boolean z) {
        TextView textView = new TextView(context);
        textView.setTextColor(this.b.a(w2.v));
        if (z) {
            textView.setTypeface(null, 1);
            return textView;
        }
        textView.setTypeface(null, 0);
        return textView;
    }
}
