package io.bidmachine.media3.extractor.text;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.Decoder;

@UnstableApi
/* loaded from: classes4.dex */
public interface SubtitleDecoder extends Decoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> {
    void setPositionUs(long j);
}
