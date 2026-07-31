package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcen extends zzces {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    final zziof zzh;
    private final Clock zzj;

    zzcen(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcer zzcerVar) {
        this.zzj = clock;
        zzinw zza = zzinx.zza(context);
        this.zza = zza;
        zzinw zza2 = zzinx.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = zzinv.zza(zzceh.zza(zza, zza2));
        zzinw zza3 = zzinx.zza(clock);
        this.zzd = zza3;
        zzinw zza4 = zzinx.zza(zzcerVar);
        this.zze = zza4;
        zziof zza5 = zzinv.zza(zzcej.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzcel zzc = zzcel.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzinv.zza(zzcey.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzces
    final zzcek zza() {
        return new zzcek(this.zzj, (zzcei) this.zzf.zzb());
    }
}
