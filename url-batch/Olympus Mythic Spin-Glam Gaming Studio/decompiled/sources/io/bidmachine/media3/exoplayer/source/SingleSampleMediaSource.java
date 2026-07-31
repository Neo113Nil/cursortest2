package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Consumer;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.SingleSampleMediaSource;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.util.ReleasableExecutor;
import java.util.concurrent.Executor;

@UnstableApi
@Deprecated
/* loaded from: classes15.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;

    @Nullable
    private final Supplier downloadExecutorSupplier;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;

    @Nullable
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private Supplier downloadExecutorSupplier;

        @Nullable
        private Object tag;

        @Nullable
        private String trackId;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private boolean treatLoadErrorsAsEndOfStream = true;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = (DataSource.Factory) Assertions.checkNotNull(factory);
        }

        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        public Factory setTrackId(@Nullable String str) {
            this.trackId = str;
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }

        public <T extends Executor> Factory setDownloadExecutor(final Supplier supplier, final Consumer<T> consumer) {
            this.downloadExecutorSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.SingleSampleMediaSource$Factory$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    ReleasableExecutor lambda$setDownloadExecutor$0;
                    lambda$setDownloadExecutor$0 = SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0(Supplier.this, consumer);
                    return lambda$setDownloadExecutor$0;
                }
            };
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ReleasableExecutor lambda$setDownloadExecutor$0(Supplier supplier, Consumer consumer) {
            return ReleasableExecutor.from((Executor) supplier.get(), consumer);
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, long j) {
            return new SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag, this.downloadExecutorSupplier);
        }
    }

    private SingleSampleMediaSource(@Nullable String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, @Nullable Object obj, @Nullable Supplier supplier) {
        this.dataSourceFactory = factory;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z;
        MediaItem build = new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(ImmutableList.of(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = build;
        Format.Builder label = new Format.Builder().setSampleMimeType((String) MoreObjects.firstNonNull(subtitleConfiguration.mimeType, "text/x-unknown")).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label);
        String str2 = subtitleConfiguration.id;
        this.format = label.setId(str2 == null ? str : str2).build();
        this.dataSpec = new DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new SinglePeriodTimeline(j, true, false, false, (Object) null, build);
        this.downloadExecutorSupplier = supplier;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSpec dataSpec = this.dataSpec;
        DataSource.Factory factory = this.dataSourceFactory;
        TransferListener transferListener = this.transferListener;
        Format format = this.format;
        long j2 = this.durationUs;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId);
        boolean z = this.treatLoadErrorsAsEndOfStream;
        Supplier supplier = this.downloadExecutorSupplier;
        return new SingleSampleMediaPeriod(dataSpec, factory, transferListener, format, j2, loadErrorHandlingPolicy, createEventDispatcher, z, supplier != null ? (ReleasableExecutor) supplier.get() : null);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }
}
