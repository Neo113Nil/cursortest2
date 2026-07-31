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

/* compiled from: DivAppearanceTransition.kt */
/* loaded from: classes9.dex */
public abstract class DivAppearanceTransition implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAppearanceTransition$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAppearanceTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAppearanceTransition.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivAppearanceTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class Set extends DivAppearanceTransition {
        private final DivAppearanceSetTransition value;

        public Set(DivAppearanceSetTransition divAppearanceSetTransition) {
            super(null);
            this.value = divAppearanceSetTransition;
        }

        public final DivAppearanceSetTransition getValue() {
            return this.value;
        }
    }

    private DivAppearanceTransition() {
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class Fade extends DivAppearanceTransition {
        private final DivFadeTransition value;

        public Fade(DivFadeTransition divFadeTransition) {
            super(null);
            this.value = divFadeTransition;
        }

        public final DivFadeTransition getValue() {
            return this.value;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class Scale extends DivAppearanceTransition {
        private final DivScaleTransition value;

        public Scale(DivScaleTransition divScaleTransition) {
            super(null);
            this.value = divScaleTransition;
        }

        public final DivScaleTransition getValue() {
            return this.value;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class Slide extends DivAppearanceTransition {
        private final DivSlideTransition value;

        public Slide(DivSlideTransition divSlideTransition) {
            super(null);
            this.value = divSlideTransition;
        }

        public final DivSlideTransition getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Set) {
            propertiesHash = ((Set) this).getValue().propertiesHash();
        } else if (this instanceof Fade) {
            propertiesHash = ((Fade) this).getValue().propertiesHash();
        } else if (this instanceof Scale) {
            propertiesHash = ((Scale) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Slide)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Slide) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Set) {
            hash = ((Set) this).getValue().hash();
        } else if (this instanceof Fade) {
            hash = ((Fade) this).getValue().hash();
        } else if (this instanceof Scale) {
            hash = ((Scale) this).getValue().hash();
        } else {
            if (!(this instanceof Slide)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Slide) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivAppearanceTransition divAppearanceTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAppearanceTransition == null) {
            return false;
        }
        if (this instanceof Set) {
            DivAppearanceSetTransition value = ((Set) this).getValue();
            Object value2 = divAppearanceTransition.value();
            return value.equals(value2 instanceof DivAppearanceSetTransition ? (DivAppearanceSetTransition) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Fade) {
            DivFadeTransition value3 = ((Fade) this).getValue();
            Object value4 = divAppearanceTransition.value();
            return value3.equals(value4 instanceof DivFadeTransition ? (DivFadeTransition) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Scale) {
            DivScaleTransition value5 = ((Scale) this).getValue();
            Object value6 = divAppearanceTransition.value();
            return value5.equals(value6 instanceof DivScaleTransition ? (DivScaleTransition) value6 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Slide)) {
            throw new NoWhenBranchMatchedException();
        }
        DivSlideTransition value7 = ((Slide) this).getValue();
        Object value8 = divAppearanceTransition.value();
        return value7.equals(value8 instanceof DivSlideTransition ? (DivSlideTransition) value8 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Set) {
            return ((Set) this).getValue();
        }
        if (this instanceof Fade) {
            return ((Fade) this).getValue();
        }
        if (this instanceof Scale) {
            return ((Scale) this).getValue();
        }
        if (this instanceof Slide) {
            return ((Slide) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAppearanceTransitionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAppearanceTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAppearanceTransitionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAppearanceTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
