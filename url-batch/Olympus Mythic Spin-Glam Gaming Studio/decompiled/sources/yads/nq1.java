package yads;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;

/* loaded from: classes3.dex */
public final class nq1 implements w72 {
    public final MediatedNativeAd a;
    public final xp1 b;
    public final r7 c;

    public nq1(MediatedNativeAd mediatedNativeAd, xp1 xp1Var, r7 r7Var) {
        this.a = mediatedNativeAd;
        this.b = xp1Var;
        this.c = r7Var;
    }

    @Override // yads.w72
    public final v72 a(ry1 ry1Var) {
        return new yp1(new h22(ry1Var), this.a, this.b, this.c);
    }
}
