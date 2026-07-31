package com.yandex.div.histogram;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00040\nH\u0016¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J3\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/histogram/DefaultDivParsingHistogramReporter;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "()V", "measureDataParsing", "D", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "componentName", "", "parse", "Lkotlin/Function0;", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "measureJsonParsing", "measureTemplatesParsing", "T", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultDivParsingHistogramReporter implements DivParsingHistogramReporter {
    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <D> D measureDataParsing(@NotNull JSONObject json, @Nullable String componentName, @NotNull Function0 parse) {
        return (D) parse.mo4828invoke();
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <T> T measureTemplatesParsing(@NotNull JSONObject json, @Nullable String componentName, @NotNull Function0 parse) {
        return (T) parse.mo4828invoke();
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    @NotNull
    public JSONObject measureJsonParsing(@Nullable String componentName, @NotNull Function0 parse) {
        return (JSONObject) parse.mo4828invoke();
    }
}
