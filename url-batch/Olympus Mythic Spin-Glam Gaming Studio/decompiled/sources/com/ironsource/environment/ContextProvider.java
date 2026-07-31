package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Df;
import com.ironsource.InterfaceC4567b4;
import com.ironsource.Kb;
import com.ironsource.eh;

/* loaded from: classes12.dex */
public class ContextProvider {
    private static volatile ContextProvider b;
    private InterfaceC4567b4 a = new Df();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (b == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (b == null) {
                        b = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public Context getActiveContext() {
        Activity a = this.a.a();
        return a != null ? a : this.a.b();
    }

    public Context getApplicationContext() {
        Context b2 = this.a.b();
        Activity a = this.a.a();
        return (b2 != null || a == null) ? b2 : a.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.a.a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.a.a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.a.a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (Kb.Y().h().t()) {
            this.a = new eh(this.a.a(), this.a.b());
        }
    }
}
