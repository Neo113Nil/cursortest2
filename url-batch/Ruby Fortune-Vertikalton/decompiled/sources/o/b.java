package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0279a h;

    public b(k kVar) {
        int i = kVar.f3347c;
        b(i);
        if (this.f3347c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3345a, 0, this.f3345a, 0, i);
            System.arraycopy(kVar.f3346b, 0, this.f3346b, 0, i << 1);
            this.f3347c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3311a == null) {
            c0279a.f3311a = new h(c0279a, 0);
        }
        return c0279a.f3311a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3312b == null) {
            c0279a.f3312b = new h(c0279a, 1);
        }
        return c0279a.f3312b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3347c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3313c == null) {
            c0279a.f3313c = new j(c0279a);
        }
        return c0279a.f3313c;
    }
}
