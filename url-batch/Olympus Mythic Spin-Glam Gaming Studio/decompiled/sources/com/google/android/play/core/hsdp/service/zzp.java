package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.playcore_hsdp.zzf;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.safedk.android.utils.Logger;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes14.dex */
final class zzp implements zze {
    final zzbc zza;
    private final Activity zzb;

    public zzp(Intent intent, Activity activity) {
        this.zzb = activity;
        if (zzf.zza(activity)) {
            this.zza = new zzbn(activity.getApplicationContext(), "HpoaService", intent, new zzba() { // from class: com.google.android.play.core.hsdp.service.zzg
                @Override // com.google.android.play.core.hsdp.service.zzba
                public final Object zza(IBinder iBinder) {
                    return com.google.android.play.core.hsdp.protocol.zzb.zzb(iBinder);
                }
            });
        } else {
            this.zza = null;
        }
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static /* bridge */ /* synthetic */ void zzd(zzp zzpVar, String str, String str2, Map map) {
        Activity activity = zzpVar.zzb;
        Intent zzb = zzq.zzb(str, str2, activity.getPackageName(), map);
        zzb.addFlags(536870912);
        if (activity.getPackageManager().resolveActivity(zzb, 65536) != null) {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, zzb, 0);
        } else {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, zzq.zza(str, str2, map));
        }
    }

    public final void zza() {
        zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            zzbcVar.zze();
        }
    }

    @Override // com.google.android.play.core.hsdp.service.zze
    public final void zzb(String str, int i, int i2, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map) {
        Activity activity = this.zzb;
        String packageName = activity.getPackageName();
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("Window token is null, cannot open HPOA service.");
        }
        final zzk zzkVar = new zzk(this, str, packageName, windowToken, i, i2, hsdpDeepLinkServiceListener, map);
        zzbc zzbcVar = this.zza;
        if (zzbcVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        zzbcVar.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzh
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle2 = bundle;
                zzp zzpVar = zzp.this;
                com.google.android.play.core.hsdp.protocol.zzd zzdVar = zzkVar;
                try {
                    zzbc zzbcVar2 = zzpVar.zza;
                    if (zzbcVar2 == null) {
                        throw null;
                    }
                    com.google.android.play.core.hsdp.protocol.zzc zzcVar = (com.google.android.play.core.hsdp.protocol.zzc) zzbcVar2.zzb();
                    if (zzcVar == null) {
                        return;
                    }
                    zzcVar.zzf(bundle2, zzdVar);
                } catch (RemoteException e) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e);
                }
            }
        });
    }
}
