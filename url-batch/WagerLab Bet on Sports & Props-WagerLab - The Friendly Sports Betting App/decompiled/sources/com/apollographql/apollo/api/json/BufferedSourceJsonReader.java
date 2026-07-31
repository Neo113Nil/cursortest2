package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.internal.JsonScope;
import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import com.facebook.react.devsupport.StackTraceHelper;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.msgpack.core.MessagePack;

/* compiled from: BufferedSourceJsonReader.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0001H\u0016J\b\u0010\u0019\u001a\u00020\u0001H\u0016J\b\u0010\u001a\u001a\u00020\u0001H\u0016J\b\u0010\u001b\u001a\u00020\u0001H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020\tH\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u000eH\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u0002052\u0006\u00101\u001a\u000202H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u00020\tH\u0016J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0016J\u0016\u0010:\u001a\u00020\t2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0<H\u0016J\u0010\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\tH\u0002J\u0010\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u001dH\u0002J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020B0<H\u0016J\b\u0010C\u001a\u00020\u000eH\u0002J\b\u0010D\u001a\u00020%H\u0002J\b\u0010E\u001a\u000205H\u0016J\u0010\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSourceJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "source", "Lokio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "peeked", "", "peekedLong", "", "peekedNumberLength", "peekedString", "", StackTraceHelper.STACK_KEY, "", "stackSize", "pathNames", "", "[Ljava/lang/String;", "pathIndices", "indexStack", "indexStackSize", "beginArray", "endArray", "beginObject", "endObject", "hasNext", "", "peek", "Lcom/apollographql/apollo/api/json/JsonReader$Token;", "doPeek", "peekKeyword", "peekNumber", "isLiteral", "c", "", "nextName", "nextString", "nextBoolean", "nextNull", "", "nextDouble", "", "nextLong", "nextNumber", "Lcom/apollographql/apollo/api/json/JsonNumber;", "nextQuotedValue", "runTerminator", "Lokio/ByteString;", "nextUnquotedValue", "skipQuotedValue", "", "skipUnquotedValue", "nextInt", "close", "skipValue", "selectName", "names", "", MetricTracker.Place.PUSH, "newTop", "nextNonWhitespace", "throwOnEof", "getPath", "", "getPathAsString", "readEscapeCharacter", "rewind", "throwSyntaxError", "message", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferedSourceJsonReader implements JsonReader {
    public static final int INITIAL_STACK_SIZE = 64;
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
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Buffer buffer;
    private int[] indexStack;
    private int indexStackSize;
    private int[] pathIndices;
    private String[] pathNames;
    private int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final BufferedSource source;
    private int[] stack;
    private int stackSize;
    private static final ByteString SINGLE_QUOTE_OR_SLASH = ByteString.INSTANCE.encodeUtf8("'\\");
    private static final ByteString DOUBLE_QUOTE_OR_SLASH = ByteString.INSTANCE.encodeUtf8("\"\\");
    private static final ByteString UNQUOTED_STRING_TERMINALS = ByteString.INSTANCE.encodeUtf8("{}[]:, \n\t\r/\\;#=");

    public BufferedSourceJsonReader(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.buffer = source.getBuffer();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.stack = iArr;
        this.stackSize = 1;
        this.pathNames = new String[64];
        this.pathIndices = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.indexStack = iArr2;
        this.indexStackSize = 1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginArray() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : doPeek()) == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endArray() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : doPeek()) == 4) {
            int i = this.stackSize;
            this.stackSize = i - 1;
            int[] iArr = this.pathIndices;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginObject() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : doPeek()) == 1) {
            push(3);
            this.peeked = 0;
            int i = this.indexStackSize;
            this.indexStackSize = i + 1;
            this.indexStack[i] = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endObject() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : doPeek()) == 2) {
            int i = this.stackSize;
            int i2 = i - 1;
            this.stackSize = i2;
            this.pathNames[i2] = null;
            int[] iArr = this.pathIndices;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
            this.indexStackSize--;
            return this;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: peek */
    public JsonReader.Token getPeekedToken() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : doPeek()) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
                return JsonReader.Token.NAME;
            case 15:
                return JsonReader.Token.LONG;
            case 16:
                return JsonReader.Token.NUMBER;
            case 17:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    private final int doPeek() {
        int[] iArr = this.stack;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        switch (i2) {
            case 1:
                iArr[i - 1] = 2;
                break;
            case 2:
                int nextNonWhitespace = nextNonWhitespace(true);
                this.buffer.readByte();
                char c = (char) nextNonWhitespace;
                if (c != ',') {
                    if (c == ']') {
                        this.peeked = 4;
                        return 4;
                    }
                    throwSyntaxError("Unterminated array");
                    throw new KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int nextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.readByte();
                    char c2 = (char) nextNonWhitespace2;
                    if (c2 != ',') {
                        if (c2 == '}') {
                            this.peeked = 2;
                            return 2;
                        }
                        throwSyntaxError("Unterminated object");
                        throw new KotlinNothingValueException();
                    }
                }
                char nextNonWhitespace3 = (char) nextNonWhitespace(true);
                if (nextNonWhitespace3 == '\"') {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 != '}') {
                    throwSyntaxError("Unexpected character: " + nextNonWhitespace3);
                    throw new KotlinNothingValueException();
                }
                if (i2 != 5) {
                    this.buffer.readByte();
                    this.peeked = 2;
                    return 2;
                }
                throwSyntaxError("Expected name");
                throw new KotlinNothingValueException();
            case 4:
                iArr[i - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (((char) nextNonWhitespace4) != ':') {
                    throwSyntaxError("Expected ':'");
                    throw new KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i - 1] = 7;
                break;
            case 7:
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                throwSyntaxError("Malformed JSON");
                throw new KotlinNothingValueException();
            default:
                if (i2 == 8) {
                    throw new IllegalStateException("JsonReader is closed".toString());
                }
                break;
        }
        char nextNonWhitespace5 = (char) nextNonWhitespace(true);
        if (nextNonWhitespace5 == '\"') {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == '\'' || nextNonWhitespace5 == ',' || nextNonWhitespace5 == ';') {
            throwSyntaxError("Unexpected value");
            throw new KotlinNothingValueException();
        }
        if (nextNonWhitespace5 == '[') {
            this.buffer.readByte();
            this.peeked = 3;
            return 3;
        }
        if (nextNonWhitespace5 == ']') {
            if (i2 == 1) {
                this.buffer.readByte();
                this.peeked = 4;
                return 4;
            }
            throwSyntaxError("Unexpected value");
            throw new KotlinNothingValueException();
        }
        if (nextNonWhitespace5 == '{') {
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
        if (!isLiteral((char) this.buffer.getByte(0L))) {
            throwSyntaxError("Expected value");
            throw new KotlinNothingValueException();
        }
        throwSyntaxError("Malformed JSON");
        throw new KotlinNothingValueException();
    }

    private final int peekKeyword() {
        String str;
        String str2;
        int i;
        byte b = this.buffer.getByte(0L);
        if (b == 116 || b == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (b == 102 || b == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (b != 110 && b != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            long j = i2;
            if (!this.source.request(1 + j)) {
                return 0;
            }
            byte b2 = this.buffer.getByte(j);
            if (b2 != ((byte) str.charAt(i2)) && b2 != ((byte) str2.charAt(i2))) {
                return 0;
            }
        }
        long j2 = length;
        if (this.source.request(1 + j2) && isLiteral((char) this.buffer.getByte(j2))) {
            return 0;
        }
        this.buffer.skip(j2);
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
    
        if (isLiteral(r11) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
    
        if (r6 != 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00af, code lost:
    
        if (r10 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
    
        if (r9 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r9 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
    
        r19.peekedLong = r7;
        r19.buffer.skip(r12);
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c9, code lost:
    
        if (r6 == 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cc, code lost:
    
        if (r6 == 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cf, code lost:
    
        if (r6 != 7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d2, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d3, code lost:
    
        r19.peekedNumberLength = r5;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
    
        return 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int peekNumber() {
        int i;
        boolean z = true;
        int i2 = 0;
        char c = 0;
        long j = 0;
        boolean z2 = false;
        while (true) {
            long j2 = i2;
            char c2 = 2;
            if (!this.source.request(1 + j2)) {
                i = 0;
                break;
            }
            byte b = this.buffer.getByte(j2);
            char c3 = (char) b;
            i = 0;
            if (c3 != '+') {
                if (c3 == 'E' || c3 == 'e') {
                    if (c != 2 && c != 4) {
                        return 0;
                    }
                    c = 5;
                } else if (c3 == '-') {
                    c2 = 6;
                    if (c == 0) {
                        c = 1;
                        z2 = true;
                    } else if (c != 5) {
                        return 0;
                    }
                } else if (c3 != '.') {
                    if (b < 48 || b > 57) {
                        break;
                    }
                    if (c == 0 || c == 1) {
                        j = -(b + MessagePack.Code.INT8);
                    } else if (c != 2) {
                        if (c == 3) {
                            c = 4;
                        } else if (c == 5 || c == 6) {
                            c = 7;
                        }
                    } else {
                        if (j == 0) {
                            return 0;
                        }
                        long j3 = (10 * j) - (b + MessagePack.Code.INT8);
                        z = (((j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1)) > 0) && z) || (j == -922337203685477580L && j3 < j);
                        j = j3;
                    }
                } else {
                    if (c != 2) {
                        return 0;
                    }
                    c = 3;
                }
                i2++;
            } else {
                c2 = 6;
                if (c != 5) {
                    return 0;
                }
            }
            c = c2;
            i2++;
        }
    }

    private final boolean isLiteral(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throwSyntaxError("Unexpected character: " + c);
        throw new KotlinNothingValueException();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        String nextQuotedValue;
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : doPeek()) {
            case 12:
                nextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
                break;
            case 13:
                nextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                break;
            case 14:
                nextQuotedValue = nextUnquotedValue();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        Integer valueOf = Integer.valueOf(this.peeked);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        if (intValue == 15) {
            str = String.valueOf(this.peekedLong);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    break;
                case 9:
                    str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    break;
                case 10:
                    str = nextUnquotedValue();
                    break;
                case 11:
                    String str2 = this.peekedString;
                    if (str2 != null) {
                        this.peekedString = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + getPeekedToken() + " at path " + getPathAsString());
            }
        } else {
            str = this.buffer.readUtf8(this.peekedNumberLength);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        if (intValue == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (intValue == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public Void nextNull() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : doPeek()) == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + getPeekedToken() + " at path " + getPathAsString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        if (intValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.peekedLong;
        }
        if (intValue == 16) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (intValue == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (intValue == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (intValue == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a double but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.checkNotNull(str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPathAsString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPathAsString());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        if (intValue == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.peekedLong;
        }
        if (intValue == 16) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (intValue == 9 || intValue == 8) {
            String nextQuotedValue = nextQuotedValue(intValue == 9 ? DOUBLE_QUOTE_OR_SLASH : SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                Intrinsics.checkNotNull(nextQuotedValue);
                long parseLong = Long.parseLong(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a long but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.checkNotNull(str);
            double parseDouble = Double.parseDouble(str);
            long j = (long) parseDouble;
            if (j != parseDouble) {
                throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + getPathAsString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.peekedString + " at path " + getPathAsString());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonNumber nextNumber() {
        String nextString = nextString();
        Intrinsics.checkNotNull(nextString);
        return new JsonNumber(nextString);
    }

    private final String nextQuotedValue(ByteString runTerminator) {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.source.indexOfElement(runTerminator);
            if (indexOfElement == -1) {
                throwSyntaxError("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    String readUtf8 = this.buffer.readUtf8(indexOfElement);
                    this.buffer.readByte();
                    return readUtf8;
                }
                sb.append(this.buffer.readUtf8(indexOfElement));
                this.buffer.readByte();
                String sb2 = sb.toString();
                Intrinsics.checkNotNull(sb2);
                return sb2;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.buffer.readUtf8(indexOfElement));
            this.buffer.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    private final String nextUnquotedValue() {
        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        return indexOfElement != -1 ? this.buffer.readUtf8(indexOfElement) : this.buffer.readUtf8();
    }

    private final void skipQuotedValue(ByteString runTerminator) {
        while (true) {
            long indexOfElement = this.source.indexOfElement(runTerminator);
            if (indexOfElement == -1) {
                throwSyntaxError("Unterminated string");
                throw new KotlinNothingValueException();
            }
            if (this.buffer.getByte(indexOfElement) == 92) {
                this.buffer.skip(indexOfElement + 1);
                readEscapeCharacter();
            } else {
                this.buffer.skip(indexOfElement + 1);
                return;
            }
        }
    }

    private final void skipUnquotedValue() {
        long indexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        Buffer buffer = this.buffer;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        Integer valueOf = Integer.valueOf(this.peeked);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : doPeek();
        if (intValue == 15) {
            long j = this.peekedLong;
            int i = (int) j;
            if (j != i) {
                throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (intValue == 16) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (intValue == 9 || intValue == 8) {
            String nextQuotedValue = nextQuotedValue(intValue == 9 ? DOUBLE_QUOTE_OR_SLASH : SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                Intrinsics.checkNotNull(nextQuotedValue);
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected an int but was " + getPeekedToken() + " at path " + getPathAsString());
        }
        this.peeked = 11;
        try {
            String str = this.peekedString;
            Intrinsics.checkNotNull(str);
            double parseDouble = Double.parseDouble(str);
            int i4 = (int) parseDouble;
            if (i4 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPathAsString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i5 = this.stackSize - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return i4;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPathAsString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.buffer.clear();
        this.source.close();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        int i = 0;
        do {
            Integer valueOf = Integer.valueOf(this.peeked);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            switch (valueOf != null ? valueOf.intValue() : doPeek()) {
                case 1:
                    push(3);
                    i++;
                    break;
                case 2:
                    this.stackSize--;
                    i--;
                    break;
                case 3:
                    push(1);
                    i++;
                    break;
                case 4:
                    this.stackSize--;
                    i--;
                    break;
                case 8:
                case 12:
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    break;
                case 9:
                case 13:
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    break;
                case 10:
                case 14:
                    skipUnquotedValue();
                    break;
                case 16:
                    this.buffer.skip(this.peekedNumberLength);
                    break;
            }
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.pathNames[i2 - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        skipValue();
     */
    @Override // com.apollographql.apollo.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int selectName(List<String> names) {
        Intrinsics.checkNotNullParameter(names, "names");
        if (names.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String nextName = nextName();
            int i = this.indexStack[this.indexStackSize - 1];
            if (Intrinsics.areEqual(names.get(i), nextName)) {
                int[] iArr = this.indexStack;
                int i2 = this.indexStackSize;
                iArr[i2 - 1] = i + 1;
                if (iArr[i2 - 1] == names.size()) {
                    this.indexStack[this.indexStackSize - 1] = 0;
                }
                return i;
            }
            int i3 = i;
            do {
                i3++;
                if (i3 == names.size()) {
                    i3 = 0;
                }
                if (i3 == i) {
                    break;
                }
            } while (!Intrinsics.areEqual(names.get(i3), nextName));
            int[] iArr2 = this.indexStack;
            int i4 = this.indexStackSize;
            iArr2[i4 - 1] = i3 + 1;
            if (iArr2[i4 - 1] == names.size()) {
                this.indexStack[this.indexStackSize - 1] = 0;
            }
            return i3;
        }
        return -1;
    }

    private final void push(int newTop) {
        int i = this.stackSize;
        int[] iArr = this.stack;
        if (i == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.stack = copyOf;
            String[] strArr = this.pathNames;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.pathNames = (String[]) copyOf2;
            int[] iArr2 = this.pathIndices;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
            this.pathIndices = copyOf3;
            int[] iArr3 = this.indexStack;
            int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(...)");
            this.indexStack = copyOf4;
        }
        int[] iArr4 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr4[i2] = newTop;
    }

    private final int nextNonWhitespace(boolean throwOnEof) {
        int i = 0;
        while (true) {
            long j = i;
            if (!this.source.request(j + 1)) {
                if (throwOnEof) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            byte b = this.buffer.getByte(j);
            if (b != 9 && b != 10 && b != 13 && b != 32) {
                this.buffer.skip(i - 1);
                if (b != 35) {
                    if (b != 47 || !this.source.request(2L)) {
                        return b;
                    }
                    throwSyntaxError("Malformed JSON");
                    throw new KotlinNothingValueException();
                }
                throwSyntaxError("Malformed JSON");
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public List<Object> getPath() {
        return JsonScope.INSTANCE.getPath(this.stackSize, this.stack, this.pathNames, this.pathIndices);
    }

    private final String getPathAsString() {
        return CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null);
    }

    private final char readEscapeCharacter() {
        int i;
        if (!this.source.request(1L)) {
            throwSyntaxError("Unterminated escape sequence");
            throw new KotlinNothingValueException();
        }
        char readByte = (char) this.buffer.readByte();
        if (readByte == '\n' || readByte == '\"' || readByte == '\'' || readByte == '/' || readByte == '\\') {
            return readByte;
        }
        if (readByte == 'b') {
            return '\b';
        }
        if (readByte == 'f') {
            return '\f';
        }
        if (readByte == 'n') {
            return '\n';
        }
        if (readByte == 'r') {
            return '\r';
        }
        if (readByte == 't') {
            return '\t';
        }
        if (readByte == 'u') {
            if (!this.source.request(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte b = this.buffer.getByte(i2);
                char c2 = (char) (c << 4);
                if (b >= 48 && b <= 57) {
                    i = b + MessagePack.Code.INT8;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        throwSyntaxError("\\u" + this.buffer.readUtf8(4L));
                        throw new KotlinNothingValueException();
                    }
                    i = b + MessagePack.Code.EXT32;
                }
                c = (char) (c2 + i);
            }
            this.buffer.skip(4L);
            return c;
        }
        throwSyntaxError("Invalid escape sequence: \\" + readByte);
        throw new KotlinNothingValueException();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void rewind() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.".toString());
    }

    private final Void throwSyntaxError(String message) {
        throw new JsonEncodingException(message + " at path " + getPath());
    }
}
