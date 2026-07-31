package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC4645fa implements ThreadFactory {

    @NotNull
    private final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return new Thread(r, format);
    }
}
