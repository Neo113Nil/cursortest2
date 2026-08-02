package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzftt extends zzfwe {
    final /* synthetic */ zzftv zza;

    zzftt(zzftv zzftvVar) {
        this.zza = zzftvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfuo.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzftu(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfui.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    final Map zza() {
        return this.zza;
    }
}
