package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdds extends zzdij {
    private boolean zzb;

    public zzdds(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddr
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzddu) obj).zzl();
            }
        });
        this.zzb = true;
    }
}
