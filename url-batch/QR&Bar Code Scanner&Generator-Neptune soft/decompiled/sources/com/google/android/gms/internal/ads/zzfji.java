package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfji {
    public static zzfjj zza(Context context, int i) {
        boolean booleanValue;
        if (zzfjw.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbkl.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbkl.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbkl.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbkl.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfjl(context, i);
            }
        }
        return new zzfkf();
    }

    public static zzfjj zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfjj zza = zza(context, i);
        if (!(zza instanceof zzfjl)) {
            return zza;
        }
        zza.zzf();
        zza.zzk(i2);
        if (zzfjt.zze(zzlVar.zzp)) {
            zza.zzd(zzlVar.zzp);
        }
        return zza;
    }
}
