package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1022bZ extends AbstractC00460h {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;
    public final C00520o A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, Ascii.VT, 76, 75, 81, 64, 75, 81, Ascii.VT, 68, 70, 81, 76, 74, 75, Ascii.VT, 115, 108, 96, 114, Ascii.CAN, Ascii.ESC, Ascii.EM, 17, 37, Ascii.SO, 19, Ascii.ETB, Ascii.US, 46, 39, 35, 52, 39, Ascii.GS, 54, 43, 47, 39, Ascii.VT, 17, 16, 7, Ascii.VT, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract EnumC00450g A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC1022bZ(C0889Yn c0889Yn, J2 j2, String str, C00520o c00520o, boolean z) {
        this(c0889Yn, j2, str, c00520o, z, false);
    }

    public AbstractC1022bZ(C0889Yn c0889Yn, J2 j2, String str, C00520o c00520o, boolean z, boolean z2) {
        super(c0889Yn, j2, str);
        this.A01 = c00520o;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00460h
    public final EnumC00450g A0C() {
        C00520o c00520o = this.A01;
        if (c00520o != null) {
            c00520o.A07(super.A02);
        }
        if (C0611Nr.A03(super.A00)) {
            return EnumC00450g.A05;
        }
        return A0D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r4 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r3 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (com.meta.analytics.dsp.uinode.AbstractC1022bZ.A07[6].length() == 8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.AbstractC1022bZ.A07;
        r2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
        r2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r3.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r4 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0E(Map<String, String> extraData, EnumC00450g enumC00450g) {
        if (!TextUtils.isEmpty(super.A02)) {
            if (this instanceof C0403Fg) {
                super.A01.AA8(super.A02, extraData);
            } else {
                J2 j2 = super.A01;
                String str = super.A02;
                if (A07[6].length() != 8) {
                    A07[5] = "D2ZF";
                    j2.A9j(str, extraData);
                } else {
                    j2.A9j(str, extraData);
                }
            }
            boolean A02 = EnumC00450g.A02(enumC00450g);
            if (A07[1].length() == 32) {
                throw new RuntimeException();
            }
            A07[0] = "X";
            boolean z = this.A01 != null;
            boolean isError = C0478Ih.A20(super.A00);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !A02;
                navigationDataMap.put(A03, Boolean.toString(isError2));
                navigationDataMap.put(A04, Boolean.toString(z));
                String str2 = A05;
                boolean isError3 = this.A00;
                navigationDataMap.put(str2, Boolean.toString(isError3));
                super.A01.A9s(super.A02, navigationDataMap);
            }
            C00520o c00520o = this.A01;
            if (c00520o != null) {
                c00520o.A06(enumC00450g);
                if (A07[6].length() != 8) {
                    A07[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                } else {
                    A07[5] = "IMSq";
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(47, 10, 92), Long.toString(-1L));
                hashMap.put(A0A(38, 9, 100), Long.toString(-1L));
                hashMap.put(A0A(57, 7, 122), EnumC00450g.A04.name());
                super.A01.AA9(super.A02, hashMap);
            }
        }
        L4.A02(super.A00, A0A(0, 12, 0));
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), AbstractC0540Ky.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C0527Kj.A0C(super.A00, intent);
        } catch (C0525Kh unused) {
            return false;
        }
    }
}
