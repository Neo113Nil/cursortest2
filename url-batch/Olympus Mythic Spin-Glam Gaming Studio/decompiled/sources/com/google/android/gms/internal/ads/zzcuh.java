package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzcuh implements zzhcv {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcun zzb;

    zzcuh(zzcun zzcunVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcunVar);
        this.zzb = zzcunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzcun zzcunVar = this.zzb;
        zzcunVar.zzu().zza(zzcunVar.zzt().zzb(zzcunVar.zzr(), zzcunVar.zzs(), false, this.zza, null, zzcunVar.zzp(), zzcunVar.zzw(), zzcunVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcun zzcunVar = this.zzb;
        zzcunVar.zzu().zza(zzcunVar.zzt().zzb(zzcunVar.zzr(), zzcunVar.zzs(), false, str, str2, zzcunVar.zzp(), zzcunVar.zzw(), zzcunVar.zzx()), zzcunVar.zzv());
    }
}
