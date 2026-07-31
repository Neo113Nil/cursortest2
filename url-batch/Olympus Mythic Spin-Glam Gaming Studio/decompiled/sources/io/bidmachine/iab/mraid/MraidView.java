package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabTimerHelper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.ViewUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public class MraidView extends CloseableLayout implements CloseableLayout.OnCloseClickListener, IabClickCallback {
    private final AtomicBoolean A;
    private final CloseableLayout.OnCloseClickListener B;
    private final IabElementStyle C;
    private final IabElementStyle D;
    private final IabElementStyle E;
    private final IabElementStyle F;
    private boolean G;
    private IabTimerHelper H;
    private IabProgressWrapper I;
    boolean J;
    private Integer K;
    private final MutableContextWrapper h;
    private final MraidAdView i;
    private CloseableLayout j;
    private CloseableLayout k;
    private IabLoadingWrapper l;
    private WeakReference m;
    private String n;
    private MraidViewListener o;
    private final MraidAdMeasurer p;
    private final CacheControl q;
    private final float r;
    private final float s;
    private final float t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    final boolean y;
    private final AtomicBoolean z;

    public static class Builder {
        private final MraidPlacementType a;
        private CacheControl b;
        private String c;
        private String d;
        private String e;
        private String[] f;
        private IabElementStyle g;
        private IabElementStyle h;
        private IabElementStyle i;
        private IabElementStyle j;
        private float k;
        private float l;

        @VisibleForTesting
        public MraidViewListener listener;
        private float m;
        public MraidAdMeasurer mraidAdMeasurer;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;

        public Builder() {
            this(MraidPlacementType.INLINE);
        }

        public MraidView build(@NonNull Context context) {
            return new MraidView(context, this, null);
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.o = z;
            return this;
        }

        public Builder setAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.mraidAdMeasurer = mraidAdMeasurer;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f = strArr;
            return this;
        }

        public Builder setAutoViewabilityCheck(boolean z) {
            this.r = z;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.c = str;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            this.b = cacheControl;
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.g = iabElementStyle;
            return this;
        }

        public Builder setCloseTimeSec(float f) {
            this.l = f;
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.h = iabElementStyle;
            return this;
        }

        public Builder setDurationSec(float f) {
            this.m = f;
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setListener(MraidViewListener mraidViewListener) {
            this.listener = mraidViewListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.i = iabElementStyle;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.e = str;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            this.k = f;
            return this;
        }

        public Builder setProductLink(String str) {
            this.d = str;
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.j = iabElementStyle;
            return this;
        }

        public Builder setR1(boolean z) {
            this.p = z;
            return this;
        }

        public Builder setR2(boolean z) {
            this.q = z;
            return this;
        }

        Builder(MraidPlacementType mraidPlacementType) {
            this.f = null;
            this.k = 3.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.r = false;
            this.a = mraidPlacementType;
            this.b = CacheControl.FullLoad;
            this.c = IabSettings.DEF_BASE_URL;
        }
    }

    class a implements IabTimerHelper.TimerHelperCallback {
        a() {
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerFinish() {
            if (MraidView.this.I != null) {
                MraidView.this.I.detach();
            }
            if (MraidView.this.i.isOpenNotified() || !MraidView.this.x || MraidView.this.t <= 0.0f) {
                return;
            }
            MraidView.this.g();
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerTick(float f, long j, long j2) {
            int i = (int) (j2 / 1000);
            int i2 = (int) (j / 1000);
            if (MraidView.this.I != null) {
                MraidView.this.I.changePercentage(f, i2, i);
            }
        }
    }

    class b implements CloseableLayout.OnCloseClickListener {
        b() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            MraidView.this.c(IabError.placeholder("Close button clicked"));
            MraidView.this.j();
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidViewState mraidViewState = MraidView.this.i.getMraidViewState();
            if (mraidViewState == MraidViewState.RESIZED) {
                MraidView.this.e();
                return;
            }
            if (mraidViewState == MraidViewState.EXPANDED) {
                MraidView.this.d();
            } else if (MraidView.this.h()) {
                MraidView.this.i.close();
                MraidView.this.j();
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class e implements MraidAdView.Listener {
        private e() {
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean ignoreExpandUrl(MraidAdView mraidAdView) {
            return false;
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCalendarEventIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onChangeOrientationIntention(MraidAdView mraidAdView, MraidOrientationProperties mraidOrientationProperties) {
            MraidView.this.a(mraidOrientationProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCloseIntention(MraidAdView mraidAdView) {
            MraidView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onExpandIntention(MraidAdView mraidAdView, WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidView$e;->onExpandIntention(Lio/bidmachine/iab/mraid/MraidAdView;Landroid/webkit/WebView;Lio/bidmachine/iab/mraid/MraidOrientationProperties;Z)Z");
            BrandSafetyUtils.onBidMachineOnExpandIntention(webView);
            return safedk_MraidView$e_onExpandIntention_5b66ebd0792dfd908b50fa23df1965ba(mraidAdView, webView, mraidOrientationProperties, z);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onExpanded(MraidAdView mraidAdView) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidView$e;->onExpanded(Lio/bidmachine/iab/mraid/MraidAdView;)V");
            BrandSafetyUtils.onBidMachineOnExpanded();
            safedk_MraidView$e_onExpanded_7357cea8438109e70f1ad82268c2f17b(mraidAdView);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewExpired(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewLoadFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewPageLoaded(MraidAdView mraidAdView, String str, WebView webView, boolean z) {
            MraidView.this.a(str, webView, z);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShowFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.c(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShown(MraidAdView mraidAdView) {
            MraidView.this.m();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidLoadedIntention(MraidAdView mraidAdView) {
            MraidView.this.l();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenPrivacySheet(MraidAdView mraidAdView, PrivacySheetParams privacySheetParams) {
            MraidView.this.a(privacySheetParams);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenUrlIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onPlayVideoIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onResizeIntention(MraidAdView mraidAdView, WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
            return MraidView.this.a(webView, mraidResizeProperties, mraidScreenMetrics);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onStorePictureIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onSyncCustomCloseIntention(MraidAdView mraidAdView, boolean z) {
            if (MraidView.this.v) {
                return;
            }
            if (z && !MraidView.this.G) {
                MraidView.this.G = true;
            }
            MraidView.this.a(z);
        }

        public boolean safedk_MraidView$e_onExpandIntention_5b66ebd0792dfd908b50fa23df1965ba(MraidAdView p0, WebView p1, MraidOrientationProperties p2, boolean p3) {
            return MraidView.this.a(p1, p2, p3);
        }

        public void safedk_MraidView$e_onExpanded_7357cea8438109e70f1ad82268c2f17b(MraidAdView p0) {
            MraidView.this.k();
        }

        /* synthetic */ e(MraidView mraidView, a aVar) {
            this();
        }
    }

    /* synthetic */ MraidView(Context context, Builder builder, a aVar) {
        this(context, builder);
    }

    private void n() {
        setCloseClickListener(this.B);
        setCloseVisibility(true, this.r);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout
    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > MraidUtils.MAX_ON_SCREEN_TIME_MS || this.i.isReceivedJsError()) {
            return true;
        }
        if (this.v || !this.i.isUseCustomClose()) {
            return super.canBeClosed();
        }
        return false;
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandled() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickVerified() {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
    }

    public void destroy() {
        this.o = null;
        this.m = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            a(peekActivity);
        }
        a((View) this.j);
        a((View) this.k);
        this.i.destroy();
        IabTimerHelper iabTimerHelper = this.H;
        if (iabTimerHelper != null) {
            iabTimerHelper.detach();
        }
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public void load(@Nullable String str) {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null && str != null) {
            str = mraidAdMeasurer.prepareCreativeForMeasure(str);
        }
        int i = d.a[this.q.ordinal()];
        if (i == 1) {
            e(str);
            return;
        }
        if (i == 2) {
            this.n = str;
            l();
        } else {
            if (i != 3) {
                return;
            }
            l();
            e(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        a(getVisibility());
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCloseClick() {
        f();
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCountDownFinish() {
        if (!this.i.isOpenNotified() && this.x && this.t == 0.0f) {
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        a(getVisibility());
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onViewabilityChanged(boolean z) {
        this.i.onViewabilityChanged(z);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a(i);
    }

    @Nullable
    public Activity peekActivity() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @NonNull
    public Context peekContext() {
        Activity peekActivity = peekActivity();
        return peekActivity == null ? getContext() : peekActivity;
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.m = new WeakReference(activity);
            this.h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z) {
        if (!z) {
            IabLoadingWrapper iabLoadingWrapper = this.l;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.setVisibility(8);
                return;
            }
            return;
        }
        if (this.l == null) {
            IabLoadingWrapper iabLoadingWrapper2 = new IabLoadingWrapper(null);
            this.l = iabLoadingWrapper2;
            iabLoadingWrapper2.attach(getContext(), this, this.E);
        }
        this.l.setVisibility(0);
        this.l.bringToFront();
    }

    public void show(@Nullable Activity activity) {
        int i = d.a[this.q.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (h()) {
                    n();
                }
                e(this.n);
                this.n = null;
            } else if (i == 3) {
                if (i()) {
                    if (h()) {
                        a((CloseableLayout) this, this.i.isUseCustomClose());
                    }
                } else if (h()) {
                    n();
                }
            }
        } else if (h()) {
            a((CloseableLayout) this, this.i.isUseCustomClose());
        }
        this.i.show();
        setLastInteractedActivity(activity);
        a(this.i.getLastOrientationProperties());
    }

    private MraidView(@NonNull Context context, @NonNull Builder builder) {
        super(context);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.G = false;
        this.J = false;
        this.h = new MutableContextWrapper(context);
        this.o = builder.listener;
        this.q = builder.b;
        this.r = builder.k;
        this.s = builder.l;
        float f = builder.m;
        this.t = f;
        this.u = builder.n;
        this.v = builder.o;
        this.w = builder.p;
        this.x = builder.q;
        this.y = builder.r;
        MraidAdMeasurer mraidAdMeasurer = builder.mraidAdMeasurer;
        this.p = mraidAdMeasurer;
        this.C = builder.g;
        this.D = builder.h;
        this.E = builder.i;
        IabElementStyle iabElementStyle = builder.j;
        this.F = iabElementStyle;
        MraidAdView build = new MraidAdView.Builder(context.getApplicationContext(), builder.a, new e(this, null)).setBaseUrl(builder.c).setProductLink(builder.d).setAllowedNativeFeatures(builder.f).setPageFinishedScript(builder.e).build();
        this.i = build;
        addView(build, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f > 0.0f) {
            IabProgressWrapper iabProgressWrapper = new IabProgressWrapper(null);
            this.I = iabProgressWrapper;
            iabProgressWrapper.attach(context, this, iabElementStyle);
            IabTimerHelper iabTimerHelper = new IabTimerHelper(this, new a());
            this.H = iabTimerHelper;
            iabTimerHelper.setTime(f);
        }
        this.B = new b();
        setCloseClickListener(this);
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.registerAdContainer(this);
            mraidAdMeasurer.registerAdView(build.getWebView());
        }
    }

    private void e(String str) {
        this.i.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.C);
        this.i.handleRedirect(new ClickAreaFactory(resolveDefCloseStyle.getHorizontalPosition().intValue(), resolveDefCloseStyle.getVerticalPosition().intValue()));
    }

    private boolean i() {
        return this.i.isLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onClose(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpand(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        MraidViewListener mraidViewListener;
        if (this.z.getAndSet(true) || (mraidViewListener = this.o) == null) {
            return;
        }
        mraidViewListener.onLoaded(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdShown();
        }
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onShown(this);
        }
    }

    void f() {
        if (this.i.isOpenNotified() || !this.w) {
            Utils.onUiThread(new c());
        } else {
            g();
        }
    }

    boolean h() {
        return this.i.isInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a((View) this.k);
        this.k = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            a(peekActivity);
        }
        this.i.closeExpanded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a((View) this.j);
        this.j = null;
        this.i.closeResized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onShowFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onLoadFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.o == null) {
            return;
        }
        setLoadingVisible(true);
        this.o.onOpenUrl(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpired(this, iabError);
        }
    }

    private void b(Activity activity) {
        this.K = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.o.onCalendarEvent(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.o.onStorePicture(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener != null) {
            mraidViewListener.onPlayVideo(this, str);
        }
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        Utils.removeFromParent(view);
    }

    void a(int i) {
        if (this.y) {
            boolean z = this.J && ViewUtils.isViewVisible(i);
            if (this.A.compareAndSet(!z, z)) {
                onViewabilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, WebView webView, boolean z) {
        setLoadingVisible(false);
        if (h()) {
            a((CloseableLayout) this, z);
        }
        MraidAdMeasurer mraidAdMeasurer = this.p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdViewReady(webView);
        }
        if (this.q != CacheControl.FullLoad || this.u || str.equals("data:text/html,<html></html>")) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PrivacySheetParams privacySheetParams) {
        MraidViewListener mraidViewListener = this.o;
        if (mraidViewListener == null) {
            return;
        }
        mraidViewListener.onOpenPrivacySheet(this, privacySheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        CloseableLayout closeableLayout = this.j;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.j = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.j);
        }
        Utils.removeFromParent(webView);
        this.j.addView(webView);
        IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.C);
        resolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 7));
        resolveDefCloseStyle.setVerticalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 112));
        this.j.setCloseStyle(resolveDefCloseStyle);
        this.j.setCloseVisibility(false, this.s);
        a(mraidResizeProperties, mraidScreenMetrics);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z) {
        CloseableLayout closeableLayout = this.k;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add expanded view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.k = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.k);
        }
        Utils.removeFromParent(webView);
        this.k.addView(webView);
        a(this.k, z);
        a(mraidOrientationProperties);
        return true;
    }

    private void a(CloseableLayout closeableLayout, boolean z) {
        setCloseClickListener(this);
        closeableLayout.setCloseStyle(this.C);
        closeableLayout.setCountDownStyle(this.D);
        a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        boolean z2 = !z || this.v;
        CloseableLayout closeableLayout = this.j;
        if (closeableLayout != null) {
            closeableLayout.setCloseVisibility(z2, this.s);
            return;
        }
        CloseableLayout closeableLayout2 = this.k;
        if (closeableLayout2 != null) {
            closeableLayout2.setCloseVisibility(z2, this.s);
        } else if (h()) {
            setCloseVisibility(z2, this.G ? 0.0f : this.s);
        }
    }

    private void a(MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        MraidLog.d("MraidView", "setResizedViewSizeAndPosition: %s", mraidResizeProperties);
        if (this.j == null) {
            return;
        }
        int dpToPx = Utils.dpToPx(getContext(), mraidResizeProperties.width);
        int dpToPx2 = Utils.dpToPx(getContext(), mraidResizeProperties.height);
        int dpToPx3 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetX);
        int dpToPx4 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx2);
        Rect defaultAdRectPx = mraidScreenMetrics.getDefaultAdRectPx();
        int i = defaultAdRectPx.left + dpToPx3;
        int i2 = defaultAdRectPx.top + dpToPx4;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        this.j.setLayoutParams(layoutParams);
    }

    private void a(Activity activity) {
        Integer num = this.K;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidOrientationProperties mraidOrientationProperties) {
        if (mraidOrientationProperties == null) {
            return;
        }
        Activity peekActivity = peekActivity();
        MraidLog.d("MraidView", "applyOrientation: %s", mraidOrientationProperties);
        if (peekActivity == null) {
            MraidLog.d("MraidView", "no any interacted activities", new Object[0]);
        } else {
            b(peekActivity);
            peekActivity.setRequestedOrientation(mraidOrientationProperties.obtainTargetActivityOrientation(peekActivity));
        }
    }
}
