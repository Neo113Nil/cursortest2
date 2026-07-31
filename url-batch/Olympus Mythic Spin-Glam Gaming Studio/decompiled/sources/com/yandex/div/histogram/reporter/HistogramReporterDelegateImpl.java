package com.yandex.div.histogram.reporter;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.TaskExecutor;
import com.yandex.div.histogram.util.HistogramUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HistogramReporterDelegateImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegateImpl;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramRecorder", "Ljavax/inject/Provider;", "Lcom/yandex/div/histogram/HistogramRecorder;", "histogramCallTypeProvider", "Lcom/yandex/div/histogram/HistogramCallTypeProvider;", "histogramRecordConfig", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "taskExecutor", "Lcom/yandex/div/histogram/TaskExecutor;", "(Ljavax/inject/Provider;Lcom/yandex/div/histogram/HistogramCallTypeProvider;Lcom/yandex/div/histogram/HistogramRecordConfiguration;Ljavax/inject/Provider;)V", "reportDuration", "", "histogramName", "", IronSourceConstants.EVENTS_DURATION, "", "forceCallType", "reportSize", "size", "", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HistogramReporterDelegateImpl implements HistogramReporterDelegate {

    @NotNull
    private final HistogramCallTypeProvider histogramCallTypeProvider;

    @NotNull
    private final HistogramRecordConfiguration histogramRecordConfig;

    @NotNull
    private final Provider histogramRecorder;

    @NotNull
    private final Provider taskExecutor;

    public HistogramReporterDelegateImpl(@NotNull Provider provider, @NotNull HistogramCallTypeProvider histogramCallTypeProvider, @NotNull HistogramRecordConfiguration histogramRecordConfiguration, @NotNull Provider provider2) {
        this.histogramRecorder = provider;
        this.histogramCallTypeProvider = histogramCallTypeProvider;
        this.histogramRecordConfig = histogramRecordConfiguration;
        this.taskExecutor = provider2;
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportDuration(@NotNull final String histogramName, final long duration, @HistogramCallType @Nullable String forceCallType) {
        final String histogramCallType = forceCallType == null ? this.histogramCallTypeProvider.getHistogramCallType(histogramName) : forceCallType;
        if (HistogramUtils.INSTANCE.shouldRecordHistogram(histogramCallType, this.histogramRecordConfig)) {
            ((TaskExecutor) this.taskExecutor.get()).post(new Function0() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl$reportDuration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    Provider provider;
                    provider = HistogramReporterDelegateImpl.this.histogramRecorder;
                    ((HistogramRecorder) provider.get()).recordShortTimeHistogram(histogramName + '.' + histogramCallType, RangesKt.coerceAtLeast(duration, 1L), TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
    public void reportSize(@NotNull final String histogramName, final int size) {
        ((TaskExecutor) this.taskExecutor.get()).post(new Function0() { // from class: com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl$reportSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Provider provider;
                provider = HistogramReporterDelegateImpl.this.histogramRecorder;
                ((HistogramRecorder) provider.get()).recordCount100KHistogram(histogramName + ".Size", RangesKt.coerceAtLeast(size, 1));
            }
        });
    }
}
