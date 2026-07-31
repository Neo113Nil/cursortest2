package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4120k5 extends CustomTabsServiceConnection {
    public final /* synthetic */ C4172m5 a;

    public C4120k5(C4172m5 c4172m5) {
        this.a = c4172m5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        int i;
        C4152lb c4152lb;
        C4081ii c4081ii;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        C4172m5 c4172m5 = this.a;
        c4172m5.a = client;
        Y2 y2 = c4172m5.c;
        if (y2 == null) {
            return;
        }
        try {
            C4172m5 c4172m52 = y2.e;
            CustomTabsSession customTabsSession = c4172m52.d;
            if (customTabsSession == null) {
                CustomTabsClient customTabsClient = c4172m52.a;
                customTabsSession = customTabsClient != null ? customTabsClient.newSession(new C4146l5(c4172m52)) : null;
                c4172m52.d = customTabsSession;
            }
            if (customTabsSession != null) {
                Bundle bundle = Bundle.EMPTY;
                if (customTabsSession.isEngagementSignalsApiAvailable(bundle)) {
                    customTabsSession.setEngagementSignalsCallback(y2.a(), bundle);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            try {
                Uri parse = Uri.parse(y2.a);
                Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                y2.a(parse);
            } catch (Exception unused2) {
                i = 9;
                c4152lb = y2.c;
                if (c4152lb != null) {
                    c4152lb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    c4081ii = (C4081ii) y2.i.get();
                    if (c4081ii == null) {
                        O2.a(c4081ii, Za.f, y2.c);
                        return;
                    }
                    return;
                }
                C4081ii c4081ii2 = (C4081ii) y2.i.get();
                if (c4081ii2 != null) {
                    Za landingPageFunnelState = Za.g;
                    C4152lb c4152lb2 = y2.c;
                    Integer valueOf = Integer.valueOf(i);
                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    c4081ii2.a.getLandingPageHandler().a(landingPageFunnelState, c4152lb2, valueOf);
                }
            }
        } catch (Throwable unused3) {
            Context context = y2.f;
            String str = y2.a;
            Object obj = y2.j.get();
            Intrinsics.checkNotNull(obj);
            i = F3.a(context, str, (Eh) obj, y2.d);
            c4152lb = y2.c;
            if (c4152lb != null) {
            }
            if (i != 0) {
            }
            c4081ii = (C4081ii) y2.i.get();
            if (c4081ii == null) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C4172m5 c4172m5 = this.a;
        c4172m5.a = null;
        Y2 y2 = c4172m5.c;
        if (y2 != null) {
            C4152lb c4152lb = y2.c;
            if (c4152lb != null) {
                c4152lb.f = "IN_NATIVE";
            }
            C4081ii c4081ii = (C4081ii) y2.i.get();
            if (c4081ii != null) {
                Za landingPageFunnelState = Za.g;
                C4152lb c4152lb2 = y2.c;
                Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                c4081ii.a.getLandingPageHandler().a(landingPageFunnelState, c4152lb2, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a.a = null;
    }
}
