package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivTriggerJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTrigger.kt */
/* loaded from: classes8.dex */
public final class DivTrigger implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List actions;
    public final Expression condition;
    public final Expression mode;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Mode.ON_CONDITION, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTrigger$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTrigger invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTrigger.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivTrigger(List list, Expression expression, Expression expression2) {
        this.actions = list;
        this.condition = expression;
        this.mode = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTrigger.class).hashCode();
        Iterator it = this.actions.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DivAction) it.next()).hash();
        }
        int hashCode2 = hashCode + i + this.condition.hashCode() + this.mode.hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivTrigger divTrigger, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTrigger == null) {
            return false;
        }
        List list = this.actions;
        List list2 = divTrigger.actions;
        if (list.size() != list2.size()) {
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
        return ((Boolean) this.condition.evaluate(expressionResolver)).booleanValue() == ((Boolean) divTrigger.condition.evaluate(expressionResolver2)).booleanValue() && this.mode.evaluate(expressionResolver) == divTrigger.mode.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTriggerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTriggerJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTrigger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTrigger fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTriggerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTriggerJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivTrigger.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivTrigger$Mode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "ON_CONDITION", "ON_VARIABLE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivTrigger.Mode mode) {
                return DivTrigger.Mode.INSTANCE.toString(mode);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivTrigger$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivTrigger.Mode invoke(@NotNull String str) {
                return DivTrigger.Mode.INSTANCE.fromString(str);
            }
        };

        Mode(String str) {
            this.value = str;
        }

        /* compiled from: DivTrigger.kt */
        /* renamed from: com.yandex.div2.DivTrigger$Mode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Mode mode) {
                return mode.value;
            }

            public final Mode fromString(String str) {
                Mode mode = Mode.ON_CONDITION;
                if (Intrinsics.areEqual(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.ON_VARIABLE;
                if (Intrinsics.areEqual(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }
        }
    }
}
