package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UF implements L8 {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ UD A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public UF(UD ud) {
        this.A00 = ud;
    }

    public /* synthetic */ UF(UD ud, UK uk) {
        this(ud);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        boolean z;
        boolean A0V;
        this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0I();
        z = this.A00.A0U;
        if (z) {
            A0V = this.A00.A0V();
            if (A0V) {
                this.A00.A0W.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0W.setToolbarActionMode(0);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
        boolean z;
        C00661c c00661c;
        boolean z2;
        AbstractC0992b5 abstractC0992b5;
        float A03;
        AbstractC0992b5 abstractC0992b52;
        AbstractC0992b5 abstractC0992b53;
        boolean z3;
        AbstractC0992b5 abstractC0992b54;
        boolean z4;
        AbstractC0992b5 abstractC0992b55;
        this.A00.A0O((int) f);
        z = this.A00.A0V;
        if (!z) {
            c00661c = this.A00.A0G;
            this.A00.A0W.setProgress(100.0f * (1.0f - (f / c00661c.A07())));
            return;
        }
        z2 = this.A00.A0B;
        if (z2) {
            abstractC0992b54 = this.A00.A0F;
            A03 = 1.0f - (f / abstractC0992b54.A0x().A0D().A02());
            z4 = this.A00.A0E;
            if (z4 || A03 < 1.0f) {
                this.A00.A0E = false;
                abstractC0992b55 = this.A00.A0F;
                String A022 = abstractC0992b55.A11().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                this.A00.A0W.setToolbarActionMessage(A022.replace(A00(0, 6, 65), String.valueOf((int) f)));
            } else {
                this.A00.A0E = true;
                this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC0992b5 = this.A00.A0F;
            A03 = 1.0f - (f / abstractC0992b5.A0x().A0D().A03());
        }
        this.A00.A0W.setProgress(100.0f * A03);
        abstractC0992b52 = this.A00.A0F;
        float A023 = abstractC0992b52.A0x().A0D().A02() - f;
        abstractC0992b53 = this.A00.A0F;
        float percentageOfReward = abstractC0992b53.A0x().A0D().A03();
        boolean z5 = A023 >= percentageOfReward;
        z3 = this.A00.A0E;
        if (!z3 && z5) {
            this.A00.A0W.setToolbarActionMode(1);
        }
    }
}
