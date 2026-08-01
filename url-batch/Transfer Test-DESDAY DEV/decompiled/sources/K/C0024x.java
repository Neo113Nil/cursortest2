package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: K.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024x implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f459a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Iterator f460b;

    public C0024x(X x2) {
        this.f460b = x2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f460b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f460b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        X x2 = viewGroup != null ? new X(viewGroup) : null;
        ArrayList arrayList = this.f459a;
        if (x2 == null || !x2.hasNext()) {
            while (!this.f460b.hasNext() && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                this.f460b = (Iterator) arrayList.get(V0.f.Z(arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(V0.f.Z(arrayList));
            }
        } else {
            arrayList.add(this.f460b);
            this.f460b = x2;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
