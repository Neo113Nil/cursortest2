package com.techno_world.pencil.sketch.camera;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* loaded from: classes2.dex */
public class AppOpenManager_LifecycleAdapter implements GeneratedAdapter {
    final AppOpenManager mReceiver;

    AppOpenManager_LifecycleAdapter(AppOpenManager appOpenManager) {
        this.mReceiver = appOpenManager;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (!z && event == Lifecycle.Event.ON_START) {
            if (!z2 || methodCallsLogger.approveCall("onStart", 1)) {
                this.mReceiver.onStart();
            }
        }
    }
}
