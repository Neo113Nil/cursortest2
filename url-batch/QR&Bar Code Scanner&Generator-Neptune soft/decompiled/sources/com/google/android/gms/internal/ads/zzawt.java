package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzawt extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzawt(zzasw zzaswVar, Throwable th, boolean z, int i) {
        super("Decoder init failed: [" + i + "], " + String.valueOf(zzaswVar), th);
        this.zza = zzaswVar.zzf;
        this.zzb = null;
        this.zzc = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_" + Math.abs(i);
    }

    public zzawt(zzasw zzaswVar, Throwable th, boolean z, String str) {
        super("Decoder init failed: " + str + ", " + String.valueOf(zzaswVar), th);
        this.zza = zzaswVar.zzf;
        this.zzb = str;
        String str2 = null;
        if (zzbar.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzc = str2;
    }
}
