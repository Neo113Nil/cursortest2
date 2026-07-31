package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfec implements zzfdi {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzhdi zzc;
    private final ScheduledExecutorService zzd;
    private final zzemo zze;
    private final zzflw zzf;
    private final VersionInfoParcel zzg;

    zzfec(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzemo zzemoVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzhdiVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzemoVar;
        this.zzf = zzflwVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzfdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        ListenableFuture zzc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzma)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzme)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlY)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlZ)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlW)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlX);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzc = zzhcy.zzi(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmc)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    } catch (Exception e) {
                        zzc = zzhcy.zzc(e);
                    }
                    zzhdi zzhdiVar = this.zzc;
                    return zzhcy.zzi((zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj(zzhcq.zzw(zzc), zzfeb.zza, zzhdiVar), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfdz
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzfec.this.zzc((Throwable) obj);
                        }
                    }, zzhdiVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmc)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return zzhcy.zza(new zzfed("", -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfea
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmb)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzj(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzhcy.zza(th instanceof SecurityException ? new zzfed("", 2, null) : th instanceof IllegalStateException ? new zzfed("", 3, null) : th instanceof IllegalArgumentException ? new zzfed("", 4, null) : th instanceof TimeoutException ? new zzfed("", 5, null) : new zzfed("", 0, null));
    }
}
