package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class HH extends H {
    public C0218Ih h = new C0218Ih(10);
    public BW i;
    public Object j;
    public int k;
    public int l;
    public IH m;

    public HH(IH ih) {
        this.i = ih.h;
        this.l = ih.i;
        this.m = ih;
    }

    public final IH a() {
        BW bw = this.i;
        IH ih = this.m;
        if (bw != ih.h) {
            this.h = new C0218Ih(10);
            ih = new IH(this.i, size());
        }
        this.m = ih;
        return ih;
    }

    public final boolean b(Object obj) {
        return this.i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.i = BW.e;
        f(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1425lL) {
            return b((AbstractC1425lL) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof NY) {
            return super.containsValue((NY) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        return this.i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object e(Object obj) {
        this.j = null;
        BW n = this.i.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = BW.e;
        }
        this.i = n;
        return this.j;
    }

    public final void f(int i) {
        this.l = i;
        this.k++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1425lL) {
            return (NY) d((AbstractC1425lL) obj);
        }
        return null;
    }

    @Override // o.H
    public final Set getEntries() {
        return new QH(0, this);
    }

    @Override // o.H
    public final Set getKeys() {
        return new QH(1, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1425lL) ? obj2 : (NY) super.getOrDefault((AbstractC1425lL) obj, (NY) obj2);
    }

    @Override // o.H
    public final int getSize() {
        return this.l;
    }

    @Override // o.H
    public final Collection getValues() {
        return new C2272yB(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.j = null;
        this.i = this.i.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [o.NH] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        IH ih = null;
        IH ih2 = map instanceof NH ? (NH) map : null;
        if (ih2 == null) {
            HH hh = map instanceof HH ? (HH) map : null;
            if (hh != null) {
                ih = hh.a();
            }
        } else {
            ih = ih2;
        }
        if (ih == null) {
            super.putAll(map);
            return;
        }
        C1053fh c1053fh = new C1053fh();
        c1053fh.a = 0;
        int size = size();
        BW bw = this.i;
        BW bw2 = ih.h;
        AbstractC0048Bt.l(bw2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.i = bw.m(bw2, 0, c1053fh, this);
        int i = (ih.i + size) - c1053fh.a;
        if (size != i) {
            f(i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC1425lL) {
            return (NY) e((AbstractC1425lL) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        BW o2 = this.i.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o2 == null) {
            o2 = BW.e;
        }
        this.i = o2;
        return size != size();
    }
}
