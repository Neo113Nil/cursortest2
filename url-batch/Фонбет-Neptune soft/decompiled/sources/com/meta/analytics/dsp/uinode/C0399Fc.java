package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0399Fc extends AbstractC0771Tv {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C1010bN A00;
    public final /* synthetic */ C1000bD A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, -1, -3, 8, 8, 1, Ascii.SO, -16, Ascii.NAK, Ascii.FF, 1, -25, -29, -30, -27, 17, Ascii.DC4, Ascii.ETB, Ascii.US, 16, Ascii.GS, 16, Ascii.SI, 10, Ascii.SO, Ascii.ETB, Ascii.DC4, Ascii.SO, Ascii.SYN, 10, Ascii.SI, 16, Ascii.ETB, Ascii.FF, 36, 10, Ascii.CAN, Ascii.RS, Ascii.SI, Ascii.EM, 5, 9, Ascii.CAN, Ascii.VT, 7, Ascii.SUB, Ascii.SI, Ascii.FS, Ascii.VT, 5, 7, Ascii.EM, 5, 9, Ascii.SUB, 7, 5, Ascii.FS, -40, -60, -67, -72, -64, -60, -76, -104, -77};
    }

    static {
        A01();
    }

    public C0399Fc(C1010bN c1010bN, C1000bD c1000bD) {
        this.A00 = c1010bN;
        this.A01 = c1000bD;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
    public final void AAn() {
        boolean z;
        this.A00.A0F = true;
        z = this.A00.A0G;
        if (!z) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0771Tv, com.meta.analytics.dsp.uinode.InterfaceC0595Nb
    public final void AB4(String str, Map<String, String> map) {
        EQ eq;
        String str2;
        FV fv;
        EQ eq2;
        J2 j2;
        FV fv2;
        FV fv3;
        C1U A0y;
        String str3;
        EQ eq3;
        EQ eq4;
        boolean z;
        InterfaceC00610x interfaceC00610x;
        InterfaceC00610x interfaceC00610x2;
        InterfaceC00610x interfaceC00610x3;
        FV fv4;
        FV fv5;
        eq = this.A00.A04;
        eq.A0E().A3j();
        Uri A00 = AbstractC0540Ky.A00(str);
        map.put(A00(22, 10, 82), AdPlacementType.BANNER.name());
        str2 = this.A00.A0H;
        map.put(A00(80, 8, 5), str2);
        fv = this.A00.A03;
        if (fv != null) {
            fv4 = this.A00.A03;
            map.put(A00(59, 21, 92), String.valueOf(fv4.A0l()));
            fv5 = this.A00.A03;
            map.put(A00(36, 23, 97), String.valueOf(fv5.A0H()));
        }
        eq2 = this.A00.A04;
        j2 = this.A00.A05;
        String A6T = this.A01.A6T();
        fv2 = this.A00.A03;
        if (fv2 == null) {
            A0y = null;
        } else {
            fv3 = this.A00.A03;
            A0y = fv3.A0y();
        }
        AbstractC00460h A002 = C00470i.A00(eq2, j2, A6T, A00, map, A0y);
        EnumC00450g enumC00450g = EnumC00450g.A08;
        if (A002 != null) {
            try {
                eq3 = this.A00.A04;
                eq3.A0E().A3g();
                enumC00450g = A002.A0C();
            } catch (Exception e) {
                str3 = C1010bN.A0K;
                Log.e(str3, A00(0, 22, 0), e);
            }
        }
        boolean z2 = A002 instanceof C0401Fe;
        String[] strArr = A03;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[1] = "yKt";
        strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
        if (z2 || (A002 instanceof C0403Fg)) {
            eq4 = this.A00.A04;
            if (AbstractC0556Lo.A0e(eq4, enumC00450g, map)) {
                z = true;
                if (A00(32, 4, 55).equals(A00.getScheme()) || !C00470i.A04(A00.getAuthority())) {
                }
                C1010bN c1010bN = this.A00;
                String[] strArr3 = A03;
                if (strArr3[1].length() != strArr3[2].length()) {
                    String[] strArr4 = A03;
                    strArr4[3] = "M83eNTNa8vARqiZhiytfGHWaWQaZAWG6";
                    strArr4[4] = "l8FjrIknJvxUrl7LWCsoLe7lR5i3NNwU";
                    interfaceC00610x3 = c1010bN.A00;
                    if (interfaceC00610x3 == null) {
                        return;
                    }
                } else {
                    String[] strArr5 = A03;
                    strArr5[0] = "riyOH90vrbS";
                    strArr5[5] = "IRnMxNmFGTn";
                    interfaceC00610x = c1010bN.A00;
                    if (interfaceC00610x == null) {
                        return;
                    }
                }
                if (z || enumC00450g == EnumC00450g.A05) {
                    return;
                }
                interfaceC00610x2 = this.A00.A00;
                interfaceC00610x2.AAx(this.A00);
                return;
            }
        }
        z = false;
        if (A00(32, 4, 55).equals(A00.getScheme())) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
    public final void ABj() {
        EQ eq;
        C0998bB c0998bB;
        C0998bB c0998bB2;
        C0998bB c0998bB3;
        eq = this.A00.A04;
        InterfaceC1029bg A0E = eq.A0E();
        c0998bB = this.A00.A02;
        A0E.A3k(c0998bB != null);
        c0998bB2 = this.A00.A02;
        if (c0998bB2 == null) {
            return;
        }
        c0998bB3 = this.A00.A02;
        c0998bB3.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0771Tv, com.meta.analytics.dsp.uinode.InterfaceC0595Nb
    public final void ACU() {
        EQ eq;
        C0998bB c0998bB;
        eq = this.A00.A04;
        eq.A0E().A3m();
        c0998bB = this.A00.A02;
        c0998bB.A07();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0595Nb
    public final void ADj() {
    }
}
