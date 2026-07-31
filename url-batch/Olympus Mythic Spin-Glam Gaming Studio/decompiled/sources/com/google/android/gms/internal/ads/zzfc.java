package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfc {
    final /* synthetic */ zzfd zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfc(zzfd zzfdVar, int i) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        int zzi = zzfdVar.zzd().zzi();
        if (!zzfdVar.zzd().zzk() || zzfdVar.zzd().zzh() == 1 || zzfdVar.zzd().zzh() == 4 || zzi == 0 || zzi == 1) {
            if (this.zzd) {
                zzfdVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == zzi) {
            long j = elapsedRealtime - this.zze;
            int i = this.zzb;
            if (j >= i) {
                zzfdVar.zze().zza(new zzfe(4, i));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = elapsedRealtime;
        this.zzc = zzi;
        zzfdVar.zzg().zzk(4);
        zzfdVar.zzg().zzi(4, this.zzb);
    }
}
