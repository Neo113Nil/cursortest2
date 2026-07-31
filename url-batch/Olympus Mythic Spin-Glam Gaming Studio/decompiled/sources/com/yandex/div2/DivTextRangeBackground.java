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

/* compiled from: DivTextRangeBackground.kt */
/* loaded from: classes11.dex */
public abstract class DivTextRangeBackground implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeBackground$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBackground.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivTextRangeBackground(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextRangeBackground.kt */
    public static final class Solid extends DivTextRangeBackground {
        private final DivSolidBackground value;

        public Solid(DivSolidBackground divSolidBackground) {
            super(null);
            this.value = divSolidBackground;
        }

        public final DivSolidBackground getValue() {
            return this.value;
        }
    }

    private DivTextRangeBackground() {
    }

    /* compiled from: DivTextRangeBackground.kt */
    public static final class Cloud extends DivTextRangeBackground {
        private final DivCloudBackground value;

        public Cloud(DivCloudBackground divCloudBackground) {
            super(null);
            this.value = divCloudBackground;
        }

        public final DivCloudBackground getValue() {
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
        if (this instanceof Solid) {
            propertiesHash = ((Solid) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Cloud)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Cloud) this).getValue().propertiesHash();
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
        if (this instanceof Solid) {
            hash = ((Solid) this).getValue().hash();
        } else {
            if (!(this instanceof Cloud)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Cloud) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivTextRangeBackground divTextRangeBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeBackground == null) {
            return false;
        }
        if (this instanceof Solid) {
            DivSolidBackground value = ((Solid) this).getValue();
            Object value2 = divTextRangeBackground.value();
            return value.equals(value2 instanceof DivSolidBackground ? (DivSolidBackground) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Cloud)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCloudBackground value3 = ((Cloud) this).getValue();
        Object value4 = divTextRangeBackground.value();
        return value3.equals(value4 instanceof DivCloudBackground ? (DivCloudBackground) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof Cloud) {
            return ((Cloud) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
