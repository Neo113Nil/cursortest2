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

/* compiled from: DivPageTransformation.kt */
/* loaded from: classes12.dex */
public abstract class DivPageTransformation implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPageTransformation$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPageTransformation invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageTransformation.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivPageTransformation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPageTransformation.kt */
    public static final class Slide extends DivPageTransformation {
        private final DivPageTransformationSlide value;

        public Slide(DivPageTransformationSlide divPageTransformationSlide) {
            super(null);
            this.value = divPageTransformationSlide;
        }

        public final DivPageTransformationSlide getValue() {
            return this.value;
        }
    }

    private DivPageTransformation() {
    }

    /* compiled from: DivPageTransformation.kt */
    public static final class Overlap extends DivPageTransformation {
        private final DivPageTransformationOverlap value;

        public Overlap(DivPageTransformationOverlap divPageTransformationOverlap) {
            super(null);
            this.value = divPageTransformationOverlap;
        }

        public final DivPageTransformationOverlap getValue() {
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
        if (this instanceof Slide) {
            propertiesHash = ((Slide) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Overlap)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Overlap) this).getValue().propertiesHash();
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
        if (this instanceof Slide) {
            hash = ((Slide) this).getValue().hash();
        } else {
            if (!(this instanceof Overlap)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Overlap) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivPageTransformation divPageTransformation, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageTransformation == null) {
            return false;
        }
        if (this instanceof Slide) {
            DivPageTransformationSlide value = ((Slide) this).getValue();
            Object value2 = divPageTransformation.value();
            return value.equals(value2 instanceof DivPageTransformationSlide ? (DivPageTransformationSlide) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Overlap)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageTransformationOverlap value3 = ((Overlap) this).getValue();
        Object value4 = divPageTransformation.value();
        return value3.equals(value4 instanceof DivPageTransformationOverlap ? (DivPageTransformationOverlap) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Slide) {
            return ((Slide) this).getValue();
        }
        if (this instanceof Overlap) {
            return ((Overlap) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageTransformationJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageTransformation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPageTransformation fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPageTransformationJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
