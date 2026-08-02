package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbms implements zzbzx {
    final /* synthetic */ zzbmu zza;

    zzbms(zzbmu zzbmuVar) {
        this.zza = zzbmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmz zzbmzVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbmzVar = this.zza.zzb;
        zzbmzVar.zzd();
    }
}
