package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbyn extends zzbyi {
    final /* synthetic */ UpdateClickUrlCallback zza;

    zzbyn(zzbyr zzbyrVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
