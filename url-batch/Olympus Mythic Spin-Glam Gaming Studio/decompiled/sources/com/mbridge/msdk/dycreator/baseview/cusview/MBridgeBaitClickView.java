package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.config.component.animation.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* loaded from: classes14.dex */
public class MBridgeBaitClickView extends RelativeLayout implements h {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;
    private MBridgeDyImageView a;
    private MBridgeDyImageView b;
    private TextView c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private Animation j;
    private Animation k;
    private Animation l;
    private Animation m;

    public MBridgeBaitClickView(@NonNull Context context) {
        super(context);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
        this.i = false;
    }

    private void f() {
        if (this.b == null) {
            return;
        }
        final int a = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
        if (TextUtils.isEmpty(this.e)) {
            this.b.setImageResource(a);
        } else {
            final String str = this.e;
            b.a(c.n().d()).a(str, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.b == null || !TextUtils.equals(str, MBridgeBaitClickView.this.e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.b.setImageResource(a);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.b == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.b.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void g() {
        if (this.c == null) {
            return;
        }
        String l = l();
        this.f = l;
        this.c.setText(l);
    }

    private void h() {
        setBackgroundColor(this.h);
        g();
        f();
        i();
    }

    private void i() {
        if (this.a == null) {
            return;
        }
        final int a = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
        if (TextUtils.isEmpty(this.d)) {
            this.a.setImageResource(a);
        } else {
            final String str = this.d;
            b.a(c.n().d()).a(str, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.a == null || !TextUtils.equals(str, MBridgeBaitClickView.this.d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.a.setImageResource(a);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.a == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.a.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void j() {
        if (!this.i || this.a == null || this.b == null || this.c == null) {
            init();
        }
    }

    private void k() {
        if (this.a == null || this.b == null || this.c == null) {
            try {
                removeAllViews();
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                int a = v0.a(getContext(), 55.0f);
                int a2 = v0.a(getContext(), 33.0f);
                this.b = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
                layoutParams.setMargins(a2, a2, 0, 0);
                this.b.setLayoutParams(layoutParams);
                int a3 = v0.a(getContext(), 108.0f);
                int a4 = v0.a(getContext(), 35.0f);
                int a5 = v0.a(getContext(), 43.0f);
                this.a = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a3, a3);
                layoutParams2.setMargins(a4, a5, 0, 0);
                this.a.setLayoutParams(layoutParams2);
                relativeLayout.addView(this.b);
                relativeLayout.addView(this.a);
                LinearLayout linearLayout = new LinearLayout(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.addView(relativeLayout);
                this.c = new TextView(getContext());
                this.c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                this.c.setText(this.f);
                this.c.setTextColor(-1);
                this.c.setGravity(14);
                linearLayout.addView(this.c);
                addView(linearLayout);
            } catch (Throwable th) {
                q0.b("MBridgeAnimationClickView", th.getMessage());
            }
        }
    }

    private String l() {
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        try {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
            return "Click now for details";
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void init(int i) {
        this.g = i;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.config.component.animation.h
    public View resolveAnimationTarget(String str) {
        j();
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "baithand":
            case "finger":
            case "hand":
                MBridgeDyImageView mBridgeDyImageView = this.a;
                if (mBridgeDyImageView == null) {
                    break;
                }
                break;
            case "baittext":
            case "text":
            case "label":
                TextView textView = this.c;
                if (textView == null) {
                    break;
                }
                break;
            case "circle":
            case "ripple":
            case "baitripple":
                MBridgeDyImageView mBridgeDyImageView2 = this.b;
                if (mBridgeDyImageView2 == null) {
                    break;
                }
                break;
            case "container":
            case "self":
                break;
            default:
                View findViewWithTag = findViewWithTag(str);
                if (findViewWithTag == null) {
                    break;
                }
                break;
        }
        return this;
    }

    public void startAnimation() {
        j();
        int i = this.g;
        if (i == 2) {
            this.b.setVisibility(4);
            d();
            return;
        }
        if (i == 3) {
            e();
            return;
        }
        if (i == 4) {
            this.b.setVisibility(4);
            a();
        } else if (i != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.j.setRepeatCount(1);
        this.j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.a != null) {
                            MBridgeBaitClickView.this.a.startAnimation(MBridgeBaitClickView.this.j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.j.setRepeatCount(-1);
        this.j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        MBridgeDyImageView mBridgeDyImageView2 = this.b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.m.setRepeatMode(2);
        this.m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        MBridgeDyImageView mBridgeDyImageView = this.a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.m);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.j.setRepeatCount(-1);
        this.j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.j);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.j.setRepeatCount(1);
        this.j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.l.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.k);
        animationSet.addAnimation(this.l);
        this.k.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.b != null) {
                    MBridgeBaitClickView.this.b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.b != null) {
                    MBridgeBaitClickView.this.b.setVisibility(0);
                }
            }
        });
        this.j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.a != null) {
                            MBridgeBaitClickView.this.a.startAnimation(MBridgeBaitClickView.this.j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.b != null) {
                            MBridgeBaitClickView.this.b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.j);
        }
    }

    public void init(int i, int i2) {
        this.h = i;
        this.g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.h = i;
        this.g = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        init();
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
        this.i = false;
    }

    public void init() {
        try {
            k();
            h();
            this.i = true;
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
        this.i = false;
    }

    @RequiresApi
    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = "";
        this.e = "";
        this.f = "Click now for details";
        this.g = 1;
        this.h = 1342177280;
        this.i = false;
    }
}
