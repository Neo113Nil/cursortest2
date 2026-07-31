package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzevj implements zzeup {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgpd zzc;
    private final ScheduledExecutorService zzd;
    private final zzedx zze;
    private final zzfdc zzf;
    private final VersionInfoParcel zzg;

    zzevj(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzedx zzedxVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedxVar;
        this.zzf = zzfdcVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(com.amazon.a.a.o.b.f.f598a)).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzeup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        ListenableFuture zzc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlj)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzln)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlh)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzli)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlf)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlg);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzc = zzgot.zzi(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    } catch (Exception e) {
                        zzc = zzgot.zzc(e);
                    }
                    zzgpd zzgpdVar = this.zzc;
                    return zzgot.zzi((zzgol) zzgot.zzh((zzgol) zzgot.zzj(zzgol.zzw(zzc), zzevi.zza, zzgpdVar), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevg
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzevj.this.zzc((Throwable) obj);
                        }
                    }, zzgpdVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return zzgot.zza(new zzevk("", -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlk)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgot.zza(th instanceof SecurityException ? new zzevk("", 2, null) : th instanceof IllegalStateException ? new zzevk("", 3, null) : th instanceof IllegalArgumentException ? new zzevk("", 4, null) : th instanceof TimeoutException ? new zzevk("", 5, null) : new zzevk("", 0, null));
    }
}
