package yads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class iv {
    public final i5 a = new i5();
    public final zc2 b = new zc2();
    public final h5 c = h5.F;

    public final Long a() {
        List list;
        Object obj;
        i5 i5Var = this.a;
        synchronized (i5Var.a) {
            list = CollectionsKt.toList(i5Var.d);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g5) obj).a == this.c) {
                break;
            }
        }
        g5 g5Var = (g5) obj;
        if (g5Var == null) {
            return null;
        }
        Object obj2 = g5Var.b.get(IronSourceConstants.EVENTS_DURATION);
        if (obj2 instanceof Long) {
            return (Long) obj2;
        }
        return null;
    }
}
