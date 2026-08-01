package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lf0 extends u {
    public final /* synthetic */ int d;
    public final jf0 e;

    public /* synthetic */ lf0(int i, jf0 jf0Var) {
        this.d = i;
        this.e = jf0Var;
    }

    @Override // defpackage.u
    public final int a() {
        switch (this.d) {
        }
        return this.e.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.d) {
            case 0:
                this.e.clear();
                break;
            default:
                this.e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    jf0 jf0Var = this.e;
                    Object obj2 = jf0Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && jf0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                return new mf0(this.e);
            default:
                lx0[] lx0VarArr = new lx0[8];
                for (int i = 0; i < 8; i++) {
                    lx0VarArr[i] = new mx0(1);
                }
                return new nf0(this.e, lx0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.e.remove(entry.getKey(), entry.getValue());
            default:
                jf0 jf0Var = this.e;
                if (!jf0Var.containsKey(obj)) {
                    return false;
                }
                jf0Var.remove(obj);
                return true;
        }
    }
}
