package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajs extends zzajz {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajz[] zze;

    public zzajs(String str, boolean z, boolean z2, String[] strArr, zzajz[] zzajzVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzajzVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajs.class == obj.getClass()) {
            zzajs zzajsVar = (zzajs) obj;
            if (this.zzb == zzajsVar.zzb && this.zzc == zzajsVar.zzc && Objects.equals(this.zza, zzajsVar.zza) && Arrays.equals(this.zzd, zzajsVar.zzd) && Arrays.equals(this.zze, zzajsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
