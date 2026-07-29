package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbbo implements Comparator {
    zzbbo(zzbbq zzbbqVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbu zzbbuVar = (zzbbu) obj;
        zzbbu zzbbuVar2 = (zzbbu) obj2;
        int i = zzbbuVar.zzc - zzbbuVar2.zzc;
        return i != 0 ? i : (int) (zzbbuVar.zza - zzbbuVar2.zza);
    }
}
