package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
class zzfvt extends zzfwk implements zzfyc {
    protected zzfvt(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwk
    /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfwk
    final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfwk
    final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
