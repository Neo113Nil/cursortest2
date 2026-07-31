package yads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class c6 implements s2 {
    public final long a;

    public c6(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((i6) it.next()).a;
        }
        this.a = j;
    }

    @Override // yads.s2
    public final long a() {
        return this.a;
    }

    @Override // yads.s2
    public final long a(long j) {
        return this.a;
    }
}
