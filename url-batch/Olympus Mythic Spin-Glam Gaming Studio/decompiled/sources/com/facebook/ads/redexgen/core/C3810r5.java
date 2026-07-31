package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3810r5 {
    public static C3810r5 A03;
    public static InterfaceC3833rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3820rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            copyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C3810r5(ViewpointQeConfig viewpointQeConfig, AbstractC3825rL abstractC3825rL, C3820rF c3820rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3820rF;
        abstractC3825rL.A03(new C2155Aj(c3820rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C3810r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC3825rL abstractC3825rL, InterfaceC3830rQ interfaceC3830rQ, InterfaceC2156Al interfaceC2156Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C3810r5 c3810r5 = A03;
        if (c3810r5 != null) {
            return c3810r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C3810r5(viewpointQeConfig, abstractC3825rL, new C3820rF(viewpointQeConfig, interfaceC3830rQ, ck, interfaceC2156Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC3824rK interfaceC3824rK) {
        this.A02.A0H(interfaceC3824rK);
    }

    public final void A05(InterfaceC3822rI interfaceC3822rI) {
        this.A02.A0I(interfaceC3822rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C3831rU c3831rU) {
        if (this.A00.A00 && c3831rU != null) {
            this.A01.A06(dspViewableNode, c3831rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C3831rU c3831rU, C3827rN c3827rN) {
        if (this.A00.A00 && c3831rU != null) {
            this.A01.A07(dspViewableNode, c3831rU, c3827rN);
        } else {
            this.A01.A08(dspViewableNode, c3827rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C3827rN c3827rN) {
        A08(dspViewableNode, null, c3827rN);
    }
}
