package yads;

import android.view.View;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class mi {
    public final Collection a;
    public final g22 b;

    public mi(Set set, int i) {
        Collection emptyList = (i & 1) != 0 ? CollectionsKt.emptyList() : set;
        g22 g22Var = new g22();
        this.a = emptyList;
        this.b = g22Var;
    }

    public final f22 a(View view, uy1 uy1Var) {
        g22 g22Var = this.b;
        d32 d32Var = d32.c;
        g22Var.getClass();
        e22 e22Var = new e22(view);
        e22Var.d.put("age", uy1Var.h(view));
        e22Var.d.put("body", uy1Var.a(view));
        e22Var.d.put("call_to_action", uy1Var.e(view));
        e22Var.d.put("domain", uy1Var.n(view));
        e22Var.d.put("favicon", uy1Var.g(view));
        e22Var.d.put("feedback", uy1Var.l(view));
        e22Var.d.put("icon", uy1Var.o(view));
        e22Var.d.put("media", uy1Var.c(view));
        e22Var.b = uy1Var.b(view);
        e22Var.c = uy1Var.k(view);
        e22Var.d.put("price", uy1Var.d(view));
        View i = uy1Var.i(view);
        if (!(i instanceof wl2)) {
            i = null;
        }
        e22Var.d.put("rating", i);
        e22Var.d.put("review_count", uy1Var.p(view));
        e22Var.d.put("sponsored", uy1Var.m(view));
        e22Var.d.put("title", uy1Var.j(view));
        e22Var.d.put("warning", uy1Var.f(view));
        for (String str : this.a) {
            View a = uy1Var.a(view, str);
            if (a != null) {
                e22Var.d.put(str, a);
            }
        }
        return new f22(e22Var);
    }
}
