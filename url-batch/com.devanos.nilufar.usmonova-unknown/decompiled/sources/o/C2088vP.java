package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.vP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2088vP implements Iterable {
    public C1890sP h;
    public C1890sP i;
    public final WeakHashMap j = new WeakHashMap();
    public int k = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C1824rP) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C2088vP)) {
            return false;
        }
        C2088vP c2088vP = (C2088vP) obj;
        if (this.k != c2088vP.k) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2088vP.iterator();
        while (true) {
            C1824rP c1824rP = (C1824rP) it;
            if (!c1824rP.hasNext()) {
                break;
            }
            C1824rP c1824rP2 = (C1824rP) it2;
            if (!c1824rP2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1824rP.next();
            Object next = c1824rP2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1824rP c1824rP = (C1824rP) it;
            if (!c1824rP.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c1824rP.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1824rP c1824rP = new C1824rP(this.h, this.i, 0);
        this.j.put(c1824rP, Boolean.FALSE);
        return c1824rP;
    }

    public C1890sP j(Object obj) {
        C1890sP c1890sP = this.h;
        while (c1890sP != null && !c1890sP.h.equals(obj)) {
            c1890sP = c1890sP.j;
        }
        return c1890sP;
    }

    public Object k(Object obj) {
        C1890sP j = j(obj);
        if (j == null) {
            return null;
        }
        this.k--;
        WeakHashMap weakHashMap = this.j;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2022uP) it.next()).a(j);
            }
        }
        C1890sP c1890sP = j.k;
        if (c1890sP != null) {
            c1890sP.j = j.j;
        } else {
            this.h = j.j;
        }
        C1890sP c1890sP2 = j.j;
        if (c1890sP2 != null) {
            c1890sP2.k = c1890sP;
        } else {
            this.i = c1890sP;
        }
        j.j = null;
        j.k = null;
        return j.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1824rP c1824rP = (C1824rP) it;
            if (!c1824rP.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1824rP.next()).toString());
            if (c1824rP.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
