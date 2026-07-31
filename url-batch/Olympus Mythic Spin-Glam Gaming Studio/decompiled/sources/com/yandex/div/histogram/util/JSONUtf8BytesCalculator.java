package com.yandex.div.histogram.util;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JSONUtf8BytesCalculator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0000H\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0000H\u0002J\b\u0010\f\u001a\u00020\u0000H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/histogram/util/JSONUtf8BytesCalculator;", "", "()V", "bytesSize", "", "array", "entriesSeparator", "entries", "key", "name", "", "keyValueSeparator", "object", "string", "", "value", "Companion", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class JSONUtf8BytesCalculator {
    private static final int ARRAY_BRACKETS_BYTES = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRIES_SEPARATOR_BYTES = 1;
    private static final int ESCAPED_CHARACTERS_BYTES = 2;
    private static final int FALSE_BYTES = 5;
    private static final int KEY_VALUE_SEPARATOR_BYTES = 1;
    private static final int NULL_BYTES = 4;
    private static final int OBJECT_BRACES_BYTES = 2;
    private static final int QUOTES_BYTES = 2;
    private static final int TRUE_BYTES = 4;
    private int bytesSize;

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator array() {
        this.bytesSize += 2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator object() {
        this.bytesSize += 2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator value(Object value) {
        if (!(value instanceof JSONArray)) {
            if (!(value instanceof JSONObject)) {
                if (value == null || value == JSONObject.NULL) {
                    this.bytesSize += 4;
                } else if (value instanceof Boolean) {
                    this.bytesSize += ((Boolean) value).booleanValue() ? 4 : 5;
                } else if (value instanceof Number) {
                    this.bytesSize += HistogramUtils.INSTANCE.calculateUtf8StringByteSize(JSONObject.numberToString((Number) value));
                } else {
                    string(value.toString());
                }
                return this;
            }
            INSTANCE.calculateUtf8JsonBytes((JSONObject) value, this);
            return this;
        }
        INSTANCE.calculateUtf8JsonArrayBytes((JSONArray) value, this);
        return this;
    }

    private final void string(String value) {
        int i;
        this.bytesSize += 2;
        int length = value.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            int i3 = this.bytesSize;
            if (charAt == '\"' || charAt == '\\' || charAt == '/' || charAt == '\t' || charAt == '\b' || charAt == '\n' || charAt == '\r') {
                i = 2;
            } else if (charAt <= 31) {
                HistogramUtils histogramUtils = HistogramUtils.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                i = histogramUtils.calculateUtf8StringByteSize(format);
            } else {
                i = HistogramUtils.INSTANCE.getUtf8CharByteSize(charAt);
            }
            this.bytesSize = i3 + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator key(String name) {
        string(name);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator keyValueSeparator() {
        this.bytesSize++;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator entriesSeparator(int entries) {
        if (entries <= 1) {
            return this;
        }
        this.bytesSize += entries - 1;
        return this;
    }

    /* compiled from: JSONUtf8BytesCalculator.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0014J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/histogram/util/JSONUtf8BytesCalculator$Companion;", "", "()V", "ARRAY_BRACKETS_BYTES", "", "ENTRIES_SEPARATOR_BYTES", "ESCAPED_CHARACTERS_BYTES", "FALSE_BYTES", "KEY_VALUE_SEPARATOR_BYTES", "NULL_BYTES", "OBJECT_BRACES_BYTES", "QUOTES_BYTES", "TRUE_BYTES", "calculateUtf8JsonArrayBytes", "", PreferencesSerializer.fileExtension, "Lorg/json/JSONArray;", "jsonUtf8BytesCalculator", "Lcom/yandex/div/histogram/util/JSONUtf8BytesCalculator;", "calculateUtf8JsonBytes", "Lorg/json/JSONObject;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int calculateUtf8JsonBytes(@NotNull JSONObject json) {
            JSONUtf8BytesCalculator jSONUtf8BytesCalculator = new JSONUtf8BytesCalculator();
            calculateUtf8JsonBytes(json, jSONUtf8BytesCalculator);
            return jSONUtf8BytesCalculator.bytesSize;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateUtf8JsonBytes(JSONObject json, JSONUtf8BytesCalculator jsonUtf8BytesCalculator) {
            jsonUtf8BytesCalculator.object().entriesSeparator(json.length());
            Iterator<String> keys = json.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jsonUtf8BytesCalculator.key(next).keyValueSeparator().value(json.get(next));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateUtf8JsonArrayBytes(JSONArray json, JSONUtf8BytesCalculator jsonUtf8BytesCalculator) {
            jsonUtf8BytesCalculator.array().entriesSeparator(json.length());
            int length = json.length();
            for (int i = 0; i < length; i++) {
                jsonUtf8BytesCalculator.value(json.get(i));
            }
        }
    }
}
