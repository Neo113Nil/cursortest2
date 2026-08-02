package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeux implements zzeve {
    private final boolean zza;

    zzeux(zzfbf zzfbfVar) {
        this.zza = zzfbfVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzi(this.zza ? new zzevd() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzevd
            public final void zzf(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
