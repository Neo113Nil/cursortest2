package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Sequences.kt */
/* loaded from: classes13.dex */
public final class FlatteningSequence$iterator$1 implements Iterator, KMappedMarker {
    private Iterator itemIterator;
    private final Iterator iterator;
    private int state;
    final /* synthetic */ FlatteningSequence this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    FlatteningSequence$iterator$1(FlatteningSequence flatteningSequence) {
        Sequence sequence;
        this.this$0 = flatteningSequence;
        sequence = flatteningSequence.sequence;
        this.iterator = sequence.iterator();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.state;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !ensureItemIterator()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        Iterator it = this.itemIterator;
        Intrinsics.checkNotNull(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.state;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return ensureItemIterator();
    }

    private final boolean ensureItemIterator() {
        Function1 function1;
        Function1 function12;
        Iterator it = this.itemIterator;
        if (it != null && it.hasNext()) {
            this.state = 1;
            return true;
        }
        while (this.iterator.hasNext()) {
            Object next = this.iterator.next();
            function1 = this.this$0.iterator;
            function12 = this.this$0.transformer;
            Iterator it2 = (Iterator) function1.invoke(function12.invoke(next));
            if (it2.hasNext()) {
                this.itemIterator = it2;
                this.state = 1;
                return true;
            }
        }
        this.state = 2;
        this.itemIterator = null;
        return false;
    }
}
