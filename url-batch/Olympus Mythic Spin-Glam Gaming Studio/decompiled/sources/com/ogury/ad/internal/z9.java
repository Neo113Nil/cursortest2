package com.ogury.ad.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ogury.ad.internal.t7;
import com.ogury.ad.internal.y7;
import com.ogury.ad.internal.z9;
import com.ogury.ad.mraid.browser.listeners.OrientationListener$1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z9 {
    public final Context a;
    public final f8 b;
    public int c;
    public final OrientationListener$1 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.BroadcastReceiver, com.ogury.ad.mraid.browser.listeners.OrientationListener$1] */
    public z9(Context context, f8 multiWebViewCommandExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiWebViewCommandExecutor, "multiWebViewCommandExecutor");
        this.a = context;
        this.b = multiWebViewCommandExecutor;
        this.c = context.getResources().getConfiguration().orientation;
        ?? r4 = new BroadcastReceiver() { // from class: com.ogury.ad.mraid.browser.listeners.OrientationListener$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.areEqual("android.intent.action.CONFIGURATION_CHANGED", intent.getAction())) {
                    int i = context2.getResources().getConfiguration().orientation;
                    z9 z9Var = z9.this;
                    if (z9Var.c != i) {
                        z9Var.c = i;
                        ArrayList a = z9Var.b.a();
                        int size = a.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = a.get(i2);
                            i2++;
                            y7 webView = (y7) obj;
                            t7 t7Var = webView.p;
                            t7Var.getClass();
                            Intrinsics.checkNotNullParameter(webView, "webView");
                            t7Var.d.a(webView.getMraidCommandExecutor());
                        }
                    }
                }
            }
        };
        this.d = r4;
        context.registerReceiver(r4, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }
}
