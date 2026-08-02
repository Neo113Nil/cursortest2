package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class X3 implements InterfaceC0353Cy {
    public static byte[] A06;
    public static String[] A07 = {"c0KpkRjZorNQD76", "v", "0d4inMg3wDkuo1aYYl0ssqqGC", "DDXERfdvXnPt4luj6e7N9DVUtx6ZaQcR", "MB0SdpAzdDPGS5LRihVQgeZ9YJgSZ4OW", "1ftUnjVA0zWQWzcI2VyXZGsvfHTse3XE", "DWX3euW52jSmR8J8g1ui9PfHl", "CNcDYli8yhj93EfpNTcuq0KbKbZRyRug"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<D9> A04;
    public final C4[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{52, 67, 67, 63, 60, 54, 52, 71, 60, 66, 65, 2, 55, 73, 53, 70, 72, 53, 70};
    }

    static {
        A01();
    }

    public X3(List<D9> list) {
        this.A04 = list;
        this.A05 = new C4[list.size()];
    }

    private boolean A02(C0470Hz c0470Hz, int i) {
        if (c0470Hz.A04() == 0) {
            return false;
        }
        if (c0470Hz.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4R(C0470Hz c0470Hz) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0470Hz, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0470Hz, 0)) {
                return;
            }
            int A062 = c0470Hz.A06();
            if (A07[5].charAt(6) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "JHIe8W9CfwFDjJjaFpf1hCiFr";
            strArr[6] = "vBjglJY7hKXluELD1o7ad0wQv";
            int bytesAvailable = c0470Hz.A04();
            for (C4 c4 : this.A05) {
                c0470Hz.A0Y(A062);
                c4.AFR(c0470Hz, bytesAvailable);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + bytesAvailable;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4p(InterfaceC0329Bu interfaceC0329Bu, DC dc) {
        for (int i = 0; i < i; i++) {
            D9 d9 = this.A04.get(i);
            dc.A05();
            C4 AGi = interfaceC0329Bu.AGi(dc.A03(), 3);
            AGi.A5n(Format.A0A(dc.A04(), A00(0, 19, 126), null, -1, 0, Collections.singletonList(d9.A02), d9.A01, null));
            this.A05[i] = AGi;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADs() {
        if (this.A03) {
            for (C4 c4 : this.A05) {
                c4.AFS(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADt(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void AFg() {
        this.A03 = false;
    }
}
