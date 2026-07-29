package com.unity3d.player.a;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;

/* renamed from: com.unity3d.player.a.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0107f {
    public static OnBackInvokedDispatcher a(Object obj) {
        if (obj instanceof Activity) {
            return ((Activity) obj).getOnBackInvokedDispatcher();
        }
        if (obj instanceof Dialog) {
            return ((Dialog) obj).getOnBackInvokedDispatcher();
        }
        throw new IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, C0106e c0106e) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, c0106e);
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, C0106e c0106e) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(c0106e);
    }
}
