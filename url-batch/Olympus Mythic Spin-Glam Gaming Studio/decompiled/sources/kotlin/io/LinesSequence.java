package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: ReadWrite.kt */
/* loaded from: classes4.dex */
final class LinesSequence implements Sequence {
    private final BufferedReader reader;

    public LinesSequence(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.reader = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new LinesSequence$iterator$1(this);
    }
}
