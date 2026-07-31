package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaid implements zzahz {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaid(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaid zzb(zzeu zzeuVar) {
        int zzC = zzeuVar.zzC();
        zzeuVar.zzk(8);
        int zzC2 = zzeuVar.zzC();
        int zzC3 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int zzC4 = zzeuVar.zzC();
        zzeuVar.zzk(12);
        return new zzaid(zzC, zzC2, zzC3, zzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahz
    public final int zza() {
        return 1751742049;
    }
}
