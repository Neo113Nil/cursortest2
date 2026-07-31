package io.bidmachine.media3.exoplayer.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$OutputConsumer;
import android.media.MediaParser$SeekableInputReader;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.FileTypes;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import io.bidmachine.media3.exoplayer.source.mediaparser.MediaParserUtil;
import io.bidmachine.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RequiresApi
@UnstableApi
/* loaded from: classes15.dex */
public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = new HlsExtractorFactory() { // from class: io.bidmachine.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor$$ExternalSyntheticLambda0
        @Override // io.bidmachine.media3.exoplayer.hls.HlsExtractorFactory
        public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
            HlsMediaChunkExtractor lambda$static$0;
            lambda$static$0 = MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
            return lambda$static$0;
        }
    };
    private final Format format;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final ImmutableList<MediaFormat> muxedCaptionMediaFormats;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final PlayerId playerId;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HlsMediaChunkExtractor lambda$static$0(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        String parserName;
        if (FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.language, timestampAdjuster, SubtitleParser.Factory.UNSUPPORTED, false), format, timestampAdjuster);
        }
        boolean z = list != null;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                builder.add((Object) MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i)));
            }
        } else {
            builder.add((Object) MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType("application/cea-608").build()));
        }
        ImmutableList build = builder.build();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (list == null) {
            list = ImmutableList.of();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser createMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z, build, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput);
        createMediaParserInstance.advance(peekingInputReader);
        parserName = createMediaParserInstance.getParserName();
        outputConsumerAdapterV30.setSelectedParserName(parserName);
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance, outputConsumerAdapterV30, format, z, build, peekingInputReader.totalPeekedBytes, playerId);
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format, boolean z, ImmutableList<MediaFormat> immutableList, int i, PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z;
        this.muxedCaptionMediaFormats = immutableList;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        boolean advance;
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        advance = this.mediaParser.advance(this.inputReaderAdapter);
        return advance;
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        String parserName;
        parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        String parserName;
        parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public HlsMediaChunkExtractor recreate() {
        String parserName;
        Assertions.checkState(!isReusable());
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = this.outputConsumerAdapter;
        Format format = this.format;
        boolean z = this.overrideInBandCaptionDeclarations;
        ImmutableList<MediaFormat> immutableList = this.muxedCaptionMediaFormats;
        PlayerId playerId = this.playerId;
        parserName = this.mediaParser.getParserName();
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance(outputConsumerAdapterV30, format, z, immutableList, playerId, parserName), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }

    @Override // io.bidmachine.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        MediaParser.SeekPoint seekPoint;
        MediaParser mediaParser = this.mediaParser;
        seekPoint = MediaParser.SeekPoint.START;
        mediaParser.seek(seekPoint);
    }

    @SuppressLint({"WrongConstant"})
    private static MediaParser createMediaParserInstance(MediaParser$OutputConsumer mediaParser$OutputConsumer, Format format, boolean z, ImmutableList<MediaFormat> immutableList, PlayerId playerId, String... strArr) {
        MediaParser create;
        if (strArr.length == 1) {
            create = MediaParser.createByName(strArr[0], mediaParser$OutputConsumer);
        } else {
            create = MediaParser.create(mediaParser$OutputConsumer, strArr);
        }
        create.setParameter("android.media.mediaParser.exposeCaptionFormats", immutableList);
        create.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", Boolean.valueOf(z));
        Boolean bool = Boolean.TRUE;
        create.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        create.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        create.setParameter("android.media.mediaparser.ignoreTimestampOffset", bool);
        create.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        create.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(MimeTypes.getAudioMediaMimeType(str))) {
                create.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!"video/avc".equals(MimeTypes.getVideoMediaMimeType(str))) {
                create.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(create, playerId);
        }
        return create;
    }

    private static final class PeekingInputReader implements MediaParser$SeekableInputReader {
        private final ExtractorInput extractorInput;
        private int totalPeekedBytes;

        private PeekingInputReader(ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int peek = this.extractorInput.peek(bArr, i, i2);
            this.totalPeekedBytes += peek;
            return peek;
        }

        public long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        public long getLength() {
            return this.extractorInput.getLength();
        }

        public void seekToPosition(long j) {
            throw new UnsupportedOperationException();
        }
    }
}
