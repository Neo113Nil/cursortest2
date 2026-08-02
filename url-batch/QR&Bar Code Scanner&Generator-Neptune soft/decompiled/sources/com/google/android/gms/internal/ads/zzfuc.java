package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
class zzfuc extends zzftv implements SortedMap {

    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfui zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuc(zzfui zzfuiVar, SortedMap sortedMap) {
        super(zzfuiVar, sortedMap);
        this.zze = zzfuiVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfuc(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfuc(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfuc(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwh
    public SortedSet zzg() {
        return new zzfud(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzftv, com.google.android.gms.internal.ads.zzfwh, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zzg();
        this.zzd = zzg;
        return zzg;
    }
}
