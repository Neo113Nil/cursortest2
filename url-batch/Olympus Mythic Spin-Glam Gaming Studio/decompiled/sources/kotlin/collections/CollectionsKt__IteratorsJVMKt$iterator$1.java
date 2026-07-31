package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: IteratorsJVM.kt */
/* loaded from: classes3.dex */
public final class CollectionsKt__IteratorsJVMKt$iterator$1 implements Iterator, KMappedMarker {
    final /* synthetic */ Enumeration $this_iterator;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    CollectionsKt__IteratorsJVMKt$iterator$1(Enumeration enumeration) {
        this.$this_iterator = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$this_iterator.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.$this_iterator.nextElement();
    }
}
