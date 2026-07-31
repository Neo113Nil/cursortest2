package yads;

import com.ironsource.B5;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public abstract class o41 implements Map, Serializable {
    public transient wm2 b;
    public transient xm2 c;
    public transient ym2 d;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        ym2 ym2Var = this.d;
        if (ym2Var == null) {
            zm2 zm2Var = (zm2) this;
            ym2 ym2Var2 = new ym2(zm2Var.f, 1, zm2Var.g);
            this.d = ym2Var2;
            ym2Var = ym2Var2;
        }
        return ym2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((q41) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return az2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((zm2) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xm2 xm2Var = this.c;
        if (xm2Var != null) {
            return xm2Var;
        }
        zm2 zm2Var = (zm2) this;
        xm2 xm2Var2 = new xm2(zm2Var, new ym2(zm2Var.f, 0, zm2Var.g));
        this.c = xm2Var2;
        return xm2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((zm2) this).g;
        dx.a(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        wa3 it = ((wm2) entrySet()).iterator();
        boolean z = true;
        while (true) {
            f fVar = (f) it;
            if (!fVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) fVar.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(B5.U);
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ym2 ym2Var = this.d;
        if (ym2Var != null) {
            return ym2Var;
        }
        zm2 zm2Var = (zm2) this;
        ym2 ym2Var2 = new ym2(zm2Var.f, 1, zm2Var.g);
        this.d = ym2Var2;
        return ym2Var2;
    }

    public Object writeReplace() {
        return new n41(this);
    }

    public static o41 a(HashMap hashMap) {
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        m41 m41Var = new m41(z ? entrySet.size() : 4);
        if (z) {
            m41Var.a(entrySet.size());
        }
        for (Map.Entry entry : entrySet) {
            m41Var.a(entry.getKey(), entry.getValue());
        }
        return zm2.a(m41Var.b, m41Var.a);
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q41 entrySet() {
        wm2 wm2Var = this.b;
        if (wm2Var != null) {
            return wm2Var;
        }
        zm2 zm2Var = (zm2) this;
        wm2 wm2Var2 = new wm2(zm2Var, zm2Var.f, zm2Var.g);
        this.b = wm2Var2;
        return wm2Var2;
    }
}
