package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ID {
    public final LinkedHashMap a;
    public final Y6 b;

    public ID(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new Y6(z);
    }

    public final Map a() {
        C1619oH c1619oH;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int E = EB.E(AbstractC0786bc.d0(entrySet));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
                c1619oH = new C1619oH(key, copyOf);
            } else {
                c1619oH = new C1619oH(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c1619oH.h, c1619oH.i);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC0048Bt.m(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.b.a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(YI yi) {
        AbstractC0048Bt.n(yi, "key");
        Object obj = this.a.get(yi);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(YI yi, Object obj) {
        AbstractC0048Bt.n(yi, "key");
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(yi);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(AbstractC0720ac.M0((Set) obj));
            AbstractC0048Bt.m(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(yi, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(yi, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
            linkedHashMap.put(yi, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof ID) {
            ID id = (ID) obj;
            LinkedHashMap linkedHashMap = id.a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = id.a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = AbstractC0048Bt.h(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return AbstractC0720ac.t0(this.a.entrySet(), ",\n", "{\n", "\n}", C2316yt.w, 24);
    }

    public /* synthetic */ ID(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
