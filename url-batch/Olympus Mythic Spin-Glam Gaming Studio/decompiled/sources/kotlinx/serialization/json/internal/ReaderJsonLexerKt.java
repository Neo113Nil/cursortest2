package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* compiled from: ReaderJsonLexer.kt */
/* loaded from: classes4.dex */
public abstract class ReaderJsonLexerKt {
    public static /* synthetic */ ReaderJsonLexer ReaderJsonLexer$default(Json json, InternalJsonReader internalJsonReader, char[] cArr, int i, Object obj) {
        if ((i & 4) != 0) {
            cArr = CharArrayPoolBatchSize.INSTANCE.take();
        }
        return ReaderJsonLexer(json, internalJsonReader, cArr);
    }

    public static final ReaderJsonLexer ReaderJsonLexer(Json json, InternalJsonReader reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : new ReaderJsonLexerWithComments(reader, buffer);
    }
}
