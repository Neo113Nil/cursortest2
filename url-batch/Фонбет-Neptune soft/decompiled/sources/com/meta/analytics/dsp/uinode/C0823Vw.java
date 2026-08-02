package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0823Vw implements InterfaceC0440Gu {
    public static byte[] A05;
    public static String[] A06 = {"2AQ", "PKEE8tvP1F9G5CS2asOfHv5i9NmL9OD8", "nghUlW0EKiCso94RSH6SGDaiGhOOZ9vR", "y3nJ4vSOM9HwnTFSw", "dDA", "lgpDjnw", "z3SCjqWwobuDiPiZI", "K1NyJtZzbkl5fIhEU"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final HG<? super C0823Vw> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23};
        if (A06[3].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "0CNdTW9yzTlkWk7IYlaLkwwChYLMq6mo";
        strArr[1] = "0Hm8psTbLgTGmvvfzx0WFuRjr22Bb9pe";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C0823Vw() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C0823Vw(HG<? super C0823Vw> hg) {
        this.A04 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws H1 {
        try {
            this.A01 = c0444Gy.A04;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c0444Gy.A04.getPath(), A00(0, 1, 20));
            this.A02 = randomAccessFile;
            randomAccessFile.seek(c0444Gy.A03);
            long length = c0444Gy.A02 == -1 ? this.A02.length() - c0444Gy.A03 : c0444Gy.A02;
            this.A00 = length;
            if (length >= 0) {
                this.A03 = true;
                HG<? super C0823Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADP(this, c0444Gy);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new H1(e);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws H1 {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new H1(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                HG<? super C0823Vw> hg = this.A04;
                if (hg != null) {
                    hg.ADO(this);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws H1 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.A00 -= read;
                HG<? super C0823Vw> hg = this.A04;
                if (hg != null) {
                    hg.AB1(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new H1(e);
        }
    }
}
