package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Le implements Bj, Ih, I, InterfaceC4009g {
    public final Sc a;
    public final C4456x b;
    public final PublisherCallbacks c;
    public final Ej d;

    public Le(Sc adUnit, C4456x adComponent, PublisherCallbacks publisherCallbacks, Ej stateMachine) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = adUnit;
        this.b = adComponent;
        this.c = publisherCallbacks;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C4493y9 c4493y9 = this.b.a.c;
        if (c4493y9 != null) {
            c4493y9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.a.b.d();
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C4493y9 c4493y9 = this.b.a.c;
        if (c4493y9 != null) {
            c4493y9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.d.a(new Ge(this.a, this.b, this.c, this.d), this);
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        this.d.a(new C4515z5(this.a, null, this.b), this);
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C4493y9 c4493y9 = this.b.a.c;
        if (c4493y9 != null) {
            c4493y9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Sc sc = this.a;
        sc.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        sc.b.a(inMobiNativeViewData);
    }
}
