package com.apollographql.apollo.api;

import com.apollographql.apollo.api.DefaultUpload;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;
import okio.Utf8;

/* compiled from: DefaultUpload.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B7\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/apollographql/apollo/api/DefaultUpload;", "Lcom/apollographql/apollo/api/Upload;", "writeTo", "Lkotlin/Function1;", "Lokio/BufferedSink;", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "contentLength", "", "fileName", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;JLjava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getContentLength", "()J", "getFileName", "sink", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultUpload implements Upload {
    private final long contentLength;
    private final String contentType;
    private final String fileName;
    private final Function1<BufferedSink, Unit> writeTo;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUpload(Function1<? super BufferedSink, Unit> writeTo, String contentType, long j, String str) {
        Intrinsics.checkNotNullParameter(writeTo, "writeTo");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.writeTo = writeTo;
        this.contentType = contentType;
        this.contentLength = j;
        this.fileName = str;
    }

    @Override // com.apollographql.apollo.api.Upload
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.apollographql.apollo.api.Upload
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // com.apollographql.apollo.api.Upload
    public String getFileName() {
        return this.fileName;
    }

    @Override // com.apollographql.apollo.api.Upload
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.writeTo.invoke(sink);
    }

    public final Builder newBuilder() {
        Builder contentLength = new Builder().content(this.writeTo).contentType(getContentType()).contentLength(getContentLength());
        if (getFileName() != null) {
            contentLength.fileName(getFileName());
        }
        return contentLength;
    }

    /* compiled from: DefaultUpload.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/apollographql/apollo/api/DefaultUpload$Builder;", "", "<init>", "()V", "writeTo", "Lkotlin/Function1;", "Lokio/BufferedSink;", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "contentLength", "", "fileName", "content", "byteString", "Lokio/ByteString;", "byteArray", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/DefaultUpload;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private long contentLength = -1;
        private String contentType;
        private String fileName;
        private Function1<? super BufferedSink, Unit> writeTo;

        public final Builder content(Function1<? super BufferedSink, Unit> writeTo) {
            Intrinsics.checkNotNullParameter(writeTo, "writeTo");
            if (this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once".toString());
            }
            this.writeTo = writeTo;
            return this;
        }

        public final Builder content(final String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            if (this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once".toString());
            }
            this.writeTo = new Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit content$lambda$4$lambda$3;
                    content$lambda$4$lambda$3 = DefaultUpload.Builder.content$lambda$4$lambda$3(content, (BufferedSink) obj);
                    return content$lambda$4$lambda$3;
                }
            };
            this.contentLength = Utf8.size$default(content, 0, 0, 3, null);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit content$lambda$4$lambda$3(String str, BufferedSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            sink.writeUtf8(str);
            return Unit.INSTANCE;
        }

        public final Builder content(final ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            if (this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once".toString());
            }
            this.writeTo = new Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit content$lambda$7$lambda$6;
                    content$lambda$7$lambda$6 = DefaultUpload.Builder.content$lambda$7$lambda$6(ByteString.this, (BufferedSink) obj);
                    return content$lambda$7$lambda$6;
                }
            };
            this.contentLength = byteString.size();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit content$lambda$7$lambda$6(ByteString byteString, BufferedSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            sink.write(byteString);
            return Unit.INSTANCE;
        }

        public final Builder content(final byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once".toString());
            }
            this.writeTo = new Function1() { // from class: com.apollographql.apollo.api.DefaultUpload$Builder$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit content$lambda$10$lambda$9;
                    content$lambda$10$lambda$9 = DefaultUpload.Builder.content$lambda$10$lambda$9(byteArray, (BufferedSink) obj);
                    return content$lambda$10$lambda$9;
                }
            };
            this.contentLength = byteArray.length;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit content$lambda$10$lambda$9(byte[] bArr, BufferedSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            sink.write(bArr);
            return Unit.INSTANCE;
        }

        public final Builder contentType(String contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public final Builder contentLength(long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        public final Builder fileName(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }

        public final DefaultUpload build() {
            Function1<? super BufferedSink, Unit> function1 = this.writeTo;
            if (function1 == null) {
                throw new IllegalStateException("DefaultUpload content is missing".toString());
            }
            String str = this.contentType;
            if (str == null) {
                str = "application/octet-stream";
            }
            return new DefaultUpload(function1, str, this.contentLength, this.fileName);
        }
    }
}
