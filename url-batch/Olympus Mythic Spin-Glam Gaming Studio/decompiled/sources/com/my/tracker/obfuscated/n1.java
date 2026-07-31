package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class n1 {
    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean();
    private final PluginEventTracker c;
    private final Application d;

    private n1(PluginEventTracker pluginEventTracker, Application application) {
        this.c = pluginEventTracker;
        this.d = application;
    }

    public static n1 a(e0 e0Var, Application application) {
        return new n1(PluginEventTracker.a(e0Var), application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            x2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.c, this.d);
                this.a.add(myTrackerPlugin);
                x2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                x2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    public void a(final List list) {
        if (!this.b.compareAndSet(false, true)) {
            x2.a("PluginHandler: instance has already been initialized");
        } else {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.n1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    n1.this.b(list);
                }
            });
        }
    }
}
