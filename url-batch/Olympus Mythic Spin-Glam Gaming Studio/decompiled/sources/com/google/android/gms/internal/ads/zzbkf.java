package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbkf extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzeaj zzd;

    @Nullable
    private CustomTabsSession zze;

    @Nullable
    private CustomTabsClient zzf;

    private final void zzf(@Nullable Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbkc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzeaj zzeajVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzeajVar;
        zzf(context);
    }

    @Nullable
    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbke
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbkf.this.zzd();
                }
            });
        }
        return this.zze;
    }

    @VisibleForTesting
    public final void zzc(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfH)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbkf.this.zze(i);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i) {
        zzeaj zzeajVar = this.zzd;
        if (zzeajVar != null) {
            zzeai zza2 = zzeajVar.zza();
            zza2.zzc("action", "cct_nav");
            zza2.zzc("cct_navs", String.valueOf(i));
            zza2.zzd();
        }
    }
}
