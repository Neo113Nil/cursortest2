package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzekn implements zzfzc {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfdk zzc;
    final /* synthetic */ zzfdn zzd;
    final /* synthetic */ zzfki zze;
    final /* synthetic */ zzfdw zzf;
    final /* synthetic */ zzeko zzg;

    zzekn(zzeko zzekoVar, long j, String str, zzfdk zzfdkVar, zzfdn zzfdnVar, zzfki zzfkiVar, zzfdw zzfdwVar) {
        this.zzg = zzekoVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfdkVar;
        this.zzd = zzfdnVar;
        this.zze = zzfkiVar;
        this.zzf = zzfdwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
    @Override // com.google.android.gms.internal.ads.zzfzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        Clock clock;
        com.google.android.gms.ads.internal.client.zze zzb;
        Integer valueOf;
        int i;
        boolean z;
        com.google.android.gms.ads.internal.client.zze zza;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzehh zzehhVar;
        zzfkm zzfkmVar;
        zzekp zzekpVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzekd) {
                r3 = 3;
            } else if (th instanceof CancellationException) {
                i = 4;
            } else if (th instanceof zzfek) {
                i = 5;
            } else if (th instanceof zzebh) {
                r3 = zzffe.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbu)).booleanValue() && (th instanceof zzehg) && (zzb = ((zzehg) th).zzb()) != null) {
                    valueOf = Integer.valueOf(zzb.zza);
                    zzeko.zzg(this.zzg, this.zzb, r3, elapsedRealtime, this.zzc.zzah, valueOf);
                    zzeko zzekoVar = this.zzg;
                    z = zzekoVar.zze;
                    if (z) {
                        zzekpVar = zzekoVar.zzb;
                        zzekpVar.zza(this.zzd, this.zzc, r3, th instanceof zzehg ? (zzehg) th : null, elapsedRealtime);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhi)).booleanValue()) {
                        zzfkmVar = this.zzg.zzc;
                        zzfki zzfkiVar = this.zze;
                        zzfdw zzfdwVar = this.zzf;
                        zzfdk zzfdkVar = this.zzc;
                        zzfkmVar.zzd(zzfkiVar.zzc(zzfdwVar, zzfdkVar, zzfdkVar.zzo));
                    }
                    zza = zzffe.zza(th);
                    i2 = zza.zza;
                    if ((i2 != 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                        zza = zzffe.zza(new zzehg(13, zza.zzd));
                    }
                    zzehhVar = this.zzg.zzf;
                    zzehhVar.zze(this.zzc, elapsedRealtime, zza);
                }
            }
            valueOf = null;
            zzeko.zzg(this.zzg, this.zzb, r3, elapsedRealtime, this.zzc.zzah, valueOf);
            zzeko zzekoVar2 = this.zzg;
            z = zzekoVar2.zze;
            if (z) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhi)).booleanValue()) {
            }
            zza = zzffe.zza(th);
            i2 = zza.zza;
            if (i2 != 3) {
            }
            zza = zzffe.zza(new zzehg(13, zza.zzd));
            zzehhVar = this.zzg.zzf;
            zzehhVar.zze(this.zzc, elapsedRealtime, zza);
        }
        i = 2;
        r3 = i;
        valueOf = null;
        zzeko.zzg(this.zzg, this.zzb, r3, elapsedRealtime, this.zzc.zzah, valueOf);
        zzeko zzekoVar22 = this.zzg;
        z = zzekoVar22.zze;
        if (z) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhi)).booleanValue()) {
        }
        zza = zzffe.zza(th);
        i2 = zza.zza;
        if (i2 != 3) {
        }
        zza = zzffe.zza(new zzehg(13, zza.zzd));
        zzehhVar = this.zzg.zzf;
        zzehhVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzehh zzehhVar;
        zzekp zzekpVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeko.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah, null);
        zzeko zzekoVar = this.zzg;
        z = zzekoVar.zze;
        if (z) {
            zzekpVar = zzekoVar.zzb;
            zzekpVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzehhVar = this.zzg.zzf;
        zzehhVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
