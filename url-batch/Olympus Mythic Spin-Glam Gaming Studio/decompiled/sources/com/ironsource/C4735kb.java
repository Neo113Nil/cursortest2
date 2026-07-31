package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC4717jb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4735kb extends AbstractC4935va implements Wb {

    @NotNull
    private final UUID d;

    @NotNull
    private final C4700ib e;
    private Tb f;

    @NotNull
    private String g;
    private C4684hd h;

    @Nullable
    private InterfaceC4771mb i;

    @Nullable
    private AdapterNativeAdData j;

    @Nullable
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C4735kb(UUID uuid, C4700ib c4700ib, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C4950w7.a.a() : uuid, c4700ib);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4735kb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Tb tb = this$0.f;
            if (tb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                tb = null;
            }
            tb.n();
            this$0.i = null;
        } catch (Throwable th) {
            C4782n4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4735kb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Tb tb = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C4814p0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Tb tb2 = this$0.f;
            if (tb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                tb = tb2;
            }
            tb.o();
        }
    }

    private final Tb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String b = b();
        C4684hd c4684hd = this.h;
        if (c4684hd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            c4684hd = null;
        }
        C4611dc c4611dc = new C4611dc(uuid, b, c4684hd);
        a(c4611dc);
        return new Tb(this, a(), c4611dc);
    }

    @Override // com.ironsource.AbstractC4935va
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.a(C4735kb.this);
            }
        });
    }

    @NotNull
    public final UUID g() {
        return this.d;
    }

    @Nullable
    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Nullable
    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Nullable
    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Nullable
    public final InterfaceC4717jb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4717jb.a(icon.getDrawable(), icon.getUri());
    }

    @Nullable
    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    @Nullable
    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.b(C4735kb.this);
            }
        });
    }

    @Override // com.ironsource.Wb
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        String uuid = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, uuid, b());
        b(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.a(C4735kb.this, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4735kb(@NotNull UUID adId, @NotNull C4700ib nativeAd) {
        super(new C4814p0(r1, F0.b.MEDIATION));
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().f().a(new C4777n(aVar, adId, b()));
    }

    public final void a(@Nullable final InterfaceC4771mb interfaceC4771mb) {
        a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.a(C4735kb.this, interfaceC4771mb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4735kb this$0, InterfaceC4771mb interfaceC4771mb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC4771mb;
    }

    @Override // com.ironsource.Wb
    public void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Qb qb = new Qb();
        Tb tb = this.f;
        if (tb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            tb = null;
        }
        tb.a(qb);
        this.j = qb.a();
        this.k = qb.b();
        b(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.b(C4735kb.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4735kb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4771mb interfaceC4771mb = this$0.i;
        if (interfaceC4771mb != null) {
            interfaceC4771mb.b(this$0.e, adInfo);
        }
    }

    @Override // com.ironsource.Wb
    public void b(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.a(C4735kb.this, adInfo);
            }
        });
    }

    public final void b(@NotNull final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4735kb.a(C4735kb.this, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4735kb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC4771mb interfaceC4771mb = this$0.i;
        if (interfaceC4771mb != null) {
            interfaceC4771mb.a(this$0.e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4735kb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4771mb interfaceC4771mb = this$0.i;
        if (interfaceC4771mb != null) {
            interfaceC4771mb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4735kb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
