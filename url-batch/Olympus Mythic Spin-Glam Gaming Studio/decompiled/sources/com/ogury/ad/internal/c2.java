package com.ogury.ad.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ogury.ad.internal.b8;
import com.ogury.ad.internal.c2;
import com.ogury.ad.internal.xi;
import com.ogury.ad.internal.y7;
import com.ogury.ad.mraid.browser.listeners.CloseSystemDialogsListener$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c2 {
    public final Context a;
    public final f8 b;
    public final CloseSystemDialogsListener$1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.BroadcastReceiver, com.ogury.ad.mraid.browser.listeners.CloseSystemDialogsListener$1] */
    public c2(Context context, f8 multiWebViewCommandExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiWebViewCommandExecutor, "multiWebViewCommandExecutor");
        this.a = context;
        this.b = multiWebViewCommandExecutor;
        ?? r4 = new BroadcastReceiver() { // from class: com.ogury.ad.mraid.browser.listeners.CloseSystemDialogsListener$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Collection values = c2.this.b.b.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((xi) it.next()).b) {
                            return;
                        }
                    }
                }
                ArrayList a = c2.this.b.a();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    Object obj = a.get(i);
                    i++;
                    b8.a((y7) obj, "ogySdkMraidGateway.callEventListeners(\"ogyOnCloseSystem\", {})");
                }
            }
        };
        this.c = r4;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(r4, intentFilter);
    }
}
