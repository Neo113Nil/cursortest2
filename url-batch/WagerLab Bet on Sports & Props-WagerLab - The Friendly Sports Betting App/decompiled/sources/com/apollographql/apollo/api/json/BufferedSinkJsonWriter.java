package com.apollographql.apollo.api.json;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.internal.JsonScope;
import com.google.common.base.Ascii;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* compiled from: BufferedSinkJsonWriter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 42\u00020\u0001:\u00014B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0001H\u0016J\b\u0010\u0017\u001a\u00020\u0001H\u0016J\b\u0010\u0018\u001a\u00020\u0001H\u0016J\b\u0010\u0019\u001a\u00020\u0001H\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J \u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0001H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020%H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020&H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020'H\u0016J\u0010\u0010#\u001a\u00020\u00012\u0006\u0010#\u001a\u00020(H\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020)H\u0016J\u000e\u0010*\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0005J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010\u001d\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\tH\u0002J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012¨\u00065"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSinkJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "sink", "Lokio/BufferedSink;", "indent", "", "<init>", "(Lokio/BufferedSink;Ljava/lang/String;)V", "stackSize", "", "scopes", "", "pathNames", "", "[Ljava/lang/String;", "pathIndices", "separator", "getSeparator", "()Ljava/lang/String;", "deferredName", "path", "getPath", "beginArray", "endArray", "beginObject", "endObject", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "empty", "openBracket", "close", "nonempty", "closeBracket", "name", "writeDeferredName", "", "value", "nullValue", "", "", "", "Lcom/apollographql/apollo/api/json/JsonNumber;", "Lcom/apollographql/apollo/api/Upload;", "jsonValue", "flush", "newline", "beforeName", "beforeValue", "peekScope", "pushScope", "newTop", "replaceTop", "topOfStack", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferedSinkJsonWriter implements JsonWriter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEX_ARRAY = "0123456789abcdef";
    private static final String[] REPLACEMENT_CHARS;
    private String deferredName;
    private final String indent;
    private int[] pathIndices;
    private String[] pathNames;
    private int[] scopes;
    private final BufferedSink sink;
    private int stackSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BufferedSinkJsonWriter(BufferedSink sink) {
        this(sink, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(sink, "sink");
    }

    public BufferedSinkJsonWriter(BufferedSink sink, String str) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.indent = str;
        this.scopes = new int[64];
        this.pathNames = new String[64];
        this.pathIndices = new int[64];
        pushScope(6);
    }

    public /* synthetic */ BufferedSinkJsonWriter(BufferedSink bufferedSink, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bufferedSink, (i & 2) != 0 ? null : str);
    }

    private final String getSeparator() {
        String str = this.indent;
        return (str == null || str.length() == 0) ? Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR : ": ";
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        return CollectionsKt.joinToString$default(JsonScope.INSTANCE.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices), ".", null, null, 0, null, null, 62, null);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginArray() {
        writeDeferredName();
        return open(1, "[");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endArray() {
        return close(1, 2, "]");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginObject() {
        writeDeferredName();
        return open(3, "{");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endObject() {
        return close(3, 5, "}");
    }

    private final JsonWriter open(int empty, String openBracket) {
        beforeValue();
        pushScope(empty);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.writeUtf8(openBracket);
        return this;
    }

    private final JsonWriter close(int empty, int nonempty, String closeBracket) {
        int peekScope = peekScope();
        if (peekScope != nonempty && peekScope != empty) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        if (this.deferredName != null) {
            throw new IllegalStateException(("Dangling name: " + this.deferredName).toString());
        }
        int i = this.stackSize;
        int i2 = i - 1;
        this.stackSize = i2;
        this.pathNames[i2] = null;
        int[] iArr = this.pathIndices;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        if (peekScope == nonempty) {
            newline();
        }
        this.sink.writeUtf8(closeBracket);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter name(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.stackSize;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        this.deferredName = name;
        this.pathNames[i - 1] = name;
        return this;
    }

    private final void writeDeferredName() {
        if (this.deferredName != null) {
            beforeName();
            Companion companion = INSTANCE;
            BufferedSink bufferedSink = this.sink;
            String str = this.deferredName;
            Intrinsics.checkNotNull(str);
            companion.string(bufferedSink, str);
            this.deferredName = null;
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeDeferredName();
        beforeValue();
        INSTANCE.string(this.sink, value);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter nullValue() {
        return jsonValue("null");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(boolean value) {
        return jsonValue(value ? "true" : "false");
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + value).toString());
        }
        return jsonValue(String.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(int value) {
        return jsonValue(String.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(long value) {
        return jsonValue(String.valueOf(value));
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(JsonNumber value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return jsonValue(value.getValue());
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public BufferedSinkJsonWriter value(Upload value) {
        Intrinsics.checkNotNullParameter(value, "value");
        nullValue();
        return this;
    }

    public final JsonWriter jsonValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        writeDeferredName();
        beforeValue();
        this.sink.writeUtf8(value);
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.sink.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.scopes[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    private final void newline() {
        if (this.indent == null) {
            return;
        }
        this.sink.writeByte(10);
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            this.sink.writeUtf8(this.indent);
        }
    }

    private final void beforeName() {
        int peekScope = peekScope();
        if (peekScope == 5) {
            this.sink.writeByte(44);
        } else if (peekScope != 3) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        newline();
        replaceTop(4);
    }

    private final void beforeValue() {
        int peekScope = peekScope();
        if (peekScope == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peekScope == 2) {
            this.sink.writeByte(44);
            newline();
        } else if (peekScope == 4) {
            this.sink.writeUtf8(getSeparator());
            replaceTop(5);
        } else if (peekScope == 6) {
            replaceTop(7);
        } else {
            if (peekScope == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    private final int peekScope() {
        int i = this.stackSize;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        return this.scopes[i - 1];
    }

    private final void pushScope(int newTop) {
        int i = this.stackSize;
        int[] iArr = this.scopes;
        if (i == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.scopes = copyOf;
            String[] strArr = this.pathNames;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.pathNames = (String[]) copyOf2;
            int[] iArr2 = this.pathIndices;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
            this.pathIndices = copyOf3;
        }
        int[] iArr3 = this.scopes;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr3[i2] = newTop;
    }

    private final void replaceTop(int topOfStack) {
        this.scopes[this.stackSize - 1] = topOfStack;
    }

    /* compiled from: BufferedSinkJsonWriter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSinkJsonWriter$Companion;", "", "<init>", "()V", "HEX_ARRAY", "", "hexString", "", "REPLACEMENT_CHARS", "", "[Ljava/lang/String;", TypedValues.Custom.S_STRING, "", "sink", "Lokio/BufferedSink;", "value", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String hexString(byte b) {
            return new StringBuilder().append(BufferedSinkJsonWriter.HEX_ARRAY.charAt(b >>> 4)).append(BufferedSinkJsonWriter.HEX_ARRAY.charAt(b & Ascii.SI)).toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void string(BufferedSink sink, String value) {
            int i;
            String str;
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(value, "value");
            String[] strArr = BufferedSinkJsonWriter.REPLACEMENT_CHARS;
            sink.writeByte(34);
            int length = value.length();
            int i2 = 0;
            while (i < length) {
                char charAt = value.charAt(i);
                if (charAt < 128) {
                    str = strArr[charAt];
                    i = str == null ? i + 1 : 0;
                    if (i2 < i) {
                        sink.writeUtf8(value, i2, i);
                    }
                    sink.writeUtf8(str);
                    i2 = i + 1;
                } else {
                    if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i2 < i) {
                    }
                    sink.writeUtf8(str);
                    i2 = i + 1;
                }
            }
            if (i2 < length) {
                sink.writeUtf8(value, i2, length);
            }
            sink.writeByte(34);
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u00" + INSTANCE.hexString((byte) i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        REPLACEMENT_CHARS = strArr;
    }
}
