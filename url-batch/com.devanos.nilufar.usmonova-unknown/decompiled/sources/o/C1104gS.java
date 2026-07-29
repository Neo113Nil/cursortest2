package o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.gS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104gS extends AbstractMap {
    public static final /* synthetic */ int n = 0;
    public final int h;
    public List i = Collections.EMPTY_LIST;
    public Map j;
    public boolean k;
    public volatile E6 l;
    public Map m;

    public C1104gS(int i) {
        this.h = i;
        Map map = Collections.EMPTY_MAP;
        this.j = map;
        this.m = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.i.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C1300jS) this.i.get(i2)).h);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((C1300jS) this.i.get(i4)).h);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.k) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.i.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.i.isEmpty()) {
            this.i.clear();
        }
        if (this.j.isEmpty()) {
            return;
        }
        this.j.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.j.containsKey(comparable);
    }

    public final Iterable d() {
        return this.j.isEmpty() ? AbstractC0048Bt.g : this.j.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.j.isEmpty() && !(this.j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.j = treeMap;
            this.m = treeMap.descendingMap();
        }
        return (SortedMap) this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.l == null) {
            this.l = new E6(this, 2);
        }
        return this.l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1104gS)) {
            return super.equals(obj);
        }
        C1104gS c1104gS = (C1104gS) obj;
        int size = size();
        if (size == c1104gS.size()) {
            int size2 = this.i.size();
            if (size2 != c1104gS.i.size()) {
                return ((AbstractSet) entrySet()).equals(c1104gS.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(c1104gS.c(i))) {
                }
            }
            if (size2 != size) {
                return this.j.equals(c1104gS.j);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((C1300jS) this.i.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.i.isEmpty();
        int i = this.h;
        if (isEmpty && !(this.i instanceof ArrayList)) {
            this.i = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.i.size() == i) {
            C1300jS c1300jS = (C1300jS) this.i.remove(i - 1);
            e().put(c1300jS.h, c1300jS.i);
        }
        this.i.add(i2, new C1300jS(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((C1300jS) this.i.remove(i)).i;
        if (!this.j.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.i;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1300jS(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((C1300jS) this.i.get(a)).i : this.j.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C1300jS) this.i.get(i2)).hashCode();
        }
        return this.j.size() > 0 ? this.j.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
        }
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.j.size() + this.i.size();
    }
}
