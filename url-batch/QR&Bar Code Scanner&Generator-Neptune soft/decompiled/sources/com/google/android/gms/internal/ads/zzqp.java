package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzqp extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqn zzc;
    public final String zzd;
    public final zzqp zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqp(zzaf zzafVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + r13, th, zzafVar.zzm, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
        String valueOf = String.valueOf(zzafVar);
    }

    static /* bridge */ /* synthetic */ zzqp zza(zzqp zzqpVar, zzqp zzqpVar2) {
        return new zzqp(zzqpVar.getMessage(), zzqpVar.getCause(), zzqpVar.zza, false, zzqpVar.zzc, zzqpVar.zzd, zzqpVar2);
    }

    public zzqp(zzaf zzafVar, Throwable th, boolean z, zzqn zzqnVar) {
        this("Decoder init failed: " + zzqnVar.zza + ", " + String.valueOf(zzafVar), th, zzafVar.zzm, false, zzqnVar, (zzen.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzqp(String str, Throwable th, String str2, boolean z, zzqn zzqnVar, String str3, zzqp zzqpVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqnVar;
        this.zzd = str3;
        this.zze = zzqpVar;
    }
}
