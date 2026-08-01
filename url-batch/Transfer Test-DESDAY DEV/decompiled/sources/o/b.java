package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0254a h;

    public b(k kVar) {
        int i = kVar.f3186c;
        b(i);
        if (this.f3186c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3184a, 0, this.f3184a, 0, i);
            System.arraycopy(kVar.f3185b, 0, this.f3185b, 0, i << 1);
            this.f3186c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0254a(0, this);
        }
        C0254a c0254a = this.h;
        if (c0254a.f3150a == null) {
            c0254a.f3150a = new h(c0254a, 0);
        }
        return c0254a.f3150a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0254a(0, this);
        }
        C0254a c0254a = this.h;
        if (c0254a.f3151b == null) {
            c0254a.f3151b = new h(c0254a, 1);
        }
        return c0254a.f3151b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3186c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0254a(0, this);
        }
        C0254a c0254a = this.h;
        if (c0254a.f3152c == null) {
            c0254a.f3152c = new j(c0254a);
        }
        return c0254a.f3152c;
    }
}
