package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReaderJsonLexer.kt */
/* loaded from: classes6.dex */
public class ReaderJsonLexer extends AbstractJsonLexer {
    private final char[] buffer;
    private final InternalJsonReader reader;
    private final ArrayAsSequence source;
    protected int threshold;

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String peekLeadingMatchingValue(String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    public ReaderJsonLexer(InternalJsonReader reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = 128;
        this.source = new ArrayAsSequence(buffer);
        preload(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public ArrayAsSequence getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = getSource().charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return isValidValueStart(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return false;
            }
        }
    }

    private final void preload(int i) {
        char[] buffer$kotlinx_serialization_json = getSource().getBuffer$kotlinx_serialization_json();
        if (i != 0) {
            int i2 = this.currentPosition;
            ArraysKt.copyInto(buffer$kotlinx_serialization_json, buffer$kotlinx_serialization_json, 0, i2, i2 + i);
        }
        int length = getSource().length();
        while (true) {
            if (i == length) {
                break;
            }
            int read = this.reader.read(buffer$kotlinx_serialization_json, i, length - i);
            if (read == -1) {
                getSource().trim(i);
                this.threshold = -1;
                break;
            }
            i += read;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int i) {
        if (i < getSource().length()) {
            return i;
        }
        this.currentPosition = i;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(prefetchOrEof));
                if (charToTokenClass != 3) {
                    this.currentPosition = i2;
                    return charToTokenClass;
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = i2;
                    if (charAt == c) {
                        return;
                    } else {
                        unexpectedToken(c);
                    }
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                unexpectedToken(c);
                return;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int prefetchOrEof;
        char charAt;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1 || !((charAt = getSource().charAt(prefetchOrEof)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = prefetchOrEof + 1;
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.currentPosition;
        int indexOf = indexOf('\"', i);
        if (indexOf == -1) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                return consumeString(getSource(), this.currentPosition, prefetchOrEof);
            }
            String str = AbstractJsonLexerKt.tokenDescription((byte) 1);
            int i2 = this.currentPosition;
            int i3 = i2 - 1;
            AbstractJsonLexer.fail$default(this, "Expected " + str + ", but had '" + ((i2 == getSource().length() || i3 < 0) ? "EOF" : String.valueOf(getSource().charAt(i3))) + "' instead", i3, null, 4, null);
            throw new KotlinNothingValueException();
        }
        for (int i4 = i; i4 < indexOf; i4++) {
            if (getSource().charAt(i4) == '\\') {
                return consumeString(getSource(), this.currentPosition, i4);
            }
        }
        this.currentPosition = indexOf + 1;
        return substring(i, indexOf);
    }

    public int indexOf(char c, int i) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (i < length) {
            if (source.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String substring(int i, int i2) {
        return getSource().substring(i, i2);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    protected void appendRange(int i, int i2) {
        StringBuilder escapedString = getEscapedString();
        escapedString.append(getSource().getBuffer$kotlinx_serialization_json(), i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(escapedString, "append(...)");
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }
}
