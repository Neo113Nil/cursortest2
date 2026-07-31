package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.safedk.android.utils.Logger;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes11.dex */
final class zzat implements HsdpDeepLinkService {
    final zzax zza;
    private final Context zzb;
    private final com.google.android.gms.internal.playcore_hsdp.zzg zzc;
    private final com.google.android.gms.internal.playcore_hsdp.zzg zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private Application.ActivityLifecycleCallbacks zzh;

    public zzat(Context context, com.google.android.gms.internal.playcore_hsdp.zzg zzgVar, com.google.android.gms.internal.playcore_hsdp.zzg zzgVar2, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3 && (context instanceof Activity)) {
            z4 = true;
        }
        zzax zzaxVar = context instanceof Activity ? new zzax((Activity) context) : null;
        this.zzh = null;
        this.zzb = context;
        this.zzc = zzgVar;
        this.zzd = zzgVar2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z4;
        this.zza = zzaxVar;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    private static void zzc(String str, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map, zze zzeVar, Activity activity) {
        zzeVar.zzb(str, zza.zzc(activity), zza.zzb(activity), hsdpDeepLinkServiceListener, map);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService
    public final void endSession(String str) {
        ((zzr) this.zzd.zza()).zzc(str);
        zza();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService
    public final void prewarm(List list, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        ((zzr) this.zzd.zza()).zzd(list, hsdpPrewarmListener);
    }

    final void zza() {
        if (this.zzg) {
            Context context = this.zzb;
            zzax zzaxVar = this.zza;
            Activity activity = (Activity) context;
            if (zzaxVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when loading panel is enabled.");
            }
            zzaxVar.zzb();
            if (this.zzh != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.zzh);
                this.zzh = null;
            }
        }
    }

    final void zzb() {
        if (this.zzg) {
            Context context = this.zzb;
            zzax zzaxVar = this.zza;
            Activity activity = (Activity) context;
            if (zzaxVar == null) {
                throw new IllegalStateException("hsdpLoadingPanel cannot be null when enabling loading panel.");
            }
            if (zzaxVar.zza == null) {
                if (this.zzh != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.zzh);
                }
                this.zzh = new zzal(this, activity);
                activity.getApplication().registerActivityLifecycleCallbacks(this.zzh);
                zzaxVar.zzc();
            }
        }
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService
    public final void open(String str, String str2, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map, boolean z) {
        HsdpDeepLinkService.HsdpDeepLinkServiceListener zzarVar;
        Context context = this.zzb;
        Intent zzb = zzq.zzb(str, str2, context.getPackageName(), map);
        if (this.zzf) {
            Uri data = zzb.getData();
            if (data == null) {
                Bundle bundle = new Bundle();
                bundle.putString("errorMessage", "Deeplink URL is null.");
                hsdpDeepLinkServiceListener.onError(bundle);
                return;
            }
            String uri = data.toString();
            if (!(context instanceof Activity)) {
                Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
                intent.putExtra("target_package_name", str);
                intent.putExtra(Constants.REFERRER, str2);
                intent.putExtra("auto_trigger", z);
                intent.putExtra("deeplink_url", uri);
                if (map != null) {
                    Bundle bundle2 = new Bundle();
                    for (Map.Entry entry : map.entrySet()) {
                        bundle2.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    intent.putExtra("extra_query_params_bundle", bundle2);
                }
                intent.addFlags(262144);
                intent.addFlags(268435456);
                Log.i("HsdpDeepLinkServiceImpl", "Starting HSDP Shim Activity.");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return;
            }
            com.google.android.gms.internal.playcore_hsdp.zzg zzgVar = this.zzd;
            Activity activity = (Activity) context;
            if (!((zzr) zzgVar.zza()).zzf()) {
                zzb();
            }
            zzr zzrVar = (zzr) zzgVar.zza();
            IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
            int zzc = zza.zzc(activity);
            int zzb2 = zza.zzb(activity);
            if (!this.zzg) {
                zzarVar = new zzan(this, hsdpDeepLinkServiceListener, activity, str, str2, map);
            } else {
                zzarVar = new zzar(this, hsdpDeepLinkServiceListener, activity, str, str2, map);
            }
            zzrVar.zze(str, uri, windowToken, zzc, zzb2, z, zzarVar);
            return;
        }
        Activity activity2 = (Activity) context;
        if (this.zza == null) {
            throw new IllegalStateException("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
        }
        zzb.addFlags(536870912);
        zzb.addFlags(262144);
        if (activity2.getPackageManager().resolveActivity(zzb, 65536) != null) {
            zzb();
            Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity2, zzb, 0);
            hsdpDeepLinkServiceListener.onDeepLinkStarted();
            zzc(str, hsdpDeepLinkServiceListener, map, (zze) this.zzc.zza(), activity2);
            return;
        }
        if (this.zze) {
            Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
            zzc(str, hsdpDeepLinkServiceListener, map, (zze) this.zzc.zza(), activity2);
        } else {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity2, zzq.zza(str, str2, map), 0);
        }
    }
}
