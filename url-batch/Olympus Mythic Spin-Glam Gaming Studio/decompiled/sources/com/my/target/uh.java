package com.my.target;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class uh {
    public final sh a;
    public final g0 b;
    public final List c;
    public final w0 d;

    private uh(List list, w0 w0Var, sh shVar, g0 g0Var) {
        this.c = list;
        this.d = w0Var;
        this.a = shVar;
        this.b = g0Var;
    }

    public static uh a(th thVar) {
        return a(thVar, new ArrayList());
    }

    public static uh a(th thVar, List list) {
        return new uh(list, thVar.b(), thVar.e(), thVar.a());
    }

    public uh a() {
        return new uh(new ArrayList(), this.d, this.a, this.b);
    }
}
