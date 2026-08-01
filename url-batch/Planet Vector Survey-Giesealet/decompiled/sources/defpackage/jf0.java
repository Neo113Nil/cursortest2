package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class jf0 extends AbstractMap implements Map, l00 {
    public y7 d;
    public kx0 e;
    public Object f;
    public int g;
    public int h;

    public final void a(int i) {
        this.h = i;
        this.g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = kx0.e;
        a(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new lf0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new lf0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f = null;
        this.e = this.e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [hf0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        gf0 gf0Var = null;
        gf0 gf0Var2 = map instanceof hf0 ? (hf0) map : null;
        if (gf0Var2 == null) {
            jf0 jf0Var = map instanceof jf0 ? (jf0) map : null;
            if (jf0Var != null) {
                gf0Var = ((ff0) jf0Var).b();
            }
        } else {
            gf0Var = gf0Var2;
        }
        if (gf0Var == null) {
            super.putAll(map);
            return;
        }
        rl rlVar = new rl();
        rlVar.a = 0;
        int i = this.h;
        kx0 kx0Var = this.e;
        kx0 kx0Var2 = gf0Var.d;
        kx0Var2.getClass();
        this.e = kx0Var.m(kx0Var2, 0, rlVar, this);
        int i2 = (gf0Var.e + i) - rlVar.a;
        if (i != i2) {
            a(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.h;
        kx0 o = this.e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = kx0.e;
        }
        this.e = o;
        return i != this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new u40(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f = null;
        kx0 n = this.e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = kx0.e;
        }
        this.e = n;
        return this.f;
    }
}
