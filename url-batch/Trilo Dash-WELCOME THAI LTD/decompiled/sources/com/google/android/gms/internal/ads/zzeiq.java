package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeiq implements zzfuh {
    private final zzfge zza;
    private final zzdbu zzb;
    private final zzfic zzc;
    private final zzfig zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxz zzg;
    private final zzeil zzh;
    private final zzefd zzi;
    private final Context zzj;
    private final zzfhq zzk;

    zzeiq(Context context, zzfge zzfgeVar, zzeil zzeilVar, zzdbu zzdbuVar, zzfic zzficVar, zzfig zzfigVar, zzcxz zzcxzVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefd zzefdVar, zzfhq zzfhqVar) {
        this.zzj = context;
        this.zza = zzfgeVar;
        this.zzh = zzeilVar;
        this.zzb = zzdbuVar;
        this.zzc = zzficVar;
        this.zzd = zzfigVar;
        this.zzg = zzcxzVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefdVar;
        this.zzk = zzfhqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    @Override // com.google.android.gms.internal.ads.zzfuh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzfvj zza(Object obj) throws Exception {
        String str;
        zzfbi zzfbiVar;
        int i;
        final zzfbs zzfbsVar = (zzfbs) obj;
        int i2 = zzfbsVar.zzb.zzb.zze;
        if (i2 != 0) {
            if (i2 < 200 || i2 >= 300) {
                str = (i2 < 300 || i2 >= 400) ? "Received error HTTP response code: " + i2 : "No location header to follow redirect or too many redirects.";
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzev)).booleanValue()) {
                str = "No fill.";
            }
            zzfbj zzfbjVar = zzfbsVar.zzb.zzb;
            zzfbiVar = zzfbjVar.zzi;
            if (zzfbiVar != null) {
                str = zzfbiVar.zza();
            }
            this.zzi.zzg(zzfbjVar);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgT)).booleanValue() && (i = zzfbsVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
                return zzfva.zzh(new zzeio(3, str));
            }
            zzffj zza = zzffo.zzc(zzfva.zzh(new zzeio(3, str)), zzffy.RENDER_CONFIG_INIT, this.zza).zza();
            for (zzfbg zzfbgVar : zzfbsVar.zzb.zza) {
                this.zzi.zzd(zzfbgVar);
                Iterator it = zzfbgVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.zzi.zze(zzfbgVar, 0L, zzfcx.zzd(1, null, null));
                        break;
                    }
                    zzeey zza2 = this.zzg.zza(zzfbgVar.zzb, (String) it.next());
                    if (zza2 == null || !zza2.zzb(zzfbsVar, zzfbgVar)) {
                    }
                }
            }
            this.zzb.zzj(new zzctj(zzfbsVar, this.zzd, this.zzc), this.zze);
            int i3 = 0;
            for (final zzfbg zzfbgVar2 : zzfbsVar.zzb.zza) {
                Iterator it2 = zzfbgVar2.zza.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    final zzeey zza3 = this.zzg.zza(zzfbgVar2.zzb, str2);
                    if (zza3 != null && zza3.zzb(zzfbsVar, zzfbgVar2)) {
                        zza = this.zza.zzb(zzffy.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i3 + "-" + str2).zzc(Throwable.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeip
                            @Override // com.google.android.gms.internal.ads.zzfuh
                            public final zzfvj zza(Object obj2) {
                                return zzeiq.this.zzb(zzfbgVar2, zzfbsVar, zza3, (Throwable) obj2);
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
        zzfbj zzfbjVar2 = zzfbsVar.zzb.zzb;
        zzfbiVar = zzfbjVar2.zzi;
        if (zzfbiVar != null) {
        }
        this.zzi.zzg(zzfbjVar2);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgT)).booleanValue()) {
        }
        zzffj zza4 = zzffo.zzc(zzfva.zzh(new zzeio(3, str)), zzffy.RENDER_CONFIG_INIT, this.zza).zza();
        while (r1.hasNext()) {
        }
        this.zzb.zzj(new zzctj(zzfbsVar, this.zzd, this.zzc), this.zze);
        int i32 = 0;
        while (r1.hasNext()) {
        }
        return zza4;
    }

    final /* synthetic */ zzfvj zzb(zzfbg zzfbgVar, zzfbs zzfbsVar, zzeey zzeeyVar, Throwable th) throws Exception {
        zzfhg zza = zzfhf.zza(this.zzj, 12);
        zza.zzc(zzfbgVar.zzF);
        zza.zzf();
        zzeil zzeilVar = this.zzh;
        zzfvj zzo = zzfva.zzo(zzeeyVar.zza(zzfbsVar, zzfbgVar), zzfbgVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeilVar.zze(zzfbsVar, zzfbgVar, zzo, this.zzc);
        zzfhp.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
