package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdd {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final int zzb;

    static {
        String str = zzfm.zza;
        zzc = Integer.toString(0, 36);
        zzd = Integer.toString(1, 36);
    }

    public zzdd(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
