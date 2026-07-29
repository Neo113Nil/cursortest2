package o;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.kS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366kS implements Iterator {
    public final /* synthetic */ int h;
    public int i = -1;
    public boolean j;
    public Iterator k;
    public final /* synthetic */ AbstractMap l;

    public /* synthetic */ C1366kS(AbstractMap abstractMap, int i) {
        this.h = i;
        this.l = abstractMap;
    }

    public final Iterator a() {
        switch (this.h) {
            case 0:
                if (this.k == null) {
                    this.k = ((C1038fS) this.l).j.entrySet().iterator();
                }
                break;
            default:
                if (this.k == null) {
                    this.k = ((C1104gS) this.l).j.entrySet().iterator();
                }
                break;
        }
        return this.k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i + 1 < ((C1038fS) this.l).i.size() || a().hasNext()) {
                }
                break;
            default:
                int i = this.i + 1;
                C1104gS c1104gS = (C1104gS) this.l;
                if (i >= c1104gS.i.size()) {
                    if (c1104gS.j.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                this.j = true;
                int i = this.i + 1;
                this.i = i;
                C1038fS c1038fS = (C1038fS) this.l;
                if (i >= c1038fS.i.size()) {
                    break;
                } else {
                    break;
                }
            default:
                this.j = true;
                int i2 = this.i + 1;
                this.i = i2;
                C1104gS c1104gS = (C1104gS) this.l;
                if (i2 >= c1104gS.i.size()) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.h;
        AbstractMap abstractMap = this.l;
        switch (i) {
            case 0:
                C1038fS c1038fS = (C1038fS) abstractMap;
                if (!this.j) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.j = false;
                int i2 = C1038fS.m;
                c1038fS.b();
                if (this.i >= c1038fS.i.size()) {
                    a().remove();
                    return;
                }
                int i3 = this.i;
                this.i = i3 - 1;
                c1038fS.f(i3);
                return;
            default:
                C1104gS c1104gS = (C1104gS) abstractMap;
                if (!this.j) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.j = false;
                int i4 = C1104gS.n;
                c1104gS.b();
                if (this.i >= c1104gS.i.size()) {
                    a().remove();
                    return;
                }
                int i5 = this.i;
                this.i = i5 - 1;
                c1104gS.g(i5);
                return;
        }
    }
}
