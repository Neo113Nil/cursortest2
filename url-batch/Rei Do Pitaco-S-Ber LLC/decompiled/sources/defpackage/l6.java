package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class l6 extends e20 implements Map {
    public g6 i;
    public i6 j;
    public k6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(e20 e20Var) {
        super(0);
        int i = e20Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(e20Var.f(i2), e20Var.i(i2));
            }
        } else if (i > 0) {
            o6.m0(0, 0, i, e20Var.f, this.f);
            o6.o0(e20Var.g, this.g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g6 g6Var = this.i;
        if (g6Var != null) {
            return g6Var;
        }
        g6 g6Var2 = new g6(this);
        this.i = g6Var2;
        return g6Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        i6 i6Var = this.j;
        if (i6Var != null) {
            return i6Var;
        }
        i6 i6Var2 = new i6(this);
        this.j = i6Var2;
        return i6Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        k6 k6Var = this.k;
        if (k6Var != null) {
            return k6Var;
        }
        k6 k6Var2 = new k6(this);
        this.k = k6Var2;
        return k6Var2;
    }
}
