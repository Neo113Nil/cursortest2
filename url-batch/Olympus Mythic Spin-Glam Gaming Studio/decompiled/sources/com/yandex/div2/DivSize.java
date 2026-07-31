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

/* compiled from: DivSize.kt */
/* loaded from: classes15.dex */
public abstract class DivSize implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivSize(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivSize.kt */
    public static final class Fixed extends DivSize {
        private final DivFixedSize value;

        public Fixed(DivFixedSize divFixedSize) {
            super(null);
            this.value = divFixedSize;
        }

        public final DivFixedSize getValue() {
            return this.value;
        }
    }

    private DivSize() {
    }

    /* compiled from: DivSize.kt */
    public static final class MatchParent extends DivSize {
        private final DivMatchParentSize value;

        public MatchParent(DivMatchParentSize divMatchParentSize) {
            super(null);
            this.value = divMatchParentSize;
        }

        public final DivMatchParentSize getValue() {
            return this.value;
        }
    }

    /* compiled from: DivSize.kt */
    public static final class WrapContent extends DivSize {
        private final DivWrapContentSize value;

        public WrapContent(DivWrapContentSize divWrapContentSize) {
            super(null);
            this.value = divWrapContentSize;
        }

        public final DivWrapContentSize getValue() {
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
        if (this instanceof Fixed) {
            propertiesHash = ((Fixed) this).getValue().propertiesHash();
        } else if (this instanceof MatchParent) {
            propertiesHash = ((MatchParent) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof WrapContent)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((WrapContent) this).getValue().propertiesHash();
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
        if (this instanceof Fixed) {
            hash = ((Fixed) this).getValue().hash();
        } else if (this instanceof MatchParent) {
            hash = ((MatchParent) this).getValue().hash();
        } else {
            if (!(this instanceof WrapContent)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((WrapContent) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivSize divSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divSize == null) {
            return false;
        }
        if (this instanceof Fixed) {
            DivFixedSize value = ((Fixed) this).getValue();
            Object value2 = divSize.value();
            return value.equals(value2 instanceof DivFixedSize ? (DivFixedSize) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof MatchParent) {
            DivMatchParentSize value3 = ((MatchParent) this).getValue();
            Object value4 = divSize.value();
            return value3.equals(value4 instanceof DivMatchParentSize ? (DivMatchParentSize) value4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof WrapContent)) {
            throw new NoWhenBranchMatchedException();
        }
        DivWrapContentSize value5 = ((WrapContent) this).getValue();
        Object value6 = divSize.value();
        return value5.equals(value6 instanceof DivWrapContentSize ? (DivWrapContentSize) value6 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof MatchParent) {
            return ((MatchParent) this).getValue();
        }
        if (this instanceof WrapContent) {
            return ((WrapContent) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
