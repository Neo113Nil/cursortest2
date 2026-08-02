package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class OG {
    public static byte[] A05;
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC0992b5 A02;
    public final C0889Yn A03;
    public final OE A04;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    public OG(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5, OE oe) {
        this.A03 = c0889Yn;
        this.A04 = oe;
        this.A02 = abstractC0992b5;
    }

    public static OG A01(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5, OE oe) {
        Object creativeAsCtaLoggingHelper = c0889Yn.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new OG(c0889Yn, abstractC0992b5, oe);
            c0889Yn.A0N(creativeAsCtaLoggingHelper);
        }
        return (OG) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C1U c1u, String str2) {
        Map<String, String> A052 = new C0602Ni().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 15), str);
        this.A03.A09().A9j(str2, A052);
        if (c1u != null) {
            C1U.A06(c1u, this.A03);
        }
        if (C0478Ih.A20(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1022bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1022bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1022bZ.A05, Boolean.TRUE.toString());
            this.A03.A09().A9s(str2, hashMap);
        }
        this.A04.AC9();
    }

    public static boolean A06(C0889Yn c0889Yn) {
        return C0478Ih.A1F(c0889Yn) && C0537Kv.A0H(c0889Yn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OF A09(AbstractC0992b5 abstractC0992b5) {
        if (C0478Ih.A1K(this.A03)) {
            r2 = abstractC0992b5.A0l() && A06(this.A03);
            return new OF(r2, r2);
        }
        boolean A0l = abstractC0992b5.A0l();
        if (A0l) {
            boolean shouldCreativeBeClickable = A06(this.A03);
        }
        r2 = false;
        return new OF(A0l, r2);
    }

    public final void A0A() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0B(String str, C1U c1u, String str2) {
        A0A();
        this.A00 = true;
        this.A01.postDelayed(new OD(this, str, c1u, str2), this.A02.A0H());
    }
}
