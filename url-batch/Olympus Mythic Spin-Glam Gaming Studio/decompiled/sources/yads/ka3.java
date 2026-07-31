package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes14.dex */
public final class ka3 implements c53 {
    public final ga3 b;
    public final long[] c;
    public final Map d;
    public final HashMap e;
    public final HashMap f;

    public ka3(ga3 ga3Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = ga3Var;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ga3Var.a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    @Override // yads.c53
    public final int a(long j) {
        int a = sb3.a(this.c, j, false);
        if (a < this.c.length) {
            return a;
        }
        return -1;
    }

    @Override // yads.c53
    public final List b(long j) {
        return this.b.a(j, this.d, this.e, this.f);
    }

    @Override // yads.c53
    public final int a() {
        return this.c.length;
    }

    @Override // yads.c53
    public final long a(int i) {
        return this.c[i];
    }
}
