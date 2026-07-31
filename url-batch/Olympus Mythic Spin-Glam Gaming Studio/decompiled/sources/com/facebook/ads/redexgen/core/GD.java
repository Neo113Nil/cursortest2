package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC3049dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3049dy
    public final void AIY() {
        boolean z;
        C2490No c2490No;
        InterfaceC2759Yh interfaceC2759Yh;
        ZU zu;
        InterfaceC2759Yh interfaceC2759Yh2;
        ZU zu2;
        ZU zu3;
        C2490No c2490No2;
        AbstractC3383jd abstractC3383jd;
        InterfaceC2760Yi A05;
        Intent intent;
        InterfaceC2760Yi interfaceC2760Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC2760Yi interfaceC2760Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c2490No = this.A00.A07;
            if (c2490No == null) {
                interfaceC2759Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC2759Yh.A4j(zu.A81());
                interfaceC2759Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC2759Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c2490No2 = this.A00.A07;
            abstractC3383jd = this.A00.A05;
            A05 = gb2.A05(zu3, c2490No2, Boolean.valueOf(abstractC3383jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC2760Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC2760Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC2760Yi2 = this.A00.A04;
            ((MW) interfaceC2760Yi2).A0b();
        }
    }
}
