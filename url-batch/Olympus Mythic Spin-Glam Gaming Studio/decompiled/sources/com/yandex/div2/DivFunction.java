package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFunctionJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFunction.kt */
/* loaded from: classes11.dex */
public final class DivFunction implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List arguments;
    public final String body;
    public final String name;
    public final DivEvaluableType returnType;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFunction$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFunction invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFunction.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivFunction(List list, String str, String str2, DivEvaluableType divEvaluableType) {
        this.arguments = list;
        this.body = str;
        this.name = str2;
        this.returnType = divEvaluableType;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFunction.class).hashCode();
        Iterator it = this.arguments.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DivFunctionArgument) it.next()).hash();
        }
        int hashCode2 = hashCode + i + this.body.hashCode() + this.name.hashCode() + this.returnType.hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivFunction divFunction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divFunction == null) {
            return false;
        }
        List list = this.arguments;
        List list2 = divFunction.arguments;
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((DivFunctionArgument) obj).equals((DivFunctionArgument) list2.get(i), expressionResolver, expressionResolver2)) {
                return false;
            }
            i = i2;
        }
        return Intrinsics.areEqual(this.body, divFunction.body) && Intrinsics.areEqual(this.name, divFunction.name) && this.returnType == divFunction.returnType;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFunctionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFunction.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFunction fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFunctionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFunctionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
