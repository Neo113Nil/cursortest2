package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CG {
    public static String[] A02 = {"ESBDEf5TGpIlPNlaK", "CFy8tTB", "6qe0qu0ibVEcKGfh7EvVwRhtqHBuEa1w", "V1Y5IBnxryXU9mIwJ4bJ5ToLD3C0Yk13", "4NTFTO6GqkeHPDwUARd0ySppWOd6l1dR", "CrEf7MIuMgaulYPqfRythdBqg4S56GJr", "vnXboZq45YJMaiP9ml0KXw1b9fE53h1M", "mdidS6i6KL2UNszMr3NEyBGV7VKvKKkC"};
    public int A00;
    public final C0470Hz A01 = new C0470Hz(8);

    /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A00(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        interfaceC0328Bt.ADv(this.A01.A00, 0, 1);
        int i = this.A01.A00[0] & 255;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int mask = 128;
        int length = 0;
        while (value == 0) {
            mask >>= 1;
            length++;
        }
        int value = mask ^ (-1);
        int i2 = i & value;
        interfaceC0328Bt.ADv(this.A01.A00, 1, length);
        for (int i3 = 0; i3 < length; i3++) {
            int value2 = i3 + 1;
            i2 = (i2 << 8) + (this.A01.A00[value2] & 255);
        }
        int mask2 = this.A00;
        int value3 = length + 1;
        this.A00 = mask2 + value3;
        return i2;
    }

    public final boolean A01(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        long A7I = interfaceC0328Bt.A7I();
        long j = 1024;
        if (A7I != -1 && A7I <= 1024) {
            j = A7I;
        }
        int i = (int) j;
        interfaceC0328Bt.ADv(this.A01.A00, 0, 4);
        long tag = this.A01.A0M();
        this.A00 = 4;
        while (true) {
            if (tag != 440786851) {
                int bytesToSearch = this.A00 + 1;
                this.A00 = bytesToSearch;
                String[] strArr = A02;
                if (strArr[0].length() == strArr[1].length()) {
                    break;
                }
                String[] strArr2 = A02;
                strArr2[3] = "l1PkIDTfiQThV6hLB2tjOKdQnzuVnbjV";
                strArr2[7] = "5y1xvAdDSVehJ56urXHmNFO2pNzfP9GT";
                if (bytesToSearch == i) {
                    return false;
                }
                interfaceC0328Bt.ADv(this.A01.A00, 0, 1);
                tag = ((tag << 8) & (-256)) | (this.A01.A00[0] & 255);
            } else {
                long A00 = A00(interfaceC0328Bt);
                long j2 = this.A00;
                if (A00 == Long.MIN_VALUE || (A7I != -1 && j2 + A00 >= A7I)) {
                    return false;
                }
                while (true) {
                    int i2 = this.A00;
                    if (i2 >= j2 + A00) {
                        return ((long) i2) == j2 + A00;
                    }
                    long A002 = A00(interfaceC0328Bt);
                    if (A02[2].charAt(30) == 'F') {
                        throw new RuntimeException();
                    }
                    A02[4] = "KE3nQOOCyGcxuS2VNFQSv9Xwlad9oCTx";
                    if (A002 == Long.MIN_VALUE) {
                        return false;
                    }
                    long A003 = A00(interfaceC0328Bt);
                    if (A003 < 0) {
                        break;
                    }
                    if (A02[5].charAt(8) != 'M') {
                        break;
                    }
                    A02[4] = "oAhGCMJduqwag2F3qzvWFprzvodLwUMc";
                    if (A003 > 2147483647L) {
                        break;
                    }
                    if (A003 != 0) {
                        int i3 = (int) A003;
                        String[] strArr3 = A02;
                        if (strArr3[0].length() != strArr3[1].length()) {
                            String[] strArr4 = A02;
                            strArr4[3] = "DpgTASio69ZqWxB525eChTWXhoKF6GpR";
                            strArr4[7] = "IdVdUYmR5RRrY4br74pFew5qFgYpPWK6";
                            interfaceC0328Bt.A3W(i3);
                            this.A00 += i3;
                        } else {
                            A02[4] = "dJss32nVjAcsiV2OBHnTjFQq6mdmK3qb";
                            interfaceC0328Bt.A3W(i3);
                            this.A00 += i3;
                        }
                    }
                }
                return false;
            }
        }
        throw new RuntimeException();
    }
}
