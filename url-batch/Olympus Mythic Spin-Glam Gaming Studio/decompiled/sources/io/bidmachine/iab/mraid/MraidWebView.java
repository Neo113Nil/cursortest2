package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import com.yandex.div.core.timer.TimerController;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.util.DeviceUtilsKt;
import io.bidmachine.util.UiUtils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002V:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010\u0015JW\u0010/\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0015J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001dH\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0007¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\nH\u0007¢\u0006\u0004\b6\u0010\u0015J\r\u00107\u001a\u00020\n¢\u0006\u0004\b7\u0010\u0015J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\u0015R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010N\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\u0010R$\u0010P\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010M\u001a\u0004\bP\u0010\u0010R\"\u0010U\u001a\u0010\u0012\f\u0012\n R*\u0004\u0018\u00010\u00040\u00040Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lio/bidmachine/iab/mraid/MraidWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Lio/bidmachine/iab/mraid/MraidWebViewController;", "controller", "<init>", "(Landroid/content/Context;Lio/bidmachine/iab/mraid/MraidWebViewController;)V", "", "muted", "", "setAudioMuted", "(Z)V", "getController", "()Lio/bidmachine/iab/mraid/MraidWebViewController;", "wasClicked", "()Z", "", "getClickTimeMs", "()J", "resetClicked", "()V", "onPageFinished", X3.i.o, "onViewabilityChanged", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "w", "h", "ow", "oh", "onSizeChanged", "(IIII)V", "updateMraidScreenMetrics$bidmachine_android_sdk_bb_3_7_1", "updateMraidScreenMetrics", "deltaX", "deltaY", "scrollX", "scrollY", "scrollRangeX", "scrollRangeY", "maxOverScrollX", "maxOverScrollY", "isTouchEvent", "overScrollBy", "(IIIIIIIIZ)Z", "computeScroll", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "onWindowVisibilityChanged", "(I)V", "doPause", "doResume", TimerController.RESET_COMMAND, "destroy", "Lio/bidmachine/iab/mraid/WebViewGestureDetector;", "a", "Lio/bidmachine/iab/mraid/WebViewGestureDetector;", "webViewGestureDetector", "Lio/bidmachine/iab/mraid/MraidScreenMetrics;", "b", "Lio/bidmachine/iab/mraid/MraidScreenMetrics;", "getMraidScreenMetrics", "()Lio/bidmachine/iab/mraid/MraidScreenMetrics;", "mraidScreenMetrics", "Lio/bidmachine/iab/mraid/MraidWebViewListener;", "c", "Lio/bidmachine/iab/mraid/MraidWebViewListener;", "getMraidWebViewListener", "()Lio/bidmachine/iab/mraid/MraidWebViewListener;", "setMraidWebViewListener", "(Lio/bidmachine/iab/mraid/MraidWebViewListener;)V", "mraidWebViewListener", "<set-?>", "d", "Z", "isLoaded", EidRequestBuilder.REQUEST_FIELD_EMAIL, "isDestroyed", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/ref/WeakReference;", "controllerRef", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes15.dex */
public final class MraidWebView extends WebView {
    private static final MraidWebChromeClient g = new MraidWebChromeClient();

    /* renamed from: a, reason: from kotlin metadata */
    private final WebViewGestureDetector webViewGestureDetector;

    /* renamed from: b, reason: from kotlin metadata */
    private final MraidScreenMetrics mraidScreenMetrics;

    /* renamed from: c, reason: from kotlin metadata */
    private MraidWebViewListener mraidWebViewListener;

    /* renamed from: d, reason: from kotlin metadata */
    private boolean isLoaded;

    /* renamed from: e, reason: from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: f, reason: from kotlin metadata */
    private final WeakReference controllerRef;

