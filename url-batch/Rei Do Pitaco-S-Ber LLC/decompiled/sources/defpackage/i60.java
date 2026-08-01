package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i60 implements Iterator, vo {
    public final ArrayList f;
    public Iterator g;

    public i60(Iterator it) {
        it.getClass();
        this.f = new ArrayList();
        this.g = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.g.next();
        View view = (View) next;
        view.getClass();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        i iVar = viewGroup != null ? new i(3, viewGroup) : null;
        ArrayList arrayList = this.f;
        if (iVar != null && iVar.hasNext()) {
            arrayList.add(this.g);
            this.g = iVar;
            return next;
        }
        while (!this.g.hasNext() && !arrayList.isEmpty()) {
            this.g = (Iterator) ua.b0(arrayList);
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(arrayList.size() - 1);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
