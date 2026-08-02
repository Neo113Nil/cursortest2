package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00841u {
    public int A00;
    public long A01;
    public RewardData A02;
    public JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C8Z A07;
    public final EnumC0497Je A08;
    public final EnumC0499Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C00841u(String str, EnumC0499Jg enumC0499Jg, AdPlacementType adPlacementType, EnumC0497Je enumC0497Je, int i, C8Z c8z) {
        this(str, enumC0499Jg, adPlacementType, enumC0497Je, i, EnumSet.of(CacheFlag.NONE), c8z);
    }

    public C00841u(String str, EnumC0499Jg enumC0499Jg, AdPlacementType adPlacementType, EnumC0497Je enumC0497Je, int i, EnumSet<CacheFlag> cacheFlags, C8Z c8z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC0497Je;
        this.A0C = i;
        this.A0B = cacheFlags;
        this.A09 = enumC0499Jg;
        this.A00 = -1;
        this.A07 = c8z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC0497Je enumC0497Je = this.A08;
        if (enumC0497Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC0497Je == EnumC0497Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final K1 A01(C0889Yn c0889Yn, C0504Jl c0504Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC0497Je enumC0497Je = this.A08;
        return new K1(c0889Yn, str, enumC0497Je != null ? new LQ(enumC0497Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c0504Jl, LW.A01(C0478Ih.A0J(c0889Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(JL jl) {
        this.A03 = jl;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
