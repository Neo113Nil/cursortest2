package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzged {
    private static final Object zza = new Object();
    private static zzged zzb;
    private final zzgeb zzc;

    private zzged(Context context, ExecutorService executorService, zzgei zzgeiVar) {
        zzgep zzgepVar = new zzgep(null);
        zzgepVar.zzc(context);
        zzgepVar.zzb(executorService);
        zzgepVar.zzd(zzgeiVar);
        this.zzc = (zzgeb) ((zzgeo) zzgepVar.zza()).zzI.zzb();
    }

    public static zzged zza(Context context, ExecutorService executorService, zzgei zzgeiVar) {
        zzged zzgedVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzged(context, executorService, zzgeiVar);
                }
                zzgedVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgedVar;
    }

    public final ListenableFuture zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}
