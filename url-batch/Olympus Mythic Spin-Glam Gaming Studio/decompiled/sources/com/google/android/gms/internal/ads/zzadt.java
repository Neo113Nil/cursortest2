package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzadt implements zzafd {
    final /* synthetic */ zzadz zza;
    private zzgxm zzb;

    @Nullable
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadt(zzadz zzadzVar, Context context, int i) {
        Objects.requireNonNull(zzadzVar);
        this.zza = zzadzVar;
        zzfm.zzW(context);
        this.zzb = zzgxm.zzi();
        this.zze = -9223372036854775807L;
        zzafa zzafaVar = zzafa.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzi zzC;
        zzt zza = zzvVar.zza();
        zzC = zzadz.zzC(zzvVar.zzG);
        zza.zzF(zzC);
        zza.zzQ();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zza() {
        zzadz zzadzVar = this.zza;
        if (zzadzVar.zzt()) {
            zzadzVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzb() {
        zzadz zzadzVar = this.zza;
        if (zzadzVar.zzt()) {
            zzadzVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzc(zzafa zzafaVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzd(zzv zzvVar) throws zzafc {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzi() {
        zzadz zzadzVar = this.zza;
        zzadzVar.zzA(this.zze);
        if (zzadzVar.zzy() >= zzadzVar.zzz()) {
            zzadzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final Surface zzk() {
        zzguk.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzl(zzaea zzaeaVar) {
        this.zza.zzp(zzaeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzm(@FloatRange float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgxm.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zza.zzc(surface, zzevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzguk.zzi(false);
        this.zzb = zzgxm.zzq(list);
        this.zzc = zzvVar;
        zzadz zzadzVar = this.zza;
        zzadzVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzadzVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        zzadzVar.zzw().zza(j3, new zzady(j + this.zzd, i2, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzt() {
        zzadz zzadzVar = this.zza;
        if (zzadzVar.zzw().zzc() == 0) {
            zzadzVar.zzo();
            return;
        }
        zzfi zzfiVar = new zzfi(10);
        boolean z = true;
        while (zzadzVar.zzw().zzc() > 0) {
            zzady zzadyVar = (zzady) zzadzVar.zzw().zzd();
            zzadyVar.getClass();
            if (z) {
                int i = zzadyVar.zzb;
                if (i == 0 || i == 1) {
                    zzadyVar = new zzady(zzadyVar.zza, 0, zzadyVar.zzc);
                } else {
                    zzadzVar.zzo();
                }
            }
            zzfiVar.zza(zzadyVar.zzc, zzadyVar);
            z = false;
        }
        zzadzVar.zzx(zzfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzu(long j, zzafb zzafbVar) {
        int i;
        zzguk.zzi(false);
        long j2 = j + this.zzd;
        zzadz zzadzVar = this.zza;
        long zzb = zzadzVar.zzv().zzb(j2);
        if (zzb == -9223372036854775807L || zzb >= zzadzVar.zzu() || (i = this.zzf) >= 2) {
            if (zzadzVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzafbVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzv(long j, long j2) throws zzafc {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzw(boolean z) {
        zzadz zzadzVar = this.zza;
        if (zzadzVar.zzt()) {
            zzadzVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzx() {
        this.zza.zzg();
    }
}
