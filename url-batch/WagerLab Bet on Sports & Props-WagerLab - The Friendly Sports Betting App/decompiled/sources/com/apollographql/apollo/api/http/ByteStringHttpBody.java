package com.apollographql.apollo.api.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: ByteStringHttpBody.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/apollographql/apollo/api/http/ByteStringHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "byteString", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", TypedValues.Custom.S_STRING, "(Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "writeTo", "", "bufferedSink", "Lokio/BufferedSink;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteStringHttpBody implements HttpBody {
    private final ByteString byteString;
    private final String contentType;

    public ByteStringHttpBody(String contentType, ByteString byteString) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        this.contentType = contentType;
        this.byteString = byteString;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public String getContentType() {
        return this.contentType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteStringHttpBody(String contentType, String string) {
        this(contentType, ByteString.INSTANCE.encodeUtf8(string));
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public long getContentLength() {
        return this.byteString.size();
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public void writeTo(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.write(this.byteString);
    }
}
