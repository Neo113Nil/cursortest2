package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import javax.annotation.Nullable;
import o.AbstractC0470Sa;
import o.AbstractC0946e20;
import o.C1097gL;
import o.C1161hJ;
import o.C1347k9;
import o.G8;
import o.JL;
import o.N8;

/* loaded from: classes.dex */
final class JsonUtf8Reader extends JsonReader {
    private static final C1347k9 CLOSING_BLOCK_COMMENT;
    private static final C1347k9 DOUBLE_QUOTE_OR_SLASH;
    private static final C1347k9 LINEFEED_OR_CARRIAGE_RETURN;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final C1347k9 SINGLE_QUOTE_OR_SLASH;
    private static final C1347k9 UNQUOTED_STRING_TERMINALS;
    private final G8 buffer;
    private int peeked;
    private long peekedLong;
    private int peekedNumberLength;

    @Nullable
    private String peekedString;
    private final N8 source;

    @Nullable
    private JsonValueSource valueSource;

    static {
        C1347k9 c1347k9 = C1347k9.k;
        SINGLE_QUOTE_OR_SLASH = C1097gL.d0("'\\");
        DOUBLE_QUOTE_OR_SLASH = C1097gL.d0("\"\\");
        UNQUOTED_STRING_TERMINALS = C1097gL.d0("{}[]:, \n\t\r\f/\\;#=");
        LINEFEED_OR_CARRIAGE_RETURN = C1097gL.d0("\n\r");
        CLOSING_BLOCK_COMMENT = C1097gL.d0("*/");
    }

