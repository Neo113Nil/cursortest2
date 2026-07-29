package o;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.oS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630oS extends AbstractSet {
    public static final /* synthetic */ int j = 0;
    public Object h;
    public int i;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i = this.i;
        if (i == 0) {
            this.h = obj;
        } else if (i == 1) {
            if (AbstractC0048Bt.h(this.h, obj)) {
                return false;
            }
            this.h = new Object[]{this.h, obj};
        } else if (i < 5) {
            Object obj2 = this.h;
            AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (P6.Y(obj, objArr2)) {
                return false;
            }
            int i2 = this.i;
            if (i2 == 4) {
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                AbstractC0048Bt.n(copyOf, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(EB.E(copyOf.length));
                P6.s0(copyOf, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] copyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
                copyOf2[copyOf2.length - 1] = obj;
                objArr = copyOf2;
            }
            this.h = objArr;
        } else {
            Object obj3 = this.h;
            AbstractC0048Bt.l(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!AbstractC1305jX.g(obj3).add(obj)) {
                return false;
            }
        }
        this.i++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.h = null;
        this.i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.i;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return AbstractC0048Bt.h(this.h, obj);
        }
        if (i < 5) {
            Object obj2 = this.h;
            AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return P6.Y(obj, (Object[]) obj2);
        }
        Object obj3 = this.h;
        AbstractC0048Bt.l(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.i;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new RQ(1, this.h);
        }
        if (i < 5) {
            Object obj = this.h;
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new RH((Object[]) obj);
        }
        Object obj2 = this.h;
        AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return AbstractC1305jX.g(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }
}
