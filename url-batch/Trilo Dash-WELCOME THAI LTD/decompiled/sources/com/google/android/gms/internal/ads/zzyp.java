package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzyp {
    public final String zza;

    private zzyp(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzyp zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        int i = zzk >> 1;
        int zzk2 = (zzdyVar.zzk() >> 3) | ((zzk & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        return new zzyp(i, zzk2, str + ".0" + i + (zzk2 < 10 ? ".0" : ".") + zzk2);
    }
}
