package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzftc extends zzfst {
    private final Object zza;

    zzftc(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzftc) {
            return this.zza.equals(((zzftc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final zzfst zza(zzfsm zzfsmVar) {
        Object apply = zzfsmVar.apply(this.zza);
        zzfsx.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzftc(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
