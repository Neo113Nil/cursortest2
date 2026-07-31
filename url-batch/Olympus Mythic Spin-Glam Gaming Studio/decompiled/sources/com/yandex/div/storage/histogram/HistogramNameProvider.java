package com.yandex.div.storage.histogram;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HistogramNameProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "", "coldCallTypeSuffix", "", "getColdCallTypeSuffix", "()Ljava/lang/String;", "componentName", "getComponentName", "divDataLoadReportName", "getDivDataLoadReportName", "divLoadTemplatesReportName", "getDivLoadTemplatesReportName", "divParsingHistogramName", "getDivParsingHistogramName", "hotCallTypeSuffix", "getHotCallTypeSuffix", "getHistogramNameFromCardId", "cardId", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface HistogramNameProvider {
    @NotNull
    String getComponentName();

    @NotNull
    String getDivDataLoadReportName();

    @NotNull
    String getDivLoadTemplatesReportName();

    @NotNull
    String getDivParsingHistogramName();

    @Nullable
    String getHistogramNameFromCardId(@NotNull String cardId);

    @NotNull
    default String getColdCallTypeSuffix() {
        return "Cold";
    }

    @NotNull
    default String getHotCallTypeSuffix() {
        return "Hot";
    }
}
