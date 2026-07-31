package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivActionTypedSetVariableHandler.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082\b¢\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSetVariableHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "checkValueAndCast", "T", "", "newValue", "view", "Lcom/yandex/div/core/view2/Div2View;", "variableName", "", "(Ljava/lang/Object;Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;)Ljava/lang/Object;", "handleAction", "", "scopeId", "action", "Lcom/yandex/div2/DivActionTyped;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleSetVariable", "", "Lcom/yandex/div2/DivActionTyped$SetVariable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivActionTypedSetVariableHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof DivActionTyped.SetVariable)) {
            return false;
        }
        handleSetVariable((DivActionTyped.SetVariable) action, view, resolver);
        return true;
    }

    private final void handleSetVariable(DivActionTyped.SetVariable action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.getValue().variableName.evaluate(resolver);
        final Object evaluate = DivActionTypedUtilsKt.evaluate(action.getValue().value, resolver);
        VariableMutationHandler.INSTANCE.setVariable(view, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedSetVariableHandler$handleSetVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                Object obj = evaluate;
                Div2View div2View = view;
                String str2 = str;
                String str3 = "array";
                if (variable instanceof Variable.ArrayVariable) {
                    boolean z = obj instanceof JSONArray;
                    JSONArray jSONArray = (JSONArray) (z ? obj : null);
                    if (jSONArray == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!z) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (jSONArray != null) {
                        ((Variable.ArrayVariable) variable).set(jSONArray);
                    }
                } else if (variable instanceof Variable.BooleanVariable) {
                    Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
                    if (bool == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (bool != null) {
                        ((Variable.BooleanVariable) variable).set(bool.booleanValue());
                    }
                } else if (variable instanceof Variable.ColorVariable) {
                    boolean z2 = obj instanceof Integer;
                    Integer num = (Integer) (z2 ? obj : null);
                    if (num == null) {
                        if (z2 ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (num != null) {
                        ((Variable.ColorVariable) variable).m7266setcIhhviA(Color.m7325constructorimpl(num.intValue()));
                    }
                } else if (variable instanceof Variable.DictVariable) {
                    boolean z3 = obj instanceof JSONObject;
                    JSONObject jSONObject = (JSONObject) (z3 ? obj : null);
                    if (jSONObject == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (z3) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (jSONObject != null) {
                        ((Variable.DictVariable) variable).set(jSONObject);
                    }
                } else if (variable instanceof Variable.DoubleVariable) {
                    boolean z4 = obj instanceof Double;
                    Double d = (Double) (z4 ? obj : null);
                    if (d == null) {
                        if (obj instanceof Integer ? true : z4) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (d != null) {
                        ((Variable.DoubleVariable) variable).set(d.doubleValue());
                    }
                } else if (variable instanceof Variable.IntegerVariable) {
                    Long l = (Long) (obj instanceof Long ? obj : null);
                    if (l == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (l != null) {
                        ((Variable.IntegerVariable) variable).set(l.longValue());
                    }
                } else if (variable instanceof Variable.StringVariable) {
                    String str4 = (String) (obj instanceof String ? obj : null);
                    if (str4 == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (str4 != null) {
                        variable.set(str4);
                    }
                } else if (variable instanceof Variable.UrlVariable) {
                    Uri uri = (Uri) (obj instanceof Uri ? obj : null);
                    if (uri == null) {
                        if (obj instanceof Integer ? true : obj instanceof Double) {
                            str3 = "number";
                        } else if (obj instanceof JSONObject) {
                            str3 = "dict";
                        } else if (!(obj instanceof JSONArray)) {
                            str3 = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        }
                        DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str3 + ") to variable " + str2));
                    }
                    if (uri != null) {
                        ((Variable.UrlVariable) variable).set(uri);
                    }
                } else if (variable instanceof Variable.PropertyVariable) {
                    throw new NotImplementedError("An operation is not implemented: Support property variables");
                }
                return variable;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T checkValueAndCast(Object newValue, Div2View view, String variableName) {
        String lowerCase;
        Intrinsics.reifiedOperationMarker(2, "T");
        if (newValue == 0) {
            if (newValue instanceof Integer ? true : newValue instanceof Double) {
                lowerCase = "number";
            } else if (newValue instanceof JSONObject) {
                lowerCase = "dict";
            } else if (newValue instanceof JSONArray) {
                lowerCase = "array";
            } else {
                lowerCase = newValue.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            DivActionTypedUtilsKt.logError(view, new IllegalArgumentException("Trying to set value with invalid type (" + lowerCase + ") to variable " + variableName));
        }
        return newValue;
    }
}
