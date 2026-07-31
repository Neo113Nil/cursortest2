package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KA implements InterfaceC2856aq {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C2381Ji A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public KA(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2856aq
    public final void AF7(String str) {
        C2847ah c2847ah;
        C2847ah c2847ah2;
        AbstractC3383jd abstractC3383jd;
        M3 m3;
        AbstractC3383jd abstractC3383jd2;
        M3 m32;
        C2847ah c2847ah3;
        this.A00.A0K = false;
        c2847ah = this.A00.A07;
        if (c2847ah != null) {
            c2847ah3 = this.A00.A07;
            c2847ah3.setProgress(100);
        }
        c2847ah2 = this.A00.A07;
        YB.A0O(c2847ah2, 8);
        abstractC3383jd = this.A00.A0X;
        if (abstractC3383jd.A1l()) {
            m3 = this.A00.A08;
            if (m3 != null) {
                abstractC3383jd2 = this.A00.A0X;
                String A14 = abstractC3383jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m32 = this.A00.A08;
                    m32.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2856aq
    public final void AF9(String str) {
        C2847ah c2847ah;
        M8 m8;
        boolean z;
        int i;
        M8 m82;
        this.A00.A0K = true;
        c2847ah = this.A00.A07;
        YB.A0O(c2847ah, 0);
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setUrl(str);
        }
        C2381Ji c2381Ji = this.A00;
        String[] strArr = A02;
        if (strArr[4].charAt(17) != strArr[5].charAt(17)) {
            A02[2] = "wX256yuF2";
            z = c2381Ji.A0I;
            if (!z) {
                i = this.A00.A00;
                if (i > 1) {
                    this.A00.A0I = true;
                    this.A00.A0o(A00(0, 19, 95));
                }
            }
            C2381Ji.A02(this.A00);
            if (A02[2].length() != 27) {
                A02[6] = "lsrcQj4qqEXeVsDQCf";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2856aq
    public final void AFY(int i) {
        boolean z;
        C2847ah c2847ah;
        C2847ah c2847ah2;
        z = this.A00.A0K;
        if (z) {
            c2847ah = this.A00.A07;
            if (c2847ah != null) {
                c2847ah2 = this.A00.A07;
                c2847ah2.setProgress(i);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2856aq
    public final void AFb(String str) {
        M8 m8;
        M8 m82;
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2856aq
    public final void AFe() {
        C2935c7 c2935c7;
        c2935c7 = this.A00.A0b;
        c2935c7.A0C().ADJ(14);
    }
}
