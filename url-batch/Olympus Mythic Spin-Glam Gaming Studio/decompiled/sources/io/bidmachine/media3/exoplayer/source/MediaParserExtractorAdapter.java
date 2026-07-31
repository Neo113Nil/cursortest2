package io.bidmachine.media3.exoplayer.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.source.MediaParserExtractorAdapter$$ExternalSyntheticApiModelOutline0;
import com.google.common.collect.ImmutableMap;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor;
import io.bidmachine.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import io.bidmachine.media3.exoplayer.source.mediaparser.MediaParserUtil;
import io.bidmachine.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi
@UnstableApi
/* loaded from: classes13.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    @Deprecated
    public static final ProgressiveMediaExtractor.Factory FACTORY = new ProgressiveMediaExtractor.Factory() { // from class: io.bidmachine.media3.exoplayer.source.MediaParserExtractorAdapter$$ExternalSyntheticLambda0
        @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
            ProgressiveMediaExtractor lambda$static$0;
            lambda$static$0 = MediaParserExtractorAdapter.lambda$static$0(playerId);
            return lambda$static$0;
        }
    };
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private String parserName;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ProgressiveMediaExtractor lambda$static$0(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId, ImmutableMap.of());
    }

    public static final class Factory implements ProgressiveMediaExtractor.Factory {
        private static final Map<String, Object> parameters = new HashMap();

        public void setConstantBitrateSeekingEnabled(boolean z) {
            if (z) {
                Map<String, Object> map = parameters;
                Boolean bool = Boolean.TRUE;
                map.put("android.media.mediaparser.adts.enableCbrSeeking", bool);
                map.put("android.media.mediaparser.amr.enableCbrSeeking", bool);
                map.put("android.media.mediaparser.mp3.enableCbrSeeking", bool);
                return;
            }
            Map<String, Object> map2 = parameters;
            map2.remove("android.media.mediaparser.adts.enableCbrSeeking");
            map2.remove("android.media.mediaparser.amr.enableCbrSeeking");
            map2.remove("android.media.mediaparser.mp3.enableCbrSeeking");
        }

        @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public MediaParserExtractorAdapter createProgressiveMediaExtractor(PlayerId playerId) {
            return new MediaParserExtractorAdapter(playerId, parameters);
        }
    }

    @Deprecated
    public MediaParserExtractorAdapter(PlayerId playerId) {
        this(playerId, ImmutableMap.of());
    }

    @SuppressLint({"WrongConstant"})
    private MediaParserExtractorAdapter(PlayerId playerId, Map<String, Object> map) {
        MediaParser create;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        create = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.mediaParser = create;
        Boolean bool = Boolean.TRUE;
        create.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        create.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        create.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.mediaParser.setParameter(entry.getKey(), entry.getValue());
        }
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        String parserName;
        String parserName2;
        String parserName3;
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            parserName3 = this.mediaParser.getParserName();
            this.parserName = parserName3;
            this.outputConsumerAdapter.setSelectedParserName(parserName3);
            return;
        }
        if (parserName.equals(this.parserName)) {
            return;
        }
        parserName2 = this.mediaParser.getParserName();
        this.parserName = parserName2;
        this.outputConsumerAdapter.setSelectedParserName(parserName2);
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        long j3;
        this.inputReaderAdapter.setCurrentPosition(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j2);
        MediaParser mediaParser = this.mediaParser;
        j3 = MediaParserExtractorAdapter$$ExternalSyntheticApiModelOutline0.m(seekPoints.second).position;
        mediaParser.seek(MediaParserExtractorAdapter$$ExternalSyntheticApiModelOutline0.m(j3 == j ? seekPoints.second : seekPoints.first));
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        boolean advance;
        advance = this.mediaParser.advance(this.inputReaderAdapter);
        long andResetSeekPosition = this.inputReaderAdapter.getAndResetSeekPosition();
        positionHolder.position = andResetSeekPosition;
        if (advance) {
            return andResetSeekPosition != -1 ? 1 : 0;
        }
        return -1;
    }
}
