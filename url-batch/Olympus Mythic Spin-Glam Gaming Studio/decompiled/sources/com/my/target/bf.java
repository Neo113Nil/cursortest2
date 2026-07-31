package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.my.target.ia;
import com.my.target.s9;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class bf extends RelativeLayout implements ha {
    private static final int y = qi.c();
    private final a a;
    private final b b;
    private final fh c;
    private final zi d;
    private final ef e;
    private final le f;
    private final w5 g;
    private final ij h;
    private final qi i;
    private final w5 j;
    private final m k;
    private final Bitmap l;
    private final Bitmap m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    ia.a s;
    private float t;
    private s9.a u;
    private final View.OnTouchListener v;
    private h2 w;
    private boolean x;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(View view, int i, n2 n2Var);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(View view, n2 n2Var);
    }

    public bf(Context context, cf cfVar) {
        super(context);
        this.w = h2.a();
        this.x = false;
        boolean z = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        qi g = qi.g(context);
        this.i = g;
        fh fhVar = new fh(context);
        this.c = fhVar;
        zi b2 = cfVar.b(g, z);
        this.d = b2;
        ef a2 = cfVar.a(g, z);
        this.e = a2;
        int i = y;
        a2.setId(i);
        w5 w5Var = new w5(context);
        this.g = w5Var;
        ij ijVar = new ij(context);
        this.h = ijVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        le leVar = new le(context, g);
        this.f = leVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        leVar.setLayoutParams(layoutParams3);
        w5 w5Var2 = new w5(context);
        this.j = w5Var2;
        this.l = f9.l(context);
        this.m = f9.k(context);
        this.a = new a() { // from class: com.my.target.bf$$ExternalSyntheticLambda7
            @Override // com.my.target.bf.a
            public final void a(View view, int i2, n2 n2Var) {
                bf.this.a(view, i2, n2Var);
            }
        };
        this.b = new b() { // from class: com.my.target.bf$$ExternalSyntheticLambda8
            @Override // com.my.target.bf.b
            public final void a(View view, n2 n2Var) {
                bf.this.a(view, n2Var);
            }
        };
        this.n = g.b(64);
        this.o = g.b(20);
        m mVar = new m(context);
        this.k = mVar;
        int b3 = g.b(28);
        this.r = b3;
        mVar.setFixedHeight(b3);
        qi.b(fhVar, ViewHierarchyConstants.ICON_BITMAP);
        qi.b(w5Var2, "sound_button");
        qi.b(b2, "vertical_view");
        qi.b(a2, "media_view");
        qi.b(leVar, "panel_view");
        qi.b(w5Var, "close_button");
        qi.b(ijVar, "progress_wheel");
        addView(leVar, 0);
        addView(fhVar, 0);
        addView(b2, 0, layoutParams);
        addView(a2, 0, layoutParams2);
        addView(w5Var2);
        addView(mVar);
        addView(w5Var);
        addView(ijVar);
        this.p = g.b(28);
        this.q = g.b(10);
        this.v = new g2(new g2.a() { // from class: com.my.target.bf$$ExternalSyntheticLambda9
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                bf.this.a(h2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.w = h2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f.b(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.b.a(view, q2.a());
    }

    @Override // com.my.target.ha
    public boolean b() {
        return this.e.d();
    }

    @Override // com.my.target.ha
    public void c(boolean z) {
        this.f.a(this.j);
        this.e.a(z);
    }

    @Override // com.my.target.ha
    public void d() {
    }

    @Override // com.my.target.ha
    public void destroy() {
        this.e.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.ia
    @NonNull
    public View getCloseButton() {
        return this.g;
    }

    @Override // com.my.target.ha
    @NonNull
    public ef getPromoMediaView() {
        return this.e;
    }

    @Override // com.my.target.ia
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.ha
    public boolean isPlaying() {
        return this.e.e();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        w5 w5Var = this.g;
        w5Var.layout(i3 - w5Var.getMeasuredWidth(), 0, i3, this.g.getMeasuredHeight());
        ij ijVar = this.h;
        int i5 = this.q;
        ijVar.layout(i5, i5, ijVar.getMeasuredWidth() + this.q, this.h.getMeasuredHeight() + this.q);
        qi.a(this.k, this.g.getLeft() - this.k.getMeasuredWidth(), this.g.getTop(), this.g.getLeft(), this.g.getBottom());
        if (i4 <= i3) {
            setBackgroundColor(-16777216);
            int measuredWidth = (i3 - this.e.getMeasuredWidth()) / 2;
            int measuredHeight = (i4 - this.e.getMeasuredHeight()) / 2;
            ef efVar = this.e;
            efVar.layout(measuredWidth, measuredHeight, efVar.getMeasuredWidth() + measuredWidth, this.e.getMeasuredHeight() + measuredHeight);
            this.c.layout(0, 0, 0, 0);
            this.d.layout(0, 0, 0, 0);
            le leVar = this.f;
            leVar.layout(0, i4 - leVar.getMeasuredHeight(), i3, i4);
            w5 w5Var2 = this.j;
            w5Var2.layout(i3 - w5Var2.getMeasuredWidth(), this.f.getTop() - this.j.getMeasuredHeight(), i3, this.f.getTop());
            if (this.e.e()) {
                this.f.b(this.j);
                return;
            }
            return;
        }
        if (this.j.getTranslationY() > 0.0f) {
            this.j.setTranslationY(0.0f);
        }
        setBackgroundColor(-1);
        int measuredWidth2 = (i3 - this.e.getMeasuredWidth()) / 2;
        ef efVar2 = this.e;
        efVar2.layout(measuredWidth2, 0, efVar2.getMeasuredWidth() + measuredWidth2, this.e.getMeasuredHeight());
        this.d.layout(0, this.e.getBottom(), i3, i4);
        int i6 = this.o;
        if (this.e.getMeasuredHeight() != 0) {
            i6 = this.e.getBottom() - (this.c.getMeasuredHeight() / 2);
        }
        fh fhVar = this.c;
        int i7 = this.o;
        fhVar.layout(i7, i6, fhVar.getMeasuredWidth() + i7, this.c.getMeasuredHeight() + i6);
        this.f.layout(0, 0, 0, 0);
        w5 w5Var3 = this.j;
        w5Var3.layout(i3 - w5Var3.getMeasuredWidth(), this.e.getBottom() - this.j.getMeasuredHeight(), i3, this.e.getBottom());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.j.measure(i, i2);
        this.g.measure(i, i2);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(this.p, 1073741824), View.MeasureSpec.makeMeasureSpec(this.p, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        m mVar = this.k;
        int i3 = this.r;
        qi.a(mVar, i3, i3, 1073741824);
        if (size2 > size) {
            this.e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - this.e.getMeasuredHeight(), Integer.MIN_VALUE));
            this.c.measure(View.MeasureSpec.makeMeasureSpec(this.n, Integer.MIN_VALUE), makeMeasureSpec2);
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), makeMeasureSpec2);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // com.my.target.ha
    public void pause() {
        this.f.e(this.j);
        this.e.f();
    }

    @Override // com.my.target.ha
    public void resume() {
        this.f.a(this.j);
        this.e.g();
    }

    @Override // com.my.target.ia
    public void setBanner(@NonNull d9 d9Var) {
        int i;
        int i2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.p, this.i.b(28));
        layoutParams.addRule(9);
        layoutParams.topMargin = this.i.b(10);
        layoutParams.leftMargin = this.i.b(10);
        this.h.setLayoutParams(layoutParams);
        this.h.setVisibility(8);
        this.x = d9Var.f().b();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.g.setVisibility(8);
        this.g.setLayoutParams(layoutParams2);
        eb j0 = d9Var.j0();
        if (j0 == null) {
            this.j.setVisibility(8);
        }
        Point c = qi.c(getContext());
        boolean z = c.x + c.y < 1280 || b(d9Var);
        this.f.a();
        this.f.setBanner(d9Var);
        this.d.a(c.x, c.y, z);
        this.d.setBanner(d9Var);
        this.e.c();
        this.e.b(d9Var, 0);
        ImageData Z = d9Var.Z();
        if (Z == null || Z.getData() == null) {
            Bitmap a2 = a1.a(this.r);
            if (a2 != null) {
                this.g.a(a2, false);
            }
        } else {
            this.g.a(Z.getData(), true);
        }
        ImageData w = d9Var.w();
        if (w != null) {
            i = w.getWidth();
            i2 = w.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = this.i.b(4);
        if (i != 0 && i2 != 0) {
            int b2 = (int) (this.i.b(64) * (i2 / i));
            layoutParams3.width = this.n;
            layoutParams3.height = b2;
            if (!z) {
                layoutParams3.bottomMargin = (-b2) / 2;
            }
        }
        layoutParams3.addRule(8, y);
        layoutParams3.setMarginStart(this.i.b(20));
        this.c.setLayoutParams(layoutParams3);
        if (w != null) {
            this.c.setImageBitmap(w.getData());
        }
        if (j0 != null && j0.v0()) {
            c(true);
            post(new Runnable() { // from class: com.my.target.bf$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    bf.this.e();
                }
            });
        }
        if (j0 != null) {
            this.t = j0.t();
            if (j0.u0()) {
                this.j.a(this.m, false);
                this.j.setContentDescription("sound_off");
            } else {
                this.j.a(this.l, false);
                this.j.setContentDescription("sound_on");
            }
        }
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bf.this.b(view);
            }
        });
        e a3 = d9Var.a();
        if (a3 != null) {
            a(a3);
        } else {
            this.k.setVisibility(8);
        }
    }

    @Override // com.my.target.ia
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@NonNull e2 e2Var) {
        if (this.x) {
            setClickAreaActual(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull e2 e2Var) {
        mi.a("PromoDefaultStyleView: Apply click area " + e2Var.a() + " to view");
        if (e2Var.c || e2Var.m) {
            this.c.setOnTouchListener(this.v);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bf.this.c(view);
                }
            });
        } else {
            this.c.setOnClickListener(null);
        }
        if (e2Var.m || e2Var.d) {
            this.e.getImageView().setOnTouchListener(this.v);
            this.e.getImageView().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bf.this.d(view);
                }
            });
        }
        if (e2Var.m || e2Var.n) {
            this.e.getClickableLayout().setOnTouchListener(this.v);
            this.e.getClickableLayout().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bf.this.e(view);
                }
            });
        } else {
            this.e.b();
        }
        this.d.a(e2Var, this.a);
        this.f.a(e2Var, this.a);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaLegacy(@NonNull e2 e2Var) {
        mi.a("PromoDefaultStyleView: Apply click area " + e2Var.a() + " to view");
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bf.this.f(view);
            }
        };
        this.c.setOnClickListener((e2Var.c || e2Var.m) ? onClickListener : null);
        this.e.getImageView().setOnClickListener((e2Var.m || e2Var.d) ? onClickListener : null);
        if (e2Var.m || e2Var.n) {
            this.e.getClickableLayout().setOnClickListener(onClickListener);
        } else {
            this.e.b();
        }
        this.d.a(e2Var, this.a);
        this.f.a(e2Var, this.a);
    }

    @Override // com.my.target.ia
    public void setInterstitialPromoViewListener(@Nullable ia.a aVar) {
        this.s = aVar;
    }

    @Override // com.my.target.ha
    public void setMediaListener(@Nullable s9.a aVar) {
        this.u = aVar;
        this.e.setInterstitialPromoViewListener(aVar);
        this.e.h();
    }

    @Override // com.my.target.ha
    public void setTimeChanged(float f) {
        this.h.setVisibility(0);
        float f2 = this.t;
        if (f2 > 0.0f) {
            this.h.setProgress(f / f2);
        }
        this.h.setDigit((int) ((this.t - f) + 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.b.a(view, t2.a(8, this.w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.b.a(view, t2.a(8192, this.w));
    }

    @Override // com.my.target.ha
    public void a(d9 d9Var) {
        this.j.setVisibility(8);
        this.g.setVisibility(0);
        a(false);
        this.e.b(d9Var);
    }

    @Override // com.my.target.ha
    public final void b(boolean z) {
        if (z) {
            this.j.a(this.m, false);
            this.j.setContentDescription("sound_off");
        } else {
            this.j.a(this.l, false);
            this.j.setContentDescription("sound_on");
        }
    }

    @Override // com.my.target.ia
    public void c() {
        this.g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.b.a(view, t2.a(4, this.w));
    }

    @Override // com.my.target.ha
    public void a(boolean z) {
        this.h.setVisibility(8);
        this.f.e(this.j);
        this.e.b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        s9.a aVar = this.u;
        if (aVar != null) {
            aVar.a();
        }
    }

    private boolean b(d9 d9Var) {
        int height;
        int width;
        eb j0 = d9Var.j0();
        if (j0 != null) {
            dj djVar = (dj) j0.A0();
            if (djVar != null) {
                height = djVar.getHeight();
                width = djVar.getWidth();
            }
            width = 0;
            height = 0;
        } else {
            ImageData y2 = d9Var.y();
            if (y2 != null) {
                height = y2.getHeight();
                width = y2.getWidth();
            }
            width = 0;
            height = 0;
        }
        if (height <= 0 || width <= 0) {
            return false;
        }
        return height > width || ((float) width) / ((float) height) < 1.4f;
    }

    @Override // com.my.target.ha
    public void a(int i) {
        this.e.a(i);
    }

    @Override // com.my.target.ha
    public void a() {
        this.e.i();
    }

    private void a(e eVar) {
        this.k.setImageBitmap(eVar.g().getBitmap());
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.bf$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bf.this.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ia.a aVar = this.s;
        if (aVar != null) {
            aVar.a();
        }
    }

    protected void a(View view, n2 n2Var) {
        a(view, 1, n2Var);
    }

    protected void a(View view, int i, n2 n2Var) {
        ia.a aVar;
        if (!view.isEnabled() || (aVar = this.s) == null) {
            return;
        }
        aVar.a(i, n2Var);
    }
}
