package com.moloco.sdk.acm.services;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g implements f {

    @NotNull
    public final Context a;

    @NotNull
    public final Lazy b;

    public g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.acm.services.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return g.a(g.this);
            }
        });
    }

    public static final PowerManager a(g gVar) {
        Object systemService = gVar.a.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean b() {
        return this.a.getPackageManager().checkPermission("android.permission.USE_FULL_SCREEN_INTENT", this.a.getPackageName()) == 0;
    }

    public final PowerManager c() {
        return (PowerManager) this.b.getValue();
    }

    @Override // com.moloco.sdk.acm.services.f
    public boolean a() {
        return c().isInteractive();
    }
}
