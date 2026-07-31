package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class v3 {
    public final e00 a;
    public final jx b;
    public final ca c;
    public final m03 d;
    public d8 e;
    public e52 f;
    public cb3 g;
    public String h;
    public String i;
    public Integer j;
    public er1 k;
    public String l;
    public boolean m;
    public int n;
    public final int o;

    public v3(e00 e00Var) {
        jx jxVar = new jx(new ic(), new om0());
        ca caVar = new ca();
        m03 m03Var = new m03();
        this.a = e00Var;
        this.b = jxVar;
        this.c = caVar;
        this.d = m03Var;
        this.m = true;
        this.o = d11.b;
    }

    public final e00 a() {
        return this.a;
    }

    public final om0 b() {
        return this.b.a;
    }

    public final void a(String str) {
        ca caVar = this.c;
        caVar.getClass();
        if (str == null || StringsKt.isBlank(str)) {
            ab1.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = caVar.a;
        if (str2 == null || Intrinsics.areEqual(str2, str)) {
            caVar.a = str;
        } else {
            ab1.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
