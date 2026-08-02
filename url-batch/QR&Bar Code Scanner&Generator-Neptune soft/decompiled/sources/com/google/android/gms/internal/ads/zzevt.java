package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzevt implements zzeve {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcfp zze;

    public zzevt(zzcfp zzcfpVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.zze = zzcfpVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaO)).booleanValue()) {
            return zzfzg.zzh(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfzg.zzf((zzfyx) zzfzg.zzo(zzfzg.zzm(zzfyx.zzv(this.zze.zza(this.zza, this.zzd)), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                info.getClass();
                return new zzevu(info, null);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return zzevt.this.zzc((Throwable) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ zzevu zzc(Throwable th) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzevu(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
