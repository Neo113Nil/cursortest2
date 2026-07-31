package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class rr1 {
    public static boolean a(qr1 qr1Var) {
        List list = qr1Var.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((pr1) it.next()).c) {
                    return false;
                }
            }
        }
        return true;
    }
}
