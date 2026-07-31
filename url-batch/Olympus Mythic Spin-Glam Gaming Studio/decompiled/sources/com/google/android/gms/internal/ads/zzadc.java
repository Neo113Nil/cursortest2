package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzadc implements zzafd {
    private final zzaed zza;
    private final zzaee zzb;
    private final zzael zzc;
    private final Queue zzd;
    private final zzadf zze;

    @Nullable
    private Surface zzf;
    private zzv zzg;
    private long zzh;
    private zzafa zzi;
    private Executor zzj;
    private zzaea zzk;

    public zzadc(final zzaed zzaedVar, zzaee zzaeeVar, zzdp zzdpVar) {
        this.zza = zzaedVar;
        this.zzb = zzaeeVar;
        zzaedVar.zzh(zzdpVar);
        zzadf zzadfVar = new zzadf(new zzadd() { // from class: com.google.android.gms.internal.ads.zzacx
            @Override // com.google.android.gms.internal.ads.zzadd
            public final /* synthetic */ void zza(float f) {
                zzaed.this.zzf(f);
            }
        });
        this.zze = zzadfVar;
        this.zzc = new zzael(new zzadb(this, null), zzaedVar, zzaeeVar, zzadfVar);
        this.zzd = new ArrayDeque();
        this.zzg = new zzt().zzQ();
        this.zzh = -9223372036854775807L;
        this.zzi = zzafa.zzb;
        this.zzj = zzacu.zza;
        this.zzk = zzacv.zza;
    }

    final /* synthetic */ Surface zzA() {
        return this.zzf;
    }

    final /* synthetic */ zzafa zzB() {
        return this.zzi;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzj;
    }

    final /* synthetic */ zzaea zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzc(zzafa zzafaVar, Executor executor) {
        this.zzi = zzafaVar;
        this.zzj = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzg(boolean z) {
        if (z) {
            this.zza.zzm();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzh(boolean z) {
        return this.zza.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzl(zzaea zzaeaVar) {
        this.zzk = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzm(float f) {
        this.zza.zzo(f);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzo(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zzf = surface;
        this.zza.zze(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzq() {
        this.zzf = null;
        this.zza.zze(null);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzr(int i) {
        this.zza.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzguk.zzi(list.isEmpty());
        int i3 = zzvVar.zzw;
        zzv zzvVar2 = this.zzg;
        if (i3 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i3, zzvVar.zzx);
        }
        float f = zzvVar.zzA;
        if (f != this.zzg.zzA) {
            this.zze.zza(f);
        }
        this.zzg = zzvVar;
        if (j != this.zzh) {
            this.zzc.zzd(i2, j);
            this.zzh = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzt() {
        this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzu(long j, zzafb zzafbVar) {
        this.zzd.add(zzafbVar);
        this.zzc.zze(j);
        this.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzadc.this.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzw(boolean z) {
        this.zza.zzk(z);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzx() {
    }

    final /* synthetic */ void zzy() {
        this.zzi.zza();
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final Surface zzk() {
        Surface surface = this.zzf;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzv(long j, long j2) throws zzafc {
        try {
            this.zzc.zzb(j, j2);
        } catch (zzjn e) {
            throw new zzafc(e, this.zzg);
        }
    }
}
