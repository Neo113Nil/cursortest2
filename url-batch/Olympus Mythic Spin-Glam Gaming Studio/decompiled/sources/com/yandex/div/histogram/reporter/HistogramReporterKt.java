package com.yandex.div.histogram.reporter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: HistogramReporter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a>\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "baseHistogramName", "componentName", "Lkotlin/Function2;", "", "block", "withComponentHistogram", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "div-histogram_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HistogramReporterKt {
    private static final void withComponentHistogram(String str, String str2, Function2 function2) {
        function2.invoke(str, null);
        if (str2 != null) {
            function2.invoke(str2 + '.' + str, str2);
        }
    }
}
