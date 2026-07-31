package com.yandex.div.storage.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TemplateUsage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/entity/TemplateUsage;", "", "cardId", "", "templateId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getTemplateId", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TemplateUsage {

    @NotNull
    private final String cardId;

    @NotNull
    private final String templateId;

    public TemplateUsage(@NotNull String str, @NotNull String str2) {
        this.cardId = str;
        this.templateId = str2;
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }
}
