package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ReadWrite.kt */
/* loaded from: classes4.dex */
public final class LinesSequence$iterator$1 implements Iterator, KMappedMarker {
    private boolean done;
    private String nextValue;
    final /* synthetic */ LinesSequence this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    LinesSequence$iterator$1(LinesSequence linesSequence) {
        this.this$0 = linesSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        BufferedReader bufferedReader;
        if (this.nextValue == null && !this.done) {
            bufferedReader = this.this$0.reader;
            String readLine = bufferedReader.readLine();
            this.nextValue = readLine;
            if (readLine == null) {
                this.done = true;
            }
        }
        return this.nextValue != null;
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.nextValue;
        this.nextValue = null;
        Intrinsics.checkNotNull(str);
        return str;
    }
}
