package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDrawable.kt */
/* loaded from: classes10.dex */
public abstract class DivDrawable implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDrawable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDrawable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDrawable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivDrawable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivDrawable.kt */
    public static final class Shape extends DivDrawable {
        private final DivShapeDrawable value;

        public Shape(DivShapeDrawable divShapeDrawable) {
            super(null);
            this.value = divShapeDrawable;
        }

        public final DivShapeDrawable getValue() {
            return this.value;
        }
    }

    private DivDrawable() {
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (!(this instanceof Shape)) {
            throw new NoWhenBranchMatchedException();
        }
        int propertiesHash = hashCode + ((Shape) this).getValue().propertiesHash();
        this._propertiesHash = Integer.valueOf(propertiesHash);
        return propertiesHash;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (!(this instanceof Shape)) {
            throw new NoWhenBranchMatchedException();
        }
        int hash = hashCode + ((Shape) this).getValue().hash();
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivDrawable divDrawable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDrawable == null) {
            return false;
        }
        if (!(this instanceof Shape)) {
            throw new NoWhenBranchMatchedException();
        }
        DivShapeDrawable value = ((Shape) this).getValue();
        Object value2 = divDrawable.value();
        return value.equals(value2 instanceof DivShapeDrawable ? (DivShapeDrawable) value2 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Shape) {
            return ((Shape) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDrawableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDrawableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDrawable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivDrawable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDrawableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDrawableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
