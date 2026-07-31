package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzol {
    final /* synthetic */ zzom zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzup zze;
    private boolean zzf;
    private boolean zzg;

    public zzol(zzom zzomVar, String str, int i, zzup zzupVar) {
        Objects.requireNonNull(zzomVar);
        this.zza = zzomVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzupVar == null ? -1L : zzupVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        this.zze = zzupVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.zza()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbe zzbeVar, zzbe zzbeVar2) {
        int i = this.zzc;
        if (i < zzbeVar.zza()) {
            zzom zzomVar = this.zza;
            zzbeVar.zzb(i, zzomVar.zzj(), 0L);
            for (int i2 = zzomVar.zzj().zzn; i2 <= zzomVar.zzj().zzo; i2++) {
                int zze = zzbeVar2.zze(zzbeVar.zzf(i2));
                if (zze != -1) {
                    i = zzbeVar2.zzd(zze, zzomVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzup zzupVar = this.zze;
        return zzupVar == null || zzbeVar2.zze(zzupVar.zza) != -1;
    }

    public final boolean zzb(int i, zzup zzupVar) {
        if (zzupVar == null) {
            return i == this.zzc;
        }
        zzup zzupVar2 = this.zze;
        return zzupVar2 == null ? !zzupVar.zzb() && zzupVar.zzd == this.zzd : zzupVar.zzd == zzupVar2.zzd && zzupVar.zzb == zzupVar2.zzb && zzupVar.zzc == zzupVar2.zzc;
    }

    public final void zzc(int i, zzup zzupVar) {
        if (this.zzd == -1 && i == this.zzc && zzupVar != null) {
            zzom zzomVar = this.zza;
            long j = zzupVar.zzd;
            if (j >= zzomVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zzme zzmeVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return this.zzc != zzmeVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzupVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbe zzbeVar = zzmeVar.zzb;
        int zze = zzbeVar.zze(zzupVar.zza);
        int zze2 = zzbeVar.zze(this.zze.zza);
        zzup zzupVar2 = this.zze;
        if (j2 < zzupVar2.zzd || zze < zze2) {
            return false;
        }
        if (zze > zze2) {
            return true;
        }
        if (!zzupVar.zzb()) {
            int i = zzupVar.zze;
            return i == -1 || i > zzupVar2.zzb;
        }
        int i2 = zzupVar.zzb;
        int i3 = zzupVar.zzc;
        int i4 = zzupVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzupVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzup zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}
