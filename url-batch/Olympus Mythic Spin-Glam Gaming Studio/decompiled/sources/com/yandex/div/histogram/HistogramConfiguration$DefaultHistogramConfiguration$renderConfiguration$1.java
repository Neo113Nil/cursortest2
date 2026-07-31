package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramConfiguration.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 extends AdaptedFunctionReference implements Function0 {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1();

    HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1() {
        super(0, RenderConfiguration.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final RenderConfiguration mo4828invoke() {
        return new RenderConfiguration(null, null, null, null, 15, null);
    }
}
