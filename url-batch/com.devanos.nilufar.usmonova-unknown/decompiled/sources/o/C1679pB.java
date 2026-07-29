package o;

import java.util.Map;
import java.util.Set;

/* renamed from: o.pB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1679pB {
    public final int a;
    public final C1745qB b;
    public final C0218Ih c;
    public int d;
    public int e;
    public int f;

    public C1679pB(int i) {
        this.a = i;
        if (i <= 0) {
            AbstractC0773bP.l("maxSize <= 0");
            throw null;
        }
        this.b = new C1745qB(0);
        this.c = new C0218Ih(9);
    }

    public final Object a(Object obj) {
        AbstractC0048Bt.n(obj, "key");
        synchronized (this.c) {
            C1745qB c1745qB = this.b;
            c1745qB.getClass();
            Object obj2 = c1745qB.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        AbstractC0048Bt.n(obj, "key");
        synchronized (this.c) {
            this.d++;
            C1745qB c1745qB = this.b;
            c1745qB.getClass();
            put = c1745qB.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.b.a.entrySet();
                    AbstractC0048Bt.m(entrySet, "map.entries");
                    Map.Entry entry = (Map.Entry) AbstractC0720ac.o0(entrySet);
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C1745qB c1745qB2 = this.b;
                    c1745qB2.getClass();
                    AbstractC0048Bt.n(key, "key");
                    c1745qB2.a.remove(key);
                    int i2 = this.d;
                    AbstractC0048Bt.n(value, "value");
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
