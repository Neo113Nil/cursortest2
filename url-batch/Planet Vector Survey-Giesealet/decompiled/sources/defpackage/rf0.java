package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rf0 extends e0 implements Set, Collection, j00 {
    public static final rf0 g;
    public final Object d;
    public final Object e;
    public final hf0 f;

    static {
        b2 b2Var = b2.z;
        g = new rf0(b2Var, b2Var, hf0.f);
    }

    public rf0(Object obj, Object obj2, hf0 hf0Var) {
        this.d = obj;
        this.e = obj2;
        this.f = hf0Var;
    }

    @Override // defpackage.i
    public final int a() {
        return this.f.e;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dv(this.d, this.f);
    }
}
