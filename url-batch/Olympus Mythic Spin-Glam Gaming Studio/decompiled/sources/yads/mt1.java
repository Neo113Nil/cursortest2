package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;

/* loaded from: classes13.dex */
public final class mt1 implements lo2 {
    public static final Object e = new Object();
    public final cg a;
    public final boolean b;
    public final Executor c;
    public final Lazy d;

    public mt1(cg cgVar, Lazy lazy, boolean z) {
        mg1 mg1Var;
        mg1 mg1Var2 = mg1.e;
        if (mg1Var2 == null) {
            synchronized (mg1.d) {
                mg1Var = mg1.e;
                if (mg1Var == null) {
                    mg1Var = new mg1();
                    mg1.e = mg1Var;
                }
            }
            mg1Var2 = mg1Var;
        }
        Executor a = mg1Var2.a();
        this.a = cgVar;
        this.b = z;
        this.c = a;
        this.d = lazy;
    }

    public static final void a(mt1 mt1Var, ho2 ho2Var) {
        try {
            hc3.a((tt3) mt1Var.d.getValue(), ho2Var);
            a(ho2Var.a, ho2Var.b);
            cg cgVar = mt1Var.a;
            if (cgVar.a.a()) {
                try {
                    ac0 ac0Var = (ac0) cgVar.b.getValue();
                    ac0Var.a.reportEvent(ho2Var.a, ho2Var.b);
                } catch (Throwable unused) {
                    boolean z = ob1.a;
                }
            }
        } catch (Throwable unused2) {
            boolean z2 = ob1.a;
        }
    }

    public final void b(final Throwable th) {
        if (this.a != null) {
            this.c.execute(new Runnable() { // from class: yads.mt1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    mt1.a(mt1.this, th);
                }
            });
        } else {
            boolean z = ob1.a;
        }
    }

    @Override // yads.lo2
    public final void reportError(final String str, final Throwable th) {
        if (this.b) {
            if (this.a != null) {
                this.c.execute(new Runnable() { // from class: yads.mt1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mt1.a(mt1.this, str, th);
                    }
                });
            } else {
                boolean z = ob1.a;
            }
        }
    }

    public final void b(final Map map) {
        if (this.a != null) {
            this.c.execute(new Runnable() { // from class: yads.mt1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    mt1.a(mt1.this, map);
                }
            });
        } else {
            boolean z = ob1.a;
        }
    }

    public final void a(final ho2 ho2Var) {
        if (this.a != null) {
            this.c.execute(new Runnable() { // from class: yads.mt1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    mt1.a(mt1.this, ho2Var);
                }
            });
        } else {
            boolean z = ob1.a;
        }
    }

    public static final void a(mt1 mt1Var, Throwable th) {
        try {
            mt1Var.getClass();
            a(th);
            cg cgVar = mt1Var.a;
            if (cgVar.a.a()) {
                try {
                    ((ac0) cgVar.b.getValue()).a.reportUnhandledException(th);
                } catch (Throwable unused) {
                    boolean z = ob1.a;
                }
            }
        } catch (Throwable unused2) {
            boolean z2 = ob1.a;
        }
    }

    public static final void a(mt1 mt1Var, String str, Throwable th) {
        try {
            mt1Var.getClass();
            a(str, th);
            mt1Var.a.reportError(str, th);
        } catch (Throwable unused) {
            boolean z = ob1.a;
        }
    }

    public static final void a(mt1 mt1Var, Map map) {
        try {
            mt1Var.getClass();
            a(map);
            cg cgVar = mt1Var.a;
            if (cgVar.a.a()) {
                try {
                    ((ac0) cgVar.b.getValue()).a.reportAnr(map);
                } catch (Throwable unused) {
                    boolean z = ob1.a;
                }
            }
        } catch (Throwable unused2) {
            boolean z2 = ob1.a;
        }
    }

    public static void a(Throwable th) {
        Objects.toString(th);
        boolean z = ob1.a;
    }

    public static void a(String str, Throwable th) {
        Objects.toString(th);
        boolean z = ob1.a;
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ArraysKt.contentDeepToString(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        boolean z = ob1.a;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ArraysKt.toList((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        boolean z = ob1.a;
    }
}
