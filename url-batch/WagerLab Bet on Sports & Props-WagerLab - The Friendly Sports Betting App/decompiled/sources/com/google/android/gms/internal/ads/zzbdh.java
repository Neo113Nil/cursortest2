package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbdh extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsm zzd;
    private CustomTabsSession zze;
    private CustomTabsClient zzf;

    private final void zzf(Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbde(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdsm zzdsmVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdsmVar;
        zzf(context);
    }

    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbdh.this.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfc)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbdh.this.zze(i);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i) {
        zzdsm zzdsmVar = this.zzd;
        if (zzdsmVar != null) {
            zzdsl zza2 = zzdsmVar.zza();
            zza2.zzc("action", "cct_nav");
            zza2.zzc("cct_navs", String.valueOf(i));
            zza2.zzd();
        }
    }
}
