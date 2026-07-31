package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfxm {
    private final zzfwn zza;
    private final ArrayList zzb;

    public zzfxm(zzfwn zzfwnVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfwnVar;
        arrayList.add(str);
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public final zzfwn zzb() {
        return this.zza;
    }

    public final ArrayList zzc() {
        return this.zzb;
    }
}
