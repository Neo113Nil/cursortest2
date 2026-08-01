package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zq implements Iterable {
    public rm0 d;
    public rm0 e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;
    public final HashMap h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.qm0) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        if (this.g != zqVar.g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = zqVar.iterator();
        while (true) {
            qm0 qm0Var = (qm0) it;
            if (!qm0Var.hasNext()) {
                break;
            }
            qm0 qm0Var2 = (qm0) it2;
            if (!qm0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) qm0Var.next();
            Object next = qm0Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            qm0 qm0Var = (qm0) it;
            if (!qm0Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) qm0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qm0 qm0Var = new qm0(this.d, this.e, 0);
        this.f.put(qm0Var, Boolean.FALSE);
        return qm0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            qm0 qm0Var = (qm0) it;
            if (!qm0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) qm0Var.next()).toString());
            if (qm0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
