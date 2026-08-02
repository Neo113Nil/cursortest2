package com.meta.analytics.dsp.uinode;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0953aS extends AbstractC00540q {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C0951aQ A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C0953aS(C0951aQ c0951aQ) {
        this.A00 = c0951aQ;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C01915z c01915z = (C01915z) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c01915z.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c01915z.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f;
        this.A00.A07.A0E().A2j();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c2f.A00());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c2f.A00());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0F(InterfaceC00530p interfaceC00530p) {
        FG fg;
        C2F c2f;
        C2F c2f2;
        FG fg2;
        C1F c1f;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f3;
        C1F c1f2;
        RewardedVideoAd rewardedVideoAd2;
        C1F c1f3;
        C2F c2f4;
        RewardedVideoAd rewardedVideoAd3;
        C1F c1f4;
        C2F c2f5;
        C2F c2f6;
        C2F c2f7;
        C1F c1f5;
        C2F c2f8;
        fg = this.A00.A05;
        if (fg == null) {
            this.A00.A07.A07().A9a(A00(0, 3, 70), C8A.A0N, new C8B(A00(3, 18, 43)));
            return;
        }
        AbstractC0996b9 abstractC0996b9 = (AbstractC0996b9) interfaceC00530p;
        c2f = this.A00.A09;
        if (c2f.A03 != null) {
            c2f8 = this.A00.A09;
            abstractC0996b9.A02(c2f8.A03);
        }
        c2f2 = this.A00.A09;
        int A0G = abstractC0996b9.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        c2f2.A00 = A0G;
        this.A00.A06 = true;
        C0951aQ c0951aQ = this.A00;
        fg2 = c0951aQ.A05;
        c0951aQ.A04 = fg2.A0G();
        c1f = this.A00.A04;
        if (c1f != null) {
            int i = 0;
            c1f4 = this.A00.A04;
            if (!c1f4.A0j()) {
                c1f5 = this.A00.A04;
                i = ((AbstractC0992b5) c1f5).A0v();
            }
            if (i > 0) {
                C0541Kz c0541Kz = new C0541Kz();
                C0889Yn c0889Yn = this.A00.A07;
                c2f5 = this.A00.A09;
                if (c0541Kz.A09(c0889Yn, c2f5.A06, i)) {
                    c0541Kz.A08(this.A00.A07, true);
                    C0951aQ c0951aQ2 = this.A00;
                    C0889Yn c0889Yn2 = c0951aQ2.A07;
                    c2f6 = this.A00.A09;
                    String str = c2f6.A0D;
                    c2f7 = this.A00.A09;
                    c0951aQ2.A03 = c0541Kz.A07(c0889Yn2, str, c2f7.A06);
                } else {
                    C0951aQ c0951aQ3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        c0541Kz.A08(c0951aQ3.A07, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        c0541Kz.A08(c0951aQ3.A07, false);
                    }
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c2f3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c2f3.A00());
            return;
        }
        c1f2 = this.A00.A04;
        ((AbstractC0992b5) c1f2).A17(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1f3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1f3.A0J());
        c2f4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c2f4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.25
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2F c2f9;
                s2SRewardedVideoAdExtendedListener2 = C0953aS.this.A00.A08;
                c2f9 = C0953aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                C1F c1f6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2F c2f9;
                C0953aS.this.A00.A03 = null;
                c1f6 = C0953aS.this.A00.A04;
                ((AbstractC0992b5) c1f6).A17(false);
                s2SRewardedVideoAdExtendedListener2 = C0953aS.this.A00.A08;
                c2f9 = C0953aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C0953aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C0953aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0G(C0495Jb c0495Jb) {
        C2F c2f;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f2;
        this.A00.A0D(true);
        c2f = this.A00.A09;
        C0S A0E = c2f.A0B.A0E();
        j = this.A00.A01;
        A0E.A2m(C0547Lf.A01(j), c0495Jb.A03().getErrorCode(), c0495Jb.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c2f2.A00(), L1.A00(c0495Jb));
    }
}
