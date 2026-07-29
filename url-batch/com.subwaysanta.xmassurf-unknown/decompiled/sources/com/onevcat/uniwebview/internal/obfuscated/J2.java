package com.onevcat.uniwebview.internal.obfuscated;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J2 extends CustomTabsCallback {
    public final /* synthetic */ K2 a;

    public J2(K2 k2) {
        this.a = k2;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        C0058o c0058o = C0058o.b;
        String message = "onNavigationEvent: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.INFO;
        c0058o.a(enumC0054n, message);
        if (i == 1) {
            Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Started", "message");
            c0058o.a(enumC0054n, "onNavigationEvent: Navigation Started");
            K2 k2 = this.a;
            k2.d.a(k2.b, P2.SafeBrowsingEvent, K2.a(k2, "navigation_started"));
            return;
        }
        if (i == 2) {
            Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Finished", "message");
            c0058o.a(enumC0054n, "onNavigationEvent: Navigation Finished");
            K2 k22 = this.a;
            k22.d.a(k22.b, P2.SafeBrowsingEvent, K2.a(k22, "navigation_finished"));
            return;
        }
        if (i == 3) {
            Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Failed", "message");
            c0058o.a(enumC0054n, "onNavigationEvent: Navigation Failed");
            K2 k23 = this.a;
            k23.d.a(k23.b, P2.SafeBrowsingEvent, K2.a(k23, "navigation_failed"));
            return;
        }
        if (i == 4) {
            Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Aborted", "message");
            c0058o.a(enumC0054n, "onNavigationEvent: Navigation Aborted");
            return;
        }
        if (i != 6) {
            return;
        }
        K2 k24 = this.a;
        if (k24.g) {
            Intrinsics.checkNotNullParameter("onNavigationEvent: TAB_HIDDEN already handled, ignoring duplicate event.", "message");
            c0058o.a(enumC0054n, "onNavigationEvent: TAB_HIDDEN already handled, ignoring duplicate event.");
            return;
        }
        k24.g = true;
        String a = K2.a(k24, "tab_hidden");
        K2 k25 = this.a;
        k25.getClass();
        r rVar = r.b;
        String name = k25.b;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String message2 = "Removing safe browsing from manager: " + name;
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o.a(EnumC0054n.DEBUG, message2);
        rVar.a.remove(name);
        K2 k26 = this.a;
        k26.d.a(k26.b, P2.SafeBrowsingEvent, a);
    }
}
