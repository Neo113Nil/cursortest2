package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5562o9 {
    public static final Map h;
    public static final C5562o9 i;
    public final Rd a;
    public final Lo b;
    public final R8 c;
    public final N9 d;
    public final InterfaceC5643rc e;
    public final InterfaceC5593pe f;
    public final InterfaceC5408ia g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Aa.FIRST_OCCURRENCE, 1);
        hashMap.put(Aa.NON_FIRST_OCCURENCE, 0);
        hashMap.put(Aa.UNKNOWN, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new C5562o9(new C5391hj(), new C5629qn(), new C5801xe(), new C5365gj(), new Ga(), new Ha(), new Fa());
    }

    public C5562o9(C5536n9 c5536n9) {
        this(c5536n9.a, c5536n9.b, c5536n9.c, c5536n9.d, c5536n9.e, c5536n9.f, c5536n9.g);
    }

    public final C5822y9 a(C5381h9 c5381h9, C5804xh c5804xh) {
        C5822y9 c5822y9 = new C5822y9();
        C5796x9 a = this.f.a(c5381h9.l, c5381h9.m);
        C5692t9 a2 = this.e.a(c5381h9.g);
        if (a != null) {
            c5822y9.g = a;
        }
        if (a2 != null) {
            c5822y9.f = a2;
        }
        String a3 = this.a.a(c5381h9.a);
        if (a3 != null) {
            c5822y9.d = a3;
        }
        c5822y9.e = this.b.a(c5381h9, c5804xh);
        String str = c5381h9.j;
        if (str != null) {
            c5822y9.h = str;
        }
        Integer a4 = this.d.a(c5381h9);
        if (a4 != null) {
            c5822y9.c = a4.intValue();
        }
        Long l = c5381h9.c;
        if (l != null) {
            c5822y9.a = l.longValue();
        }
        Long l2 = c5381h9.d;
        if (l2 != null) {
            c5822y9.n = l2.longValue();
        }
        Long l3 = c5381h9.e;
        if (l3 != null) {
            c5822y9.o = l3.longValue();
        }
        Long l4 = c5381h9.f;
        if (l4 != null) {
            c5822y9.b = l4.longValue();
        }
        Integer num = c5381h9.k;
        if (num != null) {
            c5822y9.i = num.intValue();
        }
        c5822y9.j = this.c.a(c5381h9.o);
        C5846z7 c5846z7 = c5381h9.g;
        c5822y9.k = c5846z7 != null ? new C5793x6().a(c5846z7.a) : -1;
        String str2 = c5381h9.n;
        if (str2 != null) {
            c5822y9.l = str2.getBytes();
        }
        Aa aa = c5381h9.p;
        Integer num2 = aa != null ? (Integer) h.get(aa) : null;
        if (num2 != null) {
            c5822y9.m = num2.intValue();
        }
        G9 g9 = c5381h9.q;
        if (g9 != null) {
            int ordinal = g9.ordinal();
            if (ordinal == 0) {
                c5822y9.p = 0;
            } else if (ordinal == 1) {
                c5822y9.p = 1;
            } else if (ordinal == 2) {
                c5822y9.p = 2;
            }
        }
        Boolean bool = c5381h9.r;
        if (bool != null) {
            c5822y9.q = bool.booleanValue();
        }
        if (c5381h9.s != null) {
            c5822y9.r = r6.intValue();
        }
        c5822y9.s = ((Fa) this.g).a(c5381h9.t);
        return c5822y9;
    }

    public C5562o9(Rd rd, Lo lo, R8 r8, N9 n9, InterfaceC5643rc interfaceC5643rc, InterfaceC5593pe interfaceC5593pe, InterfaceC5408ia interfaceC5408ia) {
        this.a = rd;
        this.b = lo;
        this.c = r8;
        this.d = n9;
        this.e = interfaceC5643rc;
        this.f = interfaceC5593pe;
        this.g = interfaceC5408ia;
    }

    public static C5536n9 a() {
        return new C5536n9(i);
    }
}
