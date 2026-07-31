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

/* compiled from: DivIndicatorItemPlacement.kt */
/* loaded from: classes11.dex */
public abstract class DivIndicatorItemPlacement implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivIndicatorItemPlacement$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivIndicatorItemPlacement invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivIndicatorItemPlacement.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivIndicatorItemPlacement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class Default extends DivIndicatorItemPlacement {
        private final DivDefaultIndicatorItemPlacement value;

        public Default(DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) {
            super(null);
            this.value = divDefaultIndicatorItemPlacement;
        }

        public final DivDefaultIndicatorItemPlacement getValue() {
            return this.value;
        }
    }

    private DivIndicatorItemPlacement() {
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class Stretch extends DivIndicatorItemPlacement {
        private final DivStretchIndicatorItemPlacement value;

        public Stretch(DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) {
            super(null);
            this.value = divStretchIndicatorItemPlacement;
        }

        public final DivStretchIndicatorItemPlacement getValue() {
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
        if (this instanceof Default) {
            propertiesHash = ((Default) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Stretch) this).getValue().propertiesHash();
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
        if (this instanceof Default) {
            hash = ((Default) this).getValue().hash();
        } else {
            if (!(this instanceof Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Stretch) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivIndicatorItemPlacement divIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divIndicatorItemPlacement == null) {
            return false;
        }
        if (this instanceof Default) {
            DivDefaultIndicatorItemPlacement value = ((Default) this).getValue();
            Object value2 = divIndicatorItemPlacement.value();
            return value.equals(value2 instanceof DivDefaultIndicatorItemPlacement ? (DivDefaultIndicatorItemPlacement) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Stretch)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStretchIndicatorItemPlacement value3 = ((Stretch) this).getValue();
        Object value4 = divIndicatorItemPlacement.value();
        return value3.equals(value4 instanceof DivStretchIndicatorItemPlacement ? (DivStretchIndicatorItemPlacement) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Default) {
            return ((Default) this).getValue();
        }
        if (this instanceof Stretch) {
            return ((Stretch) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivIndicatorItemPlacementJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorItemPlacementJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivIndicatorItemPlacement fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivIndicatorItemPlacementJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorItemPlacementJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
