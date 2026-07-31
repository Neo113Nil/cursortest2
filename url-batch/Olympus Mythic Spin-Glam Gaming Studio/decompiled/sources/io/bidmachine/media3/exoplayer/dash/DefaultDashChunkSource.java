package io.bidmachine.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.UriUtil;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.HttpDataSource;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.dash.DashChunkSource;
import io.bidmachine.media3.exoplayer.dash.PlayerEmsgHandler;
import io.bidmachine.media3.exoplayer.dash.manifest.AdaptationSet;
import io.bidmachine.media3.exoplayer.dash.manifest.BaseUrl;
import io.bidmachine.media3.exoplayer.dash.manifest.DashManifest;
import io.bidmachine.media3.exoplayer.dash.manifest.RangedUri;
import io.bidmachine.media3.exoplayer.dash.manifest.Representation;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import io.bidmachine.media3.exoplayer.source.chunk.BundledChunkExtractor;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkHolder;
import io.bidmachine.media3.exoplayer.source.chunk.ContainerMediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.InitializationChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.source.chunk.SingleSampleMediaChunk;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes13.dex */
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @Nullable
    private IOException fatalError;
    private long lastChunkRequestRealtimeMs = -9223372036854775807L;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(DataSource.Factory factory, int i) {
            this(new BundledChunkExtractor.Factory(), factory, i);
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource.Factory
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkExtractorFactory.setSubtitleParserFactory(factory);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource.Factory
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.chunkExtractorFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource.Factory
        public Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            this.chunkExtractorFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
            DataSource createDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                createDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i, iArr, exoTrackSelection, i2, createDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource.Factory
        public Format getOutputTextFormat(Format format) {
            return this.chunkExtractorFactory.getOutputTextFormat(format);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        this.trackType = i2;
        this.dataSource = dataSource;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i4));
            BaseUrl selectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            int i5 = i4;
            this.representationHolders[i5] = new RepresentationHolder(periodDurationUs, representation, selectBaseUrl == null ? representation.baseUrls.get(0) : selectBaseUrl, factory.createProgressiveMediaExtractor(i2, representation.format, z, list, playerTrackEmsgHandler, playerId), 0L, representation.getIndex());
            i4 = i5 + 1;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j, segmentStartTimeUs, (segmentStartTimeUs >= j || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i2));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getNextChunk(LoadingInfo loadingInfo, long j, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j2;
        long j3;
        if (this.fatalError != null) {
            return;
        }
        long j4 = loadingInfo.playbackPositionUs;
        long j5 = j - j4;
        long msToUs = Util.msToUs(this.manifest.availabilityStartTimeMs) + Util.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(msToUs)) {
            return;
        }
        long msToUs2 = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long nowPeriodTimeUs = getNowPeriodTimeUs(msToUs2);
        MediaChunk mediaChunk = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
        int i3 = 0;
        while (i3 < length) {
            RepresentationHolder representationHolder = this.representationHolders[i3];
            if (representationHolder.segmentIndex == null) {
                mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                i = i3;
                i2 = length;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                j2 = j5;
                j3 = msToUs2;
            } else {
                long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(msToUs2);
                long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(msToUs2);
                i = i3;
                i2 = length;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                j2 = j5;
                j3 = msToUs2;
                long segmentNum = getSegmentNum(representationHolder, mediaChunk, j, firstAvailableSegmentNum, lastAvailableSegmentNum);
                if (segmentNum < firstAvailableSegmentNum) {
                    mediaChunkIteratorArr[i] = MediaChunkIterator.EMPTY;
                } else {
                    mediaChunkIteratorArr[i] = new RepresentationSegmentIterator(updateSelectedBaseUrl(i), segmentNum, lastAvailableSegmentNum, nowPeriodTimeUs);
                }
            }
            i3 = i + 1;
            msToUs2 = j3;
            length = i2;
            mediaChunkIteratorArr2 = mediaChunkIteratorArr;
            j5 = j2;
        }
        long j6 = j5;
        long j7 = msToUs2;
        this.trackSelection.updateSelectedTrack(j4, j6, getAvailableLiveDurationUs(j7, j4), list, mediaChunkIteratorArr2);
        int selectedIndex = this.trackSelection.getSelectedIndex();
        CmcdData.Factory isBufferEmpty = this.cmcdConfiguration == null ? null : new CmcdData.Factory(this.cmcdConfiguration, "d").setTrackSelection(this.trackSelection).setBufferedDurationUs(Math.max(0L, j6)).setPlaybackRate(loadingInfo.playbackSpeed).setIsLive(this.manifest.dynamic).setDidRebuffer(loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs)).setIsBufferEmpty(list.isEmpty());
        this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
        RepresentationHolder updateSelectedBaseUrl = updateSelectedBaseUrl(selectedIndex);
        ChunkExtractor chunkExtractor = updateSelectedBaseUrl.chunkExtractor;
        if (chunkExtractor != null) {
            Representation representation = updateSelectedBaseUrl.representation;
            RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
            RangedUri indexUri = updateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
            if (initializationUri != null || indexUri != null) {
                chunkHolder.chunk = newInitializationChunk(updateSelectedBaseUrl, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri, isBufferEmpty);
                return;
            }
        }
        long j8 = updateSelectedBaseUrl.periodDurationUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            z = true;
            if (this.periodIndex == dashManifest.getPeriodCount() - 1) {
                z2 = true;
                boolean z3 = (z2 || j8 != -9223372036854775807L) ? z : false;
                if (updateSelectedBaseUrl.getSegmentCount() != 0) {
                    chunkHolder.endOfStream = z3;
                    return;
                }
                long firstAvailableSegmentNum2 = updateSelectedBaseUrl.getFirstAvailableSegmentNum(j7);
                long lastAvailableSegmentNum2 = updateSelectedBaseUrl.getLastAvailableSegmentNum(j7);
                if (z2) {
                    long segmentEndTimeUs = updateSelectedBaseUrl.getSegmentEndTimeUs(lastAvailableSegmentNum2);
                    z3 &= segmentEndTimeUs + (segmentEndTimeUs - updateSelectedBaseUrl.getSegmentStartTimeUs(lastAvailableSegmentNum2)) >= j8 ? z : false;
                }
                boolean z4 = z3;
                long segmentNum2 = getSegmentNum(updateSelectedBaseUrl, mediaChunk, j, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
                if (segmentNum2 < firstAvailableSegmentNum2) {
                    this.fatalError = new BehindLiveWindowException();
                    return;
                }
                if (segmentNum2 > lastAvailableSegmentNum2 || (this.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                    chunkHolder.endOfStream = z4;
                    return;
                }
                if (z4 && updateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum2) >= j8) {
                    chunkHolder.endOfStream = true;
                    return;
                }
                int min = (int) Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
                if (j8 != -9223372036854775807L) {
                    while (min > 1 && updateSelectedBaseUrl.getSegmentStartTimeUs((min + segmentNum2) - 1) >= j8) {
                        min--;
                    }
                }
                chunkHolder.chunk = newMediaChunk(updateSelectedBaseUrl, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, min, list.isEmpty() ? j : -9223372036854775807L, nowPeriodTimeUs, isBufferEmpty);
                return;
            }
        } else {
            z = true;
        }
        z2 = false;
        if (z2) {
        }
        if (updateSelectedBaseUrl.getSegmentCount() != 0) {
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int indexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[indexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = ((ChunkExtractor) Assertions.checkStateNotNull(representationHolder.chunkExtractor)).getChunkIndex()) != null) {
                this.representationHolders[indexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.missingLastSegment = true;
                        return true;
                    }
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl selectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (selectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(selectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((!createFallbackOptions.isFallbackAvailable(2) && !createFallbackOptions.isFallbackAvailable(1)) || (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(createFallbackOptions, loadErrorInfo)) == null || !createFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            return false;
        }
        int i = fallbackSelectionFor.type;
        if (i == 2) {
            ExoTrackSelection exoTrackSelection = this.trackSelection;
            return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
        }
        if (i != 1) {
            return false;
        }
        this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, elapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i);
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getAvailableLiveDurationUs(long j, long j2) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j))) - j2);
    }

    private long getNowPeriodTimeUs(long j) {
        DashManifest dashManifest = this.manifest;
        long j2 = dashManifest.availabilityStartTimeMs;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - Util.msToUs(j2 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    protected Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i, @Nullable Object obj, @Nullable RangedUri rangedUri, @Nullable RangedUri rangedUri2, @Nullable CmcdData.Factory factory) {
        Representation representation = representationHolder.representation;
        if (rangedUri != null) {
            RangedUri attemptMerge = rangedUri.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (attemptMerge != null) {
                rangedUri = attemptMerge;
            }
        } else {
            rangedUri = (RangedUri) Assertions.checkNotNull(rangedUri2);
        }
        DataSpec buildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri, 0, ImmutableMap.of());
        if (factory != null) {
            buildDataSpec = factory.setObjectType("i").createCmcdData().addToDataSpec(buildDataSpec);
        }
        return new InitializationChunk(dataSource, buildDataSpec, format, i, obj, representationHolder.chunkExtractor);
    }

    protected Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i, Format format, int i2, @Nullable Object obj, long j, int i3, long j2, long j3, @Nullable CmcdData.Factory factory) {
        DataSpec dataSpec;
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j);
            DataSpec buildDataSpec = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j, j3) ? 0 : 8, ImmutableMap.of());
            if (factory != null) {
                factory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs);
                Pair<String, String> nextObjectAndRangeRequest = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
                if (nextObjectAndRangeRequest != null) {
                    factory.setNextObjectRequest((String) nextObjectAndRangeRequest.first).setNextRangeRequest((String) nextObjectAndRangeRequest.second);
                }
                dataSpec = factory.createCmcdData().addToDataSpec(buildDataSpec);
            } else {
                dataSpec = buildDataSpec;
            }
            return new SingleSampleMediaChunk(dataSource, dataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            RangedUri attemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(i4 + j), representationHolder.selectedBaseUrl.url);
            if (attemptMerge == null) {
                break;
            }
            i5++;
            i4++;
            segmentUrl = attemptMerge;
        }
        long j4 = (i5 + j) - 1;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j4);
        long j5 = representationHolder.periodDurationUs;
        long j6 = -9223372036854775807L;
        if (j5 != -9223372036854775807L && j5 <= segmentEndTimeUs2) {
            j6 = j5;
        }
        DataSpec buildDataSpec2 = DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.isSegmentAvailableAtFullNetworkSpeed(j4, j3) ? 0 : 8, ImmutableMap.of());
        if (factory != null) {
            factory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs);
            Pair<String, String> nextObjectAndRangeRequest2 = getNextObjectAndRangeRequest(j, segmentUrl, representationHolder);
            if (nextObjectAndRangeRequest2 != null) {
                factory.setNextObjectRequest((String) nextObjectAndRangeRequest2.first).setNextRangeRequest((String) nextObjectAndRangeRequest2.second);
            }
            buildDataSpec2 = factory.createCmcdData().addToDataSpec(buildDataSpec2);
        }
        DataSpec dataSpec2 = buildDataSpec2;
        long j7 = -representation.presentationTimeOffsetUs;
        if (MimeTypes.isImage(format.sampleMimeType)) {
            j7 += segmentStartTimeUs;
        }
        return new ContainerMediaChunk(dataSource, dataSpec2, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs2, j2, j6, j, i5, j7, representationHolder.chunkExtractor);
    }

    @Nullable
    private Pair<String, String> getNextObjectAndRangeRequest(long j, RangedUri rangedUri, RepresentationHolder representationHolder) {
        long j2 = j + 1;
        if (j2 >= representationHolder.getSegmentCount()) {
            return null;
        }
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j2);
        String relativePath = UriUtil.getRelativePath(rangedUri.resolveUri(representationHolder.selectedBaseUrl.url), segmentUrl.resolveUri(representationHolder.selectedBaseUrl.url));
        String str = segmentUrl.start + "-";
        if (segmentUrl.length != -1) {
            str = str + (segmentUrl.start + segmentUrl.length);
        }
        return new Pair<>(relativePath, str);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i) {
        RepresentationHolder representationHolder = this.representationHolders[i];
        BaseUrl selectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (selectBaseUrl == null || selectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder copyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(selectBaseUrl);
        this.representationHolders[i] = copyWithNewSelectedBaseUrl;
        return copyWithNewSelectedBaseUrl;
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j, long j2, long j3) {
            super(j, j2);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j3;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(currentIndex);
            int i = this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8;
            RepresentationHolder representationHolder = this.representationHolder;
            return DashUtil.buildDataSpec(representationHolder.representation, representationHolder.selectedBaseUrl.url, segmentUrl, i, ImmutableMap.of());
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }
    }

    protected static final class RepresentationHolder {

        @Nullable
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        RepresentationHolder(long j, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j2, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j2;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        @CheckResult
        RepresentationHolder copyWithNewRepresentation(long j, Representation representation) throws BehindLiveWindowException {
            long segmentNum;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j);
            if (segmentCount == 0) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            Assertions.checkStateNotNull(index2);
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j2 = segmentCount + firstSegmentNum;
            long j3 = j2 - 1;
            long timeUs2 = index.getTimeUs(j3) + index.getDurationUs(j3, j);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j4 = this.segmentNumShift;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum = j4 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum);
                    return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum, index2);
                }
                j2 = index.getSegmentNum(timeUs3, j);
            }
            segmentNum = j4 + (j2 - firstSegmentNum2);
            return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum, index2);
        }

        @CheckResult
        RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        @CheckResult
        RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstSegmentNum() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getFirstAvailableSegmentNum(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getFirstAvailableSegmentNum(this.periodDurationUs, j) + this.segmentNumShift;
        }

        public long getSegmentCount() {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentStartTimeUs(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getTimeUs(j - this.segmentNumShift);
        }

        public long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public RangedUri getSegmentUrl(long j) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getSegmentUrl(j - this.segmentNumShift);
        }

        public long getLastAvailableSegmentNum(long j) {
            return (getFirstAvailableSegmentNum(j) + ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).getAvailableSegmentCount(this.periodDurationUs, j)) - 1;
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j, long j2) {
            return ((DashSegmentIndex) Assertions.checkStateNotNull(this.segmentIndex)).isExplicit() || j2 == -9223372036854775807L || getSegmentEndTimeUs(j) <= j2;
        }
    }
}
