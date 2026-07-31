package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static LN A02(InterfaceC3569ms interfaceC3569ms) throws IOException {
        byte[] bArr;
        C20254v c20254v = new C20254v(16);
        LO A03 = A03(1718449184, interfaceC3569ms, c20254v);
        AbstractC20023y.A08(A03.A01 >= 16);
        interfaceC3569ms.AGt(c20254v.A0l(), 0, 16);
        c20254v.A0f(0);
        int A0G = c20254v.A0G();
        int A0G2 = c20254v.A0G();
        int A0F = c20254v.A0F();
        int A0F2 = c20254v.A0F();
        int A0G3 = c20254v.A0G();
        int A0G4 = c20254v.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC3569ms.AGt(bArr, 0, i);
        } else {
            bArr = C5C.A07;
        }
        interfaceC3569ms.AK3((int) (interfaceC3569ms.A8i() - interfaceC3569ms.A8n()));
        return new LN(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, 11, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, 63, 58, 83, 81, 88, 12, 23, 88, 11, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, 11, 22, 13, 10, 3, 68, 17, 10, 15, 10, 11, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC3569ms interfaceC3569ms) throws IOException {
        C20254v c20254v = new C20254v(8);
        LO chunkHeader = LO.A00(interfaceC3569ms, c20254v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC3569ms.AIl();
            return -1L;
        }
        interfaceC3569ms.A47(8);
        c20254v.A0f(0);
        interfaceC3569ms.AGt(c20254v.A0l(), 0, 8);
        long sampleDataSize = c20254v.A0N();
        interfaceC3569ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC3569ms interfaceC3569ms) throws IOException {
        interfaceC3569ms.AIl();
        LO A03 = A03(1684108385, interfaceC3569ms, new C20254v(8));
        interfaceC3569ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC3569ms.A8n()), Long.valueOf(A03.A01));
    }

    public static LO A03(int i, InterfaceC3569ms interfaceC3569ms, C20254v c20254v) throws IOException {
        LO A002 = LO.A00(interfaceC3569ms, c20254v);
        while (A002.A00 != i) {
            AbstractC20104g.A07(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC3569ms.AK3((int) j);
                A002 = LO.A00(interfaceC3569ms, c20254v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC3569ms interfaceC3569ms) throws IOException {
        C20254v c20254v = new C20254v(8);
        LO A002 = LO.A00(interfaceC3569ms, c20254v);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC3569ms.AGt(c20254v.A0l(), 0, 4);
        c20254v.A0f(0);
        int A0C = c20254v.A0C();
        if (A0C != 1463899717) {
            AbstractC20104g.A05(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
