package yads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class wm2 extends q41 {
    public final transient o41 d;
    public final transient Object[] e;
    public final transient int f;

    public wm2(o41 o41Var, Object[] objArr, int i) {
        this.d = o41Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // yads.f41
    public final int a(int i, Object[] objArr) {
        return a().a(i, objArr);
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // yads.f41
    public final boolean e() {
        return true;
    }

    @Override // yads.q41
    public final l41 f() {
        return new vm2(this);
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final wa3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
