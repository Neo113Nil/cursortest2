package io.bidmachine.media3.extractor.ogg;

import androidx.annotation.Nullable;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.SeekMap;
import java.io.IOException;

/* loaded from: classes10.dex */
interface OggSeeker {
    @Nullable
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput) throws IOException;

    void startSeek(long j);
}
