package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhmf {
    final zzhmg zza;
    final long[] zzb;

    zzhmf() {
        this(new zzhmg(), new long[10]);
    }

    zzhmf(zzhmg zzhmgVar, long[] jArr) {
        this.zza = zzhmgVar;
        this.zzb = jArr;
    }

    zzhmf(zzhmf zzhmfVar) {
        this.zza = new zzhmg(zzhmfVar.zza);
        this.zzb = Arrays.copyOf(zzhmfVar.zzb, 10);
    }
}
