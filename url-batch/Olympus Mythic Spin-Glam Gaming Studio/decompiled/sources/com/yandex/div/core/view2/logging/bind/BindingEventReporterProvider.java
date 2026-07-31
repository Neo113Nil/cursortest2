package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import com.yandex.div2.DivData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BindingEventReporterProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "(Lcom/yandex/div/core/view2/Div2View;)V", "get", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "oldData", "Lcom/yandex/div2/DivData;", "newData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BindingEventReporterProvider {

    @NotNull
    private final Div2View div2View;

    public BindingEventReporterProvider(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    @NotNull
    public final BindingEventReporter get(@Nullable DivData oldData, @Nullable DivData newData) {
        if (Log.isEnabled()) {
            return new BindingEventReporterImpl(this.div2View, oldData, newData);
        }
        return BindingEventReporter.INSTANCE.getSTUB();
    }
}
