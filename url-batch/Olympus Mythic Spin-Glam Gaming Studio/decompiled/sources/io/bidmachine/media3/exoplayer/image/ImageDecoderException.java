package io.bidmachine.media3.exoplayer.image;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes15.dex */
public final class ImageDecoderException extends DecoderException {
    public ImageDecoderException(String str) {
        super(str);
    }

    public ImageDecoderException(@Nullable Throwable th) {
        super(th);
    }

    public ImageDecoderException(String str, @Nullable Throwable th) {
        super(str, th);
    }
}
