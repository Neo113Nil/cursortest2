package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes14.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
    }

    @Nullable
    @RequiresApi
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
