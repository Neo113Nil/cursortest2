package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdht extends zzdij implements zzbor {
    public zzdht(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final synchronized void zzbD(final String str, final String str2) {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzdhs
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzasf) obj).zzbu(str, str2);
            }
        });
    }
}
