package kotlinx.serialization.json.internal;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AbstractJsonLexer.kt */
/* loaded from: classes4.dex */
public abstract class AbstractJsonLexer {
    public int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    public abstract boolean canConsumeValue();

    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public abstract void consumeNextToken(char c);

    public void ensureHaveChars() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence getSource();

    protected final boolean isValidValueStart(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract String peekLeadingMatchingValue(String str, boolean z);

    public abstract int prefetchOrEof(int i);

    public abstract int skipWhitespaces();

    public final boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1 || source.charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    public final byte consumeNextToken(byte b) {
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == b) {
            return consumeNextToken;
        }
        String str = AbstractJsonLexerKt.tokenDescription(b);
        int i = this.currentPosition;
        int i2 = i - 1;
        fail$default(this, "Expected " + str + ", but had '" + ((i == getSource().length() || i2 < 0) ? "EOF" : String.valueOf(getSource().charAt(i2))) + "' instead", i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    protected final void unexpectedToken(char c) {
        int i = this.currentPosition;
        if (i > 0 && c == '\"') {
            try {
                this.currentPosition = i - 1;
                String consumeStringLenient = consumeStringLenient();
                this.currentPosition = i;
                if (Intrinsics.areEqual(consumeStringLenient, POBCommonConstants.NULL_VALUE)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.currentPosition = i;
                throw th;
            }
        }
        String str = AbstractJsonLexerKt.tokenDescription(AbstractJsonLexerKt.charToTokenClass(c));
        int i2 = this.currentPosition;
        int i3 = i2 - 1;
        fail$default(this, "Expected " + str + ", but had '" + ((i2 == getSource().length() || i3 < 0) ? "EOF" : String.valueOf(getSource().charAt(i3))) + "' instead", i3, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.currentPosition = prefetchOrEof;
                    return AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return abstractJsonLexer.tryConsumeNull(z);
    }

    public final boolean tryConsumeNull(boolean z) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (POBCommonConstants.NULL_VALUE.charAt(i) != getSource().charAt(prefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.currentPosition = prefetchOrEof + 4;
        return true;
    }

    public final String peekString(boolean z) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (z) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.peekedString = consumeString;
        return consumeString;
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public String substring(int i, int i2) {
        return getSource().subSequence(i, i2).toString();
    }

    public final String consumeString() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        return consumeKeyString();
    }

    protected final String consumeString(CharSequence source, int i, int i2) {
        String decodedString;
        int prefetchOrEof;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                prefetchOrEof = prefetchOrEof(appendEscape(i, i2));
                if (prefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", prefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    appendRange(i, i2);
                    prefetchOrEof = prefetchOrEof(i2);
                    if (prefetchOrEof == -1) {
                        fail$default(this, "Unexpected EOF", prefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            z = true;
            i = prefetchOrEof;
            i2 = i;
            charAt = source.charAt(i2);
        }
        if (!z) {
            decodedString = substring(i, i2);
        } else {
            decodedString = decodedString(i, i2);
        }
        this.currentPosition = i2 + 1;
        return decodedString;
    }

    private final int appendEscape(int i, int i2) {
        appendRange(i, i2);
        return appendEsc(i2 + 1);
    }

    private final String decodedString(int i, int i2) {
        appendRange(i, i2);
        String sb = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        this.escapedString.setLength(0);
        return sb;
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public final String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(consumeStringLenient, POBCommonConstants.NULL_VALUE) || !wasUnquotedString()) {
            return consumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    public final String consumeStringLenient() {
        String decodedString;
        if (this.peekedString != null) {
            return takePeeked();
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= getSource().length() || skipWhitespaces == -1) {
            fail$default(this, "EOF", skipWhitespaces, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
        if (charToTokenClass == 1) {
            return consumeString();
        }
        if (charToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(skipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
            skipWhitespaces++;
            if (skipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, skipWhitespaces);
                int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                if (prefetchOrEof == -1) {
                    this.currentPosition = skipWhitespaces;
                    return decodedString(0, 0);
                }
                skipWhitespaces = prefetchOrEof;
                z = true;
            }
        }
        if (!z) {
            decodedString = substring(this.currentPosition, skipWhitespaces);
        } else {
            decodedString = decodedString(this.currentPosition, skipWhitespaces);
        }
        this.currentPosition = skipWhitespaces;
        return decodedString;
    }

    protected void appendRange(int i, int i2) {
        this.escapedString.append(getSource(), i, i2);
    }

    private final int appendEsc(int i) {
        int prefetchOrEof = prefetchOrEof(i);
        if (prefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = prefetchOrEof + 1;
        char charAt = getSource().charAt(prefetchOrEof);
        if (charAt == 'u') {
            return appendHex(getSource(), i2);
        }
        char escapeToChar = AbstractJsonLexerKt.escapeToChar(charAt);
        if (escapeToChar == 0) {
            fail$default(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.escapedString.append(escapeToChar);
        return i2;
    }

    private final int appendHex(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.currentPosition = i;
            ensureHaveChars();
            if (this.currentPosition + 4 >= charSequence.length()) {
                fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return appendHex(charSequence, this.currentPosition);
        }
        this.escapedString.append((char) ((fromHexChar(charSequence, i) << 12) + (fromHexChar(charSequence, i + 1) << 8) + (fromHexChar(charSequence, i + 2) << 4) + fromHexChar(charSequence, i + 3)));
        return i2;
    }

    private final int fromHexChar(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void skipElement(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = peekNextToken();
            if (peekNextToken2 != 1) {
                if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(peekNextToken2));
                } else if (peekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (peekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public final void failOnUnknownKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + lastIndexOf$default + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify(getSource(), lastIndexOf$default)));
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.currentPosition;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i, str2);
    }

    public final Void fail(String message, int i, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw JsonExceptionsKt.JsonDecodingException(i, message + " at path: " + this.path.getPath() + str, getSource());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        if (r5 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0147, code lost:
    
        if (r0 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        if (r0 == (r5 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014f, code lost:
    
        if (r1 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        if (getSource().charAt(r5) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        fail$default(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        fail$default(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0183, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        r17.currentPosition = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r9 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r0 = r11 * consumeNumericLiteral$calculateExponent(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a0, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        fail$default(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c8, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c9, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d9, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        if (r10 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e1, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e4, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e5, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f5, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f6, code lost:
    
        fail$default(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0206, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0146, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long consumeNumericLiteral() {
        boolean z;
        char charAt;
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(prefetchOrEof) == '\"') {
            prefetchOrEof++;
            if (prefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i = prefetchOrEof;
        long j = 0;
        long j2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            boolean z4 = false;
            while (i != getSource().length()) {
                charAt = getSource().charAt(i);
                if ((charAt == 'e' || charAt == 'E') && !z2) {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                    z2 = true;
                } else if (charAt == '-' && z2) {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                } else if (charAt != '+' || !z2) {
                    if (charAt != '-') {
                        if (AbstractJsonLexerKt.charToTokenClass(charAt) != 0) {
                            break loop0;
                        }
                        i++;
                        int i2 = charAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            break loop0;
                        }
                        if (z2) {
                            j2 = (j2 * 10) + i2;
                        } else {
                            j = (j * 10) - i2;
                            if (j > 0) {
                                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                        }
                    } else {
                        if (i != prefetchOrEof) {
                            fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i++;
                        z3 = true;
                    }
                } else {
                    if (i == prefetchOrEof) {
                        fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i++;
                }
                z4 = true;
            }
            break loop0;
        }
        fail$default(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private static final double consumeNumericLiteral$calculateExponent(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (!z) {
            throw new NoWhenBranchMatchedException();
        }
        return Math.pow(10.0d, j);
    }

    public final long consumeNumericLiteralFully() {
        long consumeNumericLiteral = consumeNumericLiteral();
        if (consumeNextToken() == 10) {
            return consumeNumericLiteral;
        }
        AbstractJsonLexerKt.tokenDescription((byte) 10);
        int i = this.currentPosition;
        int i2 = i - 1;
        fail$default(this, "Expected input to contain a single valid number, but got '" + ((i == getSource().length() || i2 < 0) ? "EOF" : String.valueOf(getSource().charAt(i2))) + "' after it", i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(skipWhitespaces) == '\"') {
            skipWhitespaces++;
            z = true;
        } else {
            z = false;
        }
        boolean consumeBoolean = consumeBoolean(skipWhitespaces);
        if (z) {
            if (this.currentPosition == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(this.currentPosition) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition++;
        }
        return consumeBoolean;
    }

    private final boolean consumeBoolean(int i) {
        int prefetchOrEof = prefetchOrEof(i);
        if (prefetchOrEof >= getSource().length() || prefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = prefetchOrEof + 1;
        int charAt = getSource().charAt(prefetchOrEof) | ' ';
        if (charAt == 102) {
            consumeBooleanLiteral("alse", i2);
            return false;
        }
        if (charAt == 116) {
            consumeBooleanLiteral("rue", i2);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void consumeBooleanLiteral(String str, int i) {
        if (getSource().length() - i < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (getSource().charAt(i + i2) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = i + str.length();
    }
}
