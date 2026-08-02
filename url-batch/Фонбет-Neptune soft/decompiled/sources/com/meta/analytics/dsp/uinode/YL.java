package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC02187h {
    public static YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0W A00;
    public InterfaceC01986g A01;
    public C7g A02;
    public InterfaceC02297w A03;
    public C02358c A04;
    public JE A05;
    public InterfaceC0454Hj A06;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = copyOfRange[i4] - i3;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            copyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
    }

    public static void A07() {
        A08 = new byte[]{-62, -11, -55, -10, -13, -62, -63, -62, -16, 2, 16, 16, 6, Ascii.FF, Ascii.VT, -67, 1, -2, 17, -2, -67, 6, Ascii.VT, 6, 17, 6, -2, 9, 6, Ascii.ETB, 2, 1, 33, Ascii.DC4, Ascii.US, Ascii.RS, 33, 35, 2, Ascii.DC4, 34, 34, Ascii.CAN, Ascii.RS, Ascii.GS, -13, 16, 35, 16, -8, Ascii.GS, Ascii.CAN, 35, Ascii.CAN, 16, Ascii.ESC, Ascii.CAN, 41, Ascii.DC4, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C0888Ym c0888Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c0888Ym);
        InterfaceC0454Hj A05 = A05(c0888Ym, this.A03, A03(c0888Ym));
        this.A06 = A05;
        A09(c0888Ym, A00(c0888Ym, A05));
        A0A(c0888Ym, this.A06);
        A0B(c0888Ym, this.A06);
        InterfaceC0454Hj interfaceC0454Hj = this.A06;
        if (interfaceC0454Hj != null) {
            interfaceC0454Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static AnonymousClass66 A00(C0888Ym c0888Ym, InterfaceC0454Hj interfaceC0454Hj) {
        if (!C0478Ih.A1P(c0888Ym) || interfaceC0454Hj == null) {
            return null;
        }
        return AnonymousClass67.A00().A00(interfaceC0454Hj);
    }

    public static InterfaceC02297w A01(C0888Ym c0888Ym) {
        return AbstractC02307x.A00().A00(c0888Ym, new YS());
    }

    public static synchronized YL A02() {
        YL yl;
        synchronized (YL.class) {
            if (A07 == null) {
                A07 = new YL();
            }
            yl = A07;
        }
        return yl;
    }

    public static RK A03(C0888Ym c0888Ym) {
        if (!C0478Ih.A1L(c0888Ym)) {
            return null;
        }
        return C0700Rc.A01(c0888Ym);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0454Hj A86() {
        return this.A06;
    }

    public static InterfaceC0454Hj A05(C0888Ym c0888Ym, InterfaceC02297w interfaceC02297w, RK rk) {
        if (C0478Ih.A2E(c0888Ym) && rk != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC0723Rz.A00().A00(c0888Ym, interfaceC02297w, rk, K9.A04(c0888Ym), new YM(new K1(c0888Ym, A06(0, 0, 122), null, EnumC0499Jg.A07, 0, new C0504Jl(), LW.A01(C0478Ih.A0J(c0888Ym)), null, null, new C0960aZ()), c0888Ym), C0721Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String A06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC0508Jp.A05(A06(32, 28, 77), A06, A06(0, 8, 46));
    }

    public static void A09(C0888Ym c0888Ym, AnonymousClass66 anonymousClass66) {
        if (!C0478Ih.A1P(c0888Ym) || anonymousClass66 == null) {
            return;
        }
        AnonymousClass64.A00().A00(anonymousClass66, c0888Ym);
    }

    public static void A0A(C0888Ym c0888Ym, InterfaceC0454Hj interfaceC0454Hj) {
        if (!C0478Ih.A0h(c0888Ym) || interfaceC0454Hj == null) {
            return;
        }
        new C6R(c0888Ym, interfaceC0454Hj, new C6S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C0888Ym c0888Ym, InterfaceC0454Hj interfaceC0454Hj) {
        if (interfaceC0454Hj == null) {
            return;
        }
        AbstractC0481Il.A00(c0888Ym, interfaceC0454Hj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final J2 A5u(C0888Ym c0888Ym) {
        return VQ.A01(c0888Ym);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized C7g A6A(C02177f c02177f) {
        if (this.A02 == null) {
            this.A02 = new YN(this);
        }
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized InterfaceC01986g A6L() {
        if (this.A01 == null) {
            this.A01 = new C0890Yo();
        }
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized InterfaceC02297w A6j(C02177f c02177f) {
        if (this.A03 == null) {
            this.A03 = A01(c02177f.A01());
        }
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized AnonymousClass89 A6l(C02177f c02177f) {
        return new C0877Yb(c02177f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized InterfaceC02197i A6v(C02177f c02177f) {
        return new EO(this, c02177f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized C0W A77(C02177f c02177f) {
        if (!C0478Ih.A0v(c02177f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new YQ(c02177f));
        }
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized C7k A7q(C02177f c02177f) {
        return new YO(c02177f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final C0888Ym A7r(Context context) {
        C0888Ym sdkContext = AbstractC02167e.A00();
        if (sdkContext == null) {
            C0888Ym sdkContext2 = new C0888Ym(context, this);
            AbstractC02167e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized JE A7s(C0888Ym c0888Ym) {
        if (this.A05 == null) {
            this.A05 = new VY(c0888Ym);
        }
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02187h
    public final synchronized C02358c A7y() {
        if (this.A04 == null) {
            this.A04 = new C02358c();
            A08();
        }
        return this.A04;
    }
}
