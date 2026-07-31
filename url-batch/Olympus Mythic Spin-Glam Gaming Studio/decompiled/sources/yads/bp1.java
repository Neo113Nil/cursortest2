package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class bp1 implements yw0 {
    public final t8 a;
    public final vq1 b;
    public final Context c;

    public bp1(Context context, t8 t8Var, vq1 vq1Var) {
        this.a = t8Var;
        this.b = vq1Var;
        this.c = pz.a(context);
    }

    @Override // yads.yw0
    public final xw0 a(tb1 tb1Var, km kmVar) {
        fo1 fo1Var = new fo1();
        com.monetization.ads.mediation.interstitial.b bVar = new com.monetization.ads.mediation.interstitial.b();
        v3 v3Var = kmVar.b;
        yu2 yu2Var = kmVar.c;
        ap1 ap1Var = new ap1(v3Var);
        so1 so1Var = new so1(v3Var, yu2Var, this.a);
        ep1 ep1Var = new ep1(new go1(this.b.b, ap1Var, so1Var, null, 24));
        wn1 wn1Var = new wn1(this.c, v3Var, yu2Var, this.a, kmVar.a, bVar, so1Var, ep1Var, new gc2(tb1Var, this.b));
        return new com.monetization.ads.mediation.interstitial.c(kmVar, wn1Var, bVar, new com.monetization.ads.mediation.interstitial.a(tb1Var, kmVar, wn1Var, fo1Var), new so1(kmVar.b, kmVar.c, this.a), fo1Var);
    }

    @Override // yads.yw0
    public final xw0 a(jg jgVar, km kmVar) {
        Context context = this.c;
        t8 t8Var = this.a;
        vq1 vq1Var = this.b;
        v3 v3Var = kmVar.b;
        yu2 yu2Var = kmVar.c;
        ap1 ap1Var = new ap1(v3Var);
        so1 so1Var = new so1(v3Var, yu2Var, t8Var);
        to1 to1Var = new to1(new go1(vq1Var.b, ap1Var, so1Var, null, 24));
        i5 i5Var = kmVar.a;
        gc2 gc2Var = new gc2(jgVar, vq1Var);
        com.monetization.ads.mediation.appopenad.c cVar = new com.monetization.ads.mediation.appopenad.c();
        wn1 wn1Var = new wn1(context, v3Var, yu2Var, t8Var, i5Var, cVar, so1Var, to1Var, gc2Var);
        return new com.monetization.ads.mediation.appopenad.b(wn1Var, cVar, new com.monetization.ads.mediation.appopenad.a(jgVar, wn1Var), so1Var);
    }

    @Override // yads.yw0
    public final xw0 a(er2 er2Var, km kmVar) {
        fo1 fo1Var = new fo1();
        hq1 hq1Var = new hq1();
        v3 v3Var = kmVar.b;
        yu2 yu2Var = kmVar.c;
        ap1 ap1Var = new ap1(v3Var);
        so1 so1Var = new so1(v3Var, yu2Var, this.a);
        lo1 lo1Var = new lo1(so1Var);
        gq1 gq1Var = new gq1(new go1(this.b.b, ap1Var, so1Var, new mo1(lo1Var, new kq1(lo1Var, this.a)), 16));
        wn1 wn1Var = new wn1(this.c, v3Var, yu2Var, this.a, kmVar.a, hq1Var, so1Var, gq1Var, new gc2(er2Var, this.b));
        return new fq1(kmVar.d, wn1Var, hq1Var, new or2(er2Var, kmVar.d, wn1Var, fo1Var), new so1(kmVar.b, kmVar.c, this.a), fo1Var);
    }
}
