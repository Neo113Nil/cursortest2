package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzqt implements Function {
    static final /* synthetic */ zzqt zza = new zzqt();

    private /* synthetic */ zzqt() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
