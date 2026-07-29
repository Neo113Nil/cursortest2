package o;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.fS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038fS extends AbstractMap {
    public static final /* synthetic */ int m = 0;
    public final int h;
    public List i = Collections.EMPTY_LIST;
    public Map j = Collections.EMPTY_MAP;
    public boolean k;
    public volatile E6 l;

    public C1038fS(int i) {
        this.h = i;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.i.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C1236iS) this.i.get(i2)).h);
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
            int compareTo2 = comparable.compareTo(((C1236iS) this.i.get(i4)).h);
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

    public final Iterable c() {
        return this.j.isEmpty() ? AbstractC0022At.k : this.j.entrySet();
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

    public final SortedMap d() {
        b();
        if (this.j.isEmpty() && !(this.j instanceof TreeMap)) {
            this.j = new TreeMap();
        }
        return (SortedMap) this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((C1236iS) this.i.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.i.isEmpty();
        int i = this.h;
        if (isEmpty && !(this.i instanceof ArrayList)) {
            this.i = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return d().put(comparable, obj);
        }
        if (this.i.size() == i) {
            C1236iS c1236iS = (C1236iS) this.i.remove(i - 1);
            d().put(c1236iS.h, c1236iS.i);
        }
        this.i.add(i2, new C1236iS(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.l == null) {
            this.l = new E6(this, 1);
        }
        return this.l;
    }

    public final Object f(int i) {
        b();
        Object obj = ((C1236iS) this.i.remove(i)).i;
        if (!this.j.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.i;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1236iS(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((C1236iS) this.i.get(a)).i : this.j.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return f(a);
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
