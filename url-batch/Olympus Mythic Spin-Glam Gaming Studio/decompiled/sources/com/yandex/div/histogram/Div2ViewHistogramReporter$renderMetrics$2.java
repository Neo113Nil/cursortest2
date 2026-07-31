package com.yandex.div.histogram;

import com.yandex.div.histogram.metrics.RenderMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: Div2ViewHistogramReporter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class Div2ViewHistogramReporter$renderMetrics$2 extends FunctionReferenceImpl implements Function0 {
    public static final Div2ViewHistogramReporter$renderMetrics$2 INSTANCE = new Div2ViewHistogramReporter$renderMetrics$2();

    Div2ViewHistogramReporter$renderMetrics$2() {
        super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final RenderMetrics mo4828invoke() {
        return new RenderMetrics();
    }
}
