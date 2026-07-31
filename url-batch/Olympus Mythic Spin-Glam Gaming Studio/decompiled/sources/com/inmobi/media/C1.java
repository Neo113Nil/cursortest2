package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class C1 extends B5 {
    public final Context b;
    public final long c;
    public final int d;
    public final String e;
    public final ActivityManager f;
    public final Qa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Context context, C5 listener, long j, int i) {
        super(listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = context;
        this.c = j;
        this.d = i;
        this.e = C1.class.getSimpleName();
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Qa.b;
        this.g = Pa.a(context, "appClose");
    }

    @Override // com.inmobi.media.B5
    public final void a() {
        Hl.a(new B1(this, null));
    }

    @Override // com.inmobi.media.B5
    public final void b() {
    }
}
