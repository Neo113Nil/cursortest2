package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CI implements WP, WQ {
    public static String[] A06 = {"ZtwyXb21lqsDJdKT2ajh9JxAXgW69QuB", "FrcJuXyaSLrnc8pAXv2TAxnFyZgF4qHK", "0iGJizGlWH9", "qhteMkWWDojgH5n0mIn7zojGTGtfRfRL", "S4vRLIoihFPQ", "xoDrhUfozcoi1lbYtymgci4hovtTAG3t", "yhmtadr4WKeMx7Xbvtz69UkymvwaYHjB", "iiLQKF6aVsd0mv8Gzt0Boeru5TAZQ446"};
    public long A00;
    public long A01;
    public long A02;
    public WQ A03;
    public WV[] A04 = new WV[0];
    public final WP A05;

    public CI(WP wp, boolean z, long j, long j2) {
        this.A05 = wp;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private AD A00(long j, AD ad) {
        long toleranceBeforeUs = IF.A0E(ad.A01, 0L, j - this.A01);
        long j2 = ad.A00;
        long j3 = this.A00;
        long A0E = IF.A0E(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (toleranceBeforeUs == ad.A01 && A0E == ad.A00) {
            return ad;
        }
        return new AD(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.FC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A03.ABC(this);
    }

    public static boolean A02(long j, InterfaceC0426Gg[] interfaceC0426GgArr) {
        if (j != 0) {
            for (InterfaceC0426Gg interfaceC0426Gg : interfaceC0426GgArr) {
                if (interfaceC0426Gg != null && !AbstractC0463Hs.A09(interfaceC0426Gg.A7u().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final boolean A4T(long j) {
        return this.A05.A4T(j);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void A5A(long j, boolean z) {
        this.A05.A5A(j, z);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A5x(long j, AD ad) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5x(j, A00(j, ad));
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A6D() {
        long A6D = this.A05.A6D();
        if (A6D != Long.MIN_VALUE) {
            long j = this.A00;
            if (j != Long.MIN_VALUE) {
                if (A06[2].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "DtDan6JMsc2D9dL8KrRs9GVt0cLu7T4O";
                if (A6D >= j) {
                }
            }
            return A6D;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A7U() {
        long A7U = this.A05.A7U();
        if (A7U != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A7U < j) {
                return A7U;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final TrackGroupArray A8B() {
        return this.A05.A8B();
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AAN() throws IOException {
        this.A05.AAN();
    }

    @Override // com.meta.analytics.dsp.uinode.WQ
    public final void ACj(WP wp) {
        this.A03.ACj(this);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AE4(WQ wq, long j) {
        this.A03 = wq;
        this.A05.AE4(this, j);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long AEL() {
        if (A03()) {
            long initialDiscontinuityUs = this.A02;
            if (A06[4].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "LhyfL76jA11YYofpKqTom8Rw5oMGbfG9";
            this.A02 = -9223372036854775807L;
            long AEL = AEL();
            return AEL != -9223372036854775807L ? AEL : initialDiscontinuityUs;
        }
        long AEL2 = this.A05.AEL();
        if (AEL2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        AbstractC0445Ha.A04(AEL2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AEL2 > discontinuityUs) {
            z = false;
        }
        AbstractC0445Ha.A04(z);
        return AEL2;
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AER(long j) {
        this.A05.AER(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r6 <= r4) goto L20;
     */
    @Override // com.meta.analytics.dsp.uinode.WP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AFl(long j) {
        this.A02 = -9223372036854775807L;
        boolean z = false;
        for (WV wv : this.A04) {
            if (wv != null) {
                wv.A00();
            }
        }
        long AFl = this.A05.AFl(j);
        if (AFl != j) {
            if (AFl >= this.A01) {
                long j2 = this.A00;
                if (j2 != Long.MIN_VALUE) {
                    if (A06[0].charAt(28) != '9') {
                        throw new RuntimeException();
                    }
                    A06[2] = "Q";
                }
            }
            AbstractC0445Ha.A04(z);
            return AFl;
        }
        z = true;
        AbstractC0445Ha.A04(z);
        return AFl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7 > r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // com.meta.analytics.dsp.uinode.WP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AFm(InterfaceC0426Gg[] interfaceC0426GgArr, boolean[] zArr, FB[] fbArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        int i;
        this.A04 = new WV[fbArr.length];
        FB[] fbArr2 = new FB[fbArr.length];
        int i2 = 0;
        while (true) {
            FB fb = null;
            if (i2 >= fbArr.length) {
                break;
            }
            WV[] wvArr = this.A04;
            WV wv = (WV) fbArr[i2];
            wvArr[i2] = wv;
            if (wv != null) {
                fb = wv.A01;
            }
            fbArr2[i2] = fb;
            i2++;
        }
        long AFm = this.A05.AFm(interfaceC0426GgArr, zArr, fbArr2, zArr2, j);
        if (A03()) {
            long j3 = this.A01;
            if (j == j3 && A02(j3, interfaceC0426GgArr)) {
                j2 = AFm;
                this.A02 = j2;
                if (AFm != j) {
                    if (AFm >= this.A01) {
                        long enablePositionUs = this.A00;
                        if (enablePositionUs != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    AbstractC0445Ha.A04(z);
                    for (i = 0; i < fbArr.length; i++) {
                        if (fbArr2[i] == null) {
                            FB[] childStreams = this.A04;
                            childStreams[i] = null;
                        } else if (fbArr[i] == null || this.A04[i].A01 != fbArr2[i]) {
                            this.A04[i] = new WV(this, fbArr2[i]);
                        }
                        FB[] childStreams2 = this.A04;
                        fbArr[i] = childStreams2[i];
                    }
                    return AFm;
                }
                z = true;
                AbstractC0445Ha.A04(z);
                while (i < fbArr.length) {
                }
                return AFm;
            }
        }
        j2 = -9223372036854775807L;
        this.A02 = j2;
        if (AFm != j) {
        }
        z = true;
        AbstractC0445Ha.A04(z);
        while (i < fbArr.length) {
        }
        return AFm;
    }
}
