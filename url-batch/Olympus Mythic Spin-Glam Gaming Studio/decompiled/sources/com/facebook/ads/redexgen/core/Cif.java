package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C3332id A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, 63, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C3332id c3332id) {
        this.A00 = c3332id;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C20917j c20917j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        C20917j c20917j2;
        C20917j c20917j3;
        C20917j c20917j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c20917j = this.A00.A03;
        if (c20917j != null && C2668Up.A2D(this.A00.A06)) {
            c20917j2 = this.A00.A03;
            c20917j2.A0S(new C3334ig(this));
            c20917j3 = this.A00.A03;
            c20917j3.A0N();
            c20917j4 = this.A00.A03;
            c20917j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c3328iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c3328iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        interstitialAdExtendedListener = this.A00.A07;
        c3328iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c3328iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c3328iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c3328iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        interstitialAdExtendedListener = this.A00.A07;
        c3328iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c3328iY.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n1) {
        C20917j c20917j;
        C20917j c20917j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C3328iY c3328iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C3328iY c3328iY3;
        InterstitialAd interstitialAd2;
        C3328iY c3328iY4;
        C3328iY c3328iY5;
        InterstitialAd interstitialAd3;
        C3328iY c3328iY6;
        C3328iY c3328iY7;
        C3328iY c3328iY8;
        c20917j = this.A00.A03;
        if (c20917j != null) {
            this.A00.A05 = true;
            C3332id c3332id = this.A00;
            c20917j2 = this.A00.A03;
            c3332id.A02 = c20917j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC3383jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c3328iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c3328iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC3383jd abstractC3383jd = (AbstractC3383jd) nq2;
                if (abstractC3383jd.A26() > 0) {
                    XC xc = new XC();
                    C3218gi c3218gi = this.A00.A06;
                    c3328iY6 = this.A00.A08;
                    if (xc.A09(c3218gi, c3328iY6.A08(), abstractC3383jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C3332id c3332id2 = this.A00;
                        C3218gi c3218gi2 = this.A00.A06;
                        c3328iY7 = this.A00.A08;
                        String A0A = c3328iY7.A0A();
                        c3328iY8 = this.A00.A08;
                        c3332id2.A01 = xc.A06(c3218gi2, A0A, c3328iY8.A08());
                    } else {
                        C3332id c3332id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c3332id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c3332id3.A06, false);
                        }
                    }
                }
                C3332id c3332id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c3332id4.A01;
                    if (interstitialAd != null) {
                        abstractC3383jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC3383jd));
                        c3328iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c3328iY4.A0B());
                        c3328iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c3328iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C3332id c3332id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c3332id5.A07;
                        c3328iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c3328iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c3332id5.A07;
                        c3328iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c3328iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC2630Td.A0N, new C2631Te(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C2690Vm c2690Vm) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C3328iY c3328iY;
        InterfaceC2444Lt A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2690Vm.A03().getErrorCode(), c2690Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c3328iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c3328iY.A6k(), XE.A00(c2690Vm));
    }
}