    public JsonUtf8Reader(N8 n8) {
        this.peeked = 0;
        if (n8 == null) {
            throw new NullPointerException("source == null");
        }
        this.source = n8;
        this.buffer = n8.a();
        pushScope(6);
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int nextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.readByte();
                    if (nextNonWhitespace2 != 44) {
                        if (nextNonWhitespace2 != 59) {
                            if (nextNonWhitespace2 != 125) {
                                throw syntaxError("Unterminated object");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.buffer.readByte();
                    this.peeked = PEEKED_DOUBLE_QUOTED_NAME;
                    return PEEKED_DOUBLE_QUOTED_NAME;
                }
                if (nextNonWhitespace3 == 39) {
                    this.buffer.readByte();
                    checkLenient();
                    this.peeked = PEEKED_SINGLE_QUOTED_NAME;
                    return PEEKED_SINGLE_QUOTED_NAME;
                }
                if (nextNonWhitespace3 != 125) {
                    checkLenient();
                    if (!isLiteral((char) nextNonWhitespace3)) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = PEEKED_UNQUOTED_NAME;
                    return PEEKED_UNQUOTED_NAME;
                }
                if (i2 == 5) {
                    throw syntaxError("Expected name");
                }
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.source.l(1L) && this.buffer.q(0L) == 62) {
                        this.buffer.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = PEEKED_EOF;
                    return PEEKED_EOF;
                }
                checkLenient();
            } else {
                if (i2 == PEEKED_DOUBLE_QUOTED) {
                    this.valueSource.discard();
                    this.valueSource = null;
                    this.stackSize--;
                    return doPeek();
                }
                if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.buffer.readByte();
            this.peeked = PEEKED_DOUBLE_QUOTED;
            return PEEKED_DOUBLE_QUOTED;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.buffer.readByte();
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.buffer.readByte();
                    this.peeked = 1;
                    return 1;
                }
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer.q(0L))) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = PEEKED_UNQUOTED;
                return PEEKED_UNQUOTED;
            }
            if (i2 == 1) {
                this.buffer.readByte();
                this.peeked = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.peeked = 7;
        return 7;
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private int findString(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i) {
        if (i == PEEKED_DOUBLE_QUOTED || i == PEEKED_UNQUOTED || i == PEEKED_SINGLE_QUOTED_NAME || i == PEEKED_DOUBLE_QUOTED_NAME || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.buffer.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.source.l(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        checkLenient();
        r3 = r6.buffer.q(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
        skipToEndOfLine();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nextNonWhitespace(boolean z) {
        byte q;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.source.l(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                q = this.buffer.q(i);
                if (q != PEEKED_UNQUOTED && q != 32 && q != PEEKED_DOUBLE_QUOTED_NAME && q != PEEKED_DOUBLE_QUOTED) {
                    break;
                }
                i = i2;
            }
        }
        return q;
    }

    private String nextQuotedValue(C1347k9 c1347k9) {
        StringBuilder sb = null;
        while (true) {
            long f = this.source.f(c1347k9);
            if (f == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.q(f) != 92) {
                if (sb == null) {
                    G8 g8 = this.buffer;
                    g8.getClass();
                    String D = g8.D(f, AbstractC0470Sa.a);
                    this.buffer.readByte();
                    return D;
                }
                G8 g82 = this.buffer;
                g82.getClass();
                sb.append(g82.D(f, AbstractC0470Sa.a));
                this.buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            G8 g83 = this.buffer;
            g83.getClass();
            sb.append(g83.D(f, AbstractC0470Sa.a));
            this.buffer.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    private String nextUnquotedValue() {
        long f = this.source.f(UNQUOTED_STRING_TERMINALS);
        if (f == -1) {
            return this.buffer.F();
        }
        G8 g8 = this.buffer;
        g8.getClass();
        return g8.D(f, AbstractC0470Sa.a);
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i;
        byte q = this.buffer.q(0L);
        if (q == 116 || q == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (q == 102 || q == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (q != 110 && q != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.source.l(i3)) {
                return 0;
            }
            byte q2 = this.buffer.q(i2);
            if (q2 != str.charAt(i2) && q2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.source.l(length + 1) && isLiteral(this.buffer.q(length))) {
            return 0;
        }
        this.buffer.skip(length);
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (isLiteral(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r19.peekedLong = r8;
        r19.buffer.skip(r5);
        r19.peeked = com.squareup.moshi.JsonUtf8Reader.PEEKED_LONG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return com.squareup.moshi.JsonUtf8Reader.PEEKED_LONG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r19.peekedNumberLength = r5;
        r19.peeked = com.squareup.moshi.JsonUtf8Reader.PEEKED_NUMBER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        return com.squareup.moshi.JsonUtf8Reader.PEEKED_NUMBER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() {
        long j;
        int i;
        boolean z = true;
        int i2 = 0;
        char c = 0;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.source.l(i3)) {
                j = 0;
                i = 0;
                break;
            }
            j = 0;
            byte q = this.buffer.q(i2);
            i = 0;
            if (q != 43) {
                if (q == 69 || q == 101) {
                    if (c != 2 && c != 4) {
                        return 0;
                    }
                    c = 5;
                } else if (q != 45) {
                    if (q != 46) {
                        if (q < 48 || q > 57) {
                            break;
                        }
                        if (c == 1 || c == 0) {
                            j2 = -(q - 48);
                            c = 2;
                        } else if (c == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - (q - 48);
                            z &= j2 > MIN_INCOMPLETE_INTEGER || (j2 == MIN_INCOMPLETE_INTEGER && j3 < j2);
                            j2 = j3;
                        } else if (c == 3) {
                            c = 4;
                        } else if (c == 5 || c == 6) {
                            c = 7;
                        }
                    } else {
                        if (c != 2) {
                            return 0;
                        }
                        c = 3;
                    }
                } else if (c == 0) {
                    c = 1;
                    z2 = true;
                } else if (c != 5) {
                    return 0;
                }
                i2 = i3;
            } else if (c != 5) {
                return 0;
            }
            c = 6;
            i2 = i3;
        }
    }

    private char readEscapeCharacter() {
        int i;
        if (!this.source.l(1L)) {
            throw syntaxError("Unterminated escape sequence");
        }
        byte readByte = this.buffer.readByte();
        if (readByte == PEEKED_UNQUOTED || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.lenient) {
                return (char) readByte;
            }
            throw syntaxError("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.source.l(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte q = this.buffer.q(i2);
            char c2 = (char) (c << 4);
            if (q >= 48 && q <= 57) {
                i = q - 48;
            } else if (q >= 97 && q <= 102) {
                i = q - 87;
            } else {
                if (q < 65 || q > 70) {
                    G8 g8 = this.buffer;
                    g8.getClass();
                    throw syntaxError("\\u".concat(g8.D(4L, AbstractC0470Sa.a)));
                }
                i = q - 55;
            }
            c = (char) (i + c2);
        }
        this.buffer.skip(4L);
        return c;
    }

    private void skipQuotedValue(C1347k9 c1347k9) {
        while (true) {
            long f = this.source.f(c1347k9);
            if (f == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.q(f) != 92) {
                this.buffer.skip(f + 1);
                return;
            } else {
                this.buffer.skip(f + 1);
                readEscapeCharacter();
            }
        }
    }

    private boolean skipToEndOfBlockComment() {
        long s = this.source.s(CLOSING_BLOCK_COMMENT);
        boolean z = s != -1;
        G8 g8 = this.buffer;
        g8.skip(z ? s + r1.b() : g8.i);
        return z;
    }

    private void skipToEndOfLine() {
        long f = this.source.f(LINEFEED_OR_CARRIAGE_RETURN);
        G8 g8 = this.buffer;
        g8.skip(f != -1 ? f + 1 : g8.i);
    }

    private void skipUnquotedValue() {
        long f = this.source.f(UNQUOTED_STRING_TERMINALS);
        G8 g8 = this.buffer;
        if (f == -1) {
            f = g8.i;
        }
        g8.skip(f);
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            pushScope(3);
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.b();
        this.source.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i2 = this.stackSize;
        this.stackSize = i2 - 1;
        int[] iArr = this.pathIndices;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == PEEKED_EOF) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_LONG) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == PEEKED_NUMBER) {
            G8 g8 = this.buffer;
            long j = this.peekedNumberLength;
            g8.getClass();
            this.peekedString = g8.D(j, AbstractC0470Sa.a);
        } else if (i == PEEKED_DOUBLE_QUOTED) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == PEEKED_UNQUOTED) {
            this.peekedString = nextUnquotedValue();
        } else if (i != PEEKED_BUFFERED) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.peeked = PEEKED_BUFFERED;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_LONG) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (i == PEEKED_NUMBER) {
            G8 g8 = this.buffer;
            long j2 = this.peekedNumberLength;
            g8.getClass();
            this.peekedString = g8.D(j2, AbstractC0470Sa.a);
        } else if (i == PEEKED_DOUBLE_QUOTED || i == 8) {
            String nextQuotedValue = i == PEEKED_DOUBLE_QUOTED ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != PEEKED_BUFFERED) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.peeked = PEEKED_BUFFERED;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_LONG) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == PEEKED_NUMBER) {
            G8 g8 = this.buffer;
            long j = this.peekedNumberLength;
            g8.getClass();
            this.peekedString = g8.D(j, AbstractC0470Sa.a);
        } else if (i == PEEKED_DOUBLE_QUOTED || i == 8) {
            String nextQuotedValue = i == PEEKED_DOUBLE_QUOTED ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                long parseLong = Long.parseLong(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != PEEKED_BUFFERED) {
            throw new JsonDataException("Expected a long but was " + peek() + " at path " + getPath());
        }
        this.peeked = PEEKED_BUFFERED;
        try {
            long longValueExact = new BigDecimal(this.peekedString).longValueExact();
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_UNQUOTED_NAME) {
            str = nextUnquotedValue();
        } else if (i == PEEKED_DOUBLE_QUOTED_NAME) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == PEEKED_SINGLE_QUOTED_NAME) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else {
            if (i != PEEKED_BUFFERED_NAME) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            str = this.peekedString;
            this.peekedString = null;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    @Nullable
    public <T> T nextNull() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + getPath());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N8 nextSource() {
        int i;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        G8 g8 = new G8();
        C1347k9 c1347k9 = JsonValueSource.STATE_END_OF_JSON;
        if (i2 == 3) {
            g8.S("[");
            c1347k9 = JsonValueSource.STATE_JSON;
        } else {
            if (i2 != 1) {
                if (i2 == PEEKED_DOUBLE_QUOTED) {
                    g8.S("\"");
                    c1347k9 = JsonValueSource.STATE_DOUBLE_QUOTED;
                } else if (i2 == 8) {
                    g8.S("'");
                    c1347k9 = JsonValueSource.STATE_SINGLE_QUOTED;
                } else if (i2 == PEEKED_NUMBER || i2 == PEEKED_LONG || i2 == PEEKED_UNQUOTED) {
                    g8.S(nextString());
                } else if (i2 == 5) {
                    g8.S("true");
                } else if (i2 == 6) {
                    g8.S("false");
                } else if (i2 == 7) {
                    g8.S("null");
                } else {
                    if (i2 != PEEKED_BUFFERED) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    String nextString = nextString();
                    JsonWriter of = JsonWriter.of(g8);
                    try {
                        of.value(nextString);
                        of.close();
                    } catch (Throwable th) {
                        if (of != null) {
                            try {
                                of.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                i = 0;
                if (this.peeked != 0) {
                    int[] iArr = this.pathIndices;
                    int i3 = this.stackSize - 1;
                    iArr[i3] = iArr[i3] + 1;
                    this.peeked = 0;
                }
                this.valueSource = new JsonValueSource(this.source, g8, c1347k9, i);
                pushScope(PEEKED_DOUBLE_QUOTED);
                return AbstractC0946e20.h(this.valueSource);
            }
            g8.S("{");
            c1347k9 = JsonValueSource.STATE_JSON;
        }
        i = 1;
        if (this.peeked != 0) {
        }
        this.valueSource = new JsonValueSource(this.source, g8, c1347k9, i);
        pushScope(PEEKED_DOUBLE_QUOTED);
        return AbstractC0946e20.h(this.valueSource);
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() {
        String D;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_UNQUOTED) {
            D = nextUnquotedValue();
        } else if (i == PEEKED_DOUBLE_QUOTED) {
            D = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            D = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == PEEKED_BUFFERED) {
            D = this.peekedString;
            this.peekedString = null;
        } else if (i == PEEKED_LONG) {
            D = Long.toString(this.peekedLong);
        } else {
            if (i != PEEKED_NUMBER) {
                throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
            }
            G8 g8 = this.buffer;
            long j = this.peekedNumberLength;
            g8.getClass();
            D = g8.D(j, AbstractC0470Sa.a);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return D;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return JsonReader.Token.BOOLEAN;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return JsonReader.Token.NULL;
            case 8:
            case PEEKED_DOUBLE_QUOTED /* 9 */:
            case PEEKED_UNQUOTED /* 10 */:
            case PEEKED_BUFFERED /* 11 */:
                return JsonReader.Token.STRING;
            case PEEKED_SINGLE_QUOTED_NAME /* 12 */:
            case PEEKED_DOUBLE_QUOTED_NAME /* 13 */:
            case PEEKED_UNQUOTED_NAME /* 14 */:
            case PEEKED_BUFFERED_NAME /* 15 */:
                return JsonReader.Token.NAME;
            case PEEKED_LONG /* 16 */:
            case PEEKED_NUMBER /* 17 */:
                return JsonReader.Token.NUMBER;
            case PEEKED_EOF /* 18 */:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        return new JsonUtf8Reader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() {
        if (hasNext()) {
            this.peekedString = nextName();
            this.peeked = PEEKED_BUFFERED;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < PEEKED_SINGLE_QUOTED_NAME || i > PEEKED_BUFFERED_NAME) {
            return -1;
        }
        if (i == PEEKED_BUFFERED_NAME) {
            return findName(this.peekedString, options);
        }
        int w = this.source.w(options.doubleQuoteSuffix);
        if (w != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[w];
            return w;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = PEEKED_BUFFERED_NAME;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 8 || i > PEEKED_BUFFERED) {
            return -1;
        }
        if (i == PEEKED_BUFFERED) {
            return findString(this.peekedString, options);
        }
        int w = this.source.w(options.doubleQuoteSuffix);
        if (w != -1) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return w;
        }
        String nextString = nextString();
        int findString = findString(nextString, options);
        if (findString == -1) {
            this.peeked = PEEKED_BUFFERED;
            this.peekedString = nextString;
            this.pathIndices[this.stackSize - 1] = r0[r1] - 1;
        }
        return findString;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() {
        if (this.failOnUnknown) {
            JsonReader.Token peek = peek();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
        }
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == PEEKED_UNQUOTED_NAME) {
            skipUnquotedValue();
        } else if (i == PEEKED_DOUBLE_QUOTED_NAME) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == PEEKED_SINGLE_QUOTED_NAME) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i != PEEKED_BUFFERED_NAME) {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            if (i2 == 3) {
                pushScope(1);
            } else if (i2 == 1) {
                pushScope(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (i2 == PEEKED_UNQUOTED_NAME || i2 == PEEKED_UNQUOTED) {
                    skipUnquotedValue();
                } else if (i2 == PEEKED_DOUBLE_QUOTED || i2 == PEEKED_DOUBLE_QUOTED_NAME) {
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                } else if (i2 == 8 || i2 == PEEKED_SINGLE_QUOTED_NAME) {
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                } else if (i2 == PEEKED_NUMBER) {
                    this.buffer.skip(this.peekedNumberLength);
                } else if (i2 == PEEKED_EOF) {
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.pathNames[i3 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }

    public JsonUtf8Reader(JsonUtf8Reader jsonUtf8Reader) {
        super(jsonUtf8Reader);
        this.peeked = 0;
        JL peek = jsonUtf8Reader.source.peek();
        this.source = peek;
        this.buffer = peek.i;
        this.peeked = jsonUtf8Reader.peeked;
        this.peekedLong = jsonUtf8Reader.peekedLong;
        this.peekedNumberLength = jsonUtf8Reader.peekedNumberLength;
        this.peekedString = jsonUtf8Reader.peekedString;
        try {
            peek.y(jsonUtf8Reader.buffer.i);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
