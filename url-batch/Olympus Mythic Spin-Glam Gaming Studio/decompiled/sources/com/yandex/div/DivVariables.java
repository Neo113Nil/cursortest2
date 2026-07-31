package com.yandex.div;

import android.net.Uri;
import androidx.annotation.ColorInt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.ArrayVariable;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.ColorVariable;
import com.yandex.div2.DictVariable;
import com.yandex.div2.DivVariable;
import com.yandex.div2.IntegerVariable;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.StrVariable;
import com.yandex.div2.UrlVariable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivVariables.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b\u001a\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019¨\u0006\u001a"}, d2 = {"arrayVariable", "Lcom/yandex/div2/DivVariable$Array;", "name", "", "value", "Lorg/json/JSONArray;", "boolVariable", "Lcom/yandex/div2/DivVariable$Bool;", "", "colorVariable", "Lcom/yandex/div2/DivVariable$Color;", "", "dictVariable", "Lcom/yandex/div2/DivVariable$Dict;", "Lorg/json/JSONObject;", "integerVariable", "Lcom/yandex/div2/DivVariable$Integer;", "", "numberVariable", "Lcom/yandex/div2/DivVariable$Number;", "", "stringVariable", "Lcom/yandex/div2/DivVariable$Str;", "urlVariable", "Lcom/yandex/div2/DivVariable$Url;", "Landroid/net/Uri;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivVariables {
    @NotNull
    public static final DivVariable.Integer integerVariable(@NotNull String str, long j) {
        return new DivVariable.Integer(new IntegerVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, Long.valueOf(j), null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Number numberVariable(@NotNull String str, double d) {
        return new DivVariable.Number(new NumberVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, Double.valueOf(d), null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Bool boolVariable(@NotNull String str, boolean z) {
        return new DivVariable.Bool(new BoolVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, Boolean.valueOf(z), null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Str stringVariable(@NotNull String str, @NotNull String str2) {
        return new DivVariable.Str(new StrVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, str2, null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Color colorVariable(@NotNull String str, @ColorInt int i) {
        return new DivVariable.Color(new ColorVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, Integer.valueOf(i), null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Url urlVariable(@NotNull String str, @NotNull Uri uri) {
        return new DivVariable.Url(new UrlVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, uri, null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Dict dictVariable(@NotNull String str, @NotNull JSONObject jSONObject) {
        return new DivVariable.Dict(new DictVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, jSONObject, null, 2, null)));
    }

    @NotNull
    public static final DivVariable.Array arrayVariable(@NotNull String str, @NotNull JSONArray jSONArray) {
        return new DivVariable.Array(new ArrayVariable(str, Expression.Companion.constant$default(Expression.INSTANCE, jSONArray, null, 2, null)));
    }
}
