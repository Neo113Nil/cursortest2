package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzcd implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzca zza;

    zzcd(zzca zzcaVar) {
        Objects.requireNonNull(zzcaVar);
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        boolean zzb;
        zzaq zzaqVar;
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzaqVar = this.zza.zzb;
            zzaqVar.zzc();
        }
    }
}
