package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekt implements zzfyn {
    private final zzfih zza;
    private final zzddc zzb;
    private final zzfki zzc;
    private final zzfkm zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzczh zzg;
    private final zzeko zzh;
    private final zzehh zzi;
    private final Context zzj;
    private final zzfju zzk;

    zzekt(Context context, zzfih zzfihVar, zzeko zzekoVar, zzddc zzddcVar, zzfki zzfkiVar, zzfkm zzfkmVar, zzczh zzczhVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehh zzehhVar, zzfju zzfjuVar) {
        this.zzj = context;
        this.zza = zzfihVar;
        this.zzh = zzekoVar;
        this.zzb = zzddcVar;
        this.zzc = zzfkiVar;
        this.zzd = zzfkmVar;
        this.zzg = zzczhVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzehhVar;
        this.zzk = zzfjuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    @Override // com.google.android.gms.internal.ads.zzfyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzfzp zza(Object obj) throws Exception {
        String str;
        zzfdm zzfdmVar;
        int i;
        final zzfdw zzfdwVar = (zzfdw) obj;
        int i2 = zzfdwVar.zzb.zzb.zze;
        if (i2 != 0) {
            if (i2 < 200 || i2 >= 300) {
                str = (i2 < 300 || i2 >= 400) ? "Received error HTTP response code: " + i2 : "No location header to follow redirect or too many redirects.";
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeC)).booleanValue()) {
                str = "No fill.";
            }
            zzfdn zzfdnVar = zzfdwVar.zzb.zzb;
            zzfdmVar = zzfdnVar.zzi;
            if (zzfdmVar != null) {
                str = zzfdmVar.zza();
            }
            this.zzi.zzg(zzfdnVar);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhg)).booleanValue() && (i = zzfdwVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
                return zzfzg.zzh(new zzekr(3, str));
            }
            zzfhm zza = zzfhr.zzc(zzfzg.zzh(new zzekr(3, str)), zzfib.RENDER_CONFIG_INIT, this.zza).zza();
            for (zzfdk zzfdkVar : zzfdwVar.zzb.zza) {
                this.zzi.zzd(zzfdkVar);
                Iterator it = zzfdkVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.zzi.zze(zzfdkVar, 0L, zzffe.zzd(1, null, null));
                        break;
                    }
                    zzehc zza2 = this.zzg.zza(zzfdkVar.zzb, (String) it.next());
                    if (zza2 == null || !zza2.zzb(zzfdwVar, zzfdkVar)) {
                    }
                }
            }
            this.zzb.zzj(new zzcur(zzfdwVar, this.zzd, this.zzc), this.zze);
            int i3 = 0;
            for (final zzfdk zzfdkVar2 : zzfdwVar.zzb.zza) {
                Iterator it2 = zzfdkVar2.zza.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    final zzehc zza3 = this.zzg.zza(zzfdkVar2.zzb, str2);
                    if (zza3 != null && zza3.zzb(zzfdwVar, zzfdkVar2)) {
                        zza = this.zza.zzb(zzfib.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i3 + "-" + str2).zzc(Throwable.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeks
                            @Override // com.google.android.gms.internal.ads.zzfyn
                            public final zzfzp zza(Object obj2) {
                                return zzekt.this.zzb(zzfdkVar2, zzfdwVar, zza3, (Throwable) obj2);
                            }
                        }).zza();
                        break;
                    }
                }
                i3++;
            }
            return zza;
        }
        str = "No ad config.";
        zzfdn zzfdnVar2 = zzfdwVar.zzb.zzb;
        zzfdmVar = zzfdnVar2.zzi;
        if (zzfdmVar != null) {
        }
        this.zzi.zzg(zzfdnVar2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhg)).booleanValue()) {
        }
        zzfhm zza4 = zzfhr.zzc(zzfzg.zzh(new zzekr(3, str)), zzfib.RENDER_CONFIG_INIT, this.zza).zza();
        while (r1.hasNext()) {
        }
        this.zzb.zzj(new zzcur(zzfdwVar, this.zzd, this.zzc), this.zze);
        int i32 = 0;
        while (r1.hasNext()) {
        }
        return zza4;
    }

    final /* synthetic */ zzfzp zzb(zzfdk zzfdkVar, zzfdw zzfdwVar, zzehc zzehcVar, Throwable th) throws Exception {
        zzfjj zza = zzfji.zza(this.zzj, 12);
        zza.zzc(zzfdkVar.zzF);
        zza.zzf();
        zzeko zzekoVar = this.zzh;
        zzfzp zzo = zzfzg.zzo(zzehcVar.zza(zzfdwVar, zzfdkVar), zzfdkVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzekoVar.zze(zzfdwVar, zzfdkVar, zzo, this.zzc);
        zzfjt.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
