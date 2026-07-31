package yads;

import android.net.Uri;
import java.util.List;

/* loaded from: classes5.dex */
public final class bu0 implements dc2 {
    public final g30 a;
    public final List b;

    public bu0(g30 g30Var, List list) {
        this.a = g30Var;
        this.b = list;
    }

    @Override // yads.dc2
    public final Object a(Uri uri, s30 s30Var) {
        e30 e30Var = (e30) this.a.a(uri, s30Var);
        List list = this.b;
        return (list == null || list.isEmpty()) ? e30Var : e30Var.a(this.b);
    }
}
