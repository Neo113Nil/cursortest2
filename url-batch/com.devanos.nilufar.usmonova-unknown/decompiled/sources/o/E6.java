package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class E6 extends AbstractSet {
    public final /* synthetic */ int h;
    public final /* synthetic */ Map i;

    public /* synthetic */ E6(Map map, int i) {
        this.h = i;
        this.i = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.h) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C1038fS) this.i).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C1104gS) this.i).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.h) {
            case 1:
                ((C1038fS) this.i).clear();
                break;
            case 2:
                ((C1104gS) this.i).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.h) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C1038fS) this.i).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C1104gS) this.i).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.h) {
            case 0:
                return new H6((K6) this.i);
            case 1:
                return new C1366kS((C1038fS) this.i, 0);
            default:
                return new C1366kS((C1104gS) this.i, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.h) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C1038fS) this.i).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C1104gS) this.i).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.h) {
            case 0:
                return ((K6) this.i).j;
            case 1:
                return ((C1038fS) this.i).size();
            default:
                return ((C1104gS) this.i).size();
        }
    }
}
