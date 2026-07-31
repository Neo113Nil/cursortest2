package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4569b6 implements Lc {

    @Nullable
    private InterfaceC4587c6 a;

    @NotNull
    private WeakReference<InterfaceC4605d6> b = new WeakReference<>(null);

    /* renamed from: com.ironsource.b6$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(@NotNull InterfaceC4587c6 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.Lc
    public void onInterstitialAdRewarded(@Nullable String str, int i) {
        InterfaceC4605d6 interfaceC4605d6 = this.b.get();
        if (interfaceC4605d6 != null) {
            interfaceC4605d6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClick() {
        InterfaceC4605d6 interfaceC4605d6 = this.b.get();
        if (interfaceC4605d6 != null) {
            interfaceC4605d6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClose() {
        InterfaceC4605d6 interfaceC4605d6 = this.b.get();
        if (interfaceC4605d6 != null) {
            interfaceC4605d6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        InterfaceC4605d6 interfaceC4605d6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC4605d6 = this.b.get()) == null) {
            return;
        }
        interfaceC4605d6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadFailed(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC4587c6 interfaceC4587c6 = this.a;
        if (interfaceC4587c6 != null) {
            interfaceC4587c6.a(description);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadSuccess(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC4587c6 interfaceC4587c6 = this.a;
        if (interfaceC4587c6 != null) {
            interfaceC4587c6.a(adInstance);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialOpen() {
        InterfaceC4605d6 interfaceC4605d6 = this.b.get();
        if (interfaceC4605d6 != null) {
            interfaceC4605d6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowFailed(@Nullable String str) {
        InterfaceC4605d6 interfaceC4605d6 = this.b.get();
        if (interfaceC4605d6 != null) {
            interfaceC4605d6.a(str);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowSuccess() {
    }

    public final void a(@NotNull InterfaceC4605d6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
