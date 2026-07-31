package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3995fc {
    public static final CoroutineScope a;
    public static final Semaphore b;
    public static final AtomicBoolean c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("LogSingle", true));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        a = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor));
        b = new Semaphore(1);
        c = new AtomicBoolean(false);
    }
}
