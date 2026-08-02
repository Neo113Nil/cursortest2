package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdhv implements zzdfv {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzba)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final synchronized void zzb(zzfdw zzfdwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbb)).booleanValue()) {
            try {
                this.zza = zzfdwVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
