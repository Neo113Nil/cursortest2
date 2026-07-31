package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReversedViews.kt */
/* loaded from: classes12.dex */
class ReversedListReadOnly extends AbstractList {
    private final List delegate;

    public ReversedListReadOnly(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i);
        return list.get(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new ReversedListReadOnly$listIterator$1(this, i);
    }
}
