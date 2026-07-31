package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes6.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), th);
        int errorCodeFromPlatformDiagnosticsInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        this.codecInfo = mediaCodecInfo;
        String diagnosticInfo = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.diagnosticInfo = diagnosticInfo;
        if (Util.SDK_INT >= 23) {
            errorCodeFromPlatformDiagnosticsInfo = getErrorCodeV23(th);
        } else {
            errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfo);
        }
        this.errorCode = errorCodeFromPlatformDiagnosticsInfo;
    }

    @RequiresApi
    private static int getErrorCodeV23(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
