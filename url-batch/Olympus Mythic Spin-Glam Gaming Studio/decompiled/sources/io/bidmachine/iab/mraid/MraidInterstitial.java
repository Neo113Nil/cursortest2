package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class MraidInterstitial {
    private static final AtomicInteger k = new AtomicInteger(0);
    static final /* synthetic */ boolean l = true;
    MraidView d;
    private MraidInterstitialListener e;
    public final int id = k.getAndIncrement();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private final AtomicBoolean a = new AtomicBoolean(false);
    final MraidViewListener c = new b();

    public class Builder {
        private final MraidView.Builder a = new MraidView.Builder(MraidPlacementType.INTERSTITIAL);

        public Builder() {
        }

        public MraidInterstitial build(@NonNull Context context) {
            this.a.setListener(MraidInterstitial.this.c);
            MraidInterstitial.this.d = this.a.build(context);
            return MraidInterstitial.this;
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.a.forceUseNativeCloseButton(z);
            return this;
        }

        public Builder setAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.a.setAdMeasurer(mraidAdMeasurer);
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.a.setAllowedNativeFeatures(strArr);
            return this;
        }

        public Builder setAutoViewabilityCheck(boolean z) {
            this.a.setAutoViewabilityCheck(z);
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.a.setBaseUrl(str);
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            this.a.setCacheControl(cacheControl);
            return this;
        }

        public Builder setCloseStyle(@Nullable IabElementStyle iabElementStyle) {
            this.a.setCloseStyle(iabElementStyle);
            return this;
        }

        public Builder setCloseTime(float f) {
            this.a.setCloseTimeSec(f);
            return this;
        }

        public Builder setCountDownStyle(@Nullable IabElementStyle iabElementStyle) {
            this.a.setCountDownStyle(iabElementStyle);
            return this;
        }

        public Builder setDurationSec(float f) {
            this.a.setDurationSec(f);
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.a.setIsTag(z);
            return this;
        }

        public Builder setListener(MraidInterstitialListener mraidInterstitialListener) {
            MraidInterstitial.this.e = mraidInterstitialListener;
            return this;
        }

        public Builder setLoadingStyle(@Nullable IabElementStyle iabElementStyle) {
            this.a.setLoadingStyle(iabElementStyle);
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.a.setPageFinishedScript(str);
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            this.a.setPlaceholderTimeoutSec(f);
            return this;
        }

        public Builder setProductLink(String str) {
            this.a.setProductLink(str);
            return this;
        }

        public Builder setProgressStyle(@Nullable IabElementStyle iabElementStyle) {
            this.a.setProgressStyle(iabElementStyle);
            return this;
        }

        public Builder setR1(boolean z) {
            this.a.setR1(z);
            return this;
        }

        public Builder setR2(boolean z) {
            this.a.setR2(z);
            return this;
        }
    }

    private class b implements MraidViewListener {
        private b() {
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onCalendarEvent(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onCalendarEvent(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onClose(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            MraidInterstitial.this.b.set(true);
            MraidInterstitial.this.a();
            MraidInterstitial.this.b();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onExpand(MraidView mraidView) {
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onExpired(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onExpired (%s)", iabError);
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onExpired(MraidInterstitial.this, iabError);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onLoadFailed(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onLoadFailed (%s)", iabError);
            MraidInterstitial.this.a();
            MraidInterstitial.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onLoaded(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            MraidInterstitial.this.c();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onOpenPrivacySheet(MraidView mraidView, PrivacySheetParams privacySheetParams) {
            MraidLog.d("MraidInterstitial", "ViewListener - onOpenPrivacySheet (%s)", privacySheetParams.toString());
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onOpenPrivacySheet(MraidInterstitial.this, privacySheetParams);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onOpenUrl(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onOpenUrl(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onPlayVideo(MraidView mraidView, String str) {
            MraidLog.d("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onPlayVideo(MraidInterstitial.this, str);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onShowFailed(MraidView mraidView, IabError iabError) {
            MraidLog.d("MraidInterstitial", "ViewListener - onShowFailed (%s)", iabError);
            MraidInterstitial.this.a();
            MraidInterstitial.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onShown(MraidView mraidView) {
            MraidLog.d("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            MraidInterstitial.this.d();
        }

        @Override // io.bidmachine.iab.mraid.MraidViewListener
        public void onStorePicture(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            MraidLog.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
            if (MraidInterstitial.this.e != null) {
                MraidInterstitial.this.e.onStorePicture(MraidInterstitial.this, str, iabClickCallback);
            }
        }
    }

    private MraidInterstitial() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new MraidInterstitial().new Builder();
    }

    public boolean canBeClosed() {
        MraidView mraidView = this.d;
        return mraidView == null || mraidView.canBeClosed() || isReceivedError();
    }

    void d() {
        this.a.set(true);
        MraidInterstitialListener mraidInterstitialListener = this.e;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onShown(this);
        }
    }

    public void destroy() {
        MraidLog.d("MraidInterstitial", "destroy", new Object[0]);
        this.f = false;
        this.e = null;
        MraidView mraidView = this.d;
        if (mraidView != null) {
            mraidView.destroy();
            this.d = null;
        }
    }

    public void dispatchClose() {
        if (this.d == null || !canBeClosed()) {
            return;
        }
        this.d.f();
    }

    public boolean isClosed() {
        return this.g;
    }

    public boolean isCompleted() {
        return this.b.get();
    }

    public boolean isReady() {
        return this.f && this.d != null;
    }

    public boolean isReceivedError() {
        return this.h;
    }

    public boolean isShown() {
        return this.a.get();
    }

    public void load(@Nullable String str) {
        MraidView mraidView = this.d;
        if (mraidView == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        mraidView.load(str);
    }

    @Nullable
    public Context peekContext() {
        MraidView mraidView = this.d;
        if (mraidView == null) {
            return null;
        }
        return mraidView.peekContext();
    }

    public void show(@Nullable Context context, @Nullable MraidType mraidType) {
        MraidActivity.show(context, this, mraidType);
    }

    public void showInView(@NonNull ViewGroup viewGroup, boolean z) {
        a(null, viewGroup, false, z);
    }

    void b(IabError iabError) {
        this.f = false;
        this.h = true;
        c(iabError);
    }

    void c() {
        this.f = true;
        MraidInterstitialListener mraidInterstitialListener = this.e;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onLoaded(this);
        }
    }

    void a(Activity activity, boolean z) {
        a(activity, (ViewGroup) activity.findViewById(R.id.content), true, z);
    }

    void a(Activity activity, ViewGroup viewGroup, boolean z, boolean z2) {
        if (!isReady()) {
            if (activity != null && z) {
                UiUtils.finishActivityWithoutAnimation(activity);
            }
            c(IabError.incorrectState("Interstitial is not ready"));
            MraidLog.w("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
            return;
        }
        if (!l && this.d == null) {
            throw new AssertionError();
        }
        this.i = z2;
        this.j = z;
        Utils.removeFromParent(this.d);
        viewGroup.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        this.d.show(activity);
    }

    void b() {
        if (isClosed()) {
            return;
        }
        this.g = true;
        MraidInterstitialListener mraidInterstitialListener = this.e;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onClose(this);
        }
        if (this.i) {
            destroy();
        }
    }

    void c(IabError iabError) {
        MraidInterstitialListener mraidInterstitialListener = this.e;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onShowFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MraidView mraidView;
        Activity peekActivity;
        if (!this.j || (mraidView = this.d) == null || (peekActivity = mraidView.peekActivity()) == null) {
            return;
        }
        UiUtils.finishActivityWithoutAnimation(peekActivity);
    }

    void a(IabError iabError) {
        this.f = false;
        this.h = true;
        MraidInterstitialListener mraidInterstitialListener = this.e;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onLoadFailed(this, iabError);
        }
    }
}
