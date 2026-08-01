package K;

import android.view.View;
import android.view.ViewGroup;
import j1.InterfaceC0183a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: K.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030x implements Iterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f722a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f723b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f724c;

    public C0030x(X x2) {
        this.f722a = 0;
        this.f724c = new ArrayList();
        this.f723b = x2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f722a) {
        }
        return this.f723b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f722a) {
            case 0:
                Object next = this.f723b.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                X x2 = viewGroup != null ? new X(0, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.f724c;
                if (x2 == null || !x2.hasNext()) {
                    while (!this.f723b.hasNext() && !arrayList.isEmpty()) {
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        this.f723b = (Iterator) arrayList.get(W0.k.r0(arrayList));
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(W0.k.r0(arrayList));
                    }
                } else {
                    arrayList.add(this.f723b);
                    this.f723b = x2;
                }
                return next;
            default:
                return ((o1.j) this.f724c).f3714b.g(this.f723b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f722a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0030x(o1.j jVar) {
        this.f722a = 1;
        this.f724c = jVar;
        this.f723b = new p1.b(jVar.f3713a);
    }
}
