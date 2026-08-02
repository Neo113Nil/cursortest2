package com.google.android.gms.internal.ads;

import java.util.Comparator;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgpn implements Comparator {
    zzgpn() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgpw zzgpwVar = (zzgpw) obj;
        zzgpw zzgpwVar2 = (zzgpw) obj2;
        zzgpq it = zzgpwVar.iterator();
        zzgpq it2 = zzgpwVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(it2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgpwVar.zzd()).compareTo(Integer.valueOf(zzgpwVar2.zzd()));
    }
}
