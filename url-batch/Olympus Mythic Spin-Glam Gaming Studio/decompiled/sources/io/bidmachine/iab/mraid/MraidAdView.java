package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.mraid.MraidWebViewController;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.model.ScriptConfig;
import io.bidmachine.rendering.utils.PrivacySheetParamsParser;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;
import io.bidmachine.util.ViewUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MraidAdView extends FrameLayout {
    private final MraidPlacementType a;
    private final String b;
    private final String c;
    private final long d;
    private final String e;
    private final AtomicBoolean f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private final AtomicBoolean j;
    private final GestureDetector k;
    private final MraidNativeFeatureManager l;
    private final MraidNativeFeatureSchemeValidator m;
    private final b n;
    private final MraidWebViewController o;
    private final Listener p;
    private final List q;
    MraidWebViewController r;
    private MraidViewState s;
    private final MraidAdRedirectHandler t;
    private boolean u;

    private static class GestureDetectorListener extends GestureDetector.SimpleOnGestureListener {
        private GestureDetectorListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    public interface Listener {
        boolean ignoreExpandUrl(@NonNull MraidAdView mraidAdView);

        void onCalendarEventIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onChangeOrientationIntention(@NonNull MraidAdView mraidAdView, @NonNull MraidOrientationProperties mraidOrientationProperties);

        void onCloseIntention(@NonNull MraidAdView mraidAdView);

        boolean onExpandIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @Nullable MraidOrientationProperties mraidOrientationProperties, boolean z);

        void onExpanded(@NonNull MraidAdView mraidAdView);

        void onMraidAdViewExpired(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewLoadFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewPageLoaded(@NonNull MraidAdView mraidAdView, @NonNull String str, @NonNull WebView webView, boolean z);

        void onMraidAdViewShowFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewShown(@NonNull MraidAdView mraidAdView);

        void onMraidLoadedIntention(@NonNull MraidAdView mraidAdView);

        void onOpenPrivacySheet(@NonNull MraidAdView mraidAdView, @NonNull PrivacySheetParams privacySheetParams);

        void onOpenUrlIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onPlayVideoIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        boolean onResizeIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @NonNull MraidResizeProperties mraidResizeProperties, @NonNull MraidScreenMetrics mraidScreenMetrics);

        void onStorePictureIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onSyncCustomCloseIntention(@NonNull MraidAdView mraidAdView, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class MraidWebViewControllerCallback implements MraidWebViewController.Callback {
        private MraidWebViewControllerCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(IabError iabError) {
            return "Callback - onError: " + iabError;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "Callback - onLoaded";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(String str) {
            return "Callback - onExpand: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(String str) {
            return "Callback - onOpen: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(String str) {
            return "Callback - onOpenPrivacySheet: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(String str) {
            return "Callback - onPlayVideo: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(String str) {
            return "Callback - onStorePicture: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(String str) {
            MraidAdView.this.p.onStorePictureIntention(MraidAdView.this, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onCalendarEvent(@Nullable final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String b;
                    b = MraidAdView.MraidWebViewControllerCallback.b(str);
                    return b;
                }
            });
            String a = MraidAdView.this.n.a(str);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            MraidAdView.this.a(a, new Executable() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda9
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    MraidAdView.MraidWebViewControllerCallback.this.a((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onClose() {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a;
                    a = MraidAdView.MraidWebViewControllerCallback.a();
                    return a;
                }
            });
            MraidAdView.this.a();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onError(@NonNull final IabError iabError) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a;
                    a = MraidAdView.MraidWebViewControllerCallback.a(IabError.this);
                    return a;
                }
            });
            MraidAdView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onExpand(@Nullable final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String c;
                    c = MraidAdView.MraidWebViewControllerCallback.c(str);
                    return c;
                }
            });
            MraidAdView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onLoaded() {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String b;
                    b = MraidAdView.MraidWebViewControllerCallback.b();
                    return b;
                }
            });
            MraidAdView.this.b();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpen(@NonNull final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String d;
                    d = MraidAdView.MraidWebViewControllerCallback.d(str);
                    return d;
                }
            });
            MraidAdView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpenPrivacySheet(@NonNull final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String e;
                    e = MraidAdView.MraidWebViewControllerCallback.e(str);
                    return e;
                }
            });
            MraidAdView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOrientation(@NonNull final MraidOrientationProperties mraidOrientationProperties) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a;
                    a = MraidAdView.MraidWebViewControllerCallback.a(MraidOrientationProperties.this);
                    return a;
                }
            });
            if (MraidAdView.this.isInterstitial() || MraidAdView.this.s == MraidViewState.EXPANDED) {
                MraidAdView.this.p.onChangeOrientationIntention(MraidAdView.this, mraidOrientationProperties);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPlayVideo(@Nullable final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String f;
                    f = MraidAdView.MraidWebViewControllerCallback.f(str);
                    return f;
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                MraidAdView.this.p.onPlayVideoIntention(MraidAdView.this, URLDecoder.decode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                MraidLog.e("MraidAdView", e);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onResize(@NonNull final MraidResizeProperties mraidResizeProperties) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a;
                    a = MraidAdView.MraidWebViewControllerCallback.a(MraidResizeProperties.this);
                    return a;
                }
            });
            MraidAdView.this.a(mraidResizeProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onStorePicture(@Nullable final String str) {
            MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String g;
                    g = MraidAdView.MraidWebViewControllerCallback.g(str);
                    return g;
                }
            });
            String b = MraidAdView.this.n.b(str);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            MraidAdView.this.a(b, new Executable() { // from class: io.bidmachine.iab.mraid.MraidAdView$MraidWebViewControllerCallback$$ExternalSyntheticLambda5
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    MraidAdView.MraidWebViewControllerCallback.this.h((String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a() {
            return "Callback - onClose";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(String str) {
            return "Callback - onCalendarEvent: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(MraidResizeProperties mraidResizeProperties) {
            return "Callback - onResize: " + mraidResizeProperties;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(MraidOrientationProperties mraidOrientationProperties) {
            return "Callback - onOrientation: " + mraidOrientationProperties;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            MraidAdView.this.p.onCalendarEventIntention(MraidAdView.this, str);
        }
    }

    private class PrimaryControllerCallback extends MraidWebViewControllerCallback {
        private PrimaryControllerCallback() {
            super();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z) {
            Listener listener = MraidAdView.this.p;
            MraidAdView mraidAdView = MraidAdView.this;
            listener.onSyncCustomCloseIntention(mraidAdView, mraidAdView.o.isUseCustomClose());
        }
    }

    private class SecondaryControllerCallback extends MraidWebViewControllerCallback {
        private SecondaryControllerCallback() {
            super();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.c();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (mraidAdView.r != null) {
                Listener listener = mraidAdView.p;
                MraidAdView mraidAdView2 = MraidAdView.this;
                listener.onSyncCustomCloseIntention(mraidAdView2, mraidAdView2.r.isUseCustomClose());
            }
        }
    }

    public MraidAdView(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable Long l, @Nullable List<ScriptConfig> list2, @NonNull Listener listener) {
        this(context, mraidPlacementType, str, str2, list, str3, l, list2, listener, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public MraidWebViewController getCurrentMraidWebViewController() {
        MraidWebViewController mraidWebViewController = this.r;
        return mraidWebViewController != null ? mraidWebViewController : this.o;
    }

    private void h() {
        if (this.i.compareAndSet(false, true)) {
            this.p.onMraidAdViewShown(this);
        }
    }

    private void i() {
        this.o.onViewabilityChanged(this.u);
        if (isLoaded() && this.u) {
            g();
            h();
        }
    }

    public void close() {
        setViewState(MraidViewState.HIDDEN);
    }

    public void closeExpanded() {
        Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidAdView;->closeExpanded()V");
        BrandSafetyUtils.onBidMachineOnClose();
        safedk_MraidAdView_closeExpanded_3aac30666c72f2a31b3391b931e42444();
    }

    public void closeResized() {
        ViewUtils.addSingleViewSafely(this, this.o.getMraidWebView());
        setViewState(MraidViewState.DEFAULT);
    }

    public void destroy() {
        this.t.complete();
        this.o.destroy();
        MraidWebViewController mraidWebViewController = this.r;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public String getBaseUrl() {
        return this.b;
    }

    @Nullable
    public MraidOrientationProperties getLastOrientationProperties() {
        return this.o.getLastOrientationProperties();
    }

    @NonNull
    public MraidViewState getMraidViewState() {
        return this.s;
    }

    @NonNull
    public WebView getWebView() {
        return this.o.getMraidWebView();
    }

    public void handleRedirect(@NonNull ClickAreaFactory clickAreaFactory) {
        this.t.handle(clickAreaFactory);
    }

    public boolean isInterstitial() {
        return this.a == MraidPlacementType.INTERSTITIAL;
    }

    public boolean isLoaded() {
        return this.f.get();
    }

    public boolean isOpenNotified() {
        return this.j.get();
    }

    public boolean isReceivedJsError() {
        return this.o.isReceivedJsError();
    }

    public boolean isUseCustomClose() {
        return this.o.isUseCustomClose();
    }

    public void load(@Nullable String str) {
        if (str == null) {
            a(IabError.noRequiredArguments("Html data are null"));
        } else {
            this.o.load(this.b, str, this.q);
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

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onViewabilityChanged(boolean z) {
        this.u = z;
        MraidWebViewController mraidWebViewController = this.r;
        if (mraidWebViewController != null) {
            mraidWebViewController.onViewabilityChanged(z);
        } else {
            i();
        }
    }

    public void safedk_MraidAdView_closeExpanded_3aac30666c72f2a31b3391b931e42444() {
        MraidWebViewController mraidWebViewController = this.r;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
            this.r = null;
        } else {
            MraidWebView mraidWebView = this.o.getMraidWebView();
            if (mraidWebView.getParent() != this) {
                ViewUtils.addSingleViewSafely(this, mraidWebView);
            }
        }
        setViewState(MraidViewState.DEFAULT);
        i();
    }

    @VisibleForTesting
    void setViewState(@NonNull MraidViewState mraidViewState) {
        this.s = mraidViewState;
        this.o.applyState(mraidViewState);
        MraidWebViewController mraidWebViewController = this.r;
        if (mraidWebViewController != null) {
            mraidWebViewController.applyState(mraidViewState);
        }
    }

    public void show() {
        if (this.h.compareAndSet(false, true) && isLoaded()) {
            g();
        }
    }

    public static class Builder {
        private final Context a;
        private final MraidPlacementType b;
        private final Listener c;
        private String d = IabSettings.DEF_BASE_URL;
        private List e;
        private String f;
        private String g;
        private Long h;
        private List i;

        public Builder(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @NonNull Listener listener) {
            this.a = context;
            this.b = mraidPlacementType;
            this.c = listener;
        }

        public MraidAdView build() {
            return new MraidAdView(this.a, this.b, this.d, this.g, this.e, this.f, this.h, this.i, this.c);
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }

        public Builder setBaseUrl(@Nullable String str) {
            this.d = str;
            return this;
        }

        public Builder setExpandTimeWindowMs(@Nullable Long l) {
            this.h = l;
            return this;
        }

        public Builder setPageFinishedScript(@Nullable String str) {
            this.f = str;
            return this;
        }

        public Builder setProductLink(@Nullable String str) {
            this.g = str;
            return this;
        }

        public Builder setScriptConfigs(@Nullable List<ScriptConfig> list) {
            this.i = list;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable List<String> list) {
            this.e = list;
            return this;
        }
    }

    MraidAdView(Context context, MraidPlacementType mraidPlacementType, String str, final String str2, List list, String str3, Long l, final List list2, Listener listener, MraidWebViewController mraidWebViewController) {
        super(context);
        this.n = new b();
        this.u = false;
        this.a = mraidPlacementType;
        this.b = str;
        this.e = str2;
        this.c = str3;
        long longValue = l != null ? l.longValue() : 0L;
        this.d = longValue;
        this.q = list2;
        this.p = listener;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new GestureDetector(context, new GestureDetectorListener());
        MraidNativeFeatureManager mraidNativeFeatureManager = new MraidNativeFeatureManager(context, (List<String>) list);
        this.l = mraidNativeFeatureManager;
        this.m = new MraidNativeFeatureSchemeValidator(mraidNativeFeatureManager);
        mraidWebViewController = mraidWebViewController == null ? new MraidWebViewController(context, new PrimaryControllerCallback(), longValue) : mraidWebViewController;
        this.o = mraidWebViewController;
        addView(mraidWebViewController.getMraidWebView(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.t = new MraidAdRedirectHandler(new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                MraidWebViewController currentMraidWebViewController;
                currentMraidWebViewController = MraidAdView.this.getCurrentMraidWebViewController();
                return currentMraidWebViewController;
            }
        }, new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                List a;
                a = MraidAdView.a(list2);
                return a;
            }
        }, new Runnable() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MraidAdView.this.f(str2);
            }
        });
        this.s = MraidViewState.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        this.p.onOpenUrlIntention(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        if (str == null || !str.isEmpty()) {
            return;
        }
        c(str);
    }

    private void g() {
        if (this.g.compareAndSet(false, true)) {
            this.o.notifyReady();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.p.onMraidLoadedIntention(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        a(str, new Executable() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                MraidAdView.this.e((String) obj);
            }
        });
    }

    private boolean d() {
        return this.h.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "Callback - can't parse privacy sheet";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        PrivacySheetParams parseJson = PrivacySheetParamsParser.parseJson(str);
        if (parseJson == null) {
            MraidLog.e("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String e;
                    e = MraidAdView.e();
                    return e;
                }
            });
        } else {
            this.p.onOpenPrivacySheet(this, parseJson);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        MraidWebViewController mraidWebViewController = this.r;
        if (mraidWebViewController == null) {
            return;
        }
        mraidWebViewController.applySupportedServices(this.l);
        this.r.applyPlacement(this.a);
        this.r.applyViewable(this.u);
        this.r.applyState(this.s);
        this.r.injectJs(this.c);
        this.r.notifyReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.s == MraidViewState.LOADING && this.f.compareAndSet(false, true)) {
            this.o.applySupportedServices(this.l);
            this.o.applyPlacement(this.a);
            this.o.applyViewable(this.u);
            this.o.injectJs(this.c);
            setViewState(MraidViewState.DEFAULT);
            i();
            g();
            this.p.onMraidAdViewPageLoaded(this, str, this.o.getMraidWebView(), this.o.isUseCustomClose());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String f() {
        return "Callback: onResize (invalidate state: " + this.s + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        if (isLoaded()) {
            if (d()) {
                this.p.onMraidAdViewShowFailed(this, iabError);
                return;
            } else {
                this.p.onMraidAdViewExpired(this, iabError);
                return;
            }
        }
        this.p.onMraidAdViewLoadFailed(this, iabError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Executable executable) {
        this.j.set(true);
        this.t.complete();
        if (this.m.a(str)) {
            executable.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidResizeProperties mraidResizeProperties) {
        MraidViewState mraidViewState = this.s;
        if (mraidViewState != MraidViewState.LOADING && mraidViewState != MraidViewState.HIDDEN && mraidViewState != MraidViewState.EXPANDED && !isInterstitial()) {
            if (this.p.onResizeIntention(this, this.o.getMraidWebView(), mraidResizeProperties, this.o.getMraidScreenMetrics())) {
                setViewState(MraidViewState.RESIZED);
                return;
            }
            return;
        }
        MraidLog.d("MraidAdView", new Function0() { // from class: io.bidmachine.iab.mraid.MraidAdView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String f;
                f = MraidAdView.this.f();
                return f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidWebViewController mraidWebViewController;
        if (isInterstitial()) {
            return;
        }
        MraidViewState mraidViewState = this.s;
        if (mraidViewState == MraidViewState.DEFAULT || mraidViewState == MraidViewState.RESIZED) {
            if (str != null && !this.p.ignoreExpandUrl(this)) {
                try {
                    String decode = URLDecoder.decode(str, "UTF-8");
                    if (!Utils.isHttpUrl(decode)) {
                        decode = this.b + decode;
                    }
                    mraidWebViewController = new MraidWebViewController(getContext(), new SecondaryControllerCallback(), this.d);
                    this.r = mraidWebViewController;
                    mraidWebViewController.load(decode);
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            } else {
                mraidWebViewController = this.o;
            }
            if (this.p.onExpandIntention(this, mraidWebViewController.getMraidWebView(), mraidWebViewController.getLastOrientationProperties(), mraidWebViewController.isUseCustomClose())) {
                setViewState(MraidViewState.EXPANDED);
                this.p.onExpanded(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.p.onCloseIntention(this);
    }
}
