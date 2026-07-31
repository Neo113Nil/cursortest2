package com.apollographql.apollo.api;

import com.apollographql.apollo.api.DefaultUpload;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: FileUpload.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toUpload", "Lcom/apollographql/apollo/api/DefaultUpload;", "Ljava/io/File;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileUpload {
    public static final DefaultUpload toUpload(final File file, String contentType) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        DefaultUpload.Builder contentType2 = new DefaultUpload.Builder().content(new Function1() { // from class: com.apollographql.apollo.api.FileUpload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit upload$lambda$1;
                upload$lambda$1 = FileUpload.toUpload$lambda$1(file, (BufferedSink) obj);
                return upload$lambda$1;
            }
        }).contentLength(file.length()).contentType(contentType);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return contentType2.fileName(name).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toUpload$lambda$1(File file, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        BufferedSource buffer = Okio.buffer(Okio.source(file));
        try {
            sink.writeAll(buffer);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(buffer, null);
            return Unit.INSTANCE;
        } finally {
        }
    }
}
