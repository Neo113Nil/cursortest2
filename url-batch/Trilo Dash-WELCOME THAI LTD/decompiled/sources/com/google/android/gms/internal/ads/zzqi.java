package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzqi extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqg zzc;
    public final String zzd;
    public final zzqi zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqi(zzad zzadVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + r13, th, zzadVar.zzm, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
        String valueOf = String.valueOf(zzadVar);
    }

    static /* bridge */ /* synthetic */ zzqi zza(zzqi zzqiVar, zzqi zzqiVar2) {
        return new zzqi(zzqiVar.getMessage(), zzqiVar.getCause(), zzqiVar.zza, false, zzqiVar.zzc, zzqiVar.zzd, zzqiVar2);
    }

    public zzqi(zzad zzadVar, Throwable th, boolean z, zzqg zzqgVar) {
        this("Decoder init failed: " + zzqgVar.zza + ", " + String.valueOf(zzadVar), th, zzadVar.zzm, false, zzqgVar, (zzeg.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzqi(String str, Throwable th, String str2, boolean z, zzqg zzqgVar, String str3, zzqi zzqiVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqgVar;
        this.zzd = str3;
        this.zze = zzqiVar;
    }
}
