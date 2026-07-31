package com.my.tracker.plugins;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public interface MyTrackerPluginConfig {
    @NonNull
    @AnyThread
    String getPluginClass();

    @NonNull
    @AnyThread
    String getPluginName();
}
