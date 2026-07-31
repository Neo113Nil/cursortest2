package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.PropertyVariableJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: PropertyVariable.kt */
/* loaded from: classes.dex */
public final class PropertyVariable implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression get;
    public final String name;
    public final String newValueVariableName;
    public final List set;
    public final Expression valueType;
    public static final Companion Companion = new Companion(null);
    private static final String NEW_VALUE_VARIABLE_NAME_DEFAULT_VALUE = "new_value";
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.PropertyVariable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final PropertyVariable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return PropertyVariable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public PropertyVariable(Expression expression, String str, String str2, List list, Expression expression2) {
        this.get = expression;
        this.name = str;
        this.newValueVariableName = str2;
        this.set = list;
        this.valueType = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(PropertyVariable.class).hashCode() + this.get.hashCode() + this.name.hashCode() + this.newValueVariableName.hashCode();
        List list = this.set;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        }
        int hashCode2 = hashCode + i + this.valueType.hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(PropertyVariable propertyVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (propertyVariable == null || !Intrinsics.areEqual(this.get.evaluate(expressionResolver), propertyVariable.get.evaluate(expressionResolver2)) || !Intrinsics.areEqual(this.name, propertyVariable.name) || !Intrinsics.areEqual(this.newValueVariableName, propertyVariable.newValueVariableName)) {
            return false;
        }
        List list = this.set;
        if (list != null) {
            List list2 = propertyVariable.set;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (propertyVariable.set != null) {
            return false;
        }
        return this.valueType.evaluate(expressionResolver) == propertyVariable.valueType.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((PropertyVariableJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getPropertyVariableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: PropertyVariable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PropertyVariable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((PropertyVariableJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getPropertyVariableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
