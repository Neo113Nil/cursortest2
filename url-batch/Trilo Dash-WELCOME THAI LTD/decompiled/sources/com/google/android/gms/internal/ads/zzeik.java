package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzeik implements zzfuw {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbg zzc;
    final /* synthetic */ zzfbj zzd;
    final /* synthetic */ zzfic zze;
    final /* synthetic */ zzfbs zzf;
    final /* synthetic */ zzeil zzg;

    zzeik(zzeil zzeilVar, long j, String str, zzfbg zzfbgVar, zzfbj zzfbjVar, zzfic zzficVar, zzfbs zzfbsVar) {
        this.zzg = zzeilVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfbgVar;
        this.zzd = zzfbjVar;
        this.zze = zzficVar;
        this.zzf = zzfbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        Clock clock;
        boolean z;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzefd zzefdVar;
        zzfig zzfigVar;
        zzeim zzeimVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        int i = th instanceof TimeoutException ? 2 : th instanceof zzeia ? 3 : th instanceof CancellationException ? 4 : th instanceof zzfcd ? 5 : ((th instanceof zzdzk) && zzfcx.zza(th).zza == 3) ? 1 : 6;
        zzeil.zzg(this.zzg, this.zzb, i, elapsedRealtime, this.zzc.zzah);
        zzeil zzeilVar = this.zzg;
        z = zzeilVar.zze;
        if (z) {
            zzeimVar = zzeilVar.zzb;
            zzeimVar.zza(this.zzd, this.zzc, i, th instanceof zzefc ? (zzefc) th : null, elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgV)).booleanValue()) {
            zzfigVar = this.zzg.zzc;
            zzfic zzficVar = this.zze;
            zzfbs zzfbsVar = this.zzf;
            zzfbg zzfbgVar = this.zzc;
            zzfigVar.zzd(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzo));
        }
        com.google.android.gms.ads.internal.client.zze zza = zzfcx.zza(th);
        int i2 = zza.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza = zzfcx.zza(new zzefc(13, zza.zzd));
        }
        zzefdVar = this.zzg.zzf;
        zzefdVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzefd zzefdVar;
        zzeim zzeimVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeil.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeil zzeilVar = this.zzg;
        z = zzeilVar.zze;
        if (z) {
            zzeimVar = zzeilVar.zzb;
            zzeimVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzefdVar = this.zzg.zzf;
        zzefdVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
