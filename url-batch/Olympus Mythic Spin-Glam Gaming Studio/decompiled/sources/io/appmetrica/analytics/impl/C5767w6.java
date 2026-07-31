package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5767w6 implements Consumer {
    public final Executor a;
    public final C5286dh b;

    public C5767w6(@NotNull Context context, @NotNull InterfaceC5689t6 interfaceC5689t6, @NotNull EnumC5798xb enumC5798xb, @NotNull InterfaceC5730ul interfaceC5730ul, @NotNull Executor executor, @NotNull String str, @NotNull D6 d6) {
        this.a = executor;
        this.b = new C5286dh(context, interfaceC5689t6, enumC5798xb, interfaceC5730ul, d6);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.a;
        C5286dh c5286dh = this.b;
        Jb jb = c5286dh.d;
        Consumer consumer = c5286dh.f;
        Context context = c5286dh.a;
        if (C5745va.c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C5745va.class)) {
                try {
                    if (C5745va.c == null) {
                        C5745va.c = new C5745va(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C5745va c5745va = C5745va.c;
        if (c5745va == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c5745va = null;
        }
        executor.execute(new RunnableC5569og(file, jb, jb, consumer, c5745va, c5286dh.b));
    }
}
