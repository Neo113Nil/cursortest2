package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W1 extends AbstractC3162fo {
    public static String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ C2702Vz A00;

    public W1(C2702Vz c2702Vz) {
        this.A00 = c2702Vz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3162fo
    public final void A00() {
        C20736r c20736r;
        C20736r c20736r2;
        c20736r = this.A00.A07;
        if (c20736r == null) {
            return;
        }
        C2702Vz c2702Vz = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        c20736r2 = c2702Vz.A07;
        c20736r2.A0X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0 != false) goto L15;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC3162fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        C20736r c20736r;
        boolean z;
        boolean z2;
        boolean A0T;
        c20736r = this.A00.A07;
        if (c20736r != null) {
            z = this.A00.A0E;
            if (!z) {
                z2 = this.A00.A0D;
                if (!z2) {
                    C2702Vz c2702Vz = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    A0T = c2702Vz.A0T();
                }
                this.A00.A0R(EnumC3105et.A02);
            }
            this.A00.A0D = false;
            this.A00.A0E = false;
        }
    }
}
