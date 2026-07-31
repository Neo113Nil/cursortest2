package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataJsonParser;
import com.yandex.div2.DivJsonParser$TemplateParserImpl;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchJsonParser;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.JsonParserComponent;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivKitJsonParser.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/serialization/DivKitJsonParser;", "", "parserComponent", "Lcom/yandex/div2/JsonParserComponent;", "context", "Lcom/yandex/div/serialization/DivKitJsonParser$CachingParsingContextImpl;", "(Lcom/yandex/div2/JsonParserComponent;Lcom/yandex/div/serialization/DivKitJsonParser$CachingParsingContextImpl;)V", "deserializeData", "Lcom/yandex/div2/DivData;", "data", "Lorg/json/JSONObject;", "deserializePatch", "Lcom/yandex/div2/DivPatch;", "parseTemplates", "Lcom/yandex/div/serialization/TemplateParsingResult;", "Lcom/yandex/div2/DivTemplate;", "retainTemplates", "serializeData", "value", "serializePatch", "Builder", "CachingParsingContextImpl", "ParsingContextImpl", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalApi
/* loaded from: classes11.dex */
public final class DivKitJsonParser {

    @NotNull
    private final CachingParsingContextImpl context;

    @NotNull
    private final JsonParserComponent parserComponent;

    public /* synthetic */ DivKitJsonParser(JsonParserComponent jsonParserComponent, CachingParsingContextImpl cachingParsingContextImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonParserComponent, cachingParsingContextImpl);
    }

    private DivKitJsonParser(JsonParserComponent jsonParserComponent, CachingParsingContextImpl cachingParsingContextImpl) {
        this.parserComponent = jsonParserComponent;
        this.context = cachingParsingContextImpl;
    }

    @NotNull
    public final DivData deserializeData(@NotNull JSONObject data) {
        return ((DivDataJsonParser.EntityParserImpl) this.parserComponent.getDivDataJsonEntityParser().getValue()).deserialize((ParsingContext) this.context, data);
    }

    @NotNull
    public final JSONObject serializeData(@NotNull DivData value) {
        return ((DivDataJsonParser.EntityParserImpl) this.parserComponent.getDivDataJsonEntityParser().getValue()).serialize((ParsingContext) this.context, value);
    }

    @NotNull
    public final DivPatch deserializePatch(@NotNull JSONObject data) {
        return ((DivPatchJsonParser.EntityParserImpl) this.parserComponent.getDivPatchJsonEntityParser().getValue()).deserialize((ParsingContext) this.context, data);
    }

    @NotNull
    public final JSONObject serializePatch(@NotNull DivPatch value) {
        return ((DivPatchJsonParser.EntityParserImpl) this.parserComponent.getDivPatchJsonEntityParser().getValue()).serialize((ParsingContext) this.context, value);
    }

    @NotNull
    public final TemplateParsingResult<DivTemplate> parseTemplates(@NotNull JSONObject data) {
        Map<String, DivTemplate> arrayMap = CollectionsKt.arrayMap();
        Map arrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> sort = JsonTopologicalSorting.INSTANCE.sort(this.context, data);
            this.context.getTemplates().takeSnapshot(arrayMap);
            TemplateProvider wrap = TemplateProvider.INSTANCE.wrap(arrayMap);
            for (Map.Entry<String, Set<String>> entry : sort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    arrayMap.put(key, ((DivJsonParser$TemplateParserImpl) this.parserComponent.getDivJsonTemplateParser().getValue()).deserialize((ParsingContext) new ParsingContextImpl(wrap, new TemplateParsingErrorLogger(this.context.getLogger(), key)), data.getJSONObject(key)));
                    if (!value.isEmpty()) {
                        arrayMap2.put(key, value);
                    }
                } catch (ParsingException e) {
                    this.context.getLogger().logTemplateError(e, key);
                }
            }
        } catch (Exception e2) {
            this.context.getLogger().logError(e2);
        }
        return new TemplateParsingResult<>(arrayMap, arrayMap2);
    }

    @NotNull
    public final TemplateParsingResult<DivTemplate> retainTemplates(@NotNull JSONObject data) {
        TemplateParsingResult<DivTemplate> parseTemplates = parseTemplates(data);
        this.context.getTemplates().putAll(parseTemplates.getTemplates());
        return parseTemplates;
    }

    /* compiled from: DivKitJsonParser.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/serialization/DivKitJsonParser$Builder;", "", "()V", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "templateProvider", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div2/DivTemplate;", "build", "Lcom/yandex/div/serialization/DivKitJsonParser;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private ParsingErrorLogger logger = ParsingErrorLogger.LOG;

        @Nullable
        private CachingTemplateProvider<DivTemplate> templateProvider;

        @NotNull
        public final Builder logger(@NotNull ParsingErrorLogger logger) {
            this.logger = logger;
            return this;
        }

        @NotNull
        public final DivKitJsonParser build() {
            JsonParserComponent jsonParserComponent = new JsonParserComponent();
            CachingTemplateProvider<DivTemplate> cachingTemplateProvider = this.templateProvider;
            if (cachingTemplateProvider == null) {
                cachingTemplateProvider = new CachingTemplateProvider<>(new InMemoryTemplateProvider(), TemplateProvider.INSTANCE.empty());
            }
            return new DivKitJsonParser(jsonParserComponent, new CachingParsingContextImpl(cachingTemplateProvider, this.logger), null);
        }
    }

    /* compiled from: DivKitJsonParser.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/serialization/DivKitJsonParser$ParsingContextImpl;", "Lcom/yandex/div/serialization/ParsingContext;", "templates", "Lcom/yandex/div/json/templates/TemplateProvider;", "Lcom/yandex/div2/DivTemplate;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Lcom/yandex/div/json/templates/TemplateProvider;Lcom/yandex/div/json/ParsingErrorLogger;)V", "getLogger", "()Lcom/yandex/div/json/ParsingErrorLogger;", "getTemplates", "()Lcom/yandex/div/json/templates/TemplateProvider;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ParsingContextImpl implements ParsingContext {

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final TemplateProvider<DivTemplate> templates;

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingContextImpl(@NotNull TemplateProvider<? extends DivTemplate> templateProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
            this.templates = templateProvider;
            this.logger = parsingErrorLogger;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public TemplateProvider<DivTemplate> getTemplates() {
            return this.templates;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public ParsingErrorLogger getLogger() {
            return this.logger;
        }
    }

    /* compiled from: DivKitJsonParser.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/serialization/DivKitJsonParser$CachingParsingContextImpl;", "Lcom/yandex/div/serialization/ParsingContext;", "templates", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div2/DivTemplate;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Lcom/yandex/div/json/templates/CachingTemplateProvider;Lcom/yandex/div/json/ParsingErrorLogger;)V", "getLogger", "()Lcom/yandex/div/json/ParsingErrorLogger;", "getTemplates", "()Lcom/yandex/div/json/templates/CachingTemplateProvider;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CachingParsingContextImpl implements ParsingContext {

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final CachingTemplateProvider<DivTemplate> templates;

        public CachingParsingContextImpl(@NotNull CachingTemplateProvider<DivTemplate> cachingTemplateProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
            this.templates = cachingTemplateProvider;
            this.logger = parsingErrorLogger;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public CachingTemplateProvider<DivTemplate> getTemplates() {
            return this.templates;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public ParsingErrorLogger getLogger() {
            return this.logger;
        }
    }
}
