package com.yandex.div.core.expression.variables;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "toStringValue", "", "Callbacks", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public class TwoWayBooleanVariableBinder extends TwoWayVariableBinder<Boolean> {

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder$Callbacks;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callbacks extends TwoWayVariableBinder.Callbacks<Boolean> {
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Boolean bool) {
        return toStringValue(bool.booleanValue());
    }

    public TwoWayBooleanVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @NotNull
    public String toStringValue(boolean z) {
        return String.valueOf(z);
    }
}
