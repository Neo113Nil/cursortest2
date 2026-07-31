package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes4.dex */
public final class pe0 {
    public static final i53 h = new i53() { // from class: yads.pe0$$ExternalSyntheticLambda0
        @Override // yads.i53
        public final Object get() {
            return pe0.a();
        }
    };
    public static final Random i = new Random();
    public dm1 e;
    public String g;
    public final i53 d = h;
    public final f73 a = new f73();
    public final d73 b = new d73();
    public final HashMap c = new HashMap();
    public g73 f = g73.b;

    public final synchronized void a(qd qdVar, int i2) {
        try {
            this.e.getClass();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                oe0 oe0Var = (oe0) it.next();
                if (oe0Var.a(qdVar)) {
                    it.remove();
                    if (oe0Var.e) {
                        if (oe0Var.a.equals(this.g)) {
                            this.g = null;
                        }
                        this.e.b(qdVar, oe0Var.a);
                    }
                }
            }
            b(qdVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(qd qdVar) {
        pm1 pm1Var;
        if (qdVar.b.c()) {
            this.g = null;
            return;
        }
        oe0 oe0Var = (oe0) this.c.get(this.g);
        this.g = a(qdVar.c, qdVar.d).a;
        c(qdVar);
        pm1 pm1Var2 = qdVar.d;
        if (pm1Var2 == null || !pm1Var2.a()) {
            return;
        }
        if (oe0Var != null) {
            long j = oe0Var.c;
            pm1 pm1Var3 = qdVar.d;
            if (j == pm1Var3.d && (pm1Var = oe0Var.d) != null && pm1Var.b == pm1Var3.b && pm1Var.c == pm1Var3.c) {
                return;
            }
        }
        pm1 pm1Var4 = qdVar.d;
        a(qdVar.c, new pm1(pm1Var4.a, pm1Var4.d));
        this.e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(qd qdVar) {
        try {
            this.e.getClass();
        } finally {
        }
        if (qdVar.b.c()) {
            return;
        }
        oe0 oe0Var = (oe0) this.c.get(this.g);
        pm1 pm1Var = qdVar.d;
        if (pm1Var != null && oe0Var != null) {
            long j = oe0Var.c;
            if (j == -1) {
                if (oe0Var.b != qdVar.c) {
                    return;
                }
            }
        }
        oe0 a = a(qdVar.c, pm1Var);
        if (this.g == null) {
            this.g = a.a;
        }
        pm1 pm1Var2 = qdVar.d;
        if (pm1Var2 != null && pm1Var2.a()) {
            pm1 pm1Var3 = qdVar.d;
            oe0 a2 = a(qdVar.c, new pm1(pm1Var3.a, pm1Var3.d, pm1Var3.b));
            if (!a2.e) {
                a2.e = true;
                qdVar.b.a(qdVar.d.a, this.b);
                d73 d73Var = this.b;
                Math.max(0L, sb3.b(this.b.f) + sb3.b(d73Var.h.a(qdVar.d.b).b));
                this.e.getClass();
            }
        }
        if (!a.e) {
            a.e = true;
            this.e.getClass();
        }
        if (a.a.equals(this.g) && !a.f) {
            a.f = true;
            this.e.a(qdVar, a.a);
        }
    }

    public final synchronized void a(qd qdVar) {
        dm1 dm1Var;
        this.g = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            oe0 oe0Var = (oe0) it.next();
            it.remove();
            if (oe0Var.e && (dm1Var = this.e) != null) {
                dm1Var.b(qdVar, oe0Var.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oe0 a(int i2, pm1 pm1Var) {
        long j;
        oe0 oe0Var = null;
        long j2 = Long.MAX_VALUE;
        for (oe0 oe0Var2 : this.c.values()) {
            if (oe0Var2.c == -1 && i2 == oe0Var2.b && pm1Var != null) {
                oe0Var2.c = pm1Var.d;
            }
            if (pm1Var == null) {
                if (i2 == oe0Var2.b) {
                    j = oe0Var2.c;
                    if (j == -1 || j < j2) {
                        oe0Var = oe0Var2;
                        j2 = j;
                    } else if (j == j2) {
                        int i3 = sb3.a;
                        if (oe0Var.d != null && oe0Var2.d != null) {
                            oe0Var = oe0Var2;
                        }
                    }
                }
            } else {
                pm1 pm1Var2 = oe0Var2.d;
                if (pm1Var2 == null) {
                    if (!pm1Var.a() && pm1Var.d == oe0Var2.c) {
                        j = oe0Var2.c;
                        if (j == -1) {
                        }
                        oe0Var = oe0Var2;
                        j2 = j;
                    }
                } else if (pm1Var.d == pm1Var2.d && pm1Var.b == pm1Var2.b && pm1Var.c == pm1Var2.c) {
                    j = oe0Var2.c;
                    if (j == -1) {
                    }
                    oe0Var = oe0Var2;
                    j2 = j;
                }
            }
        }
        if (oe0Var != null) {
            return oe0Var;
        }
        String str = (String) this.d.get();
        oe0 oe0Var3 = new oe0(this, str, i2, pm1Var);
        this.c.put(str, oe0Var3);
        return oe0Var3;
    }

    public static String a() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
