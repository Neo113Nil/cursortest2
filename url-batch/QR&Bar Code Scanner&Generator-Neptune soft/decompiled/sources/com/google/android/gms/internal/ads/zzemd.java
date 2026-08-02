package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzemd extends zzbvp {
    private final zzdcy zza;
    private final zzdkl zzb;
    private final zzdds zzc;
    private final zzdeh zzd;
    private final zzdem zze;
    private final zzdht zzf;
    private final zzdfg zzg;
    private final zzdld zzh;
    private final zzdhp zzi;
    private final zzddn zzj;

    public zzemd(zzdcy zzdcyVar, zzdkl zzdklVar, zzdds zzddsVar, zzdeh zzdehVar, zzdem zzdemVar, zzdht zzdhtVar, zzdfg zzdfgVar, zzdld zzdldVar, zzdhp zzdhpVar, zzddn zzddnVar) {
        this.zza = zzdcyVar;
        this.zzb = zzdklVar;
        this.zzc = zzddsVar;
        this.zzd = zzdehVar;
        this.zze = zzdemVar;
        this.zzf = zzdhtVar;
        this.zzg = zzdfgVar;
        this.zzh = zzdldVar;
        this.zzi = zzdhpVar;
        this.zzj = zzddnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf() {
        this.zzg.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzffe.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzo() {
        this.zze.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzq(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzr(zzbmy zzbmyVar, String str) {
    }

    public void zzs(zzcce zzcceVar) {
    }

    public void zzt(zzcci zzcciVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
