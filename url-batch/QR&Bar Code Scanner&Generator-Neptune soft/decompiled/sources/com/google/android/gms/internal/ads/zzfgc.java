package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfgc implements zzfga {
    private final String zza;

    public zzfgc(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfga
    public final boolean equals(Object obj) {
        if (obj instanceof zzfgc) {
            return this.zza.equals(((zzfgc) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfga
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
