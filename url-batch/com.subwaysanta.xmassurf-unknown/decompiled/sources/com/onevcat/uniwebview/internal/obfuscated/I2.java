package com.onevcat.uniwebview.internal.obfuscated;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I2 extends CustomTabsServiceConnection {
    public final /* synthetic */ K2 a;

    public I2(K2 k2) {
        this.a = k2;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        K2 k2 = this.a;
        k2.e = client;
        if (k2.i) {
            if (client == null) {
                k2.i = true;
                return;
            }
            if (k2.f == null) {
                k2.f = client.newSession(new J2(k2));
            }
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(k2.f);
            Integer num = k2.h;
            if (num != null) {
                builder.setToolbarColor(num.intValue());
            }
            builder.build().launchUrl(k2.a, Uri.parse(k2.c));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e = null;
    }
}
