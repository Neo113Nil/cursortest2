package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ShowFirstParty
/* loaded from: classes14.dex */
public final class zzfys {
    private final Context zza;
    private final Looper zzb;

    public zzfys(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfzc zza = zzfze.zza();
        Context context = this.zza;
        zza.zza(context.getPackageName());
        zza.zzc(2);
        zzfza zza2 = zzfzb.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfyt(context, this.zzb, (zzfze) zza.zzbu()).zza();
    }
}
