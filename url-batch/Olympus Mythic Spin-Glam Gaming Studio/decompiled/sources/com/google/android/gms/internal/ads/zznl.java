package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zznl {
    public static final zznl zza = new zznl(new zznk());
    public final zzgxw zzb;

    @Nullable
    @FloatRange
    public final Double zzc = null;

    @Nullable
    @FloatRange
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznl(zznk zznkVar) {
        this.zzb = zznkVar.zza();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zznl) && this.zzb.equals(((zznl) obj).zzb);
    }

    public final int hashCode() {
        zzgxw zzgxwVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(zzgxwVar, null, null, bool, bool, bool, bool, bool);
    }
}
