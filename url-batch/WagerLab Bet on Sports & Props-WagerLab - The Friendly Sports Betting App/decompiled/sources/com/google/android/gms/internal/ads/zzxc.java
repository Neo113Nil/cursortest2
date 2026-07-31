package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzxc implements Comparator {
    static final /* synthetic */ zzxc zza = new zzxc();

    private /* synthetic */ zzxc() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzxl) ((List) obj).get(0)).compareTo((zzxl) ((List) obj2).get(0));
    }
}
