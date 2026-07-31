package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public final class h20 {
    public static final String f = "yandex_tracking_events";
    public static final String g = "yandex_linear_creative_info";
    public static final String h = "yandex_designs";
    public final rp3 a;
    public final gf1 b;
    public final sc3 c;
    public final f20 d;
    public final pp3 e;

    public h20(Context context, mt1 mt1Var) {
        rp3 rp3Var = new rp3();
        gf1 gf1Var = new gf1(context, mt1Var, new li(context, mt1Var, null, 12));
        sc3 sc3Var = new sc3(mt1Var);
        this.a = rp3Var;
        this.b = gf1Var;
        this.c = sc3Var;
        this.d = new f20(new nq0());
        this.e = new pp3(new o83(), "CreativeExtension", "Tracking");
    }
}
