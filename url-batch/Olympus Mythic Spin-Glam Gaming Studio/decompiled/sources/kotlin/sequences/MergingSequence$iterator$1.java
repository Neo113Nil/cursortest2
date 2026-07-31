package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class MergingSequence$iterator$1 implements Iterator, KMappedMarker {
    private final Iterator iterator1;
    private final Iterator iterator2;
    final /* synthetic */ MergingSequence this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    MergingSequence$iterator$1(MergingSequence mergingSequence) {
        Sequence sequence;
        Sequence sequence2;
        this.this$0 = mergingSequence;
        sequence = mergingSequence.sequence1;
        this.iterator1 = sequence.iterator();
        sequence2 = mergingSequence.sequence2;
        this.iterator2 = sequence2.iterator();
    }

    @Override // java.util.Iterator
    public Object next() {
        Function2 function2;
        function2 = this.this$0.transform;
        return function2.invoke(this.iterator1.next(), this.iterator2.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext();
    }
}
