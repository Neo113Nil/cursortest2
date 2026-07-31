package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Na implements Bg {
    public final Context a;
    public final ICommonExecutor b;
    public final String c = "google";

    public Na(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.a = context;
        this.b = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull InterfaceC5803xg interfaceC5803xg) {
        if (!ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            interfaceC5803xg.a(new Cg("Google Play Install Referrer library is not detected", null, 2, null));
            return;
        }
        Ma ma = new Ma(this.b);
        try {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(this.a).build();
            build.startConnection(new La(ma, build, interfaceC5803xg));
        } catch (Throwable th) {
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej("Failed to get referrer from Google Play referrer library", th));
            interfaceC5803xg.a(new Cg("Failed to get referrer from Google Play referrer library", th));
        }
    }
}
