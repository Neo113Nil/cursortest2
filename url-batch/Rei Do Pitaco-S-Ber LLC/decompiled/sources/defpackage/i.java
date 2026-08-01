package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class i implements Iterator, vo {
    public final /* synthetic */ int f;
    public int g;
    public final Object h;

    public i(cg cgVar) {
        this.f = 2;
        this.h = cgVar.a.iterator();
        this.g = cgVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return this.g < ((l) obj).a();
            case 1:
                return this.g < ((Object[]) obj).length;
            case 2:
                Iterator it = (Iterator) obj;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.hasNext();
            default:
                return this.g < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.g;
                this.g = i2 + 1;
                return ((l) obj).get(i2);
            case 1:
                try {
                    int i3 = this.g;
                    this.g = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.g--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                Iterator it = (Iterator) obj;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.next();
            default:
                int i4 = this.g;
                this.g = i4 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.h;
                int i = this.g - 1;
                this.g = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public i(Object[] objArr) {
        this.f = 1;
        objArr.getClass();
        this.h = objArr;
    }

    public /* synthetic */ i(int i, Object obj) {
        this.f = i;
        this.h = obj;
    }
}
