package io.bidmachine.media3.exoplayer.image;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.Decoder;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.image.BitmapFactoryImageDecoder;

@UnstableApi
/* loaded from: classes14.dex */
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    public interface Factory {
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(Format format);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.decoder.Decoder
    @Nullable
    ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.decoder.Decoder
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;
}
