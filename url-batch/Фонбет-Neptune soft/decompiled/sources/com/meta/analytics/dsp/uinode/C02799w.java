package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02799w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0385Eo A04;
    public final TrackGroupArray A05;
    public final C0430Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C02799w(AH ah, long j, TrackGroupArray trackGroupArray, C0430Gk c0430Gk) {
        this(ah, null, new C0385Eo(0), j, -9223372036854775807L, 1, false, trackGroupArray, c0430Gk);
    }

    public C02799w(AH ah, Object obj, C0385Eo c0385Eo, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C0430Gk c0430Gk) {
        this.A03 = ah;
        this.A07 = obj;
        this.A04 = c0385Eo;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c0430Gk;
    }

    public static void A00(C02799w c02799w, C02799w c02799w2) {
        c02799w2.A0A = c02799w.A0A;
        c02799w2.A09 = c02799w.A09;
    }

    public final C02799w A01(int i) {
        C02799w c02799w = new C02799w(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c02799w);
        return c02799w;
    }

    public final C02799w A02(int i) {
        C02799w playbackInfo = new C02799w(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02799w A03(AH ah, Object obj) {
        C02799w playbackInfo = new C02799w(ah, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02799w A04(C0385Eo c0385Eo, long j, long j2) {
        long j3 = j2;
        AH ah = this.A03;
        Object obj = this.A07;
        if (!c0385Eo.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C02799w(ah, obj, c0385Eo, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C02799w A05(TrackGroupArray trackGroupArray, C0430Gk c0430Gk) {
        C02799w playbackInfo = new C02799w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0430Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C02799w A06(boolean z) {
        C02799w playbackInfo = new C02799w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
