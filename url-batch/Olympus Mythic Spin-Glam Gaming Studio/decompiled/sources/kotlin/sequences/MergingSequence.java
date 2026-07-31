package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class MergingSequence implements Sequence {
    private final Sequence sequence1;
    private final Sequence sequence2;
    private final Function2 transform;

    public MergingSequence(Sequence sequence1, Sequence sequence2, Function2 transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new MergingSequence$iterator$1(this);
    }
}
