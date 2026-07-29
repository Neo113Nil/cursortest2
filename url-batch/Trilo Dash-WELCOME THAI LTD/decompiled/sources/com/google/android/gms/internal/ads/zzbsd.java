package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbsd implements zzcge {
    final /* synthetic */ zzbsf zza;

    zzbsd(zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbsk zzbskVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbskVar = this.zza.zzb;
        zzbskVar.zzd();
    }
}
