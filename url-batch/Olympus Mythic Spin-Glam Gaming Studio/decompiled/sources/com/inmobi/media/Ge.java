package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ge extends Mi implements InterfaceC4321rm, InterfaceC3898bl {
    public final Sc f;
    public final C4456x g;
    public final PublisherCallbacks h;
    public final Ej i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ge(Sc adUnit, C4456x adComponent, PublisherCallbacks publisherCallbacks, Ej stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adUnit;
        this.g = adComponent;
        this.h = publisherCallbacks;
        this.i = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void a(boolean z) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "onAudioStateChanged " + z);
        }
        X4.a(k(), new C4393ue(this, z, null));
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void b() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        X4.a(k(), new C4472xe(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3898bl
    public final void d() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.i.a(new Le(this.f, this.g, this.h, this.i), this);
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void f() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        X4.a(k(), new C4524ze(this, null));
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void h() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        X4.a(k(), new C4445we(this, null));
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void i() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        X4.a(k(), new C4498ye(this, null));
    }
}
