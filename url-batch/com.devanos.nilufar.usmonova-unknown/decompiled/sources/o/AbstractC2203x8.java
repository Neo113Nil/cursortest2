package o;

import java.util.HashMap;

/* renamed from: o.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2203x8 {
    public static final HashMap a;

    static {
        a(true);
        a = a(false);
    }

    public static final HashMap a(boolean z) {
        HashMap hashMap = new HashMap(9);
        b(hashMap, z, C0460Rq.k);
        b(hashMap, z, C0460Rq.l);
        b(hashMap, z, C0460Rq.m);
        b(hashMap, z, C0460Rq.n);
        b(hashMap, z, C0460Rq.f100o);
        b(hashMap, z, C0460Rq.p);
        b(hashMap, z, C0460Rq.q);
        b(hashMap, z, C0460Rq.r);
        b(hashMap, z, C0460Rq.s);
        return hashMap;
    }

    public static final void b(HashMap hashMap, boolean z, C1150h8 c1150h8) {
        hashMap.put(c1150h8, new A8(c1150h8, z));
    }
}
