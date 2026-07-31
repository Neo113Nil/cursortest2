package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4741l implements Ig {
    private WeakReference<Activity> a;

    public C4741l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Ig
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
