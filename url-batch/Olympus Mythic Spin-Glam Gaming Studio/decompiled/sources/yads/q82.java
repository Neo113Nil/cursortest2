package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class q82 {
    public final v3 a;
    public final t8 b;
    public final List c;
    public final x31 d;

    public q82(v3 v3Var, t8 t8Var, List list) {
        x31 x31Var = new x31();
        this.a = v3Var;
        this.b = t8Var;
        this.c = list;
        this.d = x31Var;
    }

    public final boolean a() {
        if (this.a.m) {
            if (this.b.B) {
                Set a = this.d.a(this.c);
                if (!a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        if (!((q31) it.next()).f) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
