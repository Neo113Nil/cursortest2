package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfqk extends zzfrd {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfqk() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final zzfrd zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final zzfrd zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrd
    public final zzfre zzc() {
        if (this.zzc == 1) {
            return new zzfqm(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
