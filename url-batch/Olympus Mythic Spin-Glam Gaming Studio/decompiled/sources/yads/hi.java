package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* loaded from: classes5.dex */
public final class hi {
    public final e00 a;
    public final String b;
    public final p2 c;
    public final w8 d;
    public w22 e;

    public hi(c5 c5Var, e00 e00Var, String str) {
        p2 a = c5Var.a();
        w8 b = c5Var.b();
        this.a = e00Var;
        this.b = str;
        this.c = a;
        this.d = b;
    }

    public final io2 a() {
        io2 a = this.d.a();
        a.b(this.a.b, "ad_type");
        a.a(this.b, CreativeInfo.c);
        a.a.putAll(this.c.a());
        w22 w22Var = this.e;
        return w22Var != null ? jo2.a(a, w22Var.a()) : a;
    }
}
