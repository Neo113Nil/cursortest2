package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzail {
    public final zzais zza;
    public final zzaiv zzb;
    public final zzaeb zzc;
    public final zzaec zzd;
    public int zze;
    public zzu zzf;

    public zzail(zzais zzaisVar, zzaiv zzaivVar, zzaeb zzaebVar) {
        this.zza = zzaisVar;
        this.zzb = zzaivVar;
        this.zzc = zzaebVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzaisVar.zzg.zzo) ? new zzaec() : null;
    }
}
