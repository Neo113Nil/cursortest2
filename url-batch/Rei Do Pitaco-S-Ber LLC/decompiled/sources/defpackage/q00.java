package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class q00 implements Iterable {
    public n00 f;
    public n00 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public n00 a(Object obj) {
        n00 n00Var = this.f;
        while (n00Var != null && !n00Var.f.equals(obj)) {
            n00Var = n00Var.h;
        }
        return n00Var;
    }

    public Object b(Object obj) {
        n00 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((p00) it.next()).a(a);
            }
        }
        n00 n00Var = a.i;
        n00 n00Var2 = a.h;
        if (n00Var != null) {
            n00Var.h = n00Var2;
        } else {
            this.f = n00Var2;
        }
        n00 n00Var3 = a.h;
        if (n00Var3 != null) {
            n00Var3.i = n00Var;
        } else {
            this.g = n00Var;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.m00) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        if (this.i != q00Var.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = q00Var.iterator();
        while (true) {
            m00 m00Var = (m00) it;
            if (!m00Var.hasNext()) {
                break;
            }
            m00 m00Var2 = (m00) it2;
            if (!m00Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) m00Var.next();
            Object next = m00Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            m00 m00Var = (m00) it;
            if (!m00Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) m00Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m00 m00Var = new m00(this.f, this.g, 0);
        this.h.put(m00Var, Boolean.FALSE);
        return m00Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            m00 m00Var = (m00) it;
            if (!m00Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) m00Var.next()).toString());
            if (m00Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
