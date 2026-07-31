package com.yandex.div.json;

import com.ironsource.B5;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TemplateParsingEnvironment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0002\u001c\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment;", "T", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div/json/ParsingEnvironment;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "mainTemplateProvider", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "(Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/templates/CachingTemplateProvider;)V", "getLogger", "()Lcom/yandex/div/json/ParsingErrorLogger;", "templateFactory", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "getTemplateFactory", "()Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "templates", "Lcom/yandex/div/json/templates/TemplateProvider;", "getTemplates", "()Lcom/yandex/div/json/templates/TemplateProvider;", "parseTemplates", "", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "parseTemplatesWithResult", "", "", "parseTemplatesWithResultAndDependencies", "Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "TemplateFactory", "TemplateParsingResult", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final CachingTemplateProvider<T> mainTemplateProvider;

    @NotNull
    private final TemplateProvider<T> templates;

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateFactory;", "T", "", "create", B5.o, "Lcom/yandex/div/json/ParsingEnvironment;", "topLevel", "", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "(Lcom/yandex/div/json/ParsingEnvironment;ZLorg/json/JSONObject;)Ljava/lang/Object;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TemplateFactory<T> {
        T create(@NotNull ParsingEnvironment env, boolean topLevel, @NotNull JSONObject json) throws JSONException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger) {
        this(parsingErrorLogger, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public abstract TemplateFactory<T> getTemplateFactory();

    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    public /* synthetic */ TemplateParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.INSTANCE.empty()) : cachingTemplateProvider);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<T> getTemplates() {
        return this.templates;
    }

    public final void parseTemplates(@NotNull JSONObject json) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(json));
    }

    @NotNull
    public final Map<String, T> parseTemplatesWithResult(@NotNull JSONObject json) {
        return parseTemplatesWithResultAndDependencies(json).getParsedTemplates();
    }

    @NotNull
    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(@NotNull JSONObject json) {
        Map<String, T> arrayMap = CollectionsKt.arrayMap();
        Map arrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> sort = JsonTopologicalSorting.INSTANCE.sort(this, json);
            this.mainTemplateProvider.takeSnapshot(arrayMap);
            TemplateProvider wrap = TemplateProvider.INSTANCE.wrap(arrayMap);
            for (Map.Entry<String, Set<String>> entry : sort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    arrayMap.put(key, getTemplateFactory().create(new ParsingEnvironmentImpl(wrap, new TemplateParsingErrorLogger(getLogger(), key)), true, json.getJSONObject(key)));
                    if (!value.isEmpty()) {
                        arrayMap2.put(key, value);
                    }
                } catch (ParsingException e) {
                    getLogger().logTemplateError(e, key);
                }
            }
        } catch (Exception e2) {
            getLogger().logError(e2);
        }
        return new TemplateParsingResult<>(arrayMap, arrayMap2);
    }

    /* compiled from: TemplateParsingEnvironment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B3\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004¢\u0006\u0002\u0010\bR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/div/json/TemplateParsingEnvironment$TemplateParsingResult;", "T", "", "parsedTemplates", "", "", "templateDependencies", "", "(Ljava/util/Map;Ljava/util/Map;)V", "getParsedTemplates", "()Ljava/util/Map;", "getTemplateDependencies", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TemplateParsingResult<T> {

        @NotNull
        private final Map<String, T> parsedTemplates;

        @NotNull
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(@NotNull Map<String, ? extends T> map, @NotNull Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }

        @NotNull
        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }

        @NotNull
        public final Map<String, Set<String>> getTemplateDependencies() {
            return this.templateDependencies;
        }
    }
}
