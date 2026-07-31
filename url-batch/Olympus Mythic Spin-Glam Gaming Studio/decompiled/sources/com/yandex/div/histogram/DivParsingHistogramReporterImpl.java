package com.yandex.div.histogram;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.util.HistogramUtils;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J>\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0082\b¢\u0006\u0002\u0010\u0014J3\u0010\u0015\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0016¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0016J3\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0003H\u0016¢\u0006\u0002\u0010\u0016J,\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporterImpl;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "histogramReporter", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "calculateSizeExecutor", "Ljava/util/concurrent/Executor;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "currentUptime", "", "getCurrentUptime", "()J", "doMeasure", "D", "histogramName", "", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "componentName", "parse", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "measureDataParsing", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "measureJsonParsing", "measureTemplatesParsing", "T", "reportHistogram", "", IronSourceConstants.EVENTS_DURATION, "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    @NotNull
    private final Function0 calculateSizeExecutor;

    @NotNull
    private final Function0 histogramReporter;

    public DivParsingHistogramReporterImpl(@NotNull Function0 function0, @NotNull Function0 function02) {
        this.histogramReporter = function0;
        this.calculateSizeExecutor = function02;
    }

    private final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <D> D measureDataParsing(@NotNull JSONObject json, @Nullable String componentName, @NotNull Function0 parse) {
        long currentUptime = getCurrentUptime();
        try {
            return (D) parse.mo4828invoke();
        } finally {
            reportHistogram(HistogramNamesKt.DIV_PARSING_DATA, getCurrentUptime() - currentUptime, componentName, json);
        }
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <T> T measureTemplatesParsing(@NotNull JSONObject json, @Nullable String componentName, @NotNull Function0 parse) {
        long currentUptime = getCurrentUptime();
        try {
            return (T) parse.mo4828invoke();
        } finally {
            reportHistogram(HistogramNamesKt.DIV_PARSING_TEMPLATES, getCurrentUptime() - currentUptime, componentName, json);
        }
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    @NotNull
    public JSONObject measureJsonParsing(@Nullable String componentName, @NotNull Function0 parse) {
        long currentUptime = getCurrentUptime();
        try {
            Object mo4828invoke = parse.mo4828invoke();
            reportHistogram(HistogramNamesKt.DIV_PARSING_JSON, getCurrentUptime() - currentUptime, componentName, null);
            return (JSONObject) mo4828invoke;
        } catch (Throwable th) {
            reportHistogram(HistogramNamesKt.DIV_PARSING_JSON, getCurrentUptime() - currentUptime, componentName, null);
            throw th;
        }
    }

    private final <D> D doMeasure(String histogramName, JSONObject json, String componentName, Function0 parse) {
        long currentUptime = getCurrentUptime();
        try {
            return (D) parse.mo4828invoke();
        } finally {
            InlineMarker.finallyStart(1);
            reportHistogram(histogramName, getCurrentUptime() - currentUptime, componentName, json);
            InlineMarker.finallyEnd(1);
        }
    }

    private final void reportHistogram(final String histogramName, long duration, final String componentName, final JSONObject json) {
        HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.mo4828invoke(), histogramName, duration, componentName, null, null, 24, null);
        if (json == null) {
            return;
        }
        ((Executor) this.calculateSizeExecutor.mo4828invoke()).execute(new Runnable() { // from class: com.yandex.div.histogram.DivParsingHistogramReporterImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DivParsingHistogramReporterImpl.reportHistogram$lambda$0(json, this, histogramName, componentName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportHistogram$lambda$0(JSONObject jSONObject, DivParsingHistogramReporterImpl divParsingHistogramReporterImpl, String str, String str2) {
        HistogramReporter.reportSize$default((HistogramReporter) divParsingHistogramReporterImpl.histogramReporter.mo4828invoke(), str, HistogramUtils.INSTANCE.calculateUtf8JsonByteSize(jSONObject), str2, null, 8, null);
    }
}
