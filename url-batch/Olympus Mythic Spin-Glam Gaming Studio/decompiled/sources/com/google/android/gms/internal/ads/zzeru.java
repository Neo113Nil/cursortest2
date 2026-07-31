package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public class zzeru extends zzbvz {
    private final zzddn zza;
    private final zzdlu zzb;
    private final zzdeh zzc;
    private final zzdew zzd;
    private final zzdfb zze;
    private final zzdit zzf;
    private final zzdga zzg;
    private final zzdms zzh;
    private final zzdip zzi;
    private final zzdec zzj;

    public zzeru(zzddn zzddnVar, zzdlu zzdluVar, zzdeh zzdehVar, zzdew zzdewVar, zzdfb zzdfbVar, zzdit zzditVar, zzdga zzdgaVar, zzdms zzdmsVar, zzdip zzdipVar, zzdec zzdecVar) {
        this.zza = zzddnVar;
        this.zzb = zzdluVar;
        this.zzc = zzdehVar;
        this.zzd = zzdewVar;
        this.zze = zzdfbVar;
        this.zzf = zzditVar;
        this.zzg = zzdgaVar;
        this.zzh = zzdmsVar;
        this.zzi = zzdipVar;
        this.zzj = zzdecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf() {
        this.zzg.zzdW(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzm(zzbnm zzbnmVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzcct zzcctVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzccx zzccxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i, "", "undefined", null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzw(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfmy.zzc(8, zzeVar));
    }

    public void zzz() throws RemoteException {
    }
}
