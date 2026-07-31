package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CommentLexers.kt */
/* loaded from: classes14.dex */
public final class StringJsonLexerWithComments extends StringJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringJsonLexerWithComments(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c) {
        String source = getSource();
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

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int i;
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return i2;
        }
        String source = getSource();
        while (i2 < source.length()) {
            char charAt = source.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i = i2 + 1) >= source.length()) {
                    break;
                }
                char charAt2 = source.charAt(i);
                if (charAt2 == '*') {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) source, "*/", i2 + 2, false, 4, (Object) null);
                    if (indexOf$default == -1) {
                        this.currentPosition = source.length();
                        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i2 = indexOf$default + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i2 = StringsKt.indexOf$default((CharSequence) source, '\n', i2 + 2, false, 4, (Object) null);
                    if (i2 == -1) {
                        i2 = source.length();
                    }
                }
            }
            i2++;
        }
        this.currentPosition = i2;
        return i2;
    }
}
