package com.yandex.div.storage.templates;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/storage/templates/Template;", "", "id", "", "hash", "template", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getHash", "()Ljava/lang/String;", "getId", "getTemplate", "()Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Template {

    @NotNull
    private final String hash;

    @NotNull
    private final String id;

    @NotNull
    private final JSONObject template;

    public Template(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
        this.id = str;
        this.hash = str2;
        this.template = jSONObject;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    public final JSONObject getTemplate() {
        return this.template;
    }
}
