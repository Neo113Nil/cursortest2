package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.Upload;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: JsonWriter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0000H&J\b\u0010\u0004\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0000H&J\b\u0010\u0006\u001a\u00020\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0000H&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\fH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000fH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0015H&R\u0012\u0010\u0011\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonWriter;", "Ljava/io/Closeable;", "Lokio/Closeable;", "beginArray", "endArray", "beginObject", "endObject", "name", "", "value", "nullValue", "", "", "", "", "Lcom/apollographql/apollo/api/json/JsonNumber;", "Lcom/apollographql/apollo/api/Upload;", "path", "getPath", "()Ljava/lang/String;", "flush", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JsonWriter extends Closeable {
    JsonWriter beginArray() throws IOException;

    JsonWriter beginObject() throws IOException;

    JsonWriter endArray() throws IOException;

    JsonWriter endObject() throws IOException;

    void flush() throws IOException;

    String getPath();

    JsonWriter name(String name) throws IOException;

    JsonWriter nullValue() throws IOException;

    JsonWriter value(double value) throws IOException;

    JsonWriter value(int value) throws IOException;

    JsonWriter value(long value) throws IOException;

    JsonWriter value(Upload value) throws IOException;

    JsonWriter value(JsonNumber value) throws IOException;

    JsonWriter value(String value) throws IOException;

    JsonWriter value(boolean value) throws IOException;
}
