package com.meta.analytics.dsp.uinode;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0611Nr {
    public static long A0C;
    public static byte[] A0D;
    public static String[] A0E = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    public AbstractC0992b5 A00;
    public InterfaceC0610Nq A01;
    public OG A02;
    public boolean A03;
    public boolean A04;
    public final C1U A05;
    public final C0889Yn A06;
    public final J2 A07;
    public final C0548Lg A08;
    public final MC A09;
    public final RE A0A;
    public final String A0B;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{Ascii.US, 8, Ascii.GS, Ascii.RS, 41, 40, 40, 51, 50, Ascii.US, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, Ascii.ETB, 82, 79, 82, 84, 66, 67, 94, 89, 80, Ascii.ETB, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A01();
        A0C = 0L;
    }

    public C0611Nr(C0889Yn c0889Yn, String str, RE re, C0548Lg c0548Lg, J2 j2, C1U c1u) {
        this(c0889Yn, str, re, c0548Lg, j2, c1u, new C0762Tm());
    }

    public C0611Nr(C0889Yn c0889Yn, String str, RE re, C0548Lg c0548Lg, J2 j2, C1U c1u, MC mc) {
        this.A03 = true;
        this.A06 = c0889Yn;
        this.A0B = str;
        this.A0A = re;
        this.A08 = c0548Lg;
        this.A07 = j2;
        this.A05 = c1u;
        this.A09 = mc;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String A00 = A00(0, 22, 52);
        try {
            AbstractC0556Lo.A0Z(map, this.A00);
            AbstractC00460h A01 = C00470i.A01(this.A06, this.A07, str, AbstractC0540Ky.A00(str2), new C0602Ni(map).A03(this.A0A).A02(this.A08).A05(), this.A03, this.A04, this.A05);
            if (A01 instanceof C0403Fg) {
                ((C0403Fg) A01).A0H(this.A02);
            }
            EnumC00450g actionOutcome = EnumC00450g.A08;
            if (A01 != null) {
                actionOutcome = A01.A0C();
            }
            if (!(((A01 instanceof C0401Fe) || (A01 instanceof C0403Fg)) && AbstractC0556Lo.A0e(this.A06, actionOutcome, map)) && actionOutcome != EnumC00450g.A05) {
                InterfaceC0610Nq interfaceC0610Nq = this.A01;
                if (interfaceC0610Nq != null) {
                    interfaceC0610Nq.ABE();
                }
                this.A09.A43(this.A0B);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(A00, A00(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(A00, A00(22, 22, 95), e2);
        }
    }

    public static boolean A03(C0889Yn c0889Yn) {
        boolean isIABBottomSheetEnabled = C0478Ih.A2N(c0889Yn);
        int A06 = C0478Ih.A06(c0889Yn);
        long currentTimeMillis = System.currentTimeMillis();
        long j = A0C;
        long j2 = currentTimeMillis - j;
        if (isIABBottomSheetEnabled) {
            String[] strArr = A0E;
            String str = strArr[0];
            String str2 = strArr[6];
            int clickguardTime = str.length();
            if (clickguardTime == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "iHhMWVvnkjnFrqYtRUL";
            strArr2[4] = "26cGs68neeVahMKc5kl";
            if (j > 0 && j2 < A06) {
                return true;
            }
        }
        A0C = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC0992b5 abstractC0992b5) {
        this.A00 = abstractC0992b5;
    }

    public final void A05(InterfaceC0610Nq interfaceC0610Nq) {
        this.A01 = interfaceC0610Nq;
    }

    public final void A06(OG og) {
        this.A02 = og;
    }

    public final void A07(String str, String str2, Map<String, String> extraData) {
        new JA(str, this.A07).A04(J9.A0J, extraData);
        if (this.A08.A09(this.A06)) {
            this.A07.A9W(str, extraData);
        } else {
            A02(str, str2, extraData);
        }
    }

    public final void A08(boolean z) {
        this.A04 = z;
    }
}
