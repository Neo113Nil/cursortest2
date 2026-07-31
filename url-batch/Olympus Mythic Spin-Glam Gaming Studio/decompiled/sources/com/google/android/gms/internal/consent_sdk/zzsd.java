package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes13.dex */
final class zzsd extends zzsi {
    zzsd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsi
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry zzg = zzg(i);
                if (((zzqe) ((zzse) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzqe) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
