package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5663s6 extends Yg {
    public final Context f;
    public final Ih g;
    public final boolean h;
    public final J6 i;
    public final X1 j;
    public final E6 k;

    public /* synthetic */ C5663s6(Context context, C5631r0 c5631r0, InterfaceC5704tl interfaceC5704tl, Ih ih, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c5631r0, interfaceC5704tl, ih, (i & 16) != 0 ? false : z);
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            String a = this.i.a.a();
            X1 x1 = this.j;
            Context context = this.f;
            x1.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            String str = serviceInfo != null ? serviceInfo.processName : null;
            if (this.h || !Intrinsics.areEqual(a, str)) {
                this.a.c();
                this.c = false;
                super.a();
            } else {
                this.k.a(this.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final boolean c() {
        this.k.a(this.g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Kh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.INSTANCE;
    }

    public C5663s6(@NotNull Context context, @NotNull C5631r0 c5631r0, @Nullable InterfaceC5704tl interfaceC5704tl, @NotNull Ih ih, boolean z) {
        super(c5631r0, interfaceC5704tl, ih);
        this.f = context;
        this.g = ih;
        this.h = z;
        this.i = C5661s4.l().i();
        this.j = C5661s4.l().f();
        this.k = new E6(context);
    }
}
