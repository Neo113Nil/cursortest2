package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionSetStoredValue;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivTypedValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivActionTypedSetStoredValueHandler.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u000b\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSetStoredValueHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "createStoredValue", "Lcom/yandex/div/data/StoredValue;", "value", "Lcom/yandex/div2/DivTypedValue;", "name", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleAction", "", "action", "Lcom/yandex/div2/DivActionSetStoredValue;", "view", "Lcom/yandex/div/core/view2/Div2View;", "", "scopeId", "Lcom/yandex/div2/DivActionTyped;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivActionTypedSetStoredValueHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof DivActionTyped.SetStoredValue)) {
            return false;
        }
        handleAction(((DivActionTyped.SetStoredValue) action).getValue(), view, resolver);
        return true;
    }

    private final void handleAction(DivActionSetStoredValue action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.name.evaluate(resolver);
        long longValue = ((Number) action.lifetime.evaluate(resolver)).longValue();
        StoredValuesActionHandler.INSTANCE.executeAction(createStoredValue(action.value, str, resolver), longValue, view);
    }

    private final StoredValue createStoredValue(DivTypedValue value, String name, ExpressionResolver resolver) {
        if (value instanceof DivTypedValue.Str) {
            return new StoredValue.StringStoredValue(name, (String) ((DivTypedValue.Str) value).getValue().value.evaluate(resolver));
        }
        if (value instanceof DivTypedValue.Integer) {
            return new StoredValue.IntegerStoredValue(name, ((Number) ((DivTypedValue.Integer) value).getValue().value.evaluate(resolver)).longValue());
        }
        if (value instanceof DivTypedValue.Bool) {
            return new StoredValue.BooleanStoredValue(name, ((Boolean) ((DivTypedValue.Bool) value).getValue().value.evaluate(resolver)).booleanValue());
        }
        if (value instanceof DivTypedValue.Number) {
            return new StoredValue.DoubleStoredValue(name, ((Number) ((DivTypedValue.Number) value).getValue().value.evaluate(resolver)).doubleValue());
        }
        if (value instanceof DivTypedValue.Color) {
            return new StoredValue.ColorStoredValue(name, Color.m7325constructorimpl(((Number) ((DivTypedValue.Color) value).getValue().value.evaluate(resolver)).intValue()), null);
        }
        if (value instanceof DivTypedValue.Url) {
            return new StoredValue.UrlStoredValue(name, Url.INSTANCE.m7343fromVcSV9u8(((Uri) ((DivTypedValue.Url) value).getValue().value.evaluate(resolver)).toString()), null);
        }
        if (value instanceof DivTypedValue.Array) {
            return new StoredValue.ArrayStoredValue(name, (JSONArray) ((DivTypedValue.Array) value).getValue().value.evaluate(resolver));
        }
        if (value instanceof DivTypedValue.Dict) {
            return new StoredValue.DictStoredValue(name, (JSONObject) ((DivTypedValue.Dict) value).getValue().value.evaluate(resolver));
        }
        throw new NoWhenBranchMatchedException();
    }
}
