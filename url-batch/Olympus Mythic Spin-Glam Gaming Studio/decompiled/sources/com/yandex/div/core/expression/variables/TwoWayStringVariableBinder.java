package com.yandex.div.core.expression.variables;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "toStringValue", "Callbacks", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder$Callbacks;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder$Callbacks;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callbacks extends TwoWayVariableBinder.Callbacks<String> {
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    @NotNull
    public String toStringValue(@NotNull String str) {
        return str;
    }

    public TwoWayStringVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }
}
