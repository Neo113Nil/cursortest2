package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* compiled from: UploadRequestBody.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRequestBody;", "Lokhttp3/RequestBody;", "context", "Landroid/content/Context;", "media", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<init>", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "Lokhttp3/MediaType;", "contentLength", "", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadRequestBody extends RequestBody {
    private static final int BUFFER_SIZE = 2048;
    private final Context context;
    private final MediaData.Media media;
    public static final int $stable = 8;

    public UploadRequestBody(Context context, MediaData.Media media) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        this.context = context;
        this.media = media;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getContentType() {
        return MediaType.INSTANCE.parse(this.media.getMimeType());
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.media.getSize();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InputStream openInputStream = this.context.getContentResolver().openInputStream(this.media.getUri());
        if (openInputStream == null) {
            return;
        }
        InputStream inputStream = openInputStream;
        try {
            InputStream inputStream2 = inputStream;
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read != -1) {
                    sink.write(bArr, 0, read);
                } else {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                    return;
                }
            }
        } finally {
        }
    }
}
