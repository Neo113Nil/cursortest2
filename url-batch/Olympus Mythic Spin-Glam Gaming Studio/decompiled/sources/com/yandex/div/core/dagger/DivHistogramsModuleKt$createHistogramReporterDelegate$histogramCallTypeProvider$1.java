package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends FunctionReferenceImpl implements Function0 {
    DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final HistogramColdTypeChecker mo4828invoke() {
        return (HistogramColdTypeChecker) ((Provider) this.receiver).get();
    }
}
