package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class QH extends I {
    public final /* synthetic */ int h;
    public final HH i;

    public /* synthetic */ QH(int i, HH hh) {
        this.h = i;
        this.i = hh;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                HH hh = this.i;
                Object obj2 = hh.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && hh.containsKey(entry.getKey());
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new RH(this.i);
            default:
                CW[] cwArr = new CW[8];
                for (int i = 0; i < 8; i++) {
                    cwArr[i] = new DW(1);
                }
                return new SH(this.i, cwArr);
        }
    }

    @Override // o.I
    public final int j() {
        switch (this.h) {
        }
        return this.i.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.i.remove(entry.getKey(), entry.getValue());
            default:
                HH hh = this.i;
                if (!hh.containsKey(obj)) {
                    return false;
                }
                hh.remove(obj);
                return true;
        }
    }
}
