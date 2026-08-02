package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbcs implements Comparator {
    zzbcs(zzbcu zzbcuVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcy zzbcyVar = (zzbcy) obj;
        zzbcy zzbcyVar2 = (zzbcy) obj2;
        int i = zzbcyVar.zzc - zzbcyVar2.zzc;
        return i != 0 ? i : (zzbcyVar.zza > zzbcyVar2.zza ? 1 : (zzbcyVar.zza == zzbcyVar2.zza ? 0 : -1));
    }
}
