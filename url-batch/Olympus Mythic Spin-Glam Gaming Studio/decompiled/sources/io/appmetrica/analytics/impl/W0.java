package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes9.dex */
public final class W0 implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C5736v1 b;

    public W0(C5736v1 c5736v1, UserProfile userProfile) {
        this.b = c5736v1;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportUserProfile(this.a);
    }
}
