package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbkh {

    @Nullable
    private CustomTabsSession zza;

    @Nullable
    private CustomTabsClient zzb;

    @Nullable
    private CustomTabsServiceConnection zzc;

    @Nullable
    private zzbkg zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zziom.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.zzc;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Nullable
    public final CustomTabsSession zzc() {
        CustomTabsClient customTabsClient = this.zzb;
        if (customTabsClient == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = customTabsClient.newSession(null);
        }
        return this.zza;
    }

    public final void zzd(zzbkg zzbkgVar) {
        this.zzd = zzbkgVar;
    }

    public final void zze(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zziom.zza(activity)) != null) {
            zzion zzionVar = new zzion(this);
            this.zzc = zzionVar;
            CustomTabsClient.bindCustomTabsService(activity, zza, zzionVar);
        }
    }

    public final void zzf(CustomTabsClient customTabsClient) {
        this.zzb = customTabsClient;
        customTabsClient.warmup(0L);
        zzbkg zzbkgVar = this.zzd;
        if (zzbkgVar != null) {
            zzbkgVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
