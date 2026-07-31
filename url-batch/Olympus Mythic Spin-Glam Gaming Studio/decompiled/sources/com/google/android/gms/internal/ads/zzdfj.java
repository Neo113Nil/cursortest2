package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdfj extends zzdjn implements zzbox {
    private final Bundle zzb;

    zzdfj(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzdfi.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
