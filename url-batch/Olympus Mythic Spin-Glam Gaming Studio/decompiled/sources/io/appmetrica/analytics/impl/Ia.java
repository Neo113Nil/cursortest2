package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class Ia implements BiFunction {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiFunction
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final On apply(@NonNull Thread thread, @Nullable StackTraceElement[] stackTraceElementArr) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new On(name, priority, id, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread.getState().ordinal()), stackTraceElementArr == null ? null : Arrays.asList(stackTraceElementArr));
    }
}
