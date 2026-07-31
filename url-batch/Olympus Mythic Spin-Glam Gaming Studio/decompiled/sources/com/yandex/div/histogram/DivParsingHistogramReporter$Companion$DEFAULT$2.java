package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class DivParsingHistogramReporter$Companion$DEFAULT$2 extends FunctionReferenceImpl implements Function0 {
    public static final DivParsingHistogramReporter$Companion$DEFAULT$2 INSTANCE = new DivParsingHistogramReporter$Companion$DEFAULT$2();

    DivParsingHistogramReporter$Companion$DEFAULT$2() {
        super(0, DefaultDivParsingHistogramReporter.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final DefaultDivParsingHistogramReporter mo4828invoke() {
        return new DefaultDivParsingHistogramReporter();
    }
}
