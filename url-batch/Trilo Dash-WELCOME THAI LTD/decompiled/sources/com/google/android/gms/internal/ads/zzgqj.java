package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgqj extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgqj(zzbiw zzbiwVar, byte[] bArr) {
        this.zza = new WeakReference(zzbiwVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbiw zzbiwVar = (zzbiw) this.zza.get();
        if (zzbiwVar != null) {
            zzbiwVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbiw zzbiwVar = (zzbiw) this.zza.get();
        if (zzbiwVar != null) {
            zzbiwVar.zzd();
        }
    }
}
