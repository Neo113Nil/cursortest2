package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcux implements zzfzc {
    final /* synthetic */ zzcuz zza;

    zzcux(zzcuz zzcuzVar) {
        this.zza = zzcuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfeo zzfeoVar;
        zzfki zzfkiVar;
        zzfdw zzfdwVar;
        zzfdk zzfdkVar;
        zzfdk zzfdkVar2;
        Context context;
        String str = (String) obj;
        zzcuz zzcuzVar = this.zza;
        zzfeoVar = zzcuzVar.zzh;
        zzfkiVar = zzcuzVar.zzg;
        zzfdwVar = zzcuzVar.zze;
        zzfdkVar = zzcuzVar.zzf;
        zzfdkVar2 = zzcuzVar.zzf;
        List zzd = zzfkiVar.zzd(zzfdwVar, zzfdkVar, false, "", str, zzfdkVar2.zzc);
        zzcfy zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        zzfeoVar.zzc(zzd, true == zzo.zzv(context) ? 2 : 1);
    }
}
