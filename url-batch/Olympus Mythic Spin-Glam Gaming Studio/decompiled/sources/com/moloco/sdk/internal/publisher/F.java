package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class F implements InterstitialAd, s, FullscreenAd<InterstitialAdShowListener> {

    @NotNull
    public final v<InterstitialAdShowListener> a;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@NotNull v<? super InterstitialAdShowListener> fullscreenAd) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.a = fullscreenAd;
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
    /* renamed from: getCreateAdObjectDuration-UwyO8pc, reason: not valid java name */
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
    /* renamed from: setCreateAdObjectDuration-LRDsOJo, reason: not valid java name */
    public void mo6144setCreateAdObjectDurationLRDsOJo(long j) {
        this.a.mo6144setCreateAdObjectDurationLRDsOJo(j);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(@Nullable InterstitialAdShowListener interstitialAdShowListener) {
        this.a.show(G.a(interstitialAdShowListener));
    }
}
