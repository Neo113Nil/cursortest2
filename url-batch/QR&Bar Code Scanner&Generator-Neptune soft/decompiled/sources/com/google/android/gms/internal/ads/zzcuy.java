package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcuy implements zzfzc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcuz zzb;

    zzcuy(zzcuz zzcuzVar, String str) {
        this.zzb = zzcuzVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzfeo zzfeoVar;
        zzfki zzfkiVar;
        zzfdw zzfdwVar;
        zzfdk zzfdkVar;
        zzfdk zzfdkVar2;
        zzcuz zzcuzVar = this.zzb;
        zzfeoVar = zzcuzVar.zzh;
        zzfkiVar = zzcuzVar.zzg;
        zzfdwVar = zzcuzVar.zze;
        zzfdkVar = zzcuzVar.zzf;
        String str = this.zza;
        zzfdkVar2 = zzcuzVar.zzf;
        zzfeoVar.zza(zzfkiVar.zzd(zzfdwVar, zzfdkVar, false, str, null, zzfdkVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfeo zzfeoVar;
        zzfki zzfkiVar;
        zzfdw zzfdwVar;
        zzfdk zzfdkVar;
        zzfdk zzfdkVar2;
        String str = (String) obj;
        zzcuz zzcuzVar = this.zzb;
        zzfeoVar = zzcuzVar.zzh;
        zzfkiVar = zzcuzVar.zzg;
        zzfdwVar = zzcuzVar.zze;
        zzfdkVar = zzcuzVar.zzf;
        String str2 = this.zza;
        zzfdkVar2 = zzcuzVar.zzf;
        zzfeoVar.zza(zzfkiVar.zzd(zzfdwVar, zzfdkVar, false, str2, str, zzfdkVar2.zzd));
    }
}
