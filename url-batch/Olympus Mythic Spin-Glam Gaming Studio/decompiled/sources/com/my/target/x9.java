package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.my.target.e0;
import com.my.target.ef;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class x9 extends ne implements e0.a {
    private final e0 a;
    private final c0 b;
    private final jf c;
    private final v5 d;
    private final ImageView e;
    private final Button f;
    private final FrameLayout g;
    private final int h;
    private final int i;
    private ef.a j;

    public x9(boolean z, int i, int i2, Context context) {
        super(context);
        qi g = qi.g(context);
        this.h = i;
        this.i = i2;
        e0 e0Var = new e0(context);
        this.a = e0Var;
        e0Var.setAdVideoViewListener(this);
        addView(e0Var, new ViewGroup.LayoutParams(-1, -1));
        this.b = ib.a(z, context);
        v5 v5Var = new v5(context);
        this.d = v5Var;
        v5Var.setPadding(g.b(6));
        addView(v5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        a(frameLayout, g.b(12));
        frameLayout.setBackgroundColor(-870572770);
        addView(frameLayout);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setId(View.generateViewId());
        a(imageView, g.b(8));
        frameLayout.addView(imageView);
        Button button = new Button(context);
        this.f = button;
        a(button, g.b(8));
        frameLayout.addView(button);
        jf jfVar = new jf(context);
        this.c = jfVar;
        addView(jfVar);
    }

    @Override // com.my.target.ne, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public ImageView getAdIcon() {
        return this.e;
    }

    @NonNull
    public e0 getAdVideoView() {
        return this.a;
    }

    @NonNull
    public Button getCtaButton() {
        return this.f;
    }

    @NonNull
    public jf getProgressView() {
        return this.c;
    }

    @NonNull
    public c0 getVideoPlayer() {
        return this.b;
    }

    @NonNull
    public v5 getVolumeButton() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        qi g = qi.g(getContext());
        this.a.layout(0, 0, i5, i6);
        int b = g.b(48);
        int b2 = g.b(6);
        int b3 = i6 - g.b(16);
        this.d.layout(b2, b3 - b, b + b2, b3);
        int b4 = g.b(FacebookRequestErrorClassification.EC_INVALID_TOKEN);
        int b5 = g.b(56);
        int b6 = i5 - g.b(13);
        int b7 = i6 - g.b(16);
        this.g.layout(b6 - b4, b7 - b5, b6, b7);
        int b8 = g.b(44);
        int b9 = g.b(6);
        int i7 = (b5 - b8) / 2;
        this.e.layout(b9, i7, b9 + b8, i7 + b8);
        this.f.layout((b9 * 2) + b8, i7, b4 - b9, b5 - b9);
        int b10 = g.b(3);
        int b11 = g.b(13);
        this.c.layout(b11, i6 - b10, i5 - b11, i6);
    }

    @Override // com.my.target.ne, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        qi g = qi.g(getContext());
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        int b = g.b(48);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(g.b(FacebookRequestErrorClassification.EC_INVALID_TOKEN), 1073741824), View.MeasureSpec.makeMeasureSpec(g.b(56), 1073741824));
        int b2 = g.b(44);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(b2, 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(g.b(128), 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size - (g.b(13) * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(g.b(3), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.e0.a
    public void r() {
        ef.a aVar;
        if (!ib.a(this.b)) {
            ef.a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        this.a.setViewMode(1);
        this.a.a(this.h, this.i);
        this.b.a(this.a);
        if (!this.b.isPlaying() || (aVar = this.j) == null) {
            return;
        }
        aVar.k();
    }

    public void setPlayableVideoListener(@Nullable ef.a aVar) {
        this.j = aVar;
        this.b.a(aVar);
    }
}
