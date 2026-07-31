package sg.bigo.ads.am;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class c extends CustomTabsServiceConnection {
    private WeakReference<d> a;

    public c(d dVar) {
        this.a = new WeakReference<>(dVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        d dVar = this.a.get();
        if (dVar != null) {
            dVar.a(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.a.get();
        if (dVar != null) {
            dVar.b();
        }
    }
}
