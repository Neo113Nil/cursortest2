package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: _Sequences.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements Function1 {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    SequencesKt___SequencesKt$flatMap$2() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Sequence p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.iterator();
    }
}
