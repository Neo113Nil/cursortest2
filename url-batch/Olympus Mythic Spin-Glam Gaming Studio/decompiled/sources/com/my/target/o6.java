package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import com.my.target.c0;
import com.my.target.instreamads.InstreamAdPlayer;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class o6 extends FrameLayout implements InstreamAdPlayer, c0.a {
    private final e0 a;
    private boolean b;
    private InstreamAdPlayer.AdPlayerListener c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private c0 h;

    public o6(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new e0(context));
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f);
        }
    }

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
    }

    @Override // com.my.target.c0.a
    public void c() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void destroy() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.c0.a
    public void f() {
        this.g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    @Override // com.my.target.c0.a
    public void g() {
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    @Nullable
    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.c;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoDuration() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            return c0Var.getDuration();
        }
        return 0.0f;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoPosition() {
        if (this.h != null) {
            return r0.getPosition() / 1000.0f;
        }
        return 0.0f;
    }

    @VisibleForTesting
    int getPlaceholderHeight() {
        return this.e;
    }

    @VisibleForTesting
    int getPlaceholderWidth() {
        return this.d;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.c0.a
    public void h() {
        if (this.g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.g = false;
        }
    }

    @Override // com.my.target.c0.a
    public void j() {
    }

    @Override // com.my.target.c0.a
    public void k() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (this.f || (adPlayerListener = this.c) == null) {
            return;
        }
        adPlayerListener.onAdVideoStarted();
        this.f = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int round;
        int round2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            mode = Integer.MIN_VALUE;
        }
        if (mode2 == 0) {
            mode2 = Integer.MIN_VALUE;
        }
        int i4 = this.e;
        if (i4 == 0 || (i3 = this.d) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = i3 / i4;
        int size2 = View.MeasureSpec.getSize(i);
        float f2 = size != 0 ? size2 / size : 0.0f;
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                if (f < f2) {
                    round2 = Math.round(size * f);
                    if (size2 > 0 && round2 > size2) {
                        size = Math.round(size2 / f);
                    }
                    size2 = round2;
                } else {
                    round = Math.round(size2 / f);
                    if (size > 0 && round > size) {
                        size2 = Math.round(size * f);
                    }
                    size = round;
                }
            } else if (mode == Integer.MIN_VALUE && mode2 == 1073741824) {
                round2 = Math.round(size * f);
                if (size2 > 0 && round2 > size2) {
                    size = Math.round(size2 / f);
                }
                size2 = round2;
            } else if (mode == 1073741824 && mode2 == Integer.MIN_VALUE) {
                round = Math.round(size2 / f);
                if (size > 0 && round > size) {
                    size2 = Math.round(size * f);
                }
                size = round;
            } else {
                size = 0;
                size2 = 0;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // com.my.target.c0.a
    public void p() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void pauseAdVideo() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.pause();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2) {
        this.d = i;
        this.e = i2;
        this.f = false;
        if (this.h == null) {
            c0 a = ib.a(this.b, getContext());
            this.h = a;
            a.a(this);
        }
        this.a.a(i, i2);
        this.h.a(uri, this.a);
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void resumeAdVideo() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.resume();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setAdPlayerListener(@Nullable InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z) {
        this.b = z;
    }

    @OptIn
    @VisibleForTesting
    void setVideoPlayer(@Nullable s4 s4Var) {
        this.h = s4Var;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setVolume(float f) {
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.setVolume(f);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void stopAdVideo() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.stop();
        }
    }

    public o6(Context context) {
        this(context, null);
    }

    public o6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    o6(Context context, AttributeSet attributeSet, int i, e0 e0Var) {
        super(context, attributeSet, i);
        this.b = true;
        this.a = e0Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(e0Var, layoutParams);
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2, float f) {
        playAdVideo(uri, i, i2);
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.seekTo((long) (f * 1000.0f));
        }
    }
}
