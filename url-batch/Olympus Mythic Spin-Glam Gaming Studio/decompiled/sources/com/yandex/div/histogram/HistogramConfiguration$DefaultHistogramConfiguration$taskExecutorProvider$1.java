package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramConfiguration.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 extends FunctionReferenceImpl implements Function0 {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1();

    HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1() {
        super(0, DefaultTaskExecutor.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final DefaultTaskExecutor mo4828invoke() {
        return new DefaultTaskExecutor();
    }
}
