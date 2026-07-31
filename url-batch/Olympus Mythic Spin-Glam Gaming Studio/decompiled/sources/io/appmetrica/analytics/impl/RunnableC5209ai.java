package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5209ai implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5209ai(C5701ti c5701ti, UserProfile userProfile) {
        this.b = c5701ti;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportUserProfile(this.a);
    }
}
