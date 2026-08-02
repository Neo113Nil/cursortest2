package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfni {
    private final Context zza;
    private final Looper zzb;

    public zzfni(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfnw zza = zzfny.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfnt zza2 = zzfnu.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfnj(this.zza, this.zzb, (zzfny) zza.zzam()).zza();
    }
}
