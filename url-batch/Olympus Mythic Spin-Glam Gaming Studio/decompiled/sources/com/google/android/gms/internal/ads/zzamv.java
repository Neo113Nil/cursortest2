package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzamv {
    private int zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    @Nullable
    private zzv zzg;
    private int zzh;

    @Nullable
    private zzamx[] zzi;
    private int zzj;

    @Nullable
    private zzhbh zzk;

    @Nullable
    private zzhbh zzl;
    private boolean zzm;
    private int zzn;

    public zzamv() {
        this.zzb = -1;
        this.zzc = -1L;
        this.zzd = -1L;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzh = 0;
        this.zzm = true;
        this.zzn = -1;
    }

    /* synthetic */ zzamv(zzamw zzamwVar, byte[] bArr) {
        this.zza = zzamwVar.zza;
        this.zzb = zzamwVar.zzb;
        this.zzc = zzamwVar.zzc;
        this.zzd = zzamwVar.zzd;
        this.zze = zzamwVar.zze;
        this.zzf = zzamwVar.zzf;
        this.zzg = zzamwVar.zzg;
        this.zzh = zzamwVar.zzh;
        this.zzi = zzamwVar.zzb();
        this.zzj = zzamwVar.zzk;
        this.zzk = zzamwVar.zzi;
        this.zzl = zzamwVar.zzj;
        this.zzm = zzamwVar.zzm;
        this.zzn = zzamwVar.zzl;
    }

    final /* synthetic */ zzhbh zzA() {
        return this.zzl;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzm;
    }

    final /* synthetic */ int zzC() {
        return this.zzn;
    }

    public final zzamv zza(int i) {
        this.zza = i;
        return this;
    }

    public final zzamv zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzamv zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzamv zzd(long j) {
        this.zzd = j;
        return this;
    }

    public final zzamv zze(long j) {
        this.zze = j;
        return this;
    }

    public final zzamv zzf(long j) {
        this.zzf = j;
        return this;
    }

    public final zzamv zzg(zzv zzvVar) {
        this.zzg = zzvVar;
        return this;
    }

    public final zzamv zzh(int i) {
        this.zzh = i;
        return this;
    }

    public final zzamv zzi(@Nullable zzamx[] zzamxVarArr) {
        this.zzi = (zzamx[]) zzamxVarArr.clone();
        return this;
    }

    public final zzamv zzj(int i) {
        this.zzj = i;
        return this;
    }

    public final zzamv zzk(@Nullable zzhbh zzhbhVar) {
        this.zzk = zzhbhVar;
        return this;
    }

    public final zzamv zzl(@Nullable zzhbh zzhbhVar) {
        this.zzl = zzhbhVar;
        return this;
    }

    public final zzamv zzm(boolean z) {
        this.zzm = z;
        return this;
    }

    public final zzamv zzn(int i) {
        this.zzn = i;
        return this;
    }

    final /* synthetic */ int zzp() {
        return this.zza;
    }

    final /* synthetic */ int zzq() {
        return this.zzb;
    }

    final /* synthetic */ long zzr() {
        return this.zzc;
    }

    final /* synthetic */ long zzs() {
        return this.zzd;
    }

    final /* synthetic */ long zzt() {
        return this.zze;
    }

    final /* synthetic */ long zzu() {
        return this.zzf;
    }

    final /* synthetic */ zzv zzv() {
        return this.zzg;
    }

    final /* synthetic */ int zzw() {
        return this.zzh;
    }

    final /* synthetic */ zzamx[] zzx() {
        return this.zzi;
    }

    final /* synthetic */ int zzy() {
        return this.zzj;
    }

    final /* synthetic */ zzhbh zzz() {
        return this.zzk;
    }

    public final zzamw zzo() {
        this.zzg.getClass();
        return new zzamw(this, null);
    }
}
