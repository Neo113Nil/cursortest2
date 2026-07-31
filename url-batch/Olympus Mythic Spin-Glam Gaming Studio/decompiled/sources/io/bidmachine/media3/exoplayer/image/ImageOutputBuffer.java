package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderOutputBuffer;

@UnstableApi
/* loaded from: classes4.dex */
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    @Nullable
    public Bitmap bitmap;

    @Override // io.bidmachine.media3.decoder.DecoderOutputBuffer, io.bidmachine.media3.decoder.Buffer
    @CallSuper
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
