package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$1 extends FunctionReferenceImpl implements Function0 {
    DivKitHistogramsModule$provideDivParsingHistogramReporter$1(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final HistogramReporter mo4828invoke() {
        return (HistogramReporter) ((Provider) this.receiver).get();
    }
}
