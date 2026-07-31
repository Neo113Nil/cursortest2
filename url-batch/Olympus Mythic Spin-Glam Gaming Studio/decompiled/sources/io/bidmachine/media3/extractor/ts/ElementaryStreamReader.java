package io.bidmachine.media3.extractor.ts;

import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes14.dex */
public interface ElementaryStreamReader {
    void consume(ParsableByteArray parsableByteArray) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void packetFinished(boolean z);

    void packetStarted(long j, int i);

    void seek();
}
