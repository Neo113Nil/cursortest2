package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewn implements zzeve {
    private final Context zza;
    private final zzcfy zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcfp zzf;

    public zzewn(zzcfp zzcfpVar, int i, Context context, zzcfy zzcfyVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzcfpVar;
        this.zza = context;
        this.zzb = zzcfyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzf((zzfyx) zzfzg.zzo(zzfzg.zzm(zzfyx.zzv(zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // com.google.android.gms.internal.ads.zzfym
            public final zzfzp zza() {
                return zzfzg.zzi(null);
            }
        }, this.zzd)), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzewo(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzewm
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzewn.this.zzc((Exception) obj);
                return null;
            }
        }, zzfzw.zzb());
    }

    final /* synthetic */ zzewo zzc(Exception exc) {
        this.zzb.zzt(exc, "AttestationTokenSignal");
        return null;
    }
}
