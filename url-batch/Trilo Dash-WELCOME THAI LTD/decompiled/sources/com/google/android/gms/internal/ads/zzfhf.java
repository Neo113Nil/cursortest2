package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfhf {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfhg zza(Context context, int i) {
        boolean booleanValue;
        if (zzfhs.zza()) {
            int i2 = i - 2;
            if (i2 != 2 && i2 != 3) {
                if (i2 == 5) {
                    booleanValue = ((Boolean) zzbjh.zzb.zze()).booleanValue();
                } else if (i2 != 6 && i2 != 7 && i2 != 8) {
                    booleanValue = ((Boolean) zzbjh.zzd.zze()).booleanValue();
                }
                if (booleanValue) {
                    return new zzfhi(context, i);
                }
            }
            booleanValue = ((Boolean) zzbjh.zzc.zze()).booleanValue();
            if (booleanValue) {
            }
        }
        return new zzfib();
    }

    public static zzfhg zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfhg zza = zza(context, 7);
        if (!(zza instanceof zzfhi)) {
            return zza;
        }
        zza.zzf();
        zza.zzk(i2);
        if (zzfhp.zzd(zzlVar.zzp)) {
            zza.zzd(zzlVar.zzp);
        }
        return zza;
    }
}
