package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0401Fe extends AbstractC1022bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Ascii.SO, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, Base64.padSymbol, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0401Fe.class.getSimpleName();
    }

    public C0401Fe(C0889Yn c0889Yn, J2 j2, String str, Uri uri, Map<String, String> mExtraData, C00520o c00520o, boolean z) {
        super(c0889Yn, j2, str, c00520o, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1022bZ
    public final EnumC00450g A0D() {
        EnumC00450g enumC00450g = EnumC00450g.A08;
        if (((AbstractC1022bZ) this).A02) {
            enumC00450g = A0G();
        }
        if (!AbstractC0556Lo.A0e(((AbstractC00460h) this).A00, enumC00450g, this.A01)) {
            A0E(this.A01, enumC00450g);
        }
        return enumC00450g;
    }

    public final EnumC00450g A0G() {
        if (A0F(this.A00)) {
            EnumC00450g actionOutcome = EnumC00450g.A09;
            return actionOutcome;
        }
        try {
            EnumC00450g actionOutcome2 = C0537Kv.A05(new C0537Kv(), ((AbstractC00460h) this).A00, AbstractC0540Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC00460h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC00450g actionOutcome3 = EnumC00450g.A03;
            return actionOutcome3;
        }
    }
}
