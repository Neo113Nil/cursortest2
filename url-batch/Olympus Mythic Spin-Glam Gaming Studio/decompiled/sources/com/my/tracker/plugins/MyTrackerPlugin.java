package com.my.tracker.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* loaded from: classes6.dex */
public interface MyTrackerPlugin {
    @WorkerThread
    void init(@NonNull MyTrackerPluginConfig myTrackerPluginConfig, @NonNull PluginEventTracker pluginEventTracker, @NonNull Application application);
}
