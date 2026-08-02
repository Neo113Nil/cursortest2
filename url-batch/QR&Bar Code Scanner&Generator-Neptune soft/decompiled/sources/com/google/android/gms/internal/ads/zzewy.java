package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewy implements zzeve {
    final zzfzq zza;
    final String zzb;
    final zzcfm zzc;

    public zzewy(zzcfm zzcfmVar, zzfzq zzfzqVar, String str, byte[] bArr) {
        this.zzc = zzcfmVar;
        this.zza = zzfzqVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        final zzfzp zzi = zzfzg.zzi(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeT)).booleanValue()) {
            zzi = zzfzg.zzi(null);
        }
        final zzfzp zzi2 = zzfzg.zzi(null);
        return zzfzg.zzd(zzi, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewz((String) zzfzp.this.get(), (String) zzi2.get());
            }
        }, zzchc.zza);
    }
}
