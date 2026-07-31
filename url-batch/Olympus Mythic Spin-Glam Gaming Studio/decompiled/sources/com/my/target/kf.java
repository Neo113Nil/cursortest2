package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.views.StarsRatingView;
import com.my.target.g2;
import com.my.target.ia;
import com.my.target.s9;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class kf extends ViewGroup implements ha {
    ia.a A;
    s9.a B;
    int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    private String H;
    private String I;
    private boolean J;
    private h2 K;
    private boolean L;
    final LinearLayout a;
    final ef b;
    final x4 c;
    final x4 d;
    final m e;
    final Runnable f;
    private final c g;
    private final TextView h;
    private final StarsRatingView i;
    protected final Button j;
    private final TextView k;
    private final qi l;
    private final TextView m;
    private final ij n;
    private final w5 o;
    private final x4 p;
    private final d q;
    private final a r;
    private final View.OnTouchListener s;
    private final TextView t;
    private final FrameLayout u;
    private final int v;
    private final int w;
    private final Bitmap x;
    private final Bitmap y;
    private final int z;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ia.a aVar;
            s9.a aVar2;
            kf kfVar = kf.this;
            if (view == kfVar.a) {
                s9.a aVar3 = kfVar.B;
                if (aVar3 != null) {
                    aVar3.q();
                }
                kf.this.e();
                return;
            }
            if (view == kfVar.c) {
                if (!kfVar.b.e() || (aVar2 = kf.this.B) == null) {
                    return;
                }
                aVar2.l();
                return;
            }
            if (view != kfVar.d) {
                if (view != kfVar.e || (aVar = kfVar.A) == null) {
                    return;
                }
                aVar.a();
                return;
            }
            if (kfVar.B != null) {
                if (kfVar.b()) {
                    kf.this.B.n();
                } else {
                    kf.this.B.q();
                }
            }
            kf.this.e();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kf kfVar = kf.this;
            int i = kfVar.C;
            if (i == 2 || i == 0) {
                kfVar.e();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class c implements View.OnClickListener {
        c() {
        }

        private int a(View view) {
            kf kfVar = kf.this;
            if (view == kfVar.j) {
                return 64;
            }
            if (view == kfVar.h) {
                return 1;
            }
            if (view == kfVar.i) {
                return 16;
            }
            if (view == kfVar.m) {
                return 512;
            }
            return view == kfVar.b.getClickableLayout() ? 8192 : 2048;
        }

        private void b(View view) {
            int i = view == kf.this.j ? 2 : 1;
            if (view.isEnabled()) {
                t2 a = t2.a(a(view), kf.this.K);
                ia.a aVar = kf.this.A;
                if (aVar != null) {
                    aVar.a(i, a);
                }
            }
        }

        private void c(View view) {
            ia.a aVar;
            int i = view == kf.this.j ? 2 : 1;
            if (!view.isEnabled() || (aVar = kf.this.A) == null) {
                return;
            }
            aVar.a(i, q2.a());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (kf.this.L) {
                b(view);
            } else {
                c(view);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            kf kfVar = kf.this;
            kfVar.removeCallbacks(kfVar.f);
            kf kfVar2 = kf.this;
            int i = kfVar2.C;
            if (i == 2) {
                kfVar2.e();
                kf kfVar3 = kf.this;
                kfVar3.postDelayed(kfVar3.f, 4000L);
            } else if (i == 0 || i == 3) {
                kfVar2.g();
                kf kfVar4 = kf.this;
                kfVar4.postDelayed(kfVar4.f, 4000L);
            }
        }
    }

    public kf(Context context, boolean z) {
        super(context);
        this.K = h2.a();
        this.L = false;
        TextView textView = new TextView(context);
        this.k = textView;
        TextView textView2 = new TextView(context);
        this.h = textView2;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.i = starsRatingView;
        Button button = new Button(context);
        this.j = button;
        TextView textView3 = new TextView(context);
        this.t = textView3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.u = frameLayout;
        x4 x4Var = new x4(context);
        this.c = x4Var;
        x4 x4Var2 = new x4(context);
        this.d = x4Var2;
        x4 x4Var3 = new x4(context);
        this.p = x4Var3;
        TextView textView4 = new TextView(context);
        this.m = textView4;
        ef efVar = new ef(context, qi.g(context), false, z);
        this.b = efVar;
        ij ijVar = new ij(context);
        this.n = ijVar;
        w5 w5Var = new w5(context);
        this.o = w5Var;
        this.a = new LinearLayout(context);
        qi g = qi.g(context);
        this.l = g;
        this.f = new b();
        this.q = new d();
        this.r = new a();
        this.e = new m(context);
        qi.b(textView, "dismiss_button");
        qi.b(textView2, "title_text");
        qi.b(starsRatingView, "stars_view");
        qi.b(button, "cta_button");
        qi.b(textView3, "replay_text");
        qi.b(frameLayout, "shadow");
        qi.b(x4Var, "pause_button");
        qi.b(x4Var2, "play_button");
        qi.b(x4Var3, "replay_button");
        qi.b(textView4, "domain_text");
        qi.b(efVar, "media_view");
        qi.b(ijVar, "video_progress_wheel");
        qi.b(w5Var, "sound_button");
        this.z = g.b(28);
        this.v = g.b(16);
        this.w = g.b(4);
        this.x = f9.l(context);
        this.y = f9.k(context);
        this.g = new c();
        this.s = new g2(new g2.a() { // from class: com.my.target.kf$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                kf.this.a(h2Var);
            }
        });
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.K = h2Var;
    }

    private void f() {
        setBackgroundColor(-16777216);
        int i = this.v;
        this.b.setBackgroundColor(-16777216);
        this.b.c();
        this.u.setBackgroundColor(-1728053248);
        this.u.setVisibility(8);
        this.k.setTextSize(2, 16.0f);
        this.k.setTransformationMethod(null);
        TextView textView = this.k;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.k.setVisibility(8);
        this.k.setTextAlignment(4);
        this.k.setTextColor(-1);
        qi.a(this.k, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.h.setMaxLines(2);
        this.h.setEllipsize(truncateAt);
        this.h.setTextSize(2, 18.0f);
        this.h.setTextColor(-1);
        qi.a(this.j, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.j.setTextColor(-1);
        this.j.setTransformationMethod(null);
        this.j.setGravity(1);
        this.j.setTextSize(2, 16.0f);
        this.j.setMinimumWidth(this.l.b(100));
        this.j.setPadding(i, i, i, i);
        this.h.setShadowLayer(this.l.b(1), this.l.b(1), this.l.b(1), -16777216);
        this.m.setTextColor(-3355444);
        this.m.setMaxEms(10);
        this.m.setShadowLayer(this.l.b(1), this.l.b(1), this.l.b(1), -16777216);
        this.a.setOnClickListener(this.r);
        this.a.setGravity(17);
        this.a.setVisibility(8);
        this.a.setPadding(this.l.b(8), 0, this.l.b(8), 0);
        this.t.setSingleLine();
        this.t.setEllipsize(truncateAt);
        TextView textView2 = this.t;
        textView2.setTypeface(textView2.getTypeface(), 1);
        this.t.setTextColor(-1);
        this.t.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.l.b(4);
        this.p.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        this.c.setOnClickListener(this.r);
        this.c.setVisibility(8);
        this.c.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        this.d.setOnClickListener(this.r);
        this.d.setVisibility(8);
        this.d.setPadding(this.l.b(16), this.l.b(16), this.l.b(16), this.l.b(16));
        Bitmap c2 = f9.c(getContext());
        if (c2 != null) {
            this.d.setImageBitmap(c2);
        }
        Bitmap b2 = f9.b(getContext());
        if (b2 != null) {
            this.c.setImageBitmap(b2);
        }
        qi.a(this.c, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        qi.a(this.d, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        qi.a(this.p, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.i.setStarSize(this.l.b(12));
        this.n.setVisibility(8);
        this.e.setFixedHeight(this.z);
        addView(this.b);
        addView(this.u);
        addView(this.o);
        addView(this.k);
        addView(this.n);
        addView(this.a);
        addView(this.c);
        addView(this.d);
        addView(this.i);
        addView(this.m);
        addView(this.j);
        addView(this.h);
        addView(this.e);
        this.a.addView(this.p);
        this.a.addView(this.t, layoutParams);
    }

    private void h() {
        this.C = 1;
        this.a.setVisibility(8);
        this.d.setVisibility(0);
        this.c.setVisibility(8);
        this.u.setVisibility(0);
    }

    private void i() {
        this.a.setVisibility(8);
        this.d.setVisibility(8);
        if (this.C != 2) {
            this.c.setVisibility(8);
        }
    }

    private void j() {
        this.C = 4;
        if (this.G) {
            this.a.setVisibility(0);
            this.u.setVisibility(0);
        }
        this.d.setVisibility(8);
        this.c.setVisibility(8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull e2 e2Var) {
        mi.a("PromoStyle1View: Apply click area " + e2Var.a() + " to view");
        setOnTouchListener(this.s);
        this.j.setOnTouchListener(this.s);
        this.h.setOnTouchListener(this.s);
        this.i.setOnTouchListener(this.s);
        this.m.setOnTouchListener(this.s);
        this.b.getClickableLayout().setOnTouchListener(this.s);
        setOnClickListener((e2Var.l || e2Var.m) ? this.g : null);
        this.j.setOnClickListener((e2Var.g || e2Var.m) ? this.g : null);
        this.h.setOnClickListener((e2Var.a || e2Var.m) ? this.g : null);
        this.i.setOnClickListener((e2Var.e || e2Var.m) ? this.g : null);
        this.m.setOnClickListener((e2Var.j || e2Var.m) ? this.g : null);
        this.b.getClickableLayout().setOnClickListener((e2Var.n || e2Var.m) ? this.g : this.q);
    }

    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        mi.a("PromoStyle1View: Apply click area " + e2Var.a() + " to view");
        setOnClickListener((e2Var.l || e2Var.m) ? this.g : null);
        this.j.setOnClickListener((e2Var.g || e2Var.m) ? this.g : null);
        this.h.setOnClickListener((e2Var.a || e2Var.m) ? this.g : null);
        this.i.setOnClickListener((e2Var.e || e2Var.m) ? this.g : null);
        this.m.setOnClickListener((e2Var.j || e2Var.m) ? this.g : null);
        this.b.getClickableLayout().setOnClickListener((e2Var.n || e2Var.m) ? this.g : this.q);
    }

    @Override // com.my.target.ha
    public boolean b() {
        return this.b.d();
    }

    @Override // com.my.target.ia
    public void c() {
        this.k.setText(this.H);
        this.k.setTextSize(2, 16.0f);
        this.k.setVisibility(0);
        this.k.setTextColor(-1);
        this.k.setEnabled(true);
        TextView textView = this.k;
        int i = this.v;
        textView.setPadding(i, i, i, i);
        qi.a(this.k, -2013265920, -1, -1, this.l.b(1), this.l.b(4));
        this.J = true;
    }

    @Override // com.my.target.ha
    public void d() {
        this.n.setVisibility(8);
        j();
    }

    @Override // com.my.target.ha
    public void destroy() {
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    void e() {
        this.C = 0;
        this.a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        this.u.setVisibility(8);
    }

    void g() {
        this.C = 2;
        this.a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(0);
        this.u.setVisibility(8);
    }

    @Override // com.my.target.ia
    @NonNull
    public View getCloseButton() {
        return this.k;
    }

    @Override // com.my.target.ha
    @NonNull
    public ef getPromoMediaView() {
        return this.b;
    }

    @Override // com.my.target.ia
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.ha
    public boolean isPlaying() {
        return this.b.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.b.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.u.layout(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        int measuredWidth2 = this.d.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.d.getMeasuredHeight() >> 1;
        this.d.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.c.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.c.getMeasuredHeight() >> 1;
        this.c.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.a.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.a.getMeasuredHeight() >> 1;
        this.a.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        TextView textView = this.k;
        int i14 = this.v;
        textView.layout(i14, i14, textView.getMeasuredWidth() + i14, this.v + this.k.getMeasuredHeight());
        if (i5 <= i6) {
            this.o.layout(((this.b.getRight() - this.v) - this.o.getMeasuredWidth()) + this.o.getPadding(), ((this.b.getBottom() - this.v) - this.o.getMeasuredHeight()) + this.o.getPadding(), (this.b.getRight() - this.v) + this.o.getPadding(), (this.b.getBottom() - this.v) + this.o.getPadding());
            this.e.layout((this.b.getRight() - this.v) - this.e.getMeasuredWidth(), this.b.getTop() + this.v, this.b.getRight() - this.v, this.b.getTop() + this.v + this.e.getMeasuredHeight());
            int i15 = this.v;
            int measuredHeight5 = this.h.getMeasuredHeight() + this.i.getMeasuredHeight() + this.m.getMeasuredHeight() + this.j.getMeasuredHeight();
            int bottom = getBottom() - this.b.getBottom();
            if ((i15 * 3) + measuredHeight5 > bottom) {
                i15 = (bottom - measuredHeight5) / 3;
            }
            TextView textView2 = this.h;
            int i16 = i5 >> 1;
            textView2.layout(i16 - (textView2.getMeasuredWidth() >> 1), this.b.getBottom() + i15, (this.h.getMeasuredWidth() >> 1) + i16, this.b.getBottom() + i15 + this.h.getMeasuredHeight());
            StarsRatingView starsRatingView = this.i;
            starsRatingView.layout(i16 - (starsRatingView.getMeasuredWidth() >> 1), this.h.getBottom() + i15, (this.i.getMeasuredWidth() >> 1) + i16, this.h.getBottom() + i15 + this.i.getMeasuredHeight());
            TextView textView3 = this.m;
            textView3.layout(i16 - (textView3.getMeasuredWidth() >> 1), this.h.getBottom() + i15, (this.m.getMeasuredWidth() >> 1) + i16, this.h.getBottom() + i15 + this.m.getMeasuredHeight());
            Button button = this.j;
            button.layout(i16 - (button.getMeasuredWidth() >> 1), this.i.getBottom() + i15, i16 + (this.j.getMeasuredWidth() >> 1), this.i.getBottom() + i15 + this.j.getMeasuredHeight());
            this.n.layout(this.v, (this.b.getBottom() - this.v) - this.n.getMeasuredHeight(), this.v + this.n.getMeasuredWidth(), this.b.getBottom() - this.v);
            return;
        }
        int max = Math.max(this.j.getMeasuredHeight(), Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight()));
        Button button2 = this.j;
        int measuredWidth5 = (i5 - this.v) - button2.getMeasuredWidth();
        int measuredHeight6 = ((i6 - this.v) - this.j.getMeasuredHeight()) - ((max - this.j.getMeasuredHeight()) >> 1);
        int i17 = this.v;
        button2.layout(measuredWidth5, measuredHeight6, i5 - i17, (i6 - i17) - ((max - this.j.getMeasuredHeight()) >> 1));
        this.o.layout((this.j.getRight() - this.o.getMeasuredWidth()) + this.o.getPadding(), (((this.b.getBottom() - (this.v << 1)) - this.o.getMeasuredHeight()) - max) + this.o.getPadding(), this.j.getRight() + this.o.getPadding(), ((this.b.getBottom() - (this.v << 1)) - max) + this.o.getPadding());
        this.e.layout(this.j.getRight() - this.e.getMeasuredWidth(), this.v, this.j.getRight(), this.v + this.e.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.i;
        int left = (this.j.getLeft() - this.v) - this.i.getMeasuredWidth();
        int measuredHeight7 = ((i6 - this.v) - this.i.getMeasuredHeight()) - ((max - this.i.getMeasuredHeight()) >> 1);
        int left2 = this.j.getLeft();
        int i18 = this.v;
        starsRatingView2.layout(left, measuredHeight7, left2 - i18, (i6 - i18) - ((max - this.i.getMeasuredHeight()) >> 1));
        TextView textView4 = this.m;
        int left3 = (this.j.getLeft() - this.v) - this.m.getMeasuredWidth();
        int measuredHeight8 = ((i6 - this.v) - this.m.getMeasuredHeight()) - ((max - this.m.getMeasuredHeight()) >> 1);
        int left4 = this.j.getLeft();
        int i19 = this.v;
        textView4.layout(left3, measuredHeight8, left4 - i19, (i6 - i19) - ((max - this.m.getMeasuredHeight()) >> 1));
        int min = Math.min(this.i.getLeft(), this.m.getLeft());
        TextView textView5 = this.h;
        int measuredWidth6 = (min - this.v) - textView5.getMeasuredWidth();
        int measuredHeight9 = ((i6 - this.v) - this.h.getMeasuredHeight()) - ((max - this.h.getMeasuredHeight()) >> 1);
        int i20 = this.v;
        textView5.layout(measuredWidth6, measuredHeight9, min - i20, (i6 - i20) - ((max - this.h.getMeasuredHeight()) >> 1));
        ij ijVar = this.n;
        int i21 = this.v;
        ijVar.layout(i21, ((i6 - i21) - ijVar.getMeasuredHeight()) - ((max - this.n.getMeasuredHeight()) >> 1), this.v + this.n.getMeasuredWidth(), (i6 - this.v) - ((max - this.n.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.o.measure(View.MeasureSpec.makeMeasureSpec(this.z, 1073741824), View.MeasureSpec.makeMeasureSpec(this.z, 1073741824));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(this.z, 1073741824), View.MeasureSpec.makeMeasureSpec(this.z, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.v << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(this.z, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.z, Integer.MIN_VALUE));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.b.getMeasuredHeight(), 1073741824));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.j.getMeasuredWidth();
            int measuredWidth2 = this.h.getMeasuredWidth();
            if (this.n.getMeasuredWidth() + measuredWidth2 + Math.max(this.i.getMeasuredWidth(), this.m.getMeasuredWidth()) + measuredWidth + (this.v * 3) > i4) {
                int measuredWidth3 = (i4 - this.n.getMeasuredWidth()) - (this.v * 3);
                int i6 = measuredWidth3 / 3;
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.i.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.m.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.h.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.j.getMeasuredWidth()) - this.m.getMeasuredWidth()) - this.i.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        } else {
            int measuredHeight = this.h.getMeasuredHeight() + this.i.getMeasuredHeight() + this.m.getMeasuredHeight() + this.j.getMeasuredHeight();
            int measuredHeight2 = (size2 - this.b.getMeasuredHeight()) / 2;
            int i7 = this.v;
            if (measuredHeight + (i7 * 3) > measuredHeight2) {
                int i8 = i7 / 2;
                this.j.setPadding(i7, i8, i7, i8);
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.ha
    public void pause() {
        int i = this.C;
        if (i == 0 || i == 2) {
            h();
            this.b.f();
        }
    }

    @Override // com.my.target.ha
    public void resume() {
        this.b.g();
    }

    @Override // com.my.target.ia
    public void setBanner(@NonNull d9 d9Var) {
        this.L = d9Var.f().b();
        this.b.b(d9Var, 1);
        eb j0 = d9Var.j0();
        if (j0 == null) {
            return;
        }
        this.n.setMax(d9Var.t());
        this.G = j0.q0();
        this.F = d9Var.b0();
        this.j.setText(d9Var.l());
        this.h.setText(d9Var.K());
        String B = d9Var.B();
        B.getClass();
        switch (B) {
            case "web":
            case "webform":
                this.i.setVisibility(8);
                this.m.setVisibility(0);
                this.m.setText(d9Var.s());
                break;
            case "store":
                if (d9Var.G() > 0.0f) {
                    this.i.setVisibility(0);
                    this.i.setRating(d9Var.G());
                } else {
                    this.i.setVisibility(8);
                }
                this.m.setVisibility(8);
                break;
        }
        this.H = j0.a0();
        this.I = j0.b0();
        this.k.setText(this.H);
        if (j0.o0() && j0.v0()) {
            if (j0.Y() > 0.0f) {
                this.E = j0.Y();
                this.k.setEnabled(false);
                this.k.setTextColor(-3355444);
                TextView textView = this.k;
                int i = this.w;
                textView.setPadding(i, i, i, i);
                qi.a(this.k, -2013265920, -2013265920, -3355444, this.l.b(1), this.l.b(4));
                this.k.setTextSize(2, 12.0f);
            } else {
                TextView textView2 = this.k;
                int i2 = this.v;
                textView2.setPadding(i2, i2, i2, i2);
                this.k.setVisibility(0);
            }
        }
        this.t.setText(j0.k0());
        Bitmap j = f9.j(getContext());
        if (j != null) {
            this.p.setImageBitmap(j);
        }
        if (j0.v0()) {
            c(true);
            e();
        } else {
            h();
        }
        this.D = j0.t();
        w5 w5Var = this.o;
        w5Var.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.kf$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kf.this.a(view);
            }
        });
        if (j0.u0()) {
            w5Var.a(this.y, false);
            w5Var.setContentDescription("sound_off");
        } else {
            w5Var.a(this.x, false);
            w5Var.setContentDescription("sound_on");
        }
        e a2 = d9Var.a();
        if (a2 != null) {
            a(a2);
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // com.my.target.ia
    public void setClickArea(@NonNull e2 e2Var) {
        if (this.L) {
            setClickAreaActual(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }

    @Override // com.my.target.ia
    public void setInterstitialPromoViewListener(@Nullable ia.a aVar) {
        this.A = aVar;
    }

    @Override // com.my.target.ha
    public void setMediaListener(@Nullable s9.a aVar) {
        this.B = aVar;
        this.b.setInterstitialPromoViewListener(aVar);
    }

    @Override // com.my.target.ha
    public void setTimeChanged(float f) {
        if (!this.J && this.F) {
            float f2 = this.E;
            if (f2 > 0.0f && f2 >= f) {
                if (this.k.getVisibility() != 0) {
                    this.k.setVisibility(0);
                }
                if (this.I != null) {
                    int ceil = (int) Math.ceil(this.E - f);
                    String valueOf = String.valueOf(ceil);
                    if (this.E > 9.0f && ceil <= 9) {
                        valueOf = "0" + valueOf;
                    }
                    this.k.setText(this.I.replace("%d", valueOf));
                }
            }
        }
        if (this.n.getVisibility() != 0) {
            this.n.setVisibility(0);
        }
        this.n.setProgress(f / this.D);
        this.n.setDigit((int) Math.ceil(this.D - f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        s9.a aVar = this.B;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.my.target.ha
    public final void b(boolean z) {
        w5 w5Var = this.o;
        if (z) {
            w5Var.a(this.y, false);
            w5Var.setContentDescription("sound_off");
        } else {
            w5Var.a(this.x, false);
            w5Var.setContentDescription("sound_on");
        }
    }

    @Override // com.my.target.ha
    public void a(d9 d9Var) {
        this.b.setOnClickListener(null);
        this.o.setVisibility(8);
        this.b.b(d9Var);
        c();
        this.C = 4;
        this.a.setVisibility(8);
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        this.u.setVisibility(8);
        this.n.setVisibility(8);
    }

    @Override // com.my.target.ha
    public void a(boolean z) {
        this.b.b(true);
    }

    @Override // com.my.target.ha
    public void a(int i) {
        this.b.a(i);
    }

    @Override // com.my.target.ha
    public void a() {
        this.b.i();
        i();
    }

    private void a(e eVar) {
        this.e.setImageBitmap(eVar.g().getBitmap());
        this.e.setOnClickListener(this.r);
    }

    @Override // com.my.target.ha
    public void c(boolean z) {
        this.b.a(z);
        e();
    }
}
