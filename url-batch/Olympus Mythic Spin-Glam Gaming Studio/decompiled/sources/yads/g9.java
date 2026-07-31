package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class g9 {
    public final fc2 a;
    public final ArrayList b;
    public final HashMap c;
    public final String d;
    public final h9 e;

    public g9(fc2 fc2Var, String str, List list) {
        h9 h9Var = h9.d;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new HashMap();
        this.a = fc2Var;
        this.d = str;
        this.e = h9Var;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xd3 xd3Var = (xd3) it.next();
            this.c.put(UUID.randomUUID().toString(), xd3Var);
        }
    }
}
