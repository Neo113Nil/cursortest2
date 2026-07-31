package com.yandex.div.data;

import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivParsingEnvironment.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/data/DivParsingEnvironment;", "Lcom/yandex/div/json/TemplateParsingEnvironment;", "Lcom/yandex/div2/DivTemplate;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "templateProvider", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "(Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/templates/CachingTemplateProvider;)V", "templateFactory", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "getTemplateFactory", "()Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "templates", "getTemplates", "()Lcom/yandex/div/json/templates/CachingTemplateProvider;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<DivTemplate> {

    @NotNull
    private final TemplateParsingEnvironment.TemplateFactory<DivTemplate> templateFactory;

    @NotNull
    private final CachingTemplateProvider<DivTemplate> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger) {
        this(parsingErrorLogger, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.INSTANCE.empty()) : cachingTemplateProvider);
    }

    public DivParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<DivTemplate> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new TemplateParsingEnvironment.TemplateFactory() { // from class: com.yandex.div.data.DivParsingEnvironment$$ExternalSyntheticLambda0
            @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
            public final Object create(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
                DivTemplate templateFactory$lambda$0;
                templateFactory$lambda$0 = DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironment, z, jSONObject);
                return templateFactory$lambda$0;
            }
        };
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment, com.yandex.div.serialization.ParsingContext
    @NotNull
    public CachingTemplateProvider<DivTemplate> getTemplates() {
        return this.templates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTemplate templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
        return DivTemplate.Companion.invoke(parsingEnvironment, z, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    @NotNull
    public TemplateParsingEnvironment.TemplateFactory<DivTemplate> getTemplateFactory() {
        return this.templateFactory;
    }
}
