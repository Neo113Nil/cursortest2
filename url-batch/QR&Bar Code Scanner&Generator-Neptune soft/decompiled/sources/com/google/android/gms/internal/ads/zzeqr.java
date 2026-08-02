package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeqr implements zzeve {
    private final Executor zza;
    private final zzcfy zzb;

    zzeqr(Executor executor, zzcfy zzcfyVar) {
        this.zza = executor;
        this.zzb = zzcfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcl)).booleanValue() ? zzfzg.zzi(null) : zzfzg.zzm(this.zzb.zzj(), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeqp
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzevd() { // from class: com.google.android.gms.internal.ads.zzeqq
                    @Override // com.google.android.gms.internal.ads.zzevd
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
