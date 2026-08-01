package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0275a h;

    public b(k kVar) {
        int i = kVar.f3335c;
        b(i);
        if (this.f3335c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3333a, 0, this.f3333a, 0, i);
            System.arraycopy(kVar.f3334b, 0, this.f3334b, 0, i << 1);
            this.f3335c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0275a(0, this);
        }
        C0275a c0275a = this.h;
        if (c0275a.f3299a == null) {
            c0275a.f3299a = new h(c0275a, 0);
        }
        return c0275a.f3299a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0275a(0, this);
        }
        C0275a c0275a = this.h;
        if (c0275a.f3300b == null) {
            c0275a.f3300b = new h(c0275a, 1);
        }
        return c0275a.f3300b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3335c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0275a(0, this);
        }
        C0275a c0275a = this.h;
        if (c0275a.f3301c == null) {
            c0275a.f3301c = new j(c0275a);
        }
        return c0275a.f3301c;
    }
}
