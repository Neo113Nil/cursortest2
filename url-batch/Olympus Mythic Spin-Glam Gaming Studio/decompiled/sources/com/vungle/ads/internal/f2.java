package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;

/* loaded from: classes15.dex */
public final class f2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public f2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        Object a;
        Object a2;
        ServiceLocator serviceLocator = this.b;
        Context context = serviceLocator.a;
        a = serviceLocator.a(com.vungle.ads.internal.platform.f.class);
        a2 = this.b.a(FilePreferences.class);
        return new VungleApiClient(context, (com.vungle.ads.internal.platform.f) a, (FilePreferences) a2);
    }
}
