package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class px extends AbstractSet {
    public final /* synthetic */ ux b;

    public px(ux uxVar) {
        this.b = uxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map a = this.b.a();
        if (a != null) {
            return a.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int a2 = this.b.a(entry.getKey());
        return a2 != -1 && x92.a(this.b.b(a2), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ux uxVar = this.b;
        Map a = uxVar.a();
        return a != null ? a.entrySet().iterator() : new nx(uxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map a = this.b.a();
        if (a != null) {
            return a.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.b.b()) {
            return false;
        }
        int i = (1 << (this.b.f & 31)) - 1;
        int a2 = vx.a(entry.getKey(), entry.getValue(), i, this.b.e(), this.b.c(), this.b.d(), this.b.f());
        if (a2 == -1) {
            return false;
        }
        this.b.a(a2, i);
        ux uxVar = this.b;
        uxVar.g--;
        uxVar.f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
