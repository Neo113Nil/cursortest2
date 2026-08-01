package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f378b;

    public X(ViewGroup viewGroup) {
        this.f378b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f377a < this.f378b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f377a;
        this.f377a = i + 1;
        View childAt = this.f378b.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f377a - 1;
        this.f377a = i;
        this.f378b.removeViewAt(i);
    }
}
