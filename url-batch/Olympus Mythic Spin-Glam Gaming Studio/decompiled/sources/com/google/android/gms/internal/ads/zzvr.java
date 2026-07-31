package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public class zzvr extends zziw {
    public final int zza;

    public zzvr(Throwable th, @Nullable zzvs zzvsVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvsVar == null ? null : zzvsVar.zza)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
