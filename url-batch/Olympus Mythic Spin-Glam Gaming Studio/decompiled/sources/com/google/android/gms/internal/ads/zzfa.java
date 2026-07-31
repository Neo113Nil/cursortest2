package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfa {
    final /* synthetic */ zzfd zza;
    private final int zzb;

    @Nullable
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private boolean zzg;
    private long zzh;

    public zzfa(zzfd zzfdVar, int i) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        if (!zzfdVar.zzd().zza()) {
            if (this.zzg) {
                zzfdVar.zzg().zzk(2);
            }
            this.zzg = false;
            return;
        }
        zzbf zzq = zzfdVar.zzd().zzq();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzd = zzfdVar.zzd();
        zzbb zzd2 = zzfdVar.zzd();
        zzbb zzd3 = zzfdVar.zzd();
        int zzy = zzd.zzy();
        int zzz = zzd2.zzz();
        long zzu = zzd3.zzu();
        if (zzf != null && zzy == -1) {
            zzq.zzo(zzf, zzfdVar.zzf());
            zzu -= zzfm.zzs(0L);
            zzy = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzg && Objects.equals(zzf, this.zzc) && zzy == this.zzd && zzz == this.zze && zzu == this.zzf) {
            long j = elapsedRealtime - this.zzh;
            int i = this.zzb;
            if (j >= i) {
                zzfdVar.zze().zza(new zzfe(2, i));
                return;
            }
            return;
        }
        this.zzg = true;
        this.zzh = elapsedRealtime;
        this.zzc = zzf;
        this.zzd = zzy;
        this.zze = zzz;
        this.zzf = zzu;
        zzfdVar.zzg().zzk(2);
        zzfdVar.zzg().zzi(2, this.zzb);
    }
}
