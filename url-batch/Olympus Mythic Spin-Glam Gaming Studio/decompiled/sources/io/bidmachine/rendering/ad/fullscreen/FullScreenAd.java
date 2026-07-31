package io.bidmachine.rendering.ad.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.ad.view.AdViewListener;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.state.d;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\t\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\t\u0010\u001cJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\t\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020!¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\nJ\u0017\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\nJ\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\nJ\u0015\u00103\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eR\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "", "Landroid/content/Context;", "context", "Lio/bidmachine/rendering/model/AdParams;", "adParams", "<init>", "(Landroid/content/Context;Lio/bidmachine/rendering/model/AdParams;)V", "", "a", "()V", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/Error;", "error", "(Lio/bidmachine/rendering/model/Error;)V", "g", "Lio/bidmachine/util/SystemComponent;", "systemComponent", "(Lio/bidmachine/util/SystemComponent;)V", "b", "c", EidRequestBuilder.REQUEST_FIELD_EMAIL, "d", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "(Lio/bidmachine/rendering/model/PrivacySheetParams;)V", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "brokenCreativeEvent", "(Lio/bidmachine/rendering/model/BrokenCreativeEvent;)V", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "actionEvent", "Lio/bidmachine/util/Error;", "(Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;Lio/bidmachine/util/Error;)V", "", "isLoaded", "()Z", "isFinished", "isCompleted", "load", "Landroid/graphics/drawable/Drawable;", "drawable", "setWatermark", "(Landroid/graphics/drawable/Drawable;)V", "show", "(Landroid/content/Context;)V", "destroy", "Landroid/app/Activity;", "activity", "showInActivity", "(Landroid/app/Activity;)V", "processAdClosed", "notifyAdFailToShow", "Lio/bidmachine/rendering/internal/state/a;", "Lio/bidmachine/rendering/internal/state/a;", "adState", "Lio/bidmachine/rendering/ad/view/AdView;", "Lio/bidmachine/rendering/ad/view/AdView;", "adView", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "getFullScreenAdListener", "()Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "setFullScreenAdListener", "(Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;)V", "fullScreenAdListener", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenAd {

    /* renamed from: a, reason: from kotlin metadata */
    private final io.bidmachine.rendering.internal.state.a adState;

    /* renamed from: b, reason: from kotlin metadata */
    private final AdView adView;

    /* renamed from: c, reason: from kotlin metadata */
    private FullScreenAdListener fullScreenAdListener;

    private final class a implements AdViewListener {
        public a() {
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdAppeared(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.b();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdClicked(AdView adView, SystemComponent systemComponent) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.a(systemComponent);
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdDisappeared(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.c();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdExpired(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.d();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdFailToLoad(AdView adView, Error error) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(error, "error");
            FullScreenAd.this.a(error);
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdFailToShow(AdView adView, Error error) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(error, "error");
            FullScreenAd.this.notifyAdFailToShow(error);
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdFinished(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.processAdClosed();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdLoaded(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.f();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onAdShown(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            FullScreenAd.this.g();
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onBrokenCreativeEvent(AdView adView, BrokenCreativeEvent brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            FullScreenAd.this.a(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onOpenPrivacySheet(AdView adView, PrivacySheetParams privacySheetParams) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            FullScreenAd.this.a(privacySheetParams);
        }

        @Override // io.bidmachine.rendering.ad.AdListener
        public void onViewabilityEvent(AdView adView, ActionEvent actionEvent, io.bidmachine.util.Error error) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            FullScreenAd.this.a(actionEvent, error);
        }
    }

    public FullScreenAd(@NotNull Context context, @NotNull AdParams adParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        this.adState = new d("FullScreenAd");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.adView = new AdView(applicationContext, adParams);
    }

    private final void a() {
        this.adView.closeActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FullScreenAd this$0, Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToShow(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.adState.b(false)) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda0
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.b(FullScreenAd.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFinished(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdLoaded(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (this.adState.a(true)) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda7
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.e(FullScreenAd.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        if (this.adState.k()) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda3
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.f(FullScreenAd.this);
                }
            });
        }
    }

    public final void destroy() {
        this.adState.destroy();
        this.adView.destroy();
    }

    @Nullable
    public final FullScreenAdListener getFullScreenAdListener() {
        return this.fullScreenAdListener;
    }

    public final boolean isCompleted() {
        return this.adView.isCompleted();
    }

    public final boolean isFinished() {
        return this.adState.g();
    }

    public final boolean isLoaded() {
        return this.adState.a();
    }

    public final void load() {
        if (this.adState.b()) {
            this.adView.setAdViewListener(new a());
            this.adView.load();
        }
    }

    public final void notifyAdFailToShow(@NotNull final Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda10
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                FullScreenAd.b(FullScreenAd.this, error);
            }
        });
    }

    public final void processAdClosed() {
        a();
        c();
        e();
    }

    public final void setFullScreenAdListener(@Nullable FullScreenAdListener fullScreenAdListener) {
        this.fullScreenAdListener = fullScreenAdListener;
    }

    public final void setWatermark(@Nullable Drawable drawable) {
        this.adView.setWatermark(drawable);
    }

    public final void show(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isLoaded()) {
            FullScreenActivityKt.startActivity(this, context);
        } else {
            notifyAdFailToShow(new Error("FullScreenAd not loaded"));
        }
    }

    public final void showInActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.adView.showInActivity(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Error error) {
        if (this.adState.a(false)) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda1
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.a(FullScreenAd.this, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.adState.b(true)) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda4
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.a(FullScreenAd.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (this.adState.n()) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda9
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.c(FullScreenAd.this);
                }
            });
        }
    }

    private final void e() {
        if (this.adState.m()) {
            UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda6
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    FullScreenAd.d(FullScreenAd.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdExpired(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdShown(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0, Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToLoad(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdDisappeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final SystemComponent systemComponent) {
        this.adState.d();
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda5
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                FullScreenAd.a(FullScreenAd.this, systemComponent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0, SystemComponent systemComponent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdClicked(this$0, systemComponent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdAppeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final PrivacySheetParams privacySheetParams) {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda11
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                FullScreenAd.a(FullScreenAd.this, privacySheetParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0, PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onOpenPrivacySheet(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final BrokenCreativeEvent brokenCreativeEvent) {
        if (this.adState.j()) {
            return;
        }
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda8
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                FullScreenAd.a(FullScreenAd.this, brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0, BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onBrokenCreativeEvent(this$0, brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final ActionEvent actionEvent, final io.bidmachine.util.Error error) {
        if (this.adState.j()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.fullscreen.FullScreenAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FullScreenAd.a(FullScreenAd.this, actionEvent, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FullScreenAd this$0, ActionEvent actionEvent, io.bidmachine.util.Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(actionEvent, "$actionEvent");
        FullScreenAdListener fullScreenAdListener = this$0.fullScreenAdListener;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onViewabilityEvent(this$0, actionEvent, error);
        }
    }
}
