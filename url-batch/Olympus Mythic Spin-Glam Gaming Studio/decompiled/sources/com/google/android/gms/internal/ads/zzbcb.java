package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbcb extends zzazv {
    public Long zza;
    public Long zzb;

    public zzbcb() {
    }

    public zzbcb(String str) {
        HashMap zzb = zzazv.zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Long) zzb.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }
}
