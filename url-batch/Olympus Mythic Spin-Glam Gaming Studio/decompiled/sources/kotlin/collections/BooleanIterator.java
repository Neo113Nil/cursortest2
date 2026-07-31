package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes4.dex */
public abstract class BooleanIterator implements Iterator, KMappedMarker {
    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(nextBoolean());
    }
}
