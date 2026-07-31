package com.apollographql.apollo.api;

import com.apollographql.apollo.api.DefaultUpload;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: DefaultUpload.concurrent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"toUpload", "Lcom/apollographql/apollo/api/Upload;", "Lokio/Path;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "", "fileSystem", "Lokio/FileSystem;", "apollo-api"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/DefaultUploadKt")
/* loaded from: classes3.dex */
final /* synthetic */ class DefaultUploadKt__DefaultUpload_concurrentKt {
    public static /* synthetic */ Upload toUpload$default(Path path, String str, FileSystem fileSystem, int i, Object obj) {
        if ((i & 2) != 0) {
            fileSystem = FileSystem.SYSTEM;
        }
        return DefaultUploadKt.toUpload(path, str, fileSystem);
    }

    public static final Upload toUpload(final Path path, String contentType, final FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        DefaultUpload.Builder contentType2 = new DefaultUpload.Builder().content(new Function1() { // from class: com.apollographql.apollo.api.DefaultUploadKt__DefaultUpload_concurrentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit upload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt;
                upload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt = DefaultUploadKt__DefaultUpload_concurrentKt.toUpload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt(FileSystem.this, path, (BufferedSink) obj);
                return upload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt;
            }
        }).contentType(contentType);
        Long size = fileSystem.metadata(path).getSize();
        return contentType2.contentLength(size != null ? size.longValue() : -1L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toUpload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt(FileSystem fileSystem, Path path, BufferedSink sink) {
        Throwable th;
        Intrinsics.checkNotNullParameter(sink, "sink");
        FileHandle openReadOnly = fileSystem.openReadOnly(path);
        try {
            th = null;
            sink.writeAll(Okio.buffer(FileHandle.source$default(openReadOnly, 0L, 1, null)));
            Unit unit = Unit.INSTANCE;
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == null) {
            return Unit.INSTANCE;
        }
        throw th;
    }
}
