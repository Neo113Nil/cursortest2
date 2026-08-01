package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n40 {
    public final int a;
    public final p01 b;
    public final y7 c;
    public int d;
    public int e;
    public int f;

    public n40(int i) {
        this.a = i;
        if (i <= 0) {
            g8.r("maxSize <= 0");
            throw null;
        }
        this.b = new p01(10);
        this.c = new y7(21);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            p01 p01Var = this.b;
            p01Var.getClass();
            Object obj2 = ((LinkedHashMap) p01Var.e).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            p01 p01Var = this.b;
            p01Var.getClass();
            put = ((LinkedHashMap) p01Var.e).put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        d(this.a);
        return put;
    }

    public final Object c(Object obj) {
        Object remove;
        synchronized (this.c) {
            p01 p01Var = this.b;
            p01Var.getClass();
            remove = ((LinkedHashMap) p01Var.e).remove(obj);
            if (remove != null) {
                this.d--;
            }
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.e).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || ((LinkedHashMap) this.b.e).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.b.e).entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry == null) {
                        return;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    p01 p01Var = this.b;
                    p01Var.getClass();
                    key.getClass();
                    ((LinkedHashMap) p01Var.e).remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
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
