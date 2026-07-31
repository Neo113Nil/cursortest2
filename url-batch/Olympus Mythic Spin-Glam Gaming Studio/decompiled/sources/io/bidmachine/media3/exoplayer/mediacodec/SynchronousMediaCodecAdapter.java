package io.bidmachine.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.TraceUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.CryptoInfo;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes13.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [io.bidmachine.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        @SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec createCodec = createCodec(configuration);
                try {
                    TraceUtil.beginSection("configureCodec");
                    Surface surface = configuration.surface;
                    createCodec.configure(configuration.mediaFormat, surface, configuration.crypto, (surface == null && configuration.codecInfo.detachedSurfaceSupported && Util.SDK_INT >= 35) ? 8 : 0);
                    TraceUtil.endSection();
                    TraceUtil.beginSection("startCodec");
                    createCodec.start();
                    TraceUtil.endSection();
                    return new SynchronousMediaCodecAdapter(createCodec, configuration.loudnessCodecController);
                } catch (IOException e) {
                    e = e;
                    mediaCodec = createCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    mediaCodec = createCodec;
                    if (mediaCodec != 0) {
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        }

        protected MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            Assertions.checkNotNull(configuration.codecInfo);
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return createByCodecName;
        }
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Util.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            int i = Util.SDK_INT;
            if (i >= 30 && i < 33) {
                this.codec.stop();
            }
            if (i >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                loudnessCodecController2.removeMediaCodec(this.codec);
            }
            this.codec.release();
        } catch (Throwable th) {
            if (Util.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
            throw th;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: io.bidmachine.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                SynchronousMediaCodecAdapter.this.lambda$setOnFrameRenderedListener$0(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        metrics = this.codec.getMetrics();
        return metrics;
    }
}
