package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC5137e {
    public static OnBackInvokedDispatcher a(Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (obj instanceof Activity) {
            onBackInvokedDispatcher2 = ((Activity) obj).getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher2;
        }
        if (obj instanceof Dialog) {
            onBackInvokedDispatcher = ((Dialog) obj).getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }
        throw new IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }
}
