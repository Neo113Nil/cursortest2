package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes6.dex */
final class zzlf implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlw zzb;

    zzlf(zzlw zzlwVar, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzlwVar.zzu.zzJ()) {
            zzlwVar.zzu.zzaW().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzqb zzqbVar = new zzqb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzio zzioVar = zzlwVar.zzu;
            zzbh zzC = zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            zzlwVar.zzu.zzu().zzQ(new zzai(bundle.getString("app_id"), string2, zzqbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzC, bundle.getLong("time_to_live"), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
