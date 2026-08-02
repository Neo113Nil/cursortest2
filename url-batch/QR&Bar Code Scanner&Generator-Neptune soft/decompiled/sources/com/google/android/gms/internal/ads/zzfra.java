package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfra {
    private static final zzfrn zzb = new zzfrn("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfry zza;
    private final String zzd;

    zzfra(Context context) {
        if (zzfsb.zza(context)) {
            this.zza = new zzfry(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfqv.zza, null, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzd("unbind LMD display overlay service", new Object[0]);
        this.zza.zzr();
    }

    final void zzd(zzfqr zzfqrVar, zzfrf zzfrfVar) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzp(new zzfqx(this, taskCompletionSource, zzfqrVar, zzfrfVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzfrc zzfrcVar, zzfrf zzfrfVar) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
            return;
        }
        if (zzfrcVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzp(new zzfqw(this, taskCompletionSource, zzfrcVar, zzfrfVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zzb("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfrd zzc2 = zzfre.zzc();
            zzc2.zzb(8160);
            zzfrfVar.zza(zzc2.zzc());
        }
    }

    final void zzf(zzfrh zzfrhVar, zzfrf zzfrfVar, int i) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzp(new zzfqy(this, taskCompletionSource, zzfrhVar, i, zzfrfVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
