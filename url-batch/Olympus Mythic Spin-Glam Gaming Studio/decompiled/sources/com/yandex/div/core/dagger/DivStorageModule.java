package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.storage.DivStorageComponent;
import javax.inject.Provider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStorageModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/dagger/DivStorageModule;", "", "()V", "provideDivStorageComponent", "Lcom/yandex/div/storage/DivStorageComponent;", "externalDivStorageComponent", "Lcom/yandex/div/core/dagger/ExternalOptional;", "context", "Landroid/content/Context;", "histogramReporterDelegate", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "parsingHistogramReporter", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivStorageModule {

    @NotNull
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter divParsingHistogramReporter) {
        return divParsingHistogramReporter;
    }

    private DivStorageModule() {
    }

    @NotNull
    public final DivStorageComponent provideDivStorageComponent(@NotNull ExternalOptional<DivStorageComponent> externalDivStorageComponent, @NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @NotNull final DivParsingHistogramReporter parsingHistogramReporter) {
        if (externalDivStorageComponent.getOptional().isPresent()) {
            return (DivStorageComponent) externalDivStorageComponent.getOptional().get();
        }
        return DivStorageComponent.Companion.create$default(DivStorageComponent.INSTANCE, context, histogramReporterDelegate, null, null, null, new Provider() { // from class: com.yandex.div.core.dagger.DivStorageModule$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                DivParsingHistogramReporter provideDivStorageComponent$lambda$0;
                provideDivStorageComponent$lambda$0 = DivStorageModule.provideDivStorageComponent$lambda$0(DivParsingHistogramReporter.this);
                return provideDivStorageComponent$lambda$0;
            }
        }, null, 92, null);
    }
}
