package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeck implements zzedi {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzebl zzb;
    private final zzfzq zzc;
    private final zzfef zzd;
    private final ScheduledExecutorService zze;
    private final zzefo zzf;
    private final zzfju zzg;
    private final Context zzh;

    zzeck(Context context, zzfef zzfefVar, zzebl zzeblVar, zzfzq zzfzqVar, ScheduledExecutorService scheduledExecutorService, zzefo zzefoVar, zzfju zzfjuVar) {
        this.zzh = context;
        this.zzd = zzfefVar;
        this.zzb = zzeblVar;
        this.zzc = zzfzqVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzefoVar;
        this.zzg = zzfjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedi
    public final zzfzp zzb(zzcbc zzcbcVar) {
        zzfzp zzb = this.zzb.zzb(zzcbcVar);
        zzfjj zza2 = zzfji.zza(this.zzh, 11);
        zzfjt.zzd(zzb, zza2);
        zzfzp zzn = zzfzg.zzn(zzb, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzeck.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeD)).booleanValue()) {
            zzn = zzfzg.zzg(zzfzg.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeE)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeci
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return zzfzg.zzh(new zzebh(5));
                }
            }, zzchc.zzf);
        }
        zzfjt.zza(zzn, this.zzg, zza2);
        zzfzg.zzr(zzn, new zzecj(this), zzchc.zzf);
        return zzn;
    }

    final /* synthetic */ zzfzp zzc(InputStream inputStream) throws Exception {
        return zzfzg.zzi(new zzfdw(new zzfdt(this.zzd), zzfdv.zza(new InputStreamReader(inputStream))));
    }
}
