package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgqp {
    private final Object zza;
    private final int zzb;

    zzgqp(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqp)) {
            return false;
        }
        zzgqp zzgqpVar = (zzgqp) obj;
        return this.zza == zzgqpVar.zza && this.zzb == zzgqpVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
