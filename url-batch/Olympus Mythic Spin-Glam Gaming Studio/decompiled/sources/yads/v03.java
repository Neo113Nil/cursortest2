package yads;

import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class v03 {
    public static final HashSet b = new HashSet(CollectionsKt.listOf((Object[]) new t63[]{t63.c, t63.b}));
    public final v63 a = new v63(b);

    public final qg3 a(d20 d20Var) {
        int i = d20Var.i;
        w03 w03Var = d20Var.g;
        if (w03Var != null) {
            id3 a = this.a.a(w03Var.a);
            if (a != null) {
                float f = a.c;
                if (hd3.c == a.b) {
                    f = (long) ((f / 100) * i);
                }
                return new qg3((long) Math.min(f, i));
            }
        }
        return null;
    }
}
