package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.my.target.v9;
import com.my.target.y9;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class y9 extends ne {
    private final x9 a;
    private final v9 b;
    private final w9 c;
    private final ij d;
    private final v5 e;
    private final v5 f;
    private final v5 g;
    private final ViewGroup h;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void b();

        void d();
    }

    public y9(boolean z, final a aVar, v9.a aVar2, WebViewClient webViewClient, int i, int i2, Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.a = new x9(z, i, i2, context);
        this.b = new v9(context, aVar2, webViewClient);
        this.c = new w9(context);
        ij ijVar = new ij(context);
        this.d = ijVar;
        ijVar.setCircleColor(536870912);
        addView(ijVar);
        qi g = qi.g(context);
        v5 v5Var = new v5(context);
        this.f = v5Var;
        v5Var.setPadding(g.b(3));
        v5Var.setVisibility(8);
        v5Var.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.y9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y9.a.this.b();
            }
        });
        v5Var.a(f9.g(context), true);
        v5Var.setBackgroundColor(536870912);
        a(v5Var, g.b(22));
        addView(v5Var);
        v5 v5Var2 = new v5(context);
        this.g = v5Var2;
        v5Var2.setVisibility(8);
        v5Var2.setPadding(g.b(3));
        v5Var2.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.y9$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y9.a.this.d();
            }
        });
        v5Var2.a(f9.e(context), true);
        v5Var2.setBackgroundColor(536870912);
        a(v5Var2, g.b(22));
        addView(v5Var2);
        v5 v5Var3 = new v5(context);
        this.e = v5Var3;
        v5Var3.a(g.b(6), g.b(9));
        v5Var3.a(f9.d(context), true);
        v5Var3.setBackgroundColor(536870912);
        a(v5Var3, g.b(24));
        addView(v5Var3);
    }

    public void c() {
        if (this.b.getParent() != null) {
            return;
        }
        if (this.a.getParent() != null) {
            this.h.removeView(this.a);
        }
        this.h.addView(this.b, -1, -1);
    }

    public void d() {
        this.d.setVisibility(8);
        this.f.setVisibility(0);
    }

    @Override // com.my.target.ne, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        if (this.c.getParent() != null) {
            return;
        }
        this.h.addView(this.c, -1, -1);
    }

    public void f() {
        this.d.setVisibility(0);
        this.f.setVisibility(8);
    }

    public void g() {
        if (this.a.getParent() != null) {
            return;
        }
        this.h.addView(this.a, -1, -1);
    }

    @NonNull
    public v5 getAdChoicesButton() {
        return this.e;
    }

    @NonNull
    public v9 getInteractiveView() {
        return this.b;
    }

    @NonNull
    public w9 getPostView() {
        return this.c;
    }

    @NonNull
    public ij getProgressView() {
        return this.d;
    }

    @NonNull
    public x9 getVideoView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        qi g = qi.g(getContext());
        this.h.layout(0, 0, i5, i6);
        if (this.h.getChildCount() > 0) {
            this.h.getChildAt(0).layout(0, 0, i5, i6);
        }
        int b = g.b(28);
        int b2 = i5 - g.b(10);
        int b3 = g.b(8);
        this.d.layout(b2 - b, b3, b2, b + b3);
        int b4 = g.b(28);
        int b5 = i5 - g.b(10);
        int b6 = g.b(8);
        this.f.layout(b5 - b4, b6, b5, b4 + b6);
        int b7 = g.b(28);
        int b8 = i5 - g.b(10);
        int b9 = g.b(8);
        this.g.layout(b8 - b7, b9, b8, b7 + b9);
        int b10 = g.b(90);
        int b11 = g.b(28);
        int b12 = g.b(8);
        int b13 = g.b(7);
        this.e.layout(b12, b13, b10 + b12, b11 + b13);
    }

    @Override // com.my.target.ne, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        qi g = qi.g(getContext());
        this.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (this.h.getChildCount() > 0) {
            this.h.getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        int b = g.b(28);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
        int b2 = g.b(28);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(b2, 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(b2, 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(g.b(90), 1073741824), View.MeasureSpec.makeMeasureSpec(g.b(28), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public boolean a() {
        return this.g.getVisibility() == 0;
    }

    public void b() {
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }
}
