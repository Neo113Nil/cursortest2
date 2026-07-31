package io.ktor.http.cio.internals;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tokenizer.kt */
/* loaded from: classes5.dex */
public abstract class TokenizerKt {
    public static final int skipSpacesAndHorizontalTabs(CharArrayBuilder text, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        while (i < i2) {
            char charAt = text.charAt(i);
            if (!kotlin.text.CharsKt.isWhitespace(charAt) && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }
}
