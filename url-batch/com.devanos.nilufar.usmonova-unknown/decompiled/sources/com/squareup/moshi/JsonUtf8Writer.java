package com.squareup.moshi;

import java.io.IOException;
import javax.annotation.Nullable;
import o.AbstractC0946e20;
import o.G8;
import o.M8;
import o.NV;
import o.YR;

/* loaded from: classes.dex */
final class JsonUtf8Writer extends JsonWriter {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private String separator = ":";
    private final M8 sink;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public JsonUtf8Writer(M8 m8) {
        if (m8 == null) {
            throw new NullPointerException("sink == null");
        }
        this.sink = m8;
        pushScope(6);
    }

    private void beforeName() {
        int peekScope = peekScope();
        if (peekScope == 5) {
            this.sink.writeByte(44);
        } else if (peekScope != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() {
        int peekScope = peekScope();
        int i = 2;
        if (peekScope != 1) {
            if (peekScope != 2) {
                if (peekScope == 4) {
                    this.sink.z(this.separator);
                    i = 5;
                } else {
                    if (peekScope == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    i = 7;
                    if (peekScope != 6) {
                        if (peekScope != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.lenient) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                }
                replaceTop(i);
            }
            this.sink.writeByte(44);
        }
        newline();
        replaceTop(i);
    }

    private JsonWriter close(int i, int i2, char c) {
        int peekScope = peekScope();
        if (peekScope != i2 && peekScope != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        int i3 = this.stackSize;
        int i4 = ~this.flattenStackSize;
        if (i3 == i4) {
            this.flattenStackSize = i4;
            return this;
        }
        int i5 = i3 - 1;
        this.stackSize = i5;
        this.pathNames[i5] = null;
        int[] iArr = this.pathIndices;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (peekScope == i2) {
            newline();
        }
        this.sink.writeByte(c);
        return this;
    }

    private void newline() {
        if (this.indent == null) {
            return;
        }
        this.sink.writeByte(10);
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            this.sink.z(this.indent);
        }
    }

    private JsonWriter open(int i, int i2, char c) {
        int i3;
        int i4 = this.stackSize;
        int i5 = this.flattenStackSize;
        if (i4 == i5 && ((i3 = this.scopes[i4 - 1]) == i || i3 == i2)) {
            this.flattenStackSize = ~i5;
            return this;
        }
        beforeValue();
        checkStack();
        pushScope(i);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.writeByte(c);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void string(M8 m8, String str) {
        int i;
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        m8.writeByte(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    m8.e(str, i2, i);
                }
                m8.z(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                m8.z(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            m8.e(str, i2, length);
        }
        m8.writeByte(34);
    }

    private void writeDeferredName() {
        if (this.deferredName != null) {
            beforeName();
            string(this.sink, this.deferredName);
            this.deferredName = null;
        }
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginArray() {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter beginObject() {
        if (!this.promoteValueToName) {
            writeDeferredName();
            return open(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endArray() {
        return close(1, 2, ']');
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter endObject() {
        this.promoteValueToName = false;
        return close(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.sink.flush();
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter name(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int peekScope = peekScope();
        if ((peekScope != 3 && peekScope != 5) || this.deferredName != null || this.promoteValueToName) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.deferredName = str;
        this.pathNames[this.stackSize - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter nullValue() {
        if (this.promoteValueToName) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.sink.z("null");
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public void setIndent(String str) {
        super.setIndent(str);
        this.separator = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(str);
        }
        writeDeferredName();
        beforeValue();
        string(this.sink, str);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public M8 valueSink() {
        if (this.promoteValueToName) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        writeDeferredName();
        beforeValue();
        pushScope(9);
        return AbstractC0946e20.g(new YR() { // from class: com.squareup.moshi.JsonUtf8Writer.1
            @Override // o.YR, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (JsonUtf8Writer.this.peekScope() != 9) {
                    throw new AssertionError();
                }
                JsonUtf8Writer jsonUtf8Writer = JsonUtf8Writer.this;
                int i = jsonUtf8Writer.stackSize;
                jsonUtf8Writer.stackSize = i - 1;
                int[] iArr = jsonUtf8Writer.pathIndices;
                int i2 = i - 2;
                iArr[i2] = iArr[i2] + 1;
            }

            @Override // o.YR, java.io.Flushable
            public void flush() {
                JsonUtf8Writer.this.sink.flush();
            }

            @Override // o.YR
            public NV timeout() {
                return NV.d;
            }

            @Override // o.YR
            public void write(G8 g8, long j) {
                JsonUtf8Writer.this.sink.write(g8, j);
            }
        });
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(boolean z) {
        if (!this.promoteValueToName) {
            writeDeferredName();
            beforeValue();
            this.sink.z(z ? "true" : "false");
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.sink.close();
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        return value(bool.booleanValue());
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(double d) {
        if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Double.toString(d));
        }
        writeDeferredName();
        beforeValue();
        this.sink.z(Double.toString(d));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(long j) {
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(Long.toString(j));
        }
        writeDeferredName();
        beforeValue();
        this.sink.z(Long.toString(j));
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.JsonWriter
    public JsonWriter value(@Nullable Number number) {
        if (number == null) {
            return nullValue();
        }
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.promoteValueToName) {
            this.promoteValueToName = false;
            return name(obj);
        }
        writeDeferredName();
        beforeValue();
        this.sink.z(obj);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
