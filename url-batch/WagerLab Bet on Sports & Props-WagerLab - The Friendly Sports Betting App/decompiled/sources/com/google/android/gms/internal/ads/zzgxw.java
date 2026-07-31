package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgxw extends zzgqs {
    private final zzgzk zza;

    public zzgxw(zzgzk zzgzkVar) {
        this.zza = zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxw)) {
            return false;
        }
        zzgzk zzgzkVar = ((zzgxw) obj).zza;
        zzgzk zzgzkVar2 = this.zza;
        return zzgzkVar2.zzc().zzc().equals(zzgzkVar.zzc().zzc()) && zzgzkVar2.zzc().zza().equals(zzgzkVar.zzc().zza()) && zzgzkVar2.zzc().zzb().equals(zzgzkVar.zzc().zzb());
    }

    public final int hashCode() {
        zzgzk zzgzkVar = this.zza;
        return Objects.hash(zzgzkVar.zzc(), zzgzkVar.zzf());
    }

    public final String toString() {
        zzgzk zzgzkVar = this.zza;
        String zza = zzgzkVar.zzc().zza();
        int ordinal = zzgzkVar.zzc().zzc().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zza, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhep.RAW;
    }

    public final zzgzk zzb() {
        return this.zza;
    }
}
