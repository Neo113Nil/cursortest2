package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0444Gy A03;
    public final Uri A05;
    public final C0381Ek A07;
    public final InterfaceC0440Gu A08;
    public final C0451Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C0332Bz A06 = new C0332Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd, Uri uri, InterfaceC0440Gu interfaceC0440Gu, C0381Ek c0381Ek, C0451Hg c0451Hg) {
        this.A0B = cd;
        this.A05 = (Uri) AbstractC0445Ha.A01(uri);
        this.A08 = (InterfaceC0440Gu) AbstractC0445Ha.A01(interfaceC0440Gu);
        this.A07 = (C0381Ek) AbstractC0445Ha.A01(c0381Ek);
        this.A09 = c0451Hg;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A9P() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        String str;
        C0863Xn c0863Xn;
        long j;
        Handler handler;
        Runnable runnable;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j2 = this.A06.A00;
                Uri uri = this.A05;
                str = this.A0B.A0b;
                C0444Gy c0444Gy = new C0444Gy(uri, j2, -1L, str);
                this.A03 = c0444Gy;
                long ADl = this.A08.ADl(c0444Gy);
                this.A01 = ADl;
                if (ADl != -1) {
                    this.A01 = ADl + j2;
                }
                c0863Xn = new C0863Xn(this.A08, j2, this.A01);
                InterfaceC0327Bs extractor = this.A07.A02(c0863Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(j2, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c0863Xn, this.A06);
                    long A7i = c0863Xn.A7i();
                    j = this.A0B.A0P;
                    if (A7i > j + j2) {
                        j2 = c0863Xn.A7i();
                        this.A09.A01();
                        handler = this.A0B.A0R;
                        runnable = this.A0B.A0a;
                        handler.post(runnable);
                    }
                }
            } finally {
                if (charAt != charAt2) {
                }
                throw new RuntimeException();
            }
            if (result == 1) {
                result = 0;
            } else {
                C0332Bz c0332Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0332Bz.A00 = c0863Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
