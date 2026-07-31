package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public abstract class fs1 {
    public static final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hs1 hs1Var = (hs1) it.next();
            int ordinal = hs1Var.b.ordinal();
            if (ordinal == 0) {
                ab1.b(hs1Var.a, new Object[0]);
            } else if (ordinal == 1) {
                ab1.a(hs1Var.a, new Object[0]);
            }
        }
    }
}
