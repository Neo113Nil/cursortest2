package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* compiled from: StringJsonLexer.kt */
/* loaded from: classes14.dex */
public abstract class StringJsonLexerKt {
    public static final StringJsonLexer StringJsonLexer(Json json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        return !json.getConfiguration().getAllowComments() ? new StringJsonLexer(source) : new StringJsonLexerWithComments(source);
    }
}
