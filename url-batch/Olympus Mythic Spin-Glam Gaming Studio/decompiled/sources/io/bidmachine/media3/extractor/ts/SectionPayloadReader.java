package io.bidmachine.media3.extractor.ts;

import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes13.dex */
public interface SectionPayloadReader {
    void consume(ParsableByteArray parsableByteArray);

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);
}
