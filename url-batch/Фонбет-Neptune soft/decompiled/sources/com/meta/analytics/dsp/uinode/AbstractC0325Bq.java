package com.meta.analytics.dsp.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0325Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C01574q A02;
    public final ArrayDeque<C01574q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0326Br> A04;
    public final PriorityQueue<C01574q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c5);

    public abstract boolean A0R();

    public AbstractC0325Bq() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C01574q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C01544n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C01574q c01574q) {
        c01574q.A07();
        this.A03.add(c01574q);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C0410Fp {
        AbstractC0445Ha.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        C01574q pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC0326Br A55() throws C0410Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C0867Xr) this.A05.peek()).A00 <= this.A00) {
            C01574q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0326Br pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                A0K(poll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                WI A0N = A0N();
                if (!poll.A03()) {
                    AbstractC0326Br pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C0867Xr) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c5) throws C0410Fp {
        AbstractC0445Ha.A03(c5 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c5.A03()) {
            A0K(this.A02);
        } else {
            C01574q c01574q = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c01574q.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0326Br abstractC0326Br) {
        abstractC0326Br.A07();
        this.A04.add(abstractC0326Br);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void AEV() {
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public void AGB(long j) {
        this.A00 = j;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C01574q c01574q = this.A02;
        if (c01574q != null) {
            A0K(c01574q);
            this.A02 = null;
        }
    }
}
