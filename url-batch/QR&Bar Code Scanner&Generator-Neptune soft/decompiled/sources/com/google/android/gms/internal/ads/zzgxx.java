package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgxx extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgxx(zzbka zzbkaVar, byte[] bArr) {
        this.zza = new WeakReference(zzbkaVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbka zzbkaVar = (zzbka) this.zza.get();
        if (zzbkaVar != null) {
            zzbkaVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbka zzbkaVar = (zzbka) this.zza.get();
        if (zzbkaVar != null) {
            zzbkaVar.zzd();
        }
    }
}
