package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzvx extends zzto implements zzvl {
    private final zzfz zza;
    private final zzvh zzb;
    private final zzru zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = C.TIME_UNSET;
    private boolean zzg;
    private boolean zzh;
    private zzgy zzi;
    private zzaj zzj;
    private final zzyy zzk;

    /* synthetic */ zzvx(zzaj zzajVar, zzfz zzfzVar, zzvh zzvhVar, zzru zzruVar, zzyy zzyyVar, int i, int i2, zzu zzuVar, zzght zzghtVar, byte[] bArr) {
        this.zzj = zzajVar;
        this.zza = zzfzVar;
        this.zzb = zzvhVar;
        this.zzc = zzruVar;
        this.zzk = zzyyVar;
        this.zzd = i;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        zzaj zzJ = zzJ();
        zzbe zzwjVar = new zzwj(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j, j, 0L, 0L, z, false, false, null, zzJ, z2 ? zzJ.zzc : null);
        if (this.zze) {
            zzwjVar = new zzvu(this, zzwjVar);
        }
        zze(zzwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final synchronized void zzA(zzaj zzajVar) {
        this.zzj = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzvt) zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzun zzG(zzup zzupVar, zzyv zzyvVar, long j) {
        zzga zza = this.zza.zza();
        zzgy zzgyVar = this.zzi;
        if (zzgyVar != null) {
            zza.zze(zzgyVar);
        }
        zzaf zzafVar = zzJ().zzb;
        zzafVar.getClass();
        return new zzvt(zzafVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzupVar), this.zzk, zzf(zzupVar), this, zzyvVar, null, this.zzd, 0, null, zzeo.zzq(C.TIME_UNSET), null);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final synchronized zzaj zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zza(zzgy zzgyVar) {
        this.zzi = zzgyVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzb(long j, zzadv zzadvVar, boolean z) {
        if (j == C.TIME_UNSET) {
            j = this.zzf;
        }
        boolean zzb = zzadvVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zzb;
        this.zzh = z;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzt() {
    }
}
