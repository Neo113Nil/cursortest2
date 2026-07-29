package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgjz {
    private final Object zza;
    private final int zzb;

    zzgjz(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjz)) {
            return false;
        }
        zzgjz zzgjzVar = (zzgjz) obj;
        return this.zza == zzgjzVar.zza && this.zzb == zzgjzVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
