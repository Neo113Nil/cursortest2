package com.yandex.div.storage.templates;

import com.ironsource.B5;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTemplate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivParsingHistogramProxy.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001b\u0010\u0006\u001a\u00020\u00048RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "", "initReporter", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "(Lkotlin/jvm/functions/Function0;)V", "reporter", "getReporter", "()Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "reporter$delegate", "Lkotlin/Lazy;", "createDivData", "Lcom/yandex/div2/DivData;", B5.o, "Lcom/yandex/div/json/ParsingEnvironment;", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "componentName", "", "parseTemplatesWithResultsAndDependencies", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "Lcom/yandex/div2/DivTemplate;", "Lcom/yandex/div/data/DivParsingEnvironment;", "templates", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DivParsingHistogramProxy {

    /* renamed from: reporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reporter;

    public DivParsingHistogramProxy(@NotNull Function0 function0) {
        this.reporter = LazyKt.lazy(function0);
    }

    private DivParsingHistogramReporter getReporter() {
        return (DivParsingHistogramReporter) this.reporter.getValue();
    }

    @NotNull
    public DivData createDivData(@NotNull final ParsingEnvironment env, @NotNull final JSONObject json, @Nullable String componentName) {
        return (DivData) getReporter().measureDataParsing(json, componentName, new Function0() { // from class: com.yandex.div.storage.templates.DivParsingHistogramProxy$createDivData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DivData mo4828invoke() {
                return DivData.Companion.fromJson(ParsingEnvironment.this, json);
            }
        });
    }

    @NotNull
    public TemplateParsingEnvironment.TemplateParsingResult<DivTemplate> parseTemplatesWithResultsAndDependencies(@NotNull final DivParsingEnvironment env, @NotNull final JSONObject templates, @Nullable String componentName) {
        return (TemplateParsingEnvironment.TemplateParsingResult) getReporter().measureTemplatesParsing(templates, componentName, new Function0() { // from class: com.yandex.div.storage.templates.DivParsingHistogramProxy$parseTemplatesWithResultsAndDependencies$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final TemplateParsingEnvironment.TemplateParsingResult<DivTemplate> mo4828invoke() {
                return DivParsingEnvironment.this.parseTemplatesWithResultAndDependencies(templates);
            }
        });
    }
}
