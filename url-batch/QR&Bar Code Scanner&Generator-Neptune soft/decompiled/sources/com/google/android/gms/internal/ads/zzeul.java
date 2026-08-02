package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeul implements zzeve {
    private final String zza;
    private final zzfzq zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfef zze;
    private final zzcom zzf;

    zzeul(zzfzq zzfzqVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfef zzfefVar, zzcom zzcomVar) {
        this.zzb = zzfzqVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfefVar;
        this.zzf = zzcomVar;
    }

    public static /* synthetic */ zzfzp zzc(zzeul zzeulVar) {
        String str = zzeulVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgj)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn = zzeulVar.zzf.zzn();
        zzdck zzdckVar = new zzdck();
        zzdckVar.zzc(zzeulVar.zzd);
        zzfed zzfedVar = new zzfed();
        zzfedVar.zzs("adUnitId");
        zzfedVar.zzE(zzeulVar.zze.zzd);
        zzfedVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzdckVar.zzf(zzfedVar.zzG());
        zzn.zza(zzdckVar.zzg());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(str);
        zzn.zzb(zzacVar.zzb());
        new zzdik();
        return zzfzg.zzf(zzfzg.zzm((zzfyx) zzfzg.zzo(zzfyx.zzv(zzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgk)).longValue(), TimeUnit.MILLISECONDS, zzeulVar.zzc), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzeum(zzamVar.zza) : new zzeum(null);
            }
        }, zzeulVar.zzb), Exception.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzcgp.zzh("", (Exception) obj);
                return new zzeum(null);
            }
        }, zzeulVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgi)).booleanValue() || "adUnitId".equals(this.zze.zzf)) ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeum(null);
            }
        }) : zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // com.google.android.gms.internal.ads.zzfym
            public final zzfzp zza() {
                return zzeul.zzc(zzeul.this);
            }
        }, this.zzb);
    }
}
