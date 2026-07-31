package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Nc extends AbstractC4036h implements Ih, InterfaceC3898bl, Qo, InterfaceC4321rm {
    public volatile Bj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nc(C4248p1 adManagerComponent, Uc nativeCallbacks) {
        super(adManagerComponent.e);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        this.c = new C4024gd(adManagerComponent, nativeCallbacks, this);
    }

    @Override // com.inmobi.media.Ej
    public final Bj a() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void b() {
        Bj bj = this.c;
        InterfaceC4321rm interfaceC4321rm = bj instanceof InterfaceC4321rm ? (InterfaceC4321rm) bj : null;
        if (interfaceC4321rm != null) {
            interfaceC4321rm.b();
        }
    }

    @Override // com.inmobi.media.InterfaceC3898bl
    public final void d() {
        Bj bj = this.c;
        InterfaceC3898bl interfaceC3898bl = bj instanceof InterfaceC3898bl ? (InterfaceC3898bl) bj : null;
        if (interfaceC3898bl != null) {
            interfaceC3898bl.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void f() {
        Bj bj = this.c;
        InterfaceC4321rm interfaceC4321rm = bj instanceof InterfaceC4321rm ? (InterfaceC4321rm) bj : null;
        if (interfaceC4321rm != null) {
            interfaceC4321rm.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void h() {
        Bj bj = this.c;
        InterfaceC4321rm interfaceC4321rm = bj instanceof InterfaceC4321rm ? (InterfaceC4321rm) bj : null;
        if (interfaceC4321rm != null) {
            interfaceC4321rm.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void i() {
        Bj bj = this.c;
        InterfaceC4321rm interfaceC4321rm = bj instanceof InterfaceC4321rm ? (InterfaceC4321rm) bj : null;
        if (interfaceC4321rm != null) {
            interfaceC4321rm.i();
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        String a;
        Bj bj = this.c;
        Sc sc = bj instanceof Pd ? ((Pd) bj).j : bj instanceof Cd ? ((Cd) bj).h : bj instanceof Ge ? ((Ge) bj).f : bj instanceof Le ? ((Le) bj).a : null;
        return (sc == null || (a = sc.a(i, d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a;
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        Sc sc;
        String a;
        Bj bj = this.c;
        if (bj instanceof Pd) {
            sc = ((Pd) bj).j;
        } else if (bj instanceof Cd) {
            sc = ((Cd) bj).h;
        } else if (bj instanceof Ge) {
            sc = ((Ge) bj).f;
        } else {
            sc = bj instanceof Le ? ((Le) bj).a : null;
        }
        return (sc == null || (a = sc.a(d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a;
    }

    @Override // com.inmobi.media.InterfaceC4321rm
    public final void a(boolean z) {
        Bj bj = this.c;
        InterfaceC4321rm interfaceC4321rm = bj instanceof InterfaceC4321rm ? (InterfaceC4321rm) bj : null;
        if (interfaceC4321rm != null) {
            interfaceC4321rm.a(z);
        }
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Bj bj = this.c;
        Ih ih = bj instanceof Ih ? (Ih) bj : null;
        if (ih != null) {
            ih.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.Ej
    public final void a(Bj bj) {
        Intrinsics.checkNotNullParameter(bj, "<set-?>");
        this.c = bj;
    }
}
