package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: TrigonometricFunctions.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"evaluateMathResult", "", "result", "", "name", "", "args", "isValidTrigonometricResult", "", "value", "threshold", "throwIncorrectMathValueException", "", "toMathFunctionDisplayName", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrigonometricFunctionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object evaluateMathResult(double d, String str, double d2) {
        if (!isValidTrigonometricResult$default(d, 0.0d, 2, null)) {
            throwIncorrectMathValueException(str, d2);
        }
        return Double.valueOf(d);
    }

    static /* synthetic */ boolean isValidTrigonometricResult$default(double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            d2 = 1.0E10d;
        }
        return isValidTrigonometricResult(d, d2);
    }

    private static final boolean isValidTrigonometricResult(double d, double d2) {
        return !Double.isNaN(d) && Math.abs(d) <= d2;
    }

    private static final String toMathFunctionDisplayName(String str) {
        int hashCode = str.hashCode();
        return hashCode != 98696 ? hashCode != 2988422 ? (hashCode == 3003607 && str.equals("asin")) ? "Arcsine" : str : !str.equals("acos") ? str : "Arccosine" : !str.equals("cot") ? str : "Cotangent";
    }

    private static final void throwIncorrectMathValueException(String str, double d) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(str + '(' + d + ')', toMathFunctionDisplayName(str) + " is undefined for the given value.", null, 4, null);
        throw new KotlinNothingValueException();
    }
}
