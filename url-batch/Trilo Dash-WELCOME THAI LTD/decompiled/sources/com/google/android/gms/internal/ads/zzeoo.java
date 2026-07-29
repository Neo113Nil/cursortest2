package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeoo implements zzetb {
    private final Executor zza;
    private final zzcer zzb;

    zzeoo(Executor executor, zzcer zzcerVar) {
        this.zza = executor;
        this.zzb = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzci)).booleanValue() ? zzfva.zzi(null) : zzfva.zzm(this.zzb.zzj(), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzeta() { // from class: com.google.android.gms.internal.ads.zzeon
                    @Override // com.google.android.gms.internal.ads.zzeta
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
