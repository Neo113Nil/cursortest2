package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzls {
    public static final zzls zza = new zzls(new zzlr());
    public final zzgke zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzls(zzlr zzlrVar) {
        this.zzb = zzlrVar.zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzls)) {
            return false;
        }
        zzls zzlsVar = (zzls) obj;
        if (!this.zzb.equals(zzlsVar.zzb)) {
            return false;
        }
        boolean z = zzlsVar.zzf;
        Double d = zzlsVar.zzc;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = zzlsVar.zzd;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z2 = zzlsVar.zze;
        boolean z3 = zzlsVar.zzg;
        boolean z4 = zzlsVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, true, true, true);
    }
}
