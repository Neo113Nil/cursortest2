package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0280a h;

    public b(k kVar) {
        int i = kVar.f3331c;
        b(i);
        if (this.f3331c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3329a, 0, this.f3329a, 0, i);
            System.arraycopy(kVar.f3330b, 0, this.f3330b, 0, i << 1);
            this.f3331c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3295a == null) {
            c0280a.f3295a = new h(c0280a, 0);
        }
        return c0280a.f3295a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3296b == null) {
            c0280a.f3296b = new h(c0280a, 1);
        }
        return c0280a.f3296b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3331c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3297c == null) {
            c0280a.f3297c = new j(c0280a);
        }
        return c0280a.f3297c;
    }
}
