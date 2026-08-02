package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepd implements zzeve {
    private final Context zza;

    zzepd(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzct)).booleanValue()) {
            return zzfzg.zzi(new zzepe(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfzg.zzi(null);
    }
}
