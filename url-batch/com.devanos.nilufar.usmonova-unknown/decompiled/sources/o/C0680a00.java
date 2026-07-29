package o;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: o.a00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680a00 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((UZ) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
