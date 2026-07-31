package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class bj extends FrameLayout {
    private final e0 a;
    private final fh b;
    private final TextView c;
    private final ImageView d;
    private final LinearLayout e;
    private final cj f;
    private final hg g;
    private final w2 h;
    private final FrameLayout i;
    private final r9 j;
    private final c0 k;
    private float l;

    public bj(c0 c0Var, e0 e0Var, Context context, r9 r9Var) {
        super(context);
        this.k = c0Var;
        this.j = r9Var;
        this.a = e0Var;
        qi.b(e0Var, "video_view");
        this.g = hg.a(context);
        w2 a = w2.a(context);
        this.h = a;
        setBackgroundColor(a.a(w2.x));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        qi.b(frameLayout, "video_container");
        fh f = f(context);
        this.b = f;
        qi.b(f, "preview_view");
        frameLayout.addView(f);
        frameLayout.addView(e0Var);
        addView(frameLayout);
        cj e = e(context);
        this.f = e;
        addView(e);
        LinearLayout b = b(context);
        this.e = b;
        ImageView d = d(context);
        this.d = d;
        b.addView(d);
        qi.b(d, "icon_image_view");
        TextView c = c(context);
        this.c = c;
        qi.b(c, "domain_text_view");
        b.addView(c);
        qi.b(b, "domain_container");
        LinearLayout a2 = a(context);
        a2.addView(b);
        b.setVisibility(8);
        qi.b(a2, "bottom_layout");
        addView(a2);
        a(context.getResources().getConfiguration());
    }

    public void a(float f) {
        int a = this.g.a(hg.v);
        if (f != 0.0f) {
            this.f.getSoundControlButton().a(a1.i(a, getContext()), false);
            this.f.getSoundControlButton().setContentDescription("sound_on");
        } else {
            this.f.getSoundControlButton().a(a1.h(a, getContext()), false);
            this.f.getSoundControlButton().setContentDescription("sound_off");
        }
    }

    public void b() {
        this.b.setVisibility(0);
        this.a.setVisibility(4);
        this.f.getVideoControlButton().a(a1.f(this.g.a(hg.v), getContext()), false);
        this.f.getProgressView().setTimeChanged(this.l);
        this.j.a();
    }

    public void c() {
        this.b.setVisibility(0);
        this.f.setVisibility(4);
        this.j.b();
    }

    public void d() {
        this.f.getVideoControlButton().a(a1.f(this.g.a(hg.v), getContext()), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
    }

    public void f() {
        this.f.setVisibility(0);
        this.f.getVideoControlButton().a(a1.f(this.g.a(hg.v), getContext()), false);
    }

    public void g() {
    }

    @NonNull
    public FrameLayout getAndroidView() {
        return this;
    }

    @NonNull
    public LinearLayout getDomainContainer() {
        return this.e;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.c;
    }

    @NonNull
    public ImageView getLogoImageView() {
        return this.d;
    }

    @NonNull
    public fh getPreviewView() {
        return this.b;
    }

    @NonNull
    public cj getVideoControlView() {
        return this.f;
    }

    @NonNull
    public c0 getVideoPlayer() {
        return this.k;
    }

    @NonNull
    public e0 getVideoView() {
        return this.a;
    }

    public void h() {
        this.b.setVisibility(4);
        this.a.setVisibility(0);
        this.f.setVisibility(0);
        this.f.getVideoControlButton().a(a1.e(this.g.a(hg.v), getContext()), false);
    }

    public void i() {
        FrameLayout.LayoutParams layoutParams = getContext().getResources().getConfiguration().orientation == 2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setDuration(float f) {
        this.l = f;
        this.f.getProgressView().setMaxTime(f);
    }

    private cj e(Context context) {
        cj cjVar = new cj(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        cjVar.setLayoutParams(layoutParams);
        cjVar.setVisibility(4);
        return cjVar;
    }

    private TextView c(Context context) {
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(this.g.a(hg.g));
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams);
        this.e.setVisibility(8);
        return textView;
    }

    private ImageView d(Context context) {
        ImageView imageView = new ImageView(context);
        int a = this.g.a(hg.n);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(a, a));
        return imageView;
    }

    private fh f(Context context) {
        fh fhVar = new fh(context);
        fhVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return fhVar;
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        hg hgVar = this.g;
        int i = hg.g;
        int a = hgVar.a(i);
        layoutParams.setMargins(0, 0, a, a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.h.a(w2.d));
        gradientDrawable.setCornerRadius(this.g.a(hg.v));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setGravity(17);
        int a2 = this.g.a(i);
        linearLayout.setPadding(a2, a2, a2, a2);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public void a() {
        this.f.setVisibility(4);
    }

    private LinearLayout a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private void a(Configuration configuration) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
        if (configuration.orientation == 2) {
            layoutParams.gravity = 8388627;
        } else {
            layoutParams.gravity = 49;
        }
        this.b.setLayoutParams(layoutParams);
        this.i.setLayoutParams(layoutParams);
    }
}
