package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzbkc extends CustomTabsCallback {
    final /* synthetic */ zzbkf zza;

    zzbkc(zzbkf zzbkfVar) {
        Objects.requireNonNull(zzbkfVar);
        this.zza = zzbkfVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
        this.zza.zzc(i);
    }
}
