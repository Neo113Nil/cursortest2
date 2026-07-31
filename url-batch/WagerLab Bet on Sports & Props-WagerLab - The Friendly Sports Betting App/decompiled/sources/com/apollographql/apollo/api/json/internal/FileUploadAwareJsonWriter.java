package com.apollographql.apollo.api.json.internal;

import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.JsonNumber;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUploadAwareJsonWriter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\nJ\b\u0010\u000b\u001a\u00020\u0000H\u0016J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0013H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0015H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/apollographql/apollo/api/json/internal/FileUploadAwareJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "wrappedWriter", "<init>", "(Lcom/apollographql/apollo/api/json/JsonWriter;)V", "uploads", "", "", "Lcom/apollographql/apollo/api/Upload;", "collectedUploads", "", "beginArray", "endArray", "beginObject", "endObject", "name", "value", "", "", "", "", "Lcom/apollographql/apollo/api/json/JsonNumber;", "nullValue", "path", "getPath", "()Ljava/lang/String;", "close", "", "flush", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileUploadAwareJsonWriter implements JsonWriter {
    private final Map<String, Upload> uploads;
    private final JsonWriter wrappedWriter;

    public FileUploadAwareJsonWriter(JsonWriter wrappedWriter) {
        Intrinsics.checkNotNullParameter(wrappedWriter, "wrappedWriter");
        this.wrappedWriter = wrappedWriter;
        this.uploads = new LinkedHashMap();
    }

    public final Map<String, Upload> collectedUploads() {
        return this.uploads;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter beginArray() {
        this.wrappedWriter.beginArray();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter endArray() {
        this.wrappedWriter.endArray();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter beginObject() {
        this.wrappedWriter.beginObject();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter endObject() {
        this.wrappedWriter.endObject();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter name(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.wrappedWriter.name(name);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(boolean value) {
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(double value) {
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(int value) {
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(long value) {
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(JsonNumber value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.wrappedWriter.value(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter value(Upload value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.uploads.put(this.wrappedWriter.getPath(), value);
        this.wrappedWriter.nullValue();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public FileUploadAwareJsonWriter nullValue() {
        this.wrappedWriter.nullValue();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        return this.wrappedWriter.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.wrappedWriter.close();
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
        this.wrappedWriter.flush();
    }
}
