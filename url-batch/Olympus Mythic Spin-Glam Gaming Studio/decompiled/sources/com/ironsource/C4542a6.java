package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4542a6 implements InterfaceC4716ja {

    @NotNull
    private final Ze a;
    private long b;

    public C4542a6(@NotNull InterfaceC4749l7 applicationLifecycleService, @NotNull Ze task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4716ja
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.InterfaceC4716ja
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4716ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4716ja
    public void d() {
    }
}
