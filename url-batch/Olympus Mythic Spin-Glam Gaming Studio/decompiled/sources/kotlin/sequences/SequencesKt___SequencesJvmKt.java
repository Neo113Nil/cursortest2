package kotlin.sequences;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _SequencesJvm.kt */
/* loaded from: classes15.dex */
public abstract class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    public static Sequence filterIsInstance(Sequence sequence, final Class klass) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Sequence filter = SequencesKt.filter(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean isInstance;
                isInstance = klass.isInstance(obj);
                return Boolean.valueOf(isInstance);
            }
        });
        Intrinsics.checkNotNull(filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return filter;
    }
}
