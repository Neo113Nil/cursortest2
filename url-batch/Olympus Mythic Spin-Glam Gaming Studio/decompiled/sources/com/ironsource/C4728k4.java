package com.ironsource;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4728k4 {
    private final boolean b() {
        return true;
    }

    private final boolean c() {
        try {
            Class.forName("kotlinx.coroutines.test.TestScope");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final boolean d() {
        try {
            Method[] declaredMethods = FlowKt.class.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "flowKtClass.declaredMethods");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), "chunked") && k4$$ExternalSyntheticBackport0.m(method) == 2) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NotNull
    public final String a() {
        return d() ? "1.9.0+" : c() ? "1.6.0-1.8.x" : b() ? "1.3.0-1.5.x" : "<1.3.0";
    }
}
