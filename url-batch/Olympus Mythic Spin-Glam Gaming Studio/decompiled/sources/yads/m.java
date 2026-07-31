package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class m extends ki1 {
    public final transient Map d;
    public final /* synthetic */ y e;

    public m(y yVar, Map map) {
        this.e = yVar;
        this.d = map;
    }

    public final g41 a(Map.Entry entry) {
        Object key = entry.getKey();
        y yVar = this.e;
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) yVar;
        iVar.getClass();
        List list = (List) collection;
        return new g41(key, list instanceof RandomAccess ? new s(iVar, key, list, null) : new x(iVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.d;
        y yVar = this.e;
        Map map2 = yVar.e;
        if (map != map2) {
            l lVar = new l(this);
            while (lVar.hasNext()) {
                lVar.next();
                lVar.remove();
            }
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        yVar.e.clear();
        yVar.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        i iVar = (i) this.e;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new s(iVar, obj, list, null) : new x(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        y yVar = this.e;
        p pVar = yVar.b;
        if (pVar != null) {
            return pVar;
        }
        p c = ((gy1) yVar).c();
        yVar.b = c;
        return c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return null;
        }
        List list = (List) ((gy1) this.e).g.get();
        list.addAll(collection);
        this.e.f -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.d.toString();
    }
}
