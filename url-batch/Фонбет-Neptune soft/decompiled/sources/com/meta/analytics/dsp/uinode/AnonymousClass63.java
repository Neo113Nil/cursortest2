package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.63, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass63 extends EM implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public WL A03;
    public C5 A04;
    public AbstractC0326Br A05;
    public AbstractC0326Br A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C02729p A0A;
    public final InterfaceC0411Fq A0B;
    public final InterfaceC0412Fr A0C;

    public AnonymousClass63(InterfaceC0412Fr interfaceC0412Fr, Looper looper) {
        this(interfaceC0412Fr, looper, InterfaceC0411Fq.A00);
    }

    public AnonymousClass63(InterfaceC0412Fr interfaceC0412Fr, Looper looper, InterfaceC0411Fq interfaceC0411Fq) {
        super(3);
        this.A0C = (InterfaceC0412Fr) AbstractC0445Ha.A01(interfaceC0412Fr);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0411Fq;
        this.A0A = new C02729p();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A71()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A70(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0326Br abstractC0326Br = this.A06;
        if (abstractC0326Br != null) {
            abstractC0326Br.A08();
            this.A06 = null;
        }
        AbstractC0326Br abstractC0326Br2 = this.A05;
        if (abstractC0326Br2 != null) {
            abstractC0326Br2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEV();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4Z(this.A02);
    }

    private void A05(List<C0408Fn> list) {
        this.A0C.ABF(list);
    }

    private void A06(List<C0408Fn> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public final void A15() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public final void A16(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public final void A18(Format[] formatArr, long j) throws C02609c {
        Format format = formatArr[0];
        this.A02 = format;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4Z(format);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final boolean A91() {
        return this.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final boolean A9C() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r10.A00 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        A02();
        r10.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    @Override // com.meta.analytics.dsp.uinode.Y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFB(long j, long j2) throws C02609c {
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AGB(j);
            try {
                this.A05 = this.A03.A55();
            } catch (C0410Fp e) {
                throw C02609c.A01(e, A0z());
            }
        }
        if (A81() != 2) {
            return;
        }
        boolean z = false;
        if (this.A06 != null) {
            long A00 = A00();
            while (A00 <= j) {
                this.A01++;
                A00 = A00();
                z = true;
            }
        }
        AbstractC0326Br abstractC0326Br = this.A05;
        if (A0D[5].length() == 31) {
            throw new RuntimeException();
        }
        A0D[3] = "KD";
        if (abstractC0326Br != null) {
            boolean textRendererNeedsUpdate = abstractC0326Br.A04();
            if (textRendererNeedsUpdate) {
                if (!z) {
                    long A002 = A00();
                    String[] strArr = A0D;
                    if (strArr[2].charAt(19) != strArr[6].charAt(19)) {
                        String[] strArr2 = A0D;
                        strArr2[2] = "xJP4O1R5iBehlF3gjm9oxj2d0if1stmE";
                        strArr2[6] = "mrFlrw4gjycn3JZxSawox6A5ZMqGzaMP";
                    } else {
                        String[] strArr3 = A0D;
                        strArr3[1] = "j9HNvuqeLVtstiy16y9LH7E8URqfplUR";
                        strArr3[0] = "4Jhirnf8T6FRv4glusNGUbVI8l7wWqUm";
                    }
                }
            } else if (((AbstractC0866Xq) this.A05).A01 <= j) {
                AbstractC0326Br abstractC0326Br2 = this.A06;
                if (abstractC0326Br2 != null) {
                    abstractC0326Br2.A08();
                }
                AbstractC0326Br abstractC0326Br3 = this.A05;
                this.A06 = abstractC0326Br3;
                this.A05 = null;
                this.A01 = abstractC0326Br3.A7T(j);
                z = true;
            }
        }
        if (z) {
            A06(this.A06.A6Z(j));
        }
        if (this.A00 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A07;
                if (!textRendererNeedsUpdate2) {
                    if (this.A04 == null) {
                        C5 A54 = this.A03.A54();
                        this.A04 = A54;
                        if (A54 == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.AEG(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A11 = A11(this.A0A, this.A04, false);
                    if (A0D[3].length() != 2) {
                        throw new RuntimeException();
                    }
                    A0D[5] = "w0qgeVmaHT9zi92RU59iiGmHeY";
                    if (A11 == -4) {
                        boolean textRendererNeedsUpdate3 = this.A04.A04();
                        if (textRendererNeedsUpdate3) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.AEG(this.A04);
                        this.A04 = null;
                    } else if (A11 == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C0410Fp e2) {
                throw C02609c.A01(e2, A0z());
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AA
    public final int AGe(Format format) {
        if (this.A0B.AGf(format)) {
            return EM.A0y(null, format.A0H) ? 4 : 2;
        }
        if (AbstractC0463Hs.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A05((List) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
