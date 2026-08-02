package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzelc extends zzemd {
    private final zzdkw zza;

    public zzelc(zzdcy zzdcyVar, zzdkl zzdklVar, zzdds zzddsVar, zzdeh zzdehVar, zzdem zzdemVar, zzddn zzddnVar, zzdht zzdhtVar, zzdld zzdldVar, zzdfg zzdfgVar, zzdkw zzdkwVar, zzdhp zzdhpVar) {
        super(zzdcyVar, zzdklVar, zzddsVar, zzdehVar, zzdemVar, zzdhtVar, zzdfgVar, zzdldVar, zzdhpVar, zzddnVar);
        this.zza = zzdkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemd, com.google.android.gms.internal.ads.zzbvq
    public final void zzs(zzcce zzcceVar) {
        this.zza.zza(zzcceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemd, com.google.android.gms.internal.ads.zzbvq
    public final void zzt(zzcci zzcciVar) throws RemoteException {
        this.zza.zza(new zzcce(zzcciVar.zzf(), zzcciVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzemd, com.google.android.gms.internal.ads.zzbvq
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzemd, com.google.android.gms.internal.ads.zzbvq
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzemd, com.google.android.gms.internal.ads.zzbvq
    public final void zzy() {
        this.zza.zzc();
    }
}
