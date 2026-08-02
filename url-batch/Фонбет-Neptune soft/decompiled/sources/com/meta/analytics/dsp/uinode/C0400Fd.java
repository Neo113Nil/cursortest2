package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0400Fd extends AbstractC1022bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0400Fd.class.getSimpleName();
    }

    public C0400Fd(C0889Yn c0889Yn, J2 j2, String str, Uri uri, Map<String, String> mExtraData, C00520o c00520o, boolean z) {
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
        A0E(this.A01, enumC00450g);
        return enumC00450g;
    }

    public final EnumC00450g A0G() {
        EnumC00450g enumC00450g = EnumC00450g.A08;
        try {
            C0537Kv.A0C(new C0537Kv(), ((AbstractC00460h) this).A00, AbstractC0540Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC00460h) this).A02);
            return enumC00450g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC00450g.A03;
        }
    }
}
