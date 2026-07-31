package com.yandex.div.storage.templates;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TemplatesPayloadForStorage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage;", "", "AllCardsInvalid", "Empty", "Filled", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$AllCardsInvalid;", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$Empty;", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$Filled;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TemplatesPayloadForStorage {

    /* compiled from: TemplatesPayloadForStorage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$Filled;", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage;", "source", "", "extendExistingTemplates", "", "templates", "", "", "(Ljava/lang/String;ZLjava/util/Map;)V", "getExtendExistingTemplates", "()Z", "getSource", "()Ljava/lang/String;", "getTemplates", "()Ljava/util/Map;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Filled implements TemplatesPayloadForStorage {
        private final boolean extendExistingTemplates;

        @NotNull
        private final String source;

        @NotNull
        private final Map<String, byte[]> templates;

        public Filled(@NotNull String str, boolean z, @NotNull Map<String, byte[]> map) {
            this.source = str;
            this.extendExistingTemplates = z;
            this.templates = map;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public final boolean getExtendExistingTemplates() {
            return this.extendExistingTemplates;
        }

        @NotNull
        public final Map<String, byte[]> getTemplates() {
            return this.templates;
        }
    }

    /* compiled from: TemplatesPayloadForStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$Empty;", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage;", "()V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Empty implements TemplatesPayloadForStorage {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }
    }

    /* compiled from: TemplatesPayloadForStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage$AllCardsInvalid;", "Lcom/yandex/div/storage/templates/TemplatesPayloadForStorage;", "()V", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AllCardsInvalid implements TemplatesPayloadForStorage {

        @NotNull
        public static final AllCardsInvalid INSTANCE = new AllCardsInvalid();

        private AllCardsInvalid() {
        }
    }
}
