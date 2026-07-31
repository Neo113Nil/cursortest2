package yads;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public abstract class y extends b0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map e;
    public transient int f;

    public y(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.e = map;
    }

    public final m b() {
        Map map = this.e;
        return map instanceof NavigableMap ? new q(this, (NavigableMap) this.e) : map instanceof SortedMap ? new t(this, (SortedMap) this.e) : new m(this, this.e);
    }

    public final p c() {
        Map map = this.e;
        return map instanceof NavigableMap ? new r(this, (NavigableMap) this.e) : map instanceof SortedMap ? new u(this, (SortedMap) this.e) : new p(this, this.e);
    }
}
