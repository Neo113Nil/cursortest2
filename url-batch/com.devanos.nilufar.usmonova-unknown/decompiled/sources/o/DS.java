package o;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class DS {
    public final P2 a;
    public boolean c;
    public C1932t2 g;
    public CS h;
    public final AtomicReference b = new AtomicReference(null);
    public final C1861s d = new C1861s(6, this);
    public final C2084vL e = new C2084vL(8, this);
    public final YD f = new YD(new CS[16]);
    public long i = -1;

    public DS(P2 p2) {
        this.a = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(DS ds) {
        boolean z;
        Set set;
        Set set2;
        synchronized (ds.f) {
            z = ds.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = ds.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                r4 = null;
                List list = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        EB.i("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set2 = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
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
            synchronized (ds.f) {
                YD yd = ds.f;
                int i = yd.j;
                if (i > 0) {
                    Object[] objArr = yd.h;
                    int i2 = 0;
                    do {
                        z2 = ((CS) objArr[i2]).b(set) || z2;
                        i2++;
                    } while (i2 < i);
                }
            }
        }
    }
}
