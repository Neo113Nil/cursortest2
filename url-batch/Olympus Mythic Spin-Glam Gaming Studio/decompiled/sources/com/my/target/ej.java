package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.views.MediaAdView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class ej extends ViewGroup {
    static final int A = qi.c();
    static final int B = qi.c();
    static final int C = qi.c();
    static final int D = qi.c();
    static final int E = qi.c();
    static final int F = qi.c();
    static final int G = qi.c();
    static final int H = qi.c();
    static final int I = qi.c();
    static final int J = qi.c();
    static final int K = qi.c();
    static final int L = qi.c();
    static final int M = qi.c();
    private final TextView a;
    private final StarsRatingView b;
    private final Button c;
    private final Button d;
    private final qi e;
    private final LinearLayout f;
    private final TextView g;
    private final FrameLayout h;
    private final MediaAdView i;
    private final TextView j;
    private final jj k;
    private final w5 l;
    private final e0 m;
    private final y4 n;
    private final y4 o;
    private final y4 p;
    private final Runnable q;
    private final c r;
    private final View.OnClickListener s;
    private final Bitmap t;
    private final Bitmap u;
    private final int v;
    private final int w;
    private d x;
    private int y;
    private boolean z;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ej.this.x != null) {
                int id = view.getId();
                if (id == ej.B) {
                    ej.this.x.a(view);
                    return;
                }
                if (id == ej.C) {
                    ej.this.x.d();
                    return;
                }
                if (id == ej.E) {
                    ej.this.x.a();
                    return;
                }
                if (id == ej.D) {
                    ej.this.x.i();
                } else if (id == ej.A) {
                    ej.this.x.e();
                } else if (id == ej.J) {
                    ej.this.x.b();
                }
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ej ejVar = ej.this;
            if (ejVar.y == 2) {
                ejVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ej ejVar = ej.this;
            ejVar.removeCallbacks(ejVar.q);
            ej ejVar2 = ej.this;
            int i = ejVar2.y;
            if (i == 2) {
                ejVar2.a();
                return;
            }
            if (i == 0) {
                ejVar2.c();
            }
            ej ejVar3 = ej.this;
            ejVar3.postDelayed(ejVar3.q, 4000L);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface d {
        void a();

        void a(View view);

        void b();

        void d();

        void e();

        void i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ej(Context context) {
        super(context);
        Button button = new Button(context);
        this.d = button;
        TextView textView = new TextView(context);
        this.a = textView;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.b = starsRatingView;
        Button button2 = new Button(context);
        this.c = button2;
        TextView textView2 = new TextView(context);
        this.g = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        y4 y4Var = new y4(context);
        this.n = y4Var;
        y4 y4Var2 = new y4(context);
        this.o = y4Var2;
        y4 y4Var3 = new y4(context);
        this.p = y4Var3;
        TextView textView3 = new TextView(context);
        this.j = textView3;
        MediaAdView mediaAdView = new MediaAdView(context);
        this.i = mediaAdView;
        jj jjVar = new jj(context);
        this.k = jjVar;
        w5 w5Var = new w5(context);
        this.l = w5Var;
        this.f = new LinearLayout(context);
        qi g = qi.g(context);
        this.e = g;
        this.q = new b();
        this.r = new c();
        this.s = new a();
        this.m = new e0(context);
        this.t = ed.c(g.b(28));
        this.u = ed.b(g.b(28));
        qi.b(button, "dismiss_button");
        qi.b(textView, "title_text");
        qi.b(starsRatingView, "stars_view");
        qi.b(button2, "cta_button");
        qi.b(textView2, "replay_text");
        qi.b(frameLayout, "shadow");
        qi.b(y4Var, "pause_button");
        qi.b(y4Var2, "play_button");
        qi.b(y4Var3, "replay_button");
        qi.b(textView3, "domain_text");
        qi.b(mediaAdView, "media_view");
        qi.b(jjVar, "video_progress_wheel");
        qi.b(w5Var, "sound_button");
        this.w = g.b(28);
        this.v = g.b(16);
        b();
    }

    private void b() {
        setBackgroundColor(-16777216);
        int i = this.v;
        this.l.setId(J);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.i.setId(M);
        this.i.setLayoutParams(layoutParams);
        this.i.setId(I);
        this.i.setOnClickListener(this.r);
        this.i.setBackgroundColor(-16777216);
        this.h.setBackgroundColor(-1728053248);
        this.h.setVisibility(8);
        this.d.setId(A);
        this.d.setTextSize(2, 16.0f);
        this.d.setTransformationMethod(null);
        Button button = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.d.setMaxLines(2);
        this.d.setPadding(i, i, i, i);
        this.d.setTextColor(-1);
        qi.a(this.d, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.a.setId(G);
        this.a.setMaxLines(2);
        this.a.setEllipsize(truncateAt);
        this.a.setTextSize(2, 18.0f);
        this.a.setTextColor(-1);
        qi.a(this.c, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.c.setId(B);
        this.c.setTextColor(-1);
        this.c.setTransformationMethod(null);
        this.c.setGravity(1);
        this.c.setTextSize(2, 16.0f);
        this.c.setLines(1);
        this.c.setEllipsize(truncateAt);
        this.c.setMinimumWidth(this.e.b(100));
        this.c.setPadding(i, i, i, i);
        this.a.setShadowLayer(this.e.b(1), this.e.b(1), this.e.b(1), -16777216);
        this.j.setId(H);
        this.j.setTextColor(-3355444);
        this.j.setMaxEms(10);
        this.j.setShadowLayer(this.e.b(1), this.e.b(1), this.e.b(1), -16777216);
        this.f.setId(C);
        this.f.setOnClickListener(this.s);
        this.f.setGravity(17);
        this.f.setVisibility(8);
        this.f.setPadding(this.e.b(8), 0, this.e.b(8), 0);
        this.g.setSingleLine();
        this.g.setEllipsize(truncateAt);
        TextView textView = this.g;
        textView.setTypeface(textView.getTypeface(), 1);
        this.g.setTextColor(-1);
        this.g.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.e.b(4);
        this.p.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.n.setId(E);
        this.n.setOnClickListener(this.s);
        this.n.setVisibility(8);
        this.n.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.o.setId(D);
        this.o.setOnClickListener(this.s);
        this.o.setVisibility(8);
        this.o.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        this.h.setId(K);
        Bitmap b2 = ed.b();
        if (b2 != null) {
            this.o.setImageBitmap(b2);
        }
        Bitmap a2 = ed.a();
        if (a2 != null) {
            this.n.setImageBitmap(a2);
        }
        qi.a(this.n, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        qi.a(this.o, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        qi.a(this.p, -2013265920, -1, -1, this.e.b(1), this.e.b(4));
        this.b.setId(L);
        this.b.setStarSize(this.e.b(12));
        this.k.setId(F);
        this.k.setVisibility(8);
        this.i.addView(this.m, new ViewGroup.LayoutParams(-1, -1));
        addView(this.i);
        addView(this.h);
        addView(this.l);
        addView(this.d);
        addView(this.k);
        addView(this.f);
        addView(this.n);
        addView(this.o);
        addView(this.b);
        addView(this.j);
        addView(this.c);
        addView(this.a);
        this.f.addView(this.p);
        this.f.addView(this.g, layoutParams2);
        this.c.setOnClickListener(this.s);
        this.d.setOnClickListener(this.s);
        this.l.setOnClickListener(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.y != 2) {
            this.y = 2;
            this.i.getImageView().setVisibility(8);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(0);
            this.h.setVisibility(8);
        }
    }

    public void a(sc scVar, dj djVar) {
        eb d0 = scVar.d0();
        if (d0 == null) {
            return;
        }
        this.k.setMax(scVar.t());
        this.z = d0.q0();
        this.c.setText(scVar.l());
        this.a.setText(scVar.K());
        String B2 = scVar.B();
        B2.getClass();
        switch (B2) {
            case "web":
            case "webform":
                this.b.setVisibility(8);
                this.j.setVisibility(0);
                this.j.setText(scVar.s());
                break;
            case "store":
                this.j.setVisibility(8);
                if (scVar.Q() != 0 && scVar.G() > 0.0f) {
                    this.b.setVisibility(0);
                    this.b.setRating(scVar.G());
                    break;
                } else {
                    this.b.setVisibility(8);
                    break;
                }
        }
        this.d.setText(d0.a0());
        this.g.setText(d0.k0());
        Bitmap c2 = ed.c();
        if (c2 != null) {
            this.p.setImageBitmap(c2);
        }
        this.i.setPlaceHolderDimension(djVar.getWidth(), djVar.getHeight());
        ImageData y = scVar.y();
        if (y != null) {
            this.i.getImageView().setImageBitmap(y.getBitmap());
        }
    }

    public void d() {
        if (this.y != 3) {
            this.y = 3;
            this.i.getProgressBarView().setVisibility(0);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        if (this.y != 1) {
            this.y = 1;
            this.i.getImageView().setVisibility(0);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            this.h.setVisibility(0);
        }
    }

    public void f() {
        int i = this.y;
        if (i == 0 || i == 2) {
            return;
        }
        this.y = 0;
        this.i.getImageView().setVisibility(8);
        this.i.getProgressBarView().setVisibility(8);
        this.f.setVisibility(8);
        this.o.setVisibility(8);
        if (this.y != 2) {
            this.n.setVisibility(8);
        }
    }

    public void g() {
        this.i.getImageView().setVisibility(0);
    }

    @NonNull
    public e0 getAdVideoView() {
        return this.m;
    }

    @NonNull
    public MediaAdView getMediaAdView() {
        return this.i;
    }

    public void h() {
        if (this.y != 4) {
            this.y = 4;
            this.i.getImageView().setVisibility(0);
            this.i.getProgressBarView().setVisibility(8);
            if (this.z) {
                this.f.setVisibility(0);
                this.h.setVisibility(0);
            }
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.i.getMeasuredWidth();
        int measuredHeight = this.i.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.i.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.h.layout(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
        int measuredWidth2 = this.o.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.o.getMeasuredHeight() >> 1;
        this.o.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.n.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.n.getMeasuredHeight() >> 1;
        this.n.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f.getMeasuredHeight() >> 1;
        this.f.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        Button button = this.d;
        int i14 = this.v;
        button.layout(i14, i14, button.getMeasuredWidth() + i14, this.v + this.d.getMeasuredHeight());
        if (i5 <= i6) {
            this.l.layout(((this.i.getRight() - this.v) - this.l.getMeasuredWidth()) + this.l.getPadding(), ((this.i.getBottom() - this.v) - this.l.getMeasuredHeight()) + this.l.getPadding(), (this.i.getRight() - this.v) + this.l.getPadding(), (this.i.getBottom() - this.v) + this.l.getPadding());
            TextView textView = this.a;
            int i15 = i5 >> 1;
            textView.layout(i15 - (textView.getMeasuredWidth() >> 1), this.i.getBottom() + this.v, (this.a.getMeasuredWidth() >> 1) + i15, this.i.getBottom() + this.v + this.a.getMeasuredHeight());
            StarsRatingView starsRatingView = this.b;
            starsRatingView.layout(i15 - (starsRatingView.getMeasuredWidth() >> 1), this.a.getBottom() + this.v, (this.b.getMeasuredWidth() >> 1) + i15, this.a.getBottom() + this.v + this.b.getMeasuredHeight());
            TextView textView2 = this.j;
            textView2.layout(i15 - (textView2.getMeasuredWidth() >> 1), this.a.getBottom() + this.v, (this.j.getMeasuredWidth() >> 1) + i15, this.a.getBottom() + this.v + this.j.getMeasuredHeight());
            Button button2 = this.c;
            button2.layout(i15 - (button2.getMeasuredWidth() >> 1), this.b.getBottom() + this.v, i15 + (this.c.getMeasuredWidth() >> 1), this.b.getBottom() + this.v + this.c.getMeasuredHeight());
            this.k.layout(this.v, (this.i.getBottom() - this.v) - this.k.getMeasuredHeight(), this.v + this.k.getMeasuredWidth(), this.i.getBottom() - this.v);
            return;
        }
        int max = Math.max(this.c.getMeasuredHeight(), Math.max(this.a.getMeasuredHeight(), this.b.getMeasuredHeight()));
        Button button3 = this.c;
        int measuredWidth5 = (i5 - this.v) - button3.getMeasuredWidth();
        int measuredHeight5 = ((i6 - this.v) - this.c.getMeasuredHeight()) - ((max - this.c.getMeasuredHeight()) >> 1);
        int i16 = this.v;
        button3.layout(measuredWidth5, measuredHeight5, i5 - i16, (i6 - i16) - ((max - this.c.getMeasuredHeight()) >> 1));
        this.l.layout((this.c.getRight() - this.l.getMeasuredWidth()) + this.l.getPadding(), (((this.i.getBottom() - (this.v << 1)) - this.l.getMeasuredHeight()) - max) + this.l.getPadding(), this.c.getRight() + this.l.getPadding(), ((this.i.getBottom() - (this.v << 1)) - max) + this.l.getPadding());
        StarsRatingView starsRatingView2 = this.b;
        int left = (this.c.getLeft() - this.v) - this.b.getMeasuredWidth();
        int measuredHeight6 = ((i6 - this.v) - this.b.getMeasuredHeight()) - ((max - this.b.getMeasuredHeight()) >> 1);
        int left2 = this.c.getLeft();
        int i17 = this.v;
        starsRatingView2.layout(left, measuredHeight6, left2 - i17, (i6 - i17) - ((max - this.b.getMeasuredHeight()) >> 1));
        TextView textView3 = this.j;
        int left3 = (this.c.getLeft() - this.v) - this.j.getMeasuredWidth();
        int measuredHeight7 = ((i6 - this.v) - this.j.getMeasuredHeight()) - ((max - this.j.getMeasuredHeight()) >> 1);
        int left4 = this.c.getLeft();
        int i18 = this.v;
        textView3.layout(left3, measuredHeight7, left4 - i18, (i6 - i18) - ((max - this.j.getMeasuredHeight()) >> 1));
        int min = Math.min(this.b.getLeft(), this.j.getLeft());
        TextView textView4 = this.a;
        int measuredWidth6 = (min - this.v) - textView4.getMeasuredWidth();
        int measuredHeight8 = ((i6 - this.v) - this.a.getMeasuredHeight()) - ((max - this.a.getMeasuredHeight()) >> 1);
        int i19 = this.v;
        textView4.layout(measuredWidth6, measuredHeight8, min - i19, (i6 - i19) - ((max - this.a.getMeasuredHeight()) >> 1));
        jj jjVar = this.k;
        int i20 = this.v;
        jjVar.layout(i20, ((i6 - i20) - jjVar.getMeasuredHeight()) - ((max - this.k.getMeasuredHeight()) >> 1), this.v + this.k.getMeasuredWidth(), (i6 - this.v) - ((max - this.k.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.l.measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.w, 1073741824));
        this.k.measure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.w, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.v << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.i.getMeasuredHeight(), 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.c.getMeasuredWidth();
            int measuredWidth2 = this.a.getMeasuredWidth();
            if (this.k.getMeasuredWidth() + measuredWidth2 + Math.max(this.b.getMeasuredWidth(), this.j.getMeasuredWidth()) + measuredWidth + (this.v * 3) > i4) {
                int measuredWidth3 = (i4 - this.k.getMeasuredWidth()) - (this.v * 3);
                int i6 = measuredWidth3 / 3;
                this.c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.b.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.a.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.c.getMeasuredWidth()) - this.j.getMeasuredWidth()) - this.b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(@Nullable d dVar) {
        this.x = dVar;
    }

    public void a(float f, float f2) {
        if (this.k.getVisibility() != 0) {
            this.k.setVisibility(0);
        }
        this.k.setProgress(f / f2);
        this.k.setDigit((int) Math.ceil(f2 - f));
    }

    public void a(boolean z) {
        if (z) {
            this.l.a(this.u, false);
            this.l.setContentDescription("sound off");
        } else {
            this.l.a(this.t, false);
            this.l.setContentDescription("sound on");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.y != 0) {
            this.y = 0;
            this.i.getImageView().setVisibility(8);
            this.i.getProgressBarView().setVisibility(8);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            this.n.setVisibility(8);
            this.h.setVisibility(8);
        }
    }
}
