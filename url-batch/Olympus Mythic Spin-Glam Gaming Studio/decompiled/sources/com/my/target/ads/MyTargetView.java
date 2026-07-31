package com.my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.my.target.R;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.webform.WebFormClient;
import com.my.target.h3;
import com.my.target.jh;
import com.my.target.kh;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mi;
import com.my.target.n;
import com.my.target.nh;
import com.my.target.p;
import com.my.target.q;
import com.my.target.qi;
import com.my.target.s;
import com.my.target.tb;
import com.my.target.x;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class MyTargetView extends FrameLayout {
    private final n a;
    private final AtomicBoolean b;
    private MyTargetViewListener c;
    private WebFormClient d;
    private MyTargetViewRenderCrashListener e;
    private kh f;
    private AdSize g;
    private boolean h;
    private boolean i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface MyTargetViewListener {
        void onClick(@NonNull MyTargetView myTargetView);

        void onLoad(@NonNull MyTargetView myTargetView);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView);

        void onShow(@NonNull MyTargetView myTargetView);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @RequiresApi
    public interface MyTargetViewRenderCrashListener {
        void onViewRenderCrash(@NonNull MyTargetView myTargetView);
    }

    public MyTargetView(@NonNull Context context) {
        this(context, null);
    }

    public void a(nh nhVar, AdSize adSize) {
        final tb.a a = tb.a(this.a.j());
        jh.a(nhVar, this.a, a).a(new p.b() { // from class: com.my.target.ads.MyTargetView$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                MyTargetView.this.a(a, (nh) xVar, sVar);
            }
        }).a(a.a(), getContext());
    }

    public void destroy() {
        kh khVar = this.f;
        if (khVar != null) {
            khVar.a();
            this.f = null;
        }
        this.c = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public String getAdSource() {
        kh khVar = this.f;
        if (khVar != null) {
            return khVar.b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        kh khVar = this.f;
        if (khVar != null) {
            return khVar.c();
        }
        return 0.0f;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.a.h();
    }

    @Nullable
    public MyTargetViewListener getListener() {
        return this.c;
    }

    @Nullable
    @RequiresApi
    public MyTargetViewRenderCrashListener getRenderCrashListener() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.e;
        }
        mi.b("Trying to get a MyTargetViewRenderCrashListener on api = " + i + ", but min api = 26, return null");
        return null;
    }

    @NonNull
    public AdSize getSize() {
        return this.g;
    }

    @Nullable
    public WebFormClient getWebFormClient() {
        return this.d;
    }

    @Deprecated
    public void init(int i) {
        init(i, true);
    }

    public boolean isMediationEnabled() {
        return this.a.m();
    }

    public void load() {
        if (!this.b.compareAndSet(false, true)) {
            mi.a("MyTargetView: Doesn't support multiple load");
            return;
        }
        final tb.a a = tb.a(this.a.j());
        tb a2 = a.a();
        mi.a("MyTargetView: View load");
        a();
        jh.a(this.a, a).a(new p.b() { // from class: com.my.target.ads.MyTargetView$$ExternalSyntheticLambda1
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                MyTargetView.this.b(a, (nh) xVar, sVar);
            }
        }).a(a2, getContext());
    }

    public void loadFromBid(@NonNull String str) {
        this.a.b(str);
        this.a.b(false);
        load();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        kh khVar = this.f;
        if (khVar != null) {
            khVar.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        kh khVar = this.f;
        if (khVar != null) {
            khVar.a(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.h) {
            b();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        kh khVar = this.f;
        if (khVar != null) {
            khVar.b(z);
        }
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.a.a(str, adNetworkConfig);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        if (adSize == null) {
            mi.a("MyTargetView: AdSize cannot be null");
            return;
        }
        if (this.h && AdSize.a(this.g, adSize)) {
            return;
        }
        this.h = true;
        if (this.b.get()) {
            AdSize adSize2 = this.g;
            AdSize adSize3 = AdSize.ADSIZE_300x250;
            if (AdSize.a(adSize2, adSize3) || AdSize.a(adSize, adSize3)) {
                mi.a("MyTargetView: unable to switch size to/from 300x250");
                return;
            }
        }
        kh khVar = this.f;
        if (khVar != null) {
            khVar.a(adSize);
            View childAt = getChildAt(0);
            if (childAt instanceof h3) {
                childAt.requestLayout();
            }
        }
        this.g = adSize;
        a();
    }

    public void setListener(@Nullable MyTargetViewListener myTargetViewListener) {
        this.c = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z) {
        this.a.a(z);
    }

    public void setRefreshAd(boolean z) {
        this.a.b(z);
    }

    @RequiresApi
    public void setRenderCrashListener(@Nullable MyTargetViewRenderCrashListener myTargetViewRenderCrashListener) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.e = myTargetViewRenderCrashListener;
            return;
        }
        mi.b("Can't set MyTargetViewRenderCrashListener: available only on api >= 26, your api = " + i);
    }

    public void setSlotId(int i) {
        if (this.b.get()) {
            return;
        }
        this.a.c(i);
    }

    public void setWebFormClient(@Nullable WebFormClient webFormClient) {
        this.d = webFormClient;
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        Context context = getContext();
        Point c = qi.c(context);
        int i = c.x;
        float f = c.y;
        if (i != this.g.a || r3.b > f * 0.15f) {
            AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
            this.g = adSizeForCurrentOrientation;
            kh khVar = this.f;
            if (khVar != null) {
                khVar.a(adSizeForCurrentOrientation);
            }
        }
    }

    @Deprecated
    public void init(int i, boolean z) {
        init(i, 0, z);
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.b = new AtomicBoolean();
        this.h = false;
        mi.c("MyTargetView created. Version - " + MyTargetVersion.VERSION);
        this.a = n.a(0, "");
        this.g = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet == null) {
            return;
        }
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.MyTargetView);
        } catch (Throwable th) {
            mi.a("MyTargetView: Unable to get view attributes - " + th.getMessage());
            typedArray = null;
        }
        if (typedArray == null) {
            return;
        }
        this.a.c(typedArray.getInt(R.styleable.MyTargetView_myTarget_slotId, 0));
        this.a.b(typedArray.getBoolean(R.styleable.MyTargetView_myTarget_isRefreshAd, true));
        int i2 = typedArray.getInt(R.styleable.MyTargetView_myTarget_adSize, -1);
        if (i2 >= 0) {
            if (i2 != 3) {
                this.h = true;
            }
            this.g = AdSize.a(i2, context);
        }
        typedArray.recycle();
    }

    @Deprecated
    public void init(int i, int i2) {
        init(i, i2, true);
    }

    @Deprecated
    public void init(int i, int i2, boolean z) {
        setAdSize(AdSize.a(i2, getContext()));
        this.a.c(i);
        this.a.b(z);
        mi.a("MyTargetView: Initialized");
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class AdSize {
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        public static final AdSize ADSIZE_320x50 = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, 0);
        public static final AdSize ADSIZE_300x250 = new AdSize(300, POBCommonConstants.DEFAULT_MIN_BITRATE, 1);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);

        private AdSize(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }

        private static AdSize a(float f, float f2) {
            float a = qi.a();
            float max = Math.max(Math.min(f > 524.0f ? (f / 728.0f) * 90.0f : (f / 320.0f) * 50.0f, f2), 50.0f * a);
            return new AdSize((int) (f / a), (int) (max / a), (int) f, (int) max, 3);
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i, int i2, @NonNull Context context) {
            Point c = qi.c(context);
            float a = qi.a();
            return a(i * a, Math.min(i2 * a, c.y * 0.15f));
        }

        public int getHeight() {
            return this.b;
        }

        public int getHeightPixels() {
            return this.d;
        }

        public int getType() {
            return this.e;
        }

        public int getWidth() {
            return this.a;
        }

        public int getWidthPixels() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AdSize a(int i, Context context) {
            if (i == 1) {
                return ADSIZE_300x250;
            }
            if (i == 2) {
                return ADSIZE_728x90;
            }
            if (i != 3) {
                return ADSIZE_320x50;
            }
            return getAdSizeForCurrentOrientation(context);
        }

        private AdSize(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            float a = qi.a();
            this.c = (int) (i * a);
            this.d = (int) (i2 * a);
            this.e = i3;
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i, @NonNull Context context) {
            return a(i * qi.a(), qi.c(context).y * 0.15f);
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(@NonNull Context context) {
            Point c = qi.c(context);
            return a(c.x, c.y * 0.15f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(AdSize adSize, AdSize adSize2) {
            return adSize.b == adSize2.b && adSize.a == adSize2.a && adSize.e == adSize2.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(nh nhVar, s sVar, tb.a aVar) {
        if (this.c == null) {
            return;
        }
        q a = sVar.a();
        if (nhVar == null) {
            MyTargetViewListener myTargetViewListener = this.c;
            if (a == null) {
                a = q.i;
            }
            myTargetViewListener.onNoAd(a, this);
            return;
        }
        kh khVar = this.f;
        if (khVar != null) {
            khVar.a();
        }
        kh a2 = kh.a(this, this.a, aVar);
        this.f = a2;
        a2.a(this.i);
        this.f.b(nhVar);
        this.a.b((String) null);
    }

    private void a() {
        AdSize adSize = this.g;
        if (adSize == AdSize.ADSIZE_320x50) {
            this.a.c("standard_320x50");
            return;
        }
        if (adSize == AdSize.ADSIZE_300x250) {
            this.a.c("standard_300x250");
        } else if (adSize == AdSize.ADSIZE_728x90) {
            this.a.c("standard_728x90");
        } else {
            this.a.c("standard");
        }
    }
}
