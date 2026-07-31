package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes11.dex */
public final class Kj implements InterfaceC5486lb {
    public final /* synthetic */ UserProfile a;

    public Kj(UserProfile userProfile) {
        this.a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportUserProfile(this.a);
    }
}
