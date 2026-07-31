package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i) {
        zzguk.zzi(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzr zzb(int... iArr) {
        for (int i : iArr) {
            zza(i);
        }
        return this;
    }

    public final zzs zzc() {
        zzguk.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
