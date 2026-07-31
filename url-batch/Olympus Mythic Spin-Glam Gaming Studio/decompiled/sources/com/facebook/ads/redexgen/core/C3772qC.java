package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3772qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C3772qC A06 = new C19752v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            AW A0B;
            A0B = new C19752v().A06(bundle.getLong(C3772qC.A01(0), 0L)).A05(bundle.getLong(C3772qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C3772qC.A01(2), false)).A07(bundle.getBoolean(C3772qC.A01(3), false)).A09(bundle.getBoolean(C3772qC.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C3772qC(C19752v c19752v) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        j = c19752v.A01;
        this.A01 = j;
        j2 = c19752v.A00;
        this.A00 = j2;
        z = c19752v.A03;
        this.A03 = z;
        z2 = c19752v.A02;
        this.A02 = z2;
        z3 = c19752v.A04;
        this.A04 = z3;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3772qC)) {
            return false;
        }
        C3772qC c3772qC = (C3772qC) obj;
        return this.A01 == c3772qC.A01 && this.A00 == c3772qC.A00 && this.A03 == c3772qC.A03 && this.A02 == c3772qC.A02 && this.A04 == c3772qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
