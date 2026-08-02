package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzddm extends zzdij implements zzdde {
    public zzddm(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzddq) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzb() {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddk
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzddq) obj).zzk(zzffe.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzc(final zzdmo zzdmoVar) {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzddq) obj).zzk(zzffe.zzd(12, zzdmo.this.getMessage(), null));
            }
        });
    }
}
