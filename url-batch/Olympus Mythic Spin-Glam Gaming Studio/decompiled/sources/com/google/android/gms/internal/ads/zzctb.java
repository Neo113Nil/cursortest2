package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzctb implements zzcsl {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzp();

    public zzctb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        zzgVar.zzw(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
