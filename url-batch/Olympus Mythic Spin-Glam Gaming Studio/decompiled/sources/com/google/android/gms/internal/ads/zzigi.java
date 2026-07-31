package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zzigi {
    zzigi() {
    }

    public static final List zza(Object obj, long j) {
        zzify zzifyVar = (zzify) zziih.zzl(obj, j);
        if (zzifyVar.zza()) {
            return zzifyVar;
        }
        int size = zzifyVar.size();
        zzify zzh = zzifyVar.zzh(size == 0 ? 10 : size + size);
        zziih.zzm(obj, j, zzh);
        return zzh;
    }
}
