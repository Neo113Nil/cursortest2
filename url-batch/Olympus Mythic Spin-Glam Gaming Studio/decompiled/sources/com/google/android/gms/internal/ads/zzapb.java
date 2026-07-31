package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzapb {
    @Nullable
    public static zzapc zza(@Nullable zzapc zzapcVar, @Nullable String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzapcVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzapc) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzapc zzapcVar2 = new zzapc();
                while (i < length2) {
                    zzapcVar2.zzr((zzapc) map.get(strArr[i]));
                    i++;
                }
                return zzapcVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzapcVar.zzr((zzapc) map.get(strArr[0]));
                return zzapcVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzapcVar.zzr((zzapc) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzapcVar;
    }
}
