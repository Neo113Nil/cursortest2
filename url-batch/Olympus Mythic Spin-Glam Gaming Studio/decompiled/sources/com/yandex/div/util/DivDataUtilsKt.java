package com.yandex.div.util;

import com.yandex.div2.DivData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivDataUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"INVALID_STATE_ID", "", "Lcom/yandex/div2/DivData$Companion;", "getINVALID_STATE_ID", "(Lcom/yandex/div2/DivData$Companion;)J", "getInitialStateId", "Lcom/yandex/div2/DivData;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(@NotNull DivData.Companion companion) {
        return -1L;
    }

    public static final long getInitialStateId(@NotNull DivData divData) {
        return divData.states.isEmpty() ? getINVALID_STATE_ID(DivData.Companion) : ((DivData.State) divData.states.get(0)).stateId;
    }
}
