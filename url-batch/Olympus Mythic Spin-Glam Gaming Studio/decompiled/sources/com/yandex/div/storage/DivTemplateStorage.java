package com.yandex.div.storage;

import androidx.annotation.WorkerThread;
import com.yandex.div.core.annotations.PublicApi;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTemplateStorage.kt */
@PublicApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\f\"\u00020\u0006H'¢\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivTemplateStorage;", "", "clear", "", "deleteTemplates", "cardId", "", "readTemplates", "", "", "readTemplatesByIds", "templateId", "", "([Ljava/lang/String;)Ljava/util/Map;", "writeTemplates", "templates", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface DivTemplateStorage {
    @WorkerThread
    void clear();

    @WorkerThread
    void deleteTemplates(@NotNull String cardId);

    @WorkerThread
    @NotNull
    Map<String, byte[]> readTemplates(@NotNull String cardId);

    @WorkerThread
    @NotNull
    Map<String, byte[]> readTemplatesByIds(@NotNull String... templateId);

    @WorkerThread
    void writeTemplates(@NotNull String cardId, @NotNull Map<String, byte[]> templates);
}
