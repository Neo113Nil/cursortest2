package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzqm extends zzgg {
    public final zzqn zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqm(Throwable th, zzqn zzqnVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqnVar == null ? null : zzqnVar.zza)), th);
        String str = null;
        this.zza = zzqnVar;
        if (zzen.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
