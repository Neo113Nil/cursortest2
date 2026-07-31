package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CommentLexers.kt */
/* loaded from: classes4.dex */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(InternalJsonReader reader, char[] buffer) {
        super(reader, buffer);
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            this.currentPosition = -1;
            unexpectedToken(c);
        }
        char charAt = source.charAt(skipWhitespaces);
        this.currentPosition = skipWhitespaces + 1;
        if (charAt == c) {
            return;
        }
        unexpectedToken(c);
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    private final Pair handleComment(int i) {
        int i2 = i + 2;
        char charAt = getSource().charAt(i + 1);
        if (charAt != '*') {
            if (charAt == '/') {
                int i3 = i2;
                while (i != -1) {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) getSource(), '\n', i3, false, 4, (Object) null);
                    if (indexOf$default == -1) {
                        i3 = prefetchOrEof(getSource().length());
                        i = i3;
                    } else {
                        return TuplesKt.to(Integer.valueOf(indexOf$default + 1), Boolean.TRUE);
                    }
                }
                return TuplesKt.to(-1, Boolean.TRUE);
            }
            return TuplesKt.to(Integer.valueOf(i), Boolean.FALSE);
        }
        boolean z = false;
        int i4 = i2;
        while (i != -1) {
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) getSource(), "*/", i4, false, 4, (Object) null);
            if (indexOf$default2 != -1) {
                return TuplesKt.to(Integer.valueOf(indexOf$default2 + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) != '*') {
                i4 = prefetchOrEof(getSource().length());
            } else {
                i4 = prefetchWithinThreshold(getSource().length() - 1);
                if (z) {
                    break;
                }
                z = true;
            }
            i = i4;
        }
        this.currentPosition = getSource().length();
        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int prefetchWithinThreshold(int i) {
        if (getSource().length() - i > this.threshold) {
            return i;
        }
        this.currentPosition = i;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int prefetchOrEof;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = getSource().charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt != '/' || prefetchOrEof + 1 >= getSource().length()) {
                        break;
                    }
                    Pair handleComment = handleComment(prefetchOrEof);
                    int intValue = ((Number) handleComment.component1()).intValue();
                    if (!((Boolean) handleComment.component2()).booleanValue()) {
                        prefetchOrEof = intValue;
                        break;
                    }
                    i = intValue;
                } else {
                    i = prefetchOrEof + 1;
                }
            } else {
                break;
            }
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }
}
