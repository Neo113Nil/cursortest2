package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivIdLoggingImageDownloadCallback.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "(Lcom/yandex/div/core/view2/Div2View;)V", "divId", "", "(Ljava/lang/String;)V", "getAdditionalLogInfo", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {

    @NotNull
    private final String divId;

    public DivIdLoggingImageDownloadCallback(@NotNull String str) {
        this.divId = str;
    }

    public DivIdLoggingImageDownloadCallback(@NotNull Div2View div2View) {
        this(div2View.getLogId());
    }

    @Override // com.yandex.div.core.images.DivImageDownloadCallback
    @NotNull
    /* renamed from: getAdditionalLogInfo, reason: from getter */
    public String getDivId() {
        return this.divId;
    }
}
