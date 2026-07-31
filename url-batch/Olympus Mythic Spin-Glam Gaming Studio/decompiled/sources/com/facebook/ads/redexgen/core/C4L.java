package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4L extends EF {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C3092eg A01;
    public boolean A02;
    public final UN<C4K> A03;
    public final UN<C4B> A04;
    public final UN<E3> A05;
    public final UN<C4A> A06;
    public final UN<C2243Dy> A07;
    public final UN<C2241Dw> A08;
    public final UN<C2240Dv> A09;
    public final UN<C2235Dq> A0A;
    public final UN<C2234Dp> A0B;
    public final C2255Ek A0C;
    public final E0 A0D;
    public final AbstractC2236Dr A0E;

    public C4L(C3218gi c3218gi, VA va, C2255Ek c2255Ek, String str) {
        this(c3218gi, va, c2255Ek, str, 0, 0, false, null, null);
    }

    public C4L(C3218gi c3218gi, VA va, C2255Ek c2255Ek, String str, int i, int i2, boolean z, Bundle bundle, Map<String, String> map) {
        super(c3218gi, va, c2255Ek, str, !c2255Ek.A0m(), i, i2, z, bundle, map, new EE(c3218gi, c2255Ek));
        this.A0E = new AbstractC2236Dr() { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2237Ds c2237Ds) {
                C4L.this.A0f();
            }
        };
        this.A08 = new EQ(this);
        this.A04 = new EO(this);
        this.A05 = new EN(this);
        this.A06 = new EM(this);
        this.A03 = new EL(this);
        this.A07 = new EK(this);
        this.A0A = new EJ(this);
        this.A0B = new EI(this);
        this.A09 = new C2248Ed(this);
        this.A0D = new E0() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e1) {
                C2255Ek c2255Ek2;
                C4L c4l = C4L.this;
                c2255Ek2 = C4L.this.A0C;
                c4l.A00 = c2255Ek2.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = c2255Ek;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C2668Up.A2u(c3218gi)) {
            this.A01 = new C3092eg(c2255Ek, str, z, null);
        }
    }

    public C4L(C3218gi c3218gi, VA va, C2255Ek c2255Ek, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c3218gi, va, c2255Ek, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.EF
    public final void A0n(EnumC3096ek enumC3096ek, Map<String, String> map) {
        super.A0n(enumC3096ek, map);
        if (this.A01 != null && enumC3096ek == EnumC3096ek.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        ET et = new ET(this);
        if (this.A0C.A0q()) {
            Y4.A00(et);
            return;
        }
        C2255Ek c2255Ek = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c2255Ek.getStateHandler().post(et);
    }
}
