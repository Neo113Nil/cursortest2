package coil.fetch;

import android.media.MediaDataSource;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* compiled from: MediaDataSourceFetcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcoil/fetch/MediaDataSourceFetcher;", "Lcoil/fetch/Fetcher;", "data", "Landroid/media/MediaDataSource;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil/request/Options;", "<init>", "(Landroid/media/MediaDataSource;Lcoil/request/Options;)V", RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "MediaDataSourceOkioSource", "MediaSourceMetadata", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaDataSourceFetcher implements Fetcher {
    private final MediaDataSource data;
    private final Options options;

    public MediaDataSourceFetcher(MediaDataSource mediaDataSource, Options options) {
        this.data = mediaDataSource;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public Object fetch(Continuation<? super FetchResult> continuation) {
        return new SourceResult(ImageSources.create(Okio.buffer(new MediaDataSourceOkioSource(this.data)), this.options.getContext(), new MediaSourceMetadata(this.data)), null, DataSource.DISK);
    }

    /* compiled from: MediaDataSourceFetcher.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcoil/fetch/MediaDataSourceFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/media/MediaDataSource;", "<init>", "()V", "create", "Lcoil/fetch/Fetcher;", "data", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<MediaDataSource> {
        @Override // coil.fetch.Fetcher.Factory
        public Fetcher create(MediaDataSource data, Options options, ImageLoader imageLoader) {
            return new MediaDataSourceFetcher(data, options);
        }
    }

    /* compiled from: MediaDataSourceFetcher.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcoil/fetch/MediaDataSourceFetcher$MediaDataSourceOkioSource;", "Lokio/Source;", "mediaDataSource", "Landroid/media/MediaDataSource;", "<init>", "(Landroid/media/MediaDataSource;)V", "size", "", ViewProps.POSITION, "read", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "close", "", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaDataSourceOkioSource implements Source {
        private final MediaDataSource mediaDataSource;
        private long position;
        private long size;

        public MediaDataSourceOkioSource(MediaDataSource mediaDataSource) {
            this.mediaDataSource = mediaDataSource;
            this.size = mediaDataSource.getSize();
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) {
            long j = this.position;
            long j2 = this.size;
            if (j >= j2) {
                return -1L;
            }
            int min = (int) Math.min(byteCount, j2 - j);
            byte[] bArr = new byte[min];
            int readAt = this.mediaDataSource.readAt(this.position, bArr, 0, min);
            long j3 = readAt;
            this.position += j3;
            sink.write(bArr, 0, readAt);
            return j3;
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mediaDataSource.close();
        }
    }

    /* compiled from: MediaDataSourceFetcher.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/fetch/MediaDataSourceFetcher$MediaSourceMetadata;", "Lcoil/decode/ImageSource$Metadata;", "mediaDataSource", "Landroid/media/MediaDataSource;", "<init>", "(Landroid/media/MediaDataSource;)V", "getMediaDataSource", "()Landroid/media/MediaDataSource;", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaSourceMetadata extends ImageSource.Metadata {
        private final MediaDataSource mediaDataSource;

        public MediaSourceMetadata(MediaDataSource mediaDataSource) {
            this.mediaDataSource = mediaDataSource;
        }

        public final MediaDataSource getMediaDataSource() {
            return this.mediaDataSource;
        }
    }
}
