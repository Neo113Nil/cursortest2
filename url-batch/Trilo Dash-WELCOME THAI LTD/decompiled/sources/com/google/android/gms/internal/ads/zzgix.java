package com.google.android.gms.internal.ads;

import java.util.Comparator;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgix implements Comparator {
    zzgix() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgjg zzgjgVar = (zzgjg) obj;
        zzgjg zzgjgVar2 = (zzgjg) obj2;
        zzgja it = zzgjgVar.iterator();
        zzgja it2 = zzgjgVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(it2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgjgVar.zzd()).compareTo(Integer.valueOf(zzgjgVar2.zzd()));
    }
}
