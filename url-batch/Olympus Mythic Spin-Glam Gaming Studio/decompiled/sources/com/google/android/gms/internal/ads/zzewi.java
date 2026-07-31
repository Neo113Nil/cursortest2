package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzewi implements zzfdg {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzewi(@Nullable String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            Bundle zza = zzfml.zza(bundle, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
