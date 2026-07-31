package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3366jF implements SM {
    public final /* synthetic */ AbstractC3383jd A00;
    public final /* synthetic */ InterfaceC2495Nt A01;
    public final /* synthetic */ C2496Nu A02;
    public final /* synthetic */ C3218gi A03;
    public final /* synthetic */ boolean A04;

    public C3366jF(C2496Nu c2496Nu, C3218gi c3218gi, boolean z, AbstractC3383jd abstractC3383jd, InterfaceC2495Nt interfaceC2495Nt) {
        this.A02 = c2496Nu;
        this.A03 = c3218gi;
        this.A04 = z;
        this.A00 = abstractC3383jd;
        this.A01 = interfaceC2495Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C2668Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC3003dD.A01(this.A03, this.A00, 1, new C3367jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
