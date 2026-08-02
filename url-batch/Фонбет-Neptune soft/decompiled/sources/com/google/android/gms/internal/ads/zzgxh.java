package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxh {
    private final Object zza;
    private final int zzb;

    zzgxh(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxh)) {
            return false;
        }
        zzgxh zzgxhVar = (zzgxh) obj;
        return this.zza == zzgxhVar.zza && this.zzb == zzgxhVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
