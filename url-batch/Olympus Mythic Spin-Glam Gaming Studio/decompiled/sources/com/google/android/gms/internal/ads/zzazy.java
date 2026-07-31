package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzazy implements PackageManager$OnChecksumsReadyListener {
    final zzhdr zza = zzhdr.zze();

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum m = zzazy$$ExternalSyntheticApiModelOutline0.m(list.get(i));
                type = m.getType();
                if (type == 8) {
                    zzhdr zzhdrVar = this.zza;
                    zzhah zzi = zzhah.zzn().zzi();
                    value = m.getValue();
                    zzhdrVar.zza(zzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
