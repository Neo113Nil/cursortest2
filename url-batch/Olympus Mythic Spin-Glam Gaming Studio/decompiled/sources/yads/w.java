package yads;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class w extends v implements ListIterator {
    public final /* synthetic */ x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(xVar);
        this.e = xVar;
    }

    public final ListIterator a() {
        this.d.b();
        if (this.d.c == this.c) {
            return (ListIterator) this.b;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.e.isEmpty();
        a().add(obj);
        x xVar = this.e;
        xVar.g.f++;
        if (isEmpty) {
            xVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, int i) {
        super(xVar, ((List) xVar.c).listIterator(i));
        this.e = xVar;
    }
}
