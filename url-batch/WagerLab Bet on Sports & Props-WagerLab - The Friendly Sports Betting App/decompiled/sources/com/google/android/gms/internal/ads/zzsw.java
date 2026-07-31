package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzsw extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzst zzc;
    public final String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsw(zzu zzuVar, Throwable th, boolean z, int i) {
        this(r4, th, r6, false, null, r15.toString(), null);
        String obj = zzuVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + obj.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(obj);
        String sb2 = sb.toString();
        String str = zzuVar.zzo;
        int abs = Math.abs(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(abs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(abs);
    }

    final /* synthetic */ zzsw zza(zzsw zzswVar) {
        return new zzsw(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzswVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsw(zzu zzuVar, Throwable th, boolean z, zzst zzstVar) {
        this(r6.toString(), th, zzuVar.zzo, false, zzstVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        String str = zzstVar.zza;
        int length = str.length();
        String obj = zzuVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + obj.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
    }

    private zzsw(String str, Throwable th, String str2, boolean z, zzst zzstVar, String str3, zzsw zzswVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzstVar;
        this.zzd = str3;
    }
}
