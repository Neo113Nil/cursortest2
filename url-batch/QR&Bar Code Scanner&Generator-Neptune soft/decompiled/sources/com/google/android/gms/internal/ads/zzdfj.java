package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdfj extends zzdij implements zzddu, zzdez {
    private final zzfdk zzb;
    private final AtomicBoolean zzc;

    public zzdfj(Set set, zzfdk zzfdkVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfdkVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgI)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzag) != null && zzsVar.zza == 3) {
            zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzdfi
                @Override // com.google.android.gms.internal.ads.zzdii
                public final void zza(Object obj) {
                    zzdfj.this.zza((zzdfl) obj);
                }
            });
        }
    }

    final /* synthetic */ void zza(zzdfl zzdflVar) throws Exception {
        zzdflVar.zzg(this.zzb.zzag);
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
