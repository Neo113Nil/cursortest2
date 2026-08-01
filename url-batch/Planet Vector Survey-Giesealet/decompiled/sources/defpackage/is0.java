package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class is0 {
    public final mu a;
    public boolean c;
    public bb0 h;
    public hs0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final sh d = new sh(6, this);
    public final h e = new h(9, this);
    public final l70 f = new l70(new hs0[16]);
    public final Object g = new Object();
    public long j = -1;

    public is0(mu muVar) {
        this.a = muVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        th.d("Unexpected notification");
                        throw new kf();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                l70 l70Var = this.f;
                Object[] objArr = l70Var.d;
                int i = l70Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((hs0) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public final void b(Object obj, mu muVar, bu buVar) {
        Object obj2;
        hs0 hs0Var;
        synchronized (this.g) {
            l70 l70Var = this.f;
            Object[] objArr = l70Var.d;
            int i = l70Var.f;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((hs0) obj2).a == muVar) {
                    break;
                } else {
                    i2++;
                }
            }
            hs0Var = (hs0) obj2;
            if (hs0Var == null) {
                muVar.getClass();
                px0.k(1, muVar);
                hs0Var = new hs0(muVar);
                l70Var.b(hs0Var);
            }
        }
        hs0 hs0Var2 = this.i;
        long j = this.j;
        if (j != -1 && j != rg0.j()) {
            gh0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + rg0.j() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = hs0Var;
            this.j = rg0.j();
            hs0Var.a(obj, this.e, buVar);
        } finally {
            this.i = hs0Var2;
            this.j = j;
        }
    }

    public final void c() {
        sh shVar = this.d;
        ur0.f(ur0.a);
        synchronized (ur0.c) {
            ur0.h = zd.k0(ur0.h, shVar);
        }
        this.h = new bb0(shVar);
    }
}
