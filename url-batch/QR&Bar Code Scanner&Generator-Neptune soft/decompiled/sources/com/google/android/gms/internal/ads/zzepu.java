package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepu implements zzeve {
    private final zzfzp zza;
    private final Executor zzb;

    public zzepu(zzfzp zzfzpVar, Executor executor) {
        this.zza = zzfzpVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzn(this.zza, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                final String str = (String) obj;
                return zzfzg.zzi(new zzevd() { // from class: com.google.android.gms.internal.ads.zzeps
                    @Override // com.google.android.gms.internal.ads.zzevd
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
