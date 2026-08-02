package com.meta.analytics.dsp.uinode;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0863Xn implements InterfaceC0328Bt {
    public static String[] A07 = {"WXHfHzHth2Al5uPNAeAj07mTCizYfL", "Ea4PVszhPWUkUOAzwMvLCDFSUaducjj7", "YmMP3hbiPsyrKpNosY6PcrNT297v1Qrn", "DJcyMwta", "hLB8mG9dKKyMH1LM5ESzC", "Vr0ZnTk4fnCFSbIFCLxfH748g1DMsTn2", "7kDa6eDxYJ9kj6HJXeCECzm6I99XwLPU", "QseCjdkBkHi9C8DCiNRIrV91qCtwuZnL"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0440Gu A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C0863Xn(InterfaceC0440Gu interfaceC0440Gu, long j, long j2) {
        this.A05 = interfaceC0440Gu;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int bytesSkipped = Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.A03, 0, bArr, i, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int requiredLength = bArr.length;
        if (i2 > requiredLength) {
            int requiredLength2 = bArr.length;
            int requiredLength3 = 524288 + i2;
            int newPeekCapacity = IF.A06(requiredLength2 * 2, 65536 + i2, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        byte[] newPeekBuffer = this.A03;
        if (i2 < newPeekBuffer.length - 524288) {
            bArr = new byte[65536 + i2];
        }
        System.arraycopy(newPeekBuffer, i, bArr, 0, i2);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws IOException, InterruptedException {
        A04(i);
        int min = Math.min(this.A00 - this.A01, i);
        while (min < i) {
            min = A02(this.A03, this.A01, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i2 = this.A01 + i;
        this.A01 = i2;
        int bytesPeeked = this.A00;
        this.A00 = Math.max(bytesPeeked, i2);
        return true;
    }

    public final boolean A07(int i, boolean z) throws IOException, InterruptedException {
        int A00 = A00(i);
        while (A00 < i && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i, bytesSkipped + A00), A00, z);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final void A3W(int i) throws IOException, InterruptedException {
        A06(i, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final long A7I() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final long A7d() {
        return this.A02 + this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final long A7i() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final void ADv(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        ADw(bArr, i, i2, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final boolean ADw(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!A06(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN, SYNTHETIC] */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEM(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int A01 = A01(bArr, i, i2);
        while (true) {
            String[] strArr = A07;
            String str = strArr[5];
            String str2 = strArr[7];
            int charAt = str.charAt(6);
            int bytesRead = str2.charAt(6);
            if (charAt != bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "Jrnjt2kK808bOfAL2dwi4gGQEivMT1gd";
            strArr2[7] = "BeMd7gkFpNMGNNjn1C0ltMDP7X04qF1j";
            if (A01 >= i2 || A01 == -1) {
                break;
            }
            A01 = A02(bArr, i, i2, A01, z);
        }
        A03(A01);
        if (A07[3].length() == 12) {
            if (A01 != -1) {
            }
        } else {
            A07[6] = "kVyK5NlwbVR8i9TPL7EEmQ28yX1F3goU";
            return A01 != -1;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final void AFM() {
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final int AGM(int i) throws IOException, InterruptedException {
        int bytesSkipped = A00(i);
        if (bytesSkipped == 0) {
            byte[] bArr = this.A06;
            bytesSkipped = A02(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final void AGP(int i) throws IOException, InterruptedException {
        A07(i, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int bytesRead = A01(bArr, i, i2);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i2, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0328Bt
    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        AEM(bArr, i, i2, false);
    }
}
