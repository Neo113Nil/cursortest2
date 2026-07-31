package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class H implements RewardedInterstitialAd, s, FullscreenAd<RewardedInterstitialAdShowListener> {

    @NotNull
    public static final a e = new a(null);

    @NotNull
    public static final String f = "reward_on_skip_visible";

    @NotNull
    public final v<RewardedInterstitialAdShowListener> a;

    @NotNull
    public final String b;

    @NotNull
    public final com.moloco.sdk.internal.services.config.a c;

    @NotNull
    public final MetricsRecorder d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void a() {
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@NotNull v<? super RewardedInterstitialAdShowListener> fullscreenAd, @NotNull String adUnitId, @NotNull com.moloco.sdk.internal.services.config.a configService, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = fullscreenAd;
        this.b = adUnitId;
        this.c = configService;
        this.d = metricsRecorder;
    }

    public static final Boolean b(H h) {
        return h.a.f();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(H h) {
        return h.a.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.a.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo6143getCreateAdObjectDurationUwyO8pc() {
        return this.a.mo6143getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(@NotNull String bidResponseJson, @Nullable AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo6144setCreateAdObjectDurationLRDsOJo(long j) {
        this.a.mo6144setCreateAdObjectDurationLRDsOJo(j);
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(H h) {
        return h.a.d();
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(@Nullable RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final J j = new J(new K(rewardedInterstitialAdShowListener, new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return H.a(H.this);
            }
        }, com.moloco.sdk.internal.A.b()), this.a.b() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a, new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return H.b(H.this);
            }
        }, this.b, this.c.a(f), new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return H.c(H.this);
            }
        }, this.d);
        this.a.a(new Function1() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return H.a(J.this, this, ((Boolean) obj).booleanValue());
            }
        });
        this.a.a(new Function0() { // from class: com.moloco.sdk.internal.publisher.H$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return H.a(J.this);
            }
        });
        this.a.show(j);
    }

    public static final Unit a(J j, H h, boolean z) {
        j.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(h.b, null, null, 6, null));
        return Unit.INSTANCE;
    }

    public static final Unit a(J j) {
        j.a();
        return Unit.INSTANCE;
    }
}
