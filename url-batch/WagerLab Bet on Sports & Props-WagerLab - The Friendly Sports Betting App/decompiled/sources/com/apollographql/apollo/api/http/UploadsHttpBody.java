package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import org.apache.commons.io.IOUtils;

/* compiled from: DefaultHttpRequestComposer.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0014\u0010\u0019\u001a\u00020\u0015*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/apollographql/apollo/api/http/UploadsHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", "uploads", "", "", "Lcom/apollographql/apollo/api/Upload;", "operationByteString", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "boundary", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "getContentType", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "contentLength$delegate", "Lkotlin/Lazy;", "writeTo", "", "bufferedSink", "Lokio/BufferedSink;", "buildUploadMap", "writeBoundaries", "writeUploadContents", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UploadsHttpBody implements HttpBody {
    private final String boundary;

    /* renamed from: contentLength$delegate, reason: from kotlin metadata */
    private final Lazy contentLength;
    private final String contentType;
    private final ByteString operationByteString;
    private final Map<String, Upload> uploads;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadsHttpBody(Map<String, ? extends Upload> uploads, ByteString operationByteString) {
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        Intrinsics.checkNotNullParameter(operationByteString, "operationByteString");
        this.uploads = uploads;
        this.operationByteString = operationByteString;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.boundary = uuid;
        this.contentType = "multipart/form-data; boundary=" + uuid;
        this.contentLength = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.api.http.UploadsHttpBody$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long contentLength_delegate$lambda$1;
                contentLength_delegate$lambda$1 = UploadsHttpBody.contentLength_delegate$lambda$1(UploadsHttpBody.this);
                return Long.valueOf(contentLength_delegate$lambda$1);
            }
        });
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public long getContentLength() {
        return ((Number) this.contentLength.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long contentLength_delegate$lambda$1(UploadsHttpBody uploadsHttpBody) {
        CountingSink countingSink = new CountingSink(Okio.blackhole());
        BufferedSink buffer = Okio.buffer(countingSink);
        uploadsHttpBody.writeBoundaries(buffer, false);
        buffer.flush();
        long bytesWritten = countingSink.getBytesWritten();
        Iterator<T> it = uploadsHttpBody.uploads.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Upload) it.next()).getContentLength();
        }
        return bytesWritten + j;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public void writeTo(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        writeBoundaries(bufferedSink, true);
    }

    private final void writeBoundaries(BufferedSink bufferedSink, boolean z) {
        bufferedSink.writeUtf8("--" + this.boundary + IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.writeUtf8("Content-Disposition: form-data; name=\"operations\"\r\n");
        bufferedSink.writeUtf8("Content-Type: application/json\r\n");
        bufferedSink.writeUtf8("Content-Length: " + this.operationByteString.size() + IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.write(this.operationByteString);
        ByteString buildUploadMap = buildUploadMap(this.uploads);
        bufferedSink.writeUtf8("\r\n--" + this.boundary + IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.writeUtf8("Content-Disposition: form-data; name=\"map\"\r\n");
        bufferedSink.writeUtf8("Content-Type: application/json\r\n");
        bufferedSink.writeUtf8("Content-Length: " + buildUploadMap.size() + IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
        bufferedSink.write(buildUploadMap);
        int i = 0;
        for (Object obj : this.uploads.values()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Upload upload = (Upload) obj;
            bufferedSink.writeUtf8("\r\n--" + this.boundary + IOUtils.LINE_SEPARATOR_WINDOWS);
            bufferedSink.writeUtf8("Content-Disposition: form-data; name=\"" + i + '\"');
            if (upload.getFileName() != null) {
                bufferedSink.writeUtf8("; filename=\"" + upload.getFileName() + '\"');
            }
            bufferedSink.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            bufferedSink.writeUtf8("Content-Type: " + upload.getContentType() + IOUtils.LINE_SEPARATOR_WINDOWS);
            long contentLength = upload.getContentLength();
            if (contentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: " + contentLength + IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            bufferedSink.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            if (z) {
                upload.writeTo(bufferedSink);
            }
            i = i2;
        }
        bufferedSink.writeUtf8("\r\n--" + this.boundary + "--\r\n");
    }

    private final ByteString buildUploadMap(Map<String, ? extends Upload> uploads) {
        Buffer buffer = new Buffer();
        BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer, null);
        Set<Map.Entry<String, ? extends Upload>> entrySet = uploads.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to(String.valueOf(i), CollectionsKt.listOf(((Map.Entry) obj).getKey())));
            i = i2;
        }
        JsonWriters.writeAny(bufferedSinkJsonWriter, MapsKt.toMap(arrayList));
        return buffer.readByteString();
    }
}
