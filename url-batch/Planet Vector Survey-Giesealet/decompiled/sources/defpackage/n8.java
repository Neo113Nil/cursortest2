package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n8 extends dr0 implements Map {
    public i8 g;
    public k8 h;
    public m8 i;

    @Override // java.util.Map
    public final Set entrySet() {
        i8 i8Var = this.g;
        if (i8Var != null) {
            return i8Var;
        }
        i8 i8Var2 = new i8(this);
        this.g = i8Var2;
        return i8Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k8 k8Var = this.h;
        if (k8Var != null) {
            return k8Var;
        }
        k8 k8Var2 = new k8(this);
        this.h = k8Var2;
        return k8Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        if (iArr.length < size) {
            this.d = Arrays.copyOf(iArr, size);
            this.e = Arrays.copyOf(this.e, size * 2);
        }
        if (this.f != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        m8 m8Var = this.i;
        if (m8Var != null) {
            return m8Var;
        }
        m8 m8Var2 = new m8(this);
        this.i = m8Var2;
        return m8Var2;
    }
}
