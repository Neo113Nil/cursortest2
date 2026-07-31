package io.bidmachine.media3.extractor.jpeg;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ForwardingSeekMap;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes4.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return this.extractorOutput.track(i, i2);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.extractorOutput.seekMap(new ForwardingSeekMap(seekMap) { // from class: io.bidmachine.media3.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // io.bidmachine.media3.extractor.ForwardingSeekMap, io.bidmachine.media3.extractor.SeekMap
            public SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.first;
                SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
            }
        });
    }
}
