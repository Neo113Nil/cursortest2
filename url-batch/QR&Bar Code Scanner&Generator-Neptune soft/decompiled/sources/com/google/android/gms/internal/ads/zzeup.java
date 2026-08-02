package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeup implements zzeve {
    private final zzceu zza;
    private final zzfzq zzb;
    private final Context zzc;

    public zzeup(zzceu zzceuVar, zzfzq zzfzqVar, Context context) {
        this.zza = zzceuVar;
        this.zzb = zzfzqVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeup.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeuq zzc() throws Exception {
        if (!this.zza.zzu(this.zzc)) {
            return new zzeuq(null, null, null, null, null);
        }
        String zze = this.zza.zze(this.zzc);
        String str = zze == null ? "" : zze;
        String zzc = this.zza.zzc(this.zzc);
        String str2 = zzc == null ? "" : zzc;
        String zza = this.zza.zza(this.zzc);
        String str3 = zza == null ? "" : zza;
        String zzb = this.zza.zzb(this.zzc);
        return new zzeuq(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzad) : null);
    }
}
