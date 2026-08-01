package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0297a h;

    public b(k kVar) {
        int i = kVar.f3612c;
        b(i);
        if (this.f3612c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3610a, 0, this.f3610a, 0, i);
            System.arraycopy(kVar.f3611b, 0, this.f3611b, 0, i << 1);
            this.f3612c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0297a(0, this);
        }
        C0297a c0297a = this.h;
        if (c0297a.f3576a == null) {
            c0297a.f3576a = new h(c0297a, 0);
        }
        return c0297a.f3576a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0297a(0, this);
        }
        C0297a c0297a = this.h;
        if (c0297a.f3577b == null) {
            c0297a.f3577b = new h(c0297a, 1);
        }
        return c0297a.f3577b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3612c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0297a(0, this);
        }
        C0297a c0297a = this.h;
        if (c0297a.f3578c == null) {
            c0297a.f3578c = new j(c0297a);
        }
        return c0297a.f3578c;
    }
}
