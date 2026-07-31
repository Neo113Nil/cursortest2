package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class e0 extends FrameLayout {
    private final TextureView a;
    private SurfaceView b;
    private int c;
    private int d;
    private a e;
    private int f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void r();
    }

    public e0(Context context) {
        super(context);
        this.a = new TextureView(context);
        a();
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public Bitmap getScreenShot() {
        if (this.f == 1) {
            return null;
        }
        try {
            return this.a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @NonNull
    public TextureView getTextureView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        a aVar;
        super.onAttachedToWindow();
        if (qi.b(this) || (aVar = this.e) == null) {
            return;
        }
        aVar.r();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.c;
        if (i4 <= 0 || (i3 = this.d) <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = i4 / i3;
        if (mode == 0 && mode2 == 0) {
            size = i4;
            size2 = i3;
        } else if (mode == 0) {
            size = (int) (size2 * f);
            i4 = size;
            i3 = size2;
        } else if (mode2 != 0 && v4.a(f, 1.0f) == -1 && size2 <= size) {
            i4 = size;
            i3 = size2;
            size = (int) (size2 * f);
        } else {
            i4 = size;
            i3 = size2;
            size2 = (int) (size / f);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.b;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i4, i3);
    }

    public void setAdVideoViewListener(@Nullable a aVar) {
        this.e = aVar;
    }

    public void setExoPlayer(@Nullable ExoPlayer exoPlayer) {
        if (exoPlayer == null) {
            return;
        }
        int i = this.f;
        if (i == 0) {
            exoPlayer.setVideoSurfaceView(null);
            exoPlayer.setVideoTextureView(this.a);
        } else {
            if (i != 1) {
                return;
            }
            exoPlayer.setVideoTextureView(null);
            exoPlayer.setVideoSurfaceView(this.b);
        }
    }

    public void setViewMode(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        a();
    }

    private void a() {
        qi.b(this.a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f == 0) {
            addView(this.a, layoutParams);
            return;
        }
        if (this.b == null) {
            this.b = new SurfaceView(getContext());
        }
        addView(this.b, layoutParams);
    }
}
