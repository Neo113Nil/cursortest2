package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.R;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener;
import com.pubmatic.sdk.webrendering.ui.POBCountdownView;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public class POBMraidEndCardView extends FrameLayout implements POBEndCardRendering, POBAdRendererListener, POBUseCustomCloseListener, View.OnClickListener {
    private POBEndCardViewListener a;
    private String b;
    private POBMraidRenderer c;
    private int d;
    private ImageView e;
    private boolean f;
    private POBOnSkipOptionUpdateListener g;
    private POBCountdownView h;
    private View i;
    private POBTimeoutHandler j;
    private POBCountdownTimer k;
    private boolean l;
    private long m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;

    class a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBLog.debug("POBMraidEndCardView", "Custom close delay timer exhausted", new Object[0]);
            POBMraidEndCardView pOBMraidEndCardView = POBMraidEndCardView.this;
            pOBMraidEndCardView.a(pOBMraidEndCardView.l, 2000L);
        }
    }

    class b extends POBCountdownTimer {
        b(long j, long j2, Looper looper) {
            super(j, j2, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            POBMraidEndCardView.this.g();
            POBLog.debug("POBMraidEndCardView", "Skip button timer exhausted, Skip button is shown", new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onTick(long j) {
        }
    }

    class c implements POBCountdownView.OnTimerExhaustedListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBCountdownView.OnTimerExhaustedListener
        public void onTimerExhausted() {
            POBMraidEndCardView.this.c();
            POBLog.debug("POBMraidEndCardView", "Countdown view timer exhausted, Skip button is shown", new Object[0]);
        }
    }

    private POBMraidEndCardView(Context context) {
        super(context);
    }

    private void d() {
        setBackgroundColor(Color.argb(204, 0, 0, 0));
    }

    private void e() {
        POBTimeoutHandler pOBTimeoutHandler = this.j;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.j = null;
        }
    }

    private void f() {
        POBCountdownTimer pOBCountdownTimer = this.k;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
            a(true);
        }
    }

    private void h() {
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new a());
        this.j = pOBTimeoutHandler;
        pOBTimeoutHandler.start(2000L);
        this.m = System.currentTimeMillis();
        POBLog.debug("POBMraidEndCardView", "Custom close delay timer started with 2 sec delay", new Object[0]);
    }

    private void i() {
        POBCountdownTimer pOBCountdownTimer = this.k;
        if (pOBCountdownTimer != null) {
            this.o = true;
            pOBCountdownTimer.start();
            POBLog.debug("POBMraidEndCardView", "Skip button timer started", new Object[0]);
        }
    }

    public void destroy() {
        invalidateRenderer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public FrameLayout getView() {
        return this;
    }

    public void invalidateRenderer() {
        POBMraidRenderer pOBMraidRenderer = this.c;
        if (pOBMraidRenderer != null) {
            pOBMraidRenderer.destroy();
            this.c = null;
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        this.p++;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        int i = this.p - 1;
        this.p = i;
        POBEndCardViewListener pOBEndCardViewListener = this.a;
        if (pOBEndCardViewListener == null || i != 0) {
            return;
        }
        if (this.c != null && this.f) {
            pOBEndCardViewListener.onForward();
        } else {
            destroy();
            this.a.onClose();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.i = view;
        if (view.getParent() != null || pOBAdDescriptor == null) {
            return;
        }
        POBEndCardViewListener pOBEndCardViewListener = this.a;
        if (pOBEndCardViewListener != null) {
            pOBEndCardViewListener.onLoad();
        }
        POBEndCardUtil.updateEndCardView(view, this, pOBAdDescriptor);
        addView(view, 0);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        a(new POBVastError(602, POBVideoLogConstants.MSG_END_CARD_RENDERING_ERROR));
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            if (this.q) {
                a(false, 0L);
            }
        } else {
            onAdInteractionStarted();
            if (this.q) {
                h();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.pob_close_btn) {
            POBEndCardViewListener pOBEndCardViewListener = this.a;
            if (pOBEndCardViewListener != null) {
                pOBEndCardViewListener.onClose();
                return;
            }
            return;
        }
        if (view.getId() == R.id.pob_forward_btn) {
            POBEndCardViewListener pOBEndCardViewListener2 = this.a;
            if (pOBEndCardViewListener2 != null) {
                pOBEndCardViewListener2.onForward();
                return;
            }
            return;
        }
        if (view.getId() == com.pubmatic.sdk.video.R.id.pob_learn_more_btn) {
            c();
            POBEndCardViewListener pOBEndCardViewListener3 = this.a;
            if (pOBEndCardViewListener3 != null) {
                pOBEndCardViewListener3.onLearnMoreClick();
                return;
            }
            return;
        }
        if (view instanceof POBMraidEndCardView) {
            c();
            POBEndCardViewListener pOBEndCardViewListener4 = this.a;
            if (pOBEndCardViewListener4 != null) {
                pOBEndCardViewListener4.onEmptyAreaClick();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.c != null) {
            e();
            f();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        c();
        POBEndCardViewListener pOBEndCardViewListener = this.a;
        if (pOBEndCardViewListener != null) {
            pOBEndCardViewListener.onEndCardWillLeaveApp();
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

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        c();
        POBEndCardViewListener pOBEndCardViewListener = this.a;
        if (pOBEndCardViewListener != null) {
            pOBEndCardViewListener.onClick(null, true);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        View view = this.i;
        if (view != null) {
            removeView(view);
            this.i = null;
        }
        a(new POBVastError(602, POBVideoLogConstants.MSG_END_CARD_RENDERING_ERROR));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        POBCountdownTimer pOBCountdownTimer = this.k;
        if (pOBCountdownTimer == null) {
            return;
        }
        if (!z) {
            pOBCountdownTimer.pause();
        } else if (this.o) {
            pOBCountdownTimer.resume();
        } else {
            i();
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void render(@Nullable POBAdDescriptor pOBAdDescriptor) {
        if (pOBAdDescriptor == null) {
            b();
            return;
        }
        POBLog.debug("POBMraidEndCardView", POBVideoLogConstants.MSG_END_CARD_FOUND, new Object[0]);
        if (!POBNetworkMonitor.isNetworkAvailable(getContext())) {
            a(new POBVastError(602, POBVideoLogConstants.MSG_END_CARD_NETWORK_ERROR));
        } else {
            if (renderMRAIDView(pOBAdDescriptor)) {
                return;
            }
            a(new POBVastError(604, POBVideoLogConstants.MSG_END_CARD_NO_SUPPORTED_RESOURCE));
        }
    }

    protected boolean renderMRAIDView(@NonNull POBAdDescriptor pOBAdDescriptor) {
        if (POBUtils.isNullOrEmpty(pOBAdDescriptor.getRenderableContent())) {
            POBLog.error("POBMraidEndCardView", POBLogConstants.MSG_RENDERERABLE_CONTENTS_NOT_AVAILABLE, new Object[0]);
            return false;
        }
        POBMraidRenderer createInstance = POBMraidRenderer.createInstance(getContext(), "interstitial", hashCode());
        this.c = createInstance;
        if (createInstance == null) {
            POBLog.error("POBMraidEndCardView", POBLogConstants.MSG_FAILED_TO_CREATE_MRAID_RENDERER, new Object[0]);
            return false;
        }
        createInstance.setAdRendererListener(this);
        this.c.setBaseURL("https://ow.pubmatic.com/openrtb/2.5");
        if (this.q) {
            this.c.setCustomCloseListener(this);
        }
        this.c.renderAd(pOBAdDescriptor);
        return true;
    }

    void setFSCEnabled(boolean z) {
        setOnClickListener(z ? this : null);
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setLearnMoreTitle(@NonNull String str) {
        this.b = str;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setListener(@Nullable POBEndCardViewListener pOBEndCardViewListener) {
        this.a = pOBEndCardViewListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.g = pOBOnSkipOptionUpdateListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setSkipAfter(int i) {
        this.d = i;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener
    public void useCustomClose(boolean z) {
        this.l = z;
        e();
        long max = Math.max(0L, System.currentTimeMillis() - this.m);
        this.m = max;
        a(z, max);
    }

    public POBMraidEndCardView(@NonNull Context context, boolean z, boolean z2) {
        this(context);
        this.q = z2;
        setBackgroundColor(getResources().getColor(android.R.color.black));
        if (z2) {
            a(context, z);
        }
    }

    private void b() {
        a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBCountdownView pOBCountdownView = this.h;
        if (pOBCountdownView == null || pOBCountdownView.getParent() != this) {
            return;
        }
        removeView(this.h);
        g();
        this.h = null;
    }

    private void a(Context context, boolean z) {
        this.f = z;
        if (z) {
            this.e = POBUIUtil.createSkipButton(context, R.id.pob_forward_btn, com.pubmatic.sdk.webrendering.R.drawable.pob_ic_forward_24);
        } else {
            this.e = POBUIUtil.createSkipButton(context, R.id.pob_close_btn, R.drawable.pob_ic_close_black_24dp);
        }
        this.e.setOnClickListener(this);
        this.e.setVisibility(8);
    }

    private void a() {
        POBLog.debug("POBMraidEndCardView", POBVideoLogConstants.MSG_RENDERING_LEARN_MORE, new Object[0]);
        Resources resources = getResources();
        View a2 = com.pubmatic.sdk.video.player.a.a(getContext(), com.pubmatic.sdk.video.R.id.pob_learn_more_btn, this.b, resources.getColor(com.pubmatic.sdk.webrendering.R.color.pob_controls_background_color));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_control_height));
        layoutParams.gravity = 17;
        addView(a2, layoutParams);
        a2.setOnClickListener(this);
    }

    private void a(POBVastError pOBVastError) {
        POBEndCardViewListener pOBEndCardViewListener = this.a;
        if (pOBEndCardViewListener != null) {
            pOBEndCardViewListener.onError(pOBVastError);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, long j) {
        if (this.q && !this.n) {
            this.n = true;
            POBLog.debug("POBMraidEndCardView", "EndCard skipOffset: " + this.d, new Object[0]);
            if (z) {
                this.k = new b(a(j), 1L, Looper.getMainLooper());
                if (hasWindowFocus()) {
                    i();
                }
            } else {
                int seconds = this.d - ((int) TimeUnit.MILLISECONDS.toSeconds(j));
                if (seconds > 0) {
                    this.h = new POBCountdownView(getContext(), seconds);
                    a(false);
                    this.h.setTimerExhaustedListener(new c());
                    addView(this.h);
                    POBLog.debug("POBMraidEndCardView", "Countdown view timer started", new Object[0]);
                } else {
                    g();
                }
            }
            addView(this.e);
        }
    }

    private long a(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(TimeUnit.SECONDS.toMillis(this.d), 20000L) - j);
    }

    private void a(boolean z) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.g;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z);
        }
    }
}
