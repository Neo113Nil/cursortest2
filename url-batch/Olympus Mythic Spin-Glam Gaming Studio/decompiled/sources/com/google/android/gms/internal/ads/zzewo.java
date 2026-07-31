package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final /* synthetic */ class zzewo implements zzgub {
    static final /* synthetic */ zzewo zza = new zzewo();

    private /* synthetic */ zzewo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzewq(arrayList);
    }
}
