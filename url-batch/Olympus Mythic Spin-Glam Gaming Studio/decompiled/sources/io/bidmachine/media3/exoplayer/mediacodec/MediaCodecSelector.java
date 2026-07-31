package io.bidmachine.media3.exoplayer.mediacodec;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

@UnstableApi
/* loaded from: classes13.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda0
        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return MediaCodecUtil.getDecoderInfos(str, z, z2);
        }
    };
    public static final MediaCodecSelector PREFER_SOFTWARE = new MediaCodecSelector() { // from class: io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda1
        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            List lambda$static$0;
            lambda$static$0 = MediaCodecSelector.lambda$static$0(str, z, z2);
            return lambda$static$0;
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List lambda$static$0(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(DEFAULT.getDecoderInfos(str, z, z2));
    }
}
