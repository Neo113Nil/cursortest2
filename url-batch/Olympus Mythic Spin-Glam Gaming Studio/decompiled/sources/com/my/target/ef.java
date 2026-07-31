package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.c0;
import com.my.target.common.models.ImageData;
import com.my.target.e0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class ef extends ViewGroup implements e0.a {
    private final fh a;
    private final qi b;
    private final w5 c;
    private final b d;
    private final e0 e;
    private final FrameLayout f;
    private final ProgressBar g;
    private final boolean h;
    private final boolean i;
    a j;
    private c0 k;
    private dj l;
    private Bitmap m;
    private int n;
    private int o;
    private boolean p;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a extends AudioManager.OnAudioFocusChangeListener, c0.a {
        void l();

        void n();

        void o();

        void q();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ef efVar = ef.this;
            if (efVar.j == null) {
                return;
            }
            if (!efVar.e() && !ef.this.d()) {
                ef.this.j.q();
            } else if (ef.this.d()) {
                ef.this.j.n();
            } else {
                ef.this.j.l();
            }
        }
    }

    public ef(Context context, qi qiVar, boolean z, boolean z2) {
        super(context);
        this.p = true;
        this.b = qiVar;
        this.h = z;
        this.i = z2;
        this.a = new fh(context);
        this.c = new w5(context);
        this.g = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.f = new FrameLayout(context);
        e0 e0Var = new e0(context);
        this.e = e0Var;
        e0Var.setAdVideoViewListener(this);
        this.d = new b();
    }

    public void a() {
        c0 c0Var = this.k;
        if (c0Var != null) {
            c0Var.destroy();
        }
        this.k = null;
    }

    public void b(d9 d9Var) {
        a();
        a(d9Var);
    }

    public void c() {
        qi.b(this.c, "play_button");
        qi.b(this.a, "media_image");
        qi.b(this.e, "video_texture");
        qi.b(this.f, "clickable_layout");
        this.a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.a.setAdjustViewBounds(true);
        addView(this.e);
        this.g.setVisibility(8);
        addView(this.a);
        addView(this.g);
        addView(this.f);
        addView(this.c);
    }

    public boolean d() {
        c0 c0Var = this.k;
        return c0Var != null && c0Var.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean e() {
        c0 c0Var = this.k;
        return c0Var != null && c0Var.isPlaying();
    }

    public void f() {
        c0 c0Var = this.k;
        if (c0Var == null) {
            return;
        }
        c0Var.pause();
        this.a.setVisibility(0);
        Bitmap screenShot = this.e.getScreenShot();
        if (screenShot != null && this.k.g()) {
            this.a.setImageBitmap(screenShot);
        }
        if (this.p) {
            this.c.setVisibility(0);
        }
    }

    public void g() {
        this.c.setVisibility(8);
        c0 c0Var = this.k;
        if (c0Var == null || this.l == null) {
            return;
        }
        c0Var.resume();
        this.a.setVisibility(8);
    }

    @NonNull
    public FrameLayout getClickableLayout() {
        return this.f;
    }

    @NonNull
    public fh getImageView() {
        return this.a;
    }

    @Nullable
    public c0 getVideoPlayer() {
        return this.k;
    }

    public void h() {
        this.c.setOnClickListener(this.d);
    }

    public void i() {
        this.a.setVisibility(8);
        this.g.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.n;
        if (i4 == 0 || (i3 = this.o) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i4;
            size = i3;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((size / i3) * i4);
        }
        if (size == 0 || mode == 0) {
            size = (int) ((size2 / i4) * i3);
        }
        float f = i3 / i4;
        float f2 = size / f;
        float f3 = size2;
        if (f2 > f3) {
            size = (int) (f * f3);
        } else {
            size2 = (int) f2;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = (childAt == this.a || childAt == this.f || childAt == this.e) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i6), View.MeasureSpec.makeMeasureSpec(size2, i6));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.e0.a
    public void r() {
        a aVar;
        if (!ib.a(this.k)) {
            a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        this.e.setViewMode(1);
        dj djVar = this.l;
        if (djVar != null) {
            this.e.a(djVar.getWidth(), this.l.getHeight());
        }
        this.k.a(this.e);
        if (!this.k.isPlaying() || (aVar = this.j) == null) {
            return;
        }
        aVar.o();
    }

    public void setInterstitialPromoViewListener(@Nullable a aVar) {
        this.j = aVar;
        c0 c0Var = this.k;
        if (c0Var != null) {
            c0Var.a(aVar);
        }
    }

    public void b() {
        getClickableLayout().setOnClickListener(this.d);
    }

    public void b(d9 d9Var, int i) {
        if (d9Var.j0() != null) {
            a(d9Var, i);
        } else {
            a(d9Var);
        }
    }

    public void a(int i) {
        c0 c0Var = this.k;
        if (c0Var != null) {
            if (i == 0) {
                c0Var.f();
            } else if (i != 1) {
                c0Var.d();
            } else {
                c0Var.e();
            }
        }
    }

    void b(boolean z) {
        c0 c0Var = this.k;
        if (c0Var != null) {
            c0Var.stop();
        }
        this.g.setVisibility(8);
        this.a.setVisibility(0);
        this.a.setImageBitmap(this.m);
        this.p = z;
        if (z) {
            this.c.setVisibility(0);
            return;
        }
        this.a.setOnClickListener(null);
        this.c.setOnClickListener(null);
        setOnClickListener(null);
    }

    void a(boolean z) {
        c0 c0Var;
        this.c.setVisibility(8);
        this.g.setVisibility(0);
        if (this.l == null || (c0Var = this.k) == null) {
            return;
        }
        c0Var.a(this.j);
        this.k.a(this.e);
        this.e.a(this.l.getWidth(), this.l.getHeight());
        String str = (String) this.l.a();
        if (z && str != null) {
            this.k.a(Uri.parse(str), this.e.getContext());
        } else {
            this.k.a(Uri.parse(this.l.getUrl()), this.e.getContext());
        }
    }

    private void a(d9 d9Var, int i) {
        int b2;
        eb j0 = d9Var.j0();
        if (j0 == null) {
            return;
        }
        dj djVar = (dj) j0.A0();
        this.l = djVar;
        if (djVar == null) {
            return;
        }
        c0 a2 = ib.a(this.i, getContext());
        this.k = a2;
        a2.a(this.j);
        if (j0.u0()) {
            this.k.setVolume(0.0f);
        }
        this.o = this.l.getWidth();
        this.n = this.l.getHeight();
        ImageData i0 = j0.i0();
        if (i0 != null) {
            this.m = i0.getData();
            if (this.o <= 0 || this.n <= 0) {
                this.o = i0.getWidth();
                this.n = i0.getHeight();
            }
            this.a.setImageBitmap(this.m);
        } else {
            ImageData y = d9Var.y();
            if (y != null) {
                if (this.o <= 0 || this.n <= 0) {
                    this.o = y.getWidth();
                    this.n = y.getHeight();
                }
                Bitmap data = y.getData();
                this.m = data;
                this.a.setImageBitmap(data);
            }
        }
        if (i != 1) {
            if (this.h) {
                b2 = this.b.b(140);
            } else {
                b2 = this.b.b(96);
            }
            this.c.a(f9.a(b2), false);
        }
    }

    private void a(d9 d9Var) {
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setVisibility(8);
        this.a.setVisibility(0);
        ImageData y = d9Var.y();
        if (y == null || y.getData() == null) {
            return;
        }
        this.o = y.getWidth();
        int height = y.getHeight();
        this.n = height;
        if (this.o == 0 || height == 0) {
            this.o = y.getData().getWidth();
            this.n = y.getData().getHeight();
        }
        this.a.setImageBitmap(y.getData());
        this.a.setClickable(false);
    }
}
