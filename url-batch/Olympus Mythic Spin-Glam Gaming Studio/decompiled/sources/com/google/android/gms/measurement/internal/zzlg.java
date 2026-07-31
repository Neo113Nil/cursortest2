package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes6.dex */
final class zzlg implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlw zzb;

    zzlg(zzlw zzlwVar, Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        Bundle bundle = this.zza;
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzlwVar.zzu.zzJ()) {
            zzlwVar.zzu.zzaW().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzlwVar.zzu.zzu().zzQ(new zzai(bundle.getString("app_id"), "", new zzqb(checkNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzlwVar.zzu.zzw().zzC(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
