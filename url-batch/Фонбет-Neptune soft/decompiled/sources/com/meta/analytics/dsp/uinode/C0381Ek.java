package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0381Ek {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0327Bs A00;
    public final InterfaceC0329Bu A01;
    public final InterfaceC0327Bs[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, Ascii.DC2, Ascii.CAN, Ascii.SI, 7, -61, Ascii.NAK, 8, 4, 7, -61, Ascii.ETB, Ascii.VT, 8, -61, Ascii.SYN, Ascii.ETB, Ascii.NAK, 8, 4, 16, -47, -17, 16, Ascii.SI, 6, -63, 16, 7, -63, Ascii.NAK, 9, 6, -63, 2, Ascii.ETB, 2, 10, Ascii.CR, 2, 3, Ascii.CR, 6, -63, 6, Ascii.EM, Ascii.NAK, 19, 2, 4, Ascii.NAK, 16, 19, Ascii.DC4, -63, -55};
    }

    static {
        A01();
    }

    public C0381Ek(InterfaceC0327Bs[] interfaceC0327BsArr, InterfaceC0329Bu interfaceC0329Bu) {
        this.A02 = interfaceC0327BsArr;
        this.A01 = interfaceC0329Bu;
    }

    public final InterfaceC0327Bs A02(InterfaceC0328Bt interfaceC0328Bt, Uri uri) throws IOException, InterruptedException {
        InterfaceC0327Bs interfaceC0327Bs = this.A00;
        if (interfaceC0327Bs != null) {
            return interfaceC0327Bs;
        }
        InterfaceC0327Bs[] interfaceC0327BsArr = this.A02;
        int length = interfaceC0327BsArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC0327Bs interfaceC0327Bs2 = interfaceC0327BsArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0328Bt.AFM();
                throw th;
            }
            if (interfaceC0327Bs2.AGR(interfaceC0328Bt)) {
                this.A00 = interfaceC0327Bs2;
                interfaceC0328Bt.AFM();
                break;
            }
            continue;
            interfaceC0328Bt.AFM();
            i++;
        }
        InterfaceC0327Bs interfaceC0327Bs3 = this.A00;
        if (interfaceC0327Bs3 != null) {
            interfaceC0327Bs3.A8o(this.A01);
            return this.A00;
        }
        throw new WM(A00(24, 34, 114) + IF.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