    private final class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            MraidWebView.this.webViewGestureDetector.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return X3.i.t0;
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return X3.i.u0;
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ Configuration a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Configuration configuration) {
            super(0);
            this.a = configuration;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "onConfigurationChanged: " + Utils.orientationToString(this.a.orientation);
        }
    }

    static final class e extends Lambda implements Function0 {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "setAudioMuted: " + this.a;
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return "setAudioMuted: not supported";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidWebView(@NotNull Context context, @NotNull MraidWebViewController controller) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.webViewGestureDetector = new WebViewGestureDetector(context);
        this.mraidScreenMetrics = new MraidScreenMetrics(context);
        this.controllerRef = new WeakReference(controller);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        setOnTouchListener(new a());
        setWebChromeClient(g);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MraidWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateMraidScreenMetrics$bidmachine_android_sdk_bb_3_7_1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MraidWebView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateMraidScreenMetrics$bidmachine_android_sdk_bb_3_7_1();
    }

    private final void setAudioMuted(boolean muted) {
        try {
            if (WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                WebViewCompat.setAudioMuted(this, muted);
                MraidLog.d(v.h, new e(muted));
            } else {
                MraidLog.w(v.h, f.a);
            }
        } catch (Throwable th) {
            MraidLog.e(v.h, th);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.isLoaded = false;
        this.isDestroyed = true;
        try {
            reset();
            removeAllViews();
            super.destroy();
        } catch (Throwable th) {
            MraidLog.e(v.h, th);
        }
        this.controllerRef.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @VisibleForTesting
    public final void doPause() {
        MraidLog.d(v.h, b.a);
        try {
            onPause();
        } catch (Throwable th) {
            MraidLog.e(v.h, th);
        }
        setAudioMuted(true);
    }

    @VisibleForTesting
    public final void doResume() {
        MraidLog.d(v.h, c.a);
        try {
            onResume();
        } catch (Throwable th) {
            MraidLog.e(v.h, th);
        }
        setAudioMuted(false);
    }

    public final long getClickTimeMs() {
        return this.webViewGestureDetector.getClickTimeMs();
    }

    @Nullable
    public final MraidWebViewController getController() {
        return (MraidWebViewController) this.controllerRef.get();
    }

    @NotNull
    public final MraidScreenMetrics getMraidScreenMetrics() {
        return this.mraidScreenMetrics;
    }

    @Nullable
    public final MraidWebViewListener getMraidWebViewListener() {
        return this.mraidWebViewListener;
    }

    /* renamed from: isDestroyed, reason: from getter */
    public final boolean getIsDestroyed() {
        return this.isDestroyed;
    }

    /* renamed from: isLoaded, reason: from getter */
    public final boolean getIsLoaded() {
        return this.isLoaded;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        MraidLog.d(v.h, new d(newConfig));
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.iab.mraid.MraidWebView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MraidWebView.a(MraidWebView.this);
            }
        });
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void onPageFinished() {
        this.isLoaded = true;
        updateMraidScreenMetrics$bidmachine_android_sdk_bb_3_7_1();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int w, int h, int ow, int oh) {
        super.onSizeChanged(w, h, ow, oh);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.iab.mraid.MraidWebView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MraidWebView.b(MraidWebView.this);
            }
        });
    }

    public final void onViewabilityChanged(boolean isViewable) {
        if (isViewable) {
            doResume();
        } else {
            doPause();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0) {
            doResume();
        } else {
            doPause();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        return false;
    }

    public final void reset() {
        stopLoading();
        BidMachineNetworkBridge.webviewLoadUrl(this, "");
        doPause();
    }

    public final void resetClicked() {
        this.webViewGestureDetector.resetClick();
    }

    public final void setMraidWebViewListener(@Nullable MraidWebViewListener mraidWebViewListener) {
        this.mraidWebViewListener = mraidWebViewListener;
    }

    public final void updateMraidScreenMetrics$bidmachine_android_sdk_bb_3_7_1() {
        MraidWebViewListener mraidWebViewListener;
        if (!this.isLoaded || this.isDestroyed) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext()");
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            view = this;
        }
        DisplayMetrics displayMetrics = DeviceUtilsKt.getDisplayMetrics(context);
        boolean screenSize = this.mraidScreenMetrics.setScreenSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View obtainRootView = MraidUtils.obtainRootView(context, view);
        Intrinsics.checkNotNullExpressionValue(obtainRootView, "obtainRootView(context, container)");
        obtainRootView.getLocationOnScreen(iArr);
        boolean rootViewPosition = this.mraidScreenMetrics.setRootViewPosition(iArr[0], iArr[1], obtainRootView.getWidth(), obtainRootView.getHeight()) | screenSize;
        view.getLocationOnScreen(iArr);
        boolean defaultAdPosition = rootViewPosition | this.mraidScreenMetrics.setDefaultAdPosition(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        getLocationOnScreen(iArr);
        if ((!defaultAdPosition && !this.mraidScreenMetrics.setCurrentAdPosition(iArr[0], iArr[1], getWidth(), getHeight())) || (mraidWebViewListener = this.mraidWebViewListener) == null) {
            return;
        }
        mraidWebViewListener.onMraidScreenMetricsChanged(this.mraidScreenMetrics);
    }

    public final boolean wasClicked() {
        return this.webViewGestureDetector.isClicked();
    }
}
