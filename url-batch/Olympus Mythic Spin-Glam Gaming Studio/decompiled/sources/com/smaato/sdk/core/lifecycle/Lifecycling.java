package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes4.dex */
public abstract class Lifecycling {
    public static Lifecycle of(Activity activity) {
        return null;
    }

    public static Lifecycle wrap(LifecycleOwner lifecycleOwner) {
        return null;
    }

    public static Lifecycle of(View view) {
        return new ViewLifecycle(view);
    }
}
