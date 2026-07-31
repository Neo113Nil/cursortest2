package com.yandex.div.json;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParsingEnvironmentExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/json/ParsingEnvironmentWrapper;", "Lcom/yandex/div/json/ParsingEnvironment;", "base", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Lcom/yandex/div/json/ParsingEnvironment;Lcom/yandex/div/json/ParsingErrorLogger;)V", "_templates", "Lcom/yandex/div/json/KeyWatchingTemplateProvider;", "getLogger", "()Lcom/yandex/div/json/ParsingErrorLogger;", "requestedKeys", "", "", "getRequestedKeys", "()Ljava/util/Set;", "templates", "Lcom/yandex/div/json/templates/TemplateProvider;", "Lcom/yandex/div/data/EntityTemplate;", "getTemplates", "()Lcom/yandex/div/json/templates/TemplateProvider;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParsingEnvironmentWrapper implements ParsingEnvironment {

    @NotNull
    private final KeyWatchingTemplateProvider _templates;

    @NotNull
    private final ParsingErrorLogger logger;

    public ParsingEnvironmentWrapper(@NotNull ParsingEnvironment parsingEnvironment, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.logger = parsingErrorLogger;
        this._templates = new KeyWatchingTemplateProvider(parsingEnvironment.getTemplates());
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this._templates;
    }

    @NotNull
    public final Set<String> getRequestedKeys() {
        return this._templates.getRequestedKeys();
    }
}
