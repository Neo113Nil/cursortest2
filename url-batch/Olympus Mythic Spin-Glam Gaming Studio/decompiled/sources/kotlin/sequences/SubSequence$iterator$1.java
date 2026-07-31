package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class SubSequence$iterator$1 implements Iterator, KMappedMarker {
    private final Iterator iterator;
    private int position;
    final /* synthetic */ SubSequence this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    SubSequence$iterator$1(SubSequence subSequence) {
        Sequence sequence;
        this.this$0 = subSequence;
        sequence = subSequence.sequence;
        this.iterator = sequence.iterator();
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drop() {
        int i;
        while (r0 < i && this.iterator.hasNext()) {
            this.iterator.next();
            this.position++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        drop();
        int i2 = this.position;
        i = this.this$0.endIndex;
        return i2 < i && this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        drop();
        int i2 = this.position;
        i = this.this$0.endIndex;
        if (i2 >= i) {
            throw new NoSuchElementException();
        }
        this.position++;
        return this.iterator.next();
    }
}
