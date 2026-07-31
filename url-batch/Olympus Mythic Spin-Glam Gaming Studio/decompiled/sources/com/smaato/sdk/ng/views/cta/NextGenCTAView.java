package com.smaato.sdk.ng.views.cta;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.utils.NGSDKBitmapDownloader;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.views.helpers.ImageHelper;
import com.smaato.sdk.ng.vpaid.helpers.SimpleTimer;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes14.dex */
public class NextGenCTAView extends FrameLayout {
    private static final int g = Color.argb(102, 0, 0, 0);
    private static final int h = Color.argb(255, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 255);
    private CTAViewListener a;
    private SimpleTimer b;
    private ImageView c;
    private TextView d;
    private Boolean e;
    private Boolean f;

    public interface CTAViewListener {
        void onClick();

        void onFail();

        void onInvalidCTAIconUrl();

        void onShow();
    }

    class a implements SimpleTimer.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            NextGenCTAView nextGenCTAView = NextGenCTAView.this;
            nextGenCTAView.b = null;
            Boolean bool = nextGenCTAView.e;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            NextGenCTAView.this.show();
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            NextGenCTAView.this.f();
            NextGenCTAView.this.clearAnimation();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c implements NGSDKBitmapDownloader.DownloadListener {
        c() {
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFailed(String str, Exception exc) {
            NextGenCTAView nextGenCTAView = NextGenCTAView.this;
            nextGenCTAView.e = Boolean.FALSE;
            nextGenCTAView.d();
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFinish(String str, Bitmap bitmap) {
            if (bitmap == null) {
                NextGenCTAView.this.d();
                NextGenCTAView.this.e();
                NextGenCTAView.this.e = Boolean.FALSE;
                return;
            }
            NextGenCTAView nextGenCTAView = NextGenCTAView.this;
            nextGenCTAView.c.setImageBitmap(ImageHelper.getRoundedCornerBitmap(bitmap, 20, ViewUtils.asIntPixels(40.0f, nextGenCTAView.getContext()), ViewUtils.asIntPixels(40.0f, NextGenCTAView.this.getContext())));
            NextGenCTAView nextGenCTAView2 = NextGenCTAView.this;
            nextGenCTAView2.e = Boolean.TRUE;
            if (nextGenCTAView2.f.booleanValue()) {
                NextGenCTAView.this.show();
            }
        }
    }

    public NextGenCTAView(Context context) {
        super(context);
        this.e = null;
        this.f = Boolean.FALSE;
        a();
        b();
    }

    private void a() {
        setVisibility(4);
        setBackground(a(g, 18.0f));
    }

    private void b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(20, 20, 20, 20);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(getContext());
        this.c = imageView;
        imageView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.asIntPixels(40.0f, getContext()), ViewUtils.asIntPixels(40.0f, getContext()));
        layoutParams.setMarginEnd(5);
        this.c.setLayoutParams(layoutParams);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.cta.NextGenCTAView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NextGenCTAView.this.a(view);
            }
        });
        this.c.setContentDescription("ctaIcon");
        TextView textView = new TextView(getContext());
        this.d = textView;
        textView.setId(View.generateViewId());
        int dimension = (int) (getResources().getDimension(R.dimen.cta_font_size) / getResources().getDisplayMetrics().density);
        this.d.setPadding(40, 0, 40, 0);
        this.d.setTextSize(dimension);
        this.d.setTextColor(-1);
        this.d.setGravity(17);
        this.d.setAllCaps(true);
        this.d.setTypeface(null, 1);
        this.d.setBackground(a(h, 18.0f));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ViewUtils.asIntPixels(40.0f, getContext()));
        layoutParams2.setMarginStart(5);
        this.d.setLayoutParams(layoutParams2);
        this.d.setContentDescription("ctaButton");
        linearLayout.addView(this.c);
        linearLayout.addView(this.d);
        setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.cta.NextGenCTAView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NextGenCTAView.this.b(view);
            }
        });
        addView(linearLayout);
    }

    private void c() {
        CTAViewListener cTAViewListener = this.a;
        if (cTAViewListener != null) {
            cTAViewListener.onClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CTAViewListener cTAViewListener = this.a;
        if (cTAViewListener != null) {
            cTAViewListener.onFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        CTAViewListener cTAViewListener = this.a;
        if (cTAViewListener != null) {
            cTAViewListener.onInvalidCTAIconUrl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CTAViewListener cTAViewListener = this.a;
        if (cTAViewListener != null) {
            cTAViewListener.onShow();
        }
    }

    private void g() {
        setVisibility(4);
        this.e = null;
        this.f = Boolean.FALSE;
    }

    private void setButton(String str) {
        this.d.setText(str);
    }

    private void setIconUrl(String str) {
        new NGSDKBitmapDownloader().download(str, this.c.getWidth(), this.c.getHeight(), new c());
    }

    public void destroy() {
        SimpleTimer simpleTimer = this.b;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void hide() {
        SimpleTimer simpleTimer = this.b;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.b = null;
        }
        setVisibility(4);
    }

    public boolean isLoaded() {
        Boolean bool = this.e;
        return bool != null && bool.booleanValue();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void killTimer() {
        SimpleTimer simpleTimer = this.b;
        if (simpleTimer != null) {
            simpleTimer.pause();
            this.b.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void pause() {
        SimpleTimer simpleTimer = this.b;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
    }

    public void resume() {
        SimpleTimer simpleTimer = this.b;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
    }

    public void setListener(CTAViewListener cTAViewListener) {
        this.a = cTAViewListener;
    }

    public void show(Bitmap bitmap, String str, Integer num) {
        g();
        if (num == null || num.intValue() == 0) {
            this.f = Boolean.TRUE;
        }
        if (bitmap != null) {
            this.c.setImageBitmap(ImageHelper.getRoundedCornerBitmap(bitmap, 18, ViewUtils.asIntPixels(40.0f, getContext()), ViewUtils.asIntPixels(40.0f, getContext())));
            this.e = Boolean.TRUE;
            if (this.f.booleanValue()) {
                show();
            }
        }
        setButton(str);
        if (num != null && num.intValue() > 0) {
            a(num);
            return;
        }
        Boolean bool = this.e;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        show();
    }

    public void showWithoutIcon(String str, Integer num) {
        g();
        if (num == null || num.intValue() == 0) {
            this.f = Boolean.TRUE;
        }
        this.c.setVisibility(8);
        this.d.setTextSize((int) (getResources().getDimension(R.dimen.big_cta_font_size) / getResources().getDisplayMetrics().density));
        this.d.setPadding(90, 0, 90, 0);
        setButton(str);
        this.e = Boolean.TRUE;
        if (num == null || num.intValue() <= 0) {
            show();
        } else {
            a(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c();
    }

    private Drawable a(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        return gradientDrawable;
    }

    private void a(Integer num) {
        if (num.intValue() > 0) {
            SimpleTimer simpleTimer = new SimpleTimer(num.intValue() * 1000, new a());
            this.b = simpleTimer;
            simpleTimer.start();
            return;
        }
        show();
    }

    public NextGenCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = null;
        this.f = Boolean.FALSE;
        a();
        b();
    }

    public void show(String str, String str2, Integer num) {
        g();
        if (num == null || num.intValue() == 0) {
            this.f = Boolean.TRUE;
        }
        setIconUrl(str);
        setButton(str2);
        if (num != null && num.intValue() > 0) {
            a(num);
            return;
        }
        Boolean bool = this.e;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        show();
    }

    public NextGenCTAView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = null;
        this.f = Boolean.FALSE;
        a();
        b();
    }

    public void show(String str, String str2) {
        setVisibility(4);
        show(str, str2, (Integer) null);
    }

    public void show() {
        Boolean bool = this.e;
        if (bool == null || !bool.booleanValue() || isVisible() || this.b != null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(1500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setAnimationListener(new b());
        setVisibility(0);
        startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }
}
