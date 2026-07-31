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

/* compiled from: DivTooltipMode.kt */
/* loaded from: classes11.dex */
public abstract class DivTooltipMode implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltipMode$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTooltipMode invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTooltipMode.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivTooltipMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTooltipMode.kt */
    public static final class NonModal extends DivTooltipMode {
        private final DivTooltipModeNonModal value;

        public NonModal(DivTooltipModeNonModal divTooltipModeNonModal) {
            super(null);
            this.value = divTooltipModeNonModal;
        }

        public final DivTooltipModeNonModal getValue() {
            return this.value;
        }
    }

    private DivTooltipMode() {
    }

    /* compiled from: DivTooltipMode.kt */
    public static final class Modal extends DivTooltipMode {
        private final DivTooltipModeModal value;

        public Modal(DivTooltipModeModal divTooltipModeModal) {
            super(null);
            this.value = divTooltipModeModal;
        }

        public final DivTooltipModeModal getValue() {
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
        if (this instanceof NonModal) {
            propertiesHash = ((NonModal) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Modal)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Modal) this).getValue().propertiesHash();
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
        if (this instanceof NonModal) {
            hash = ((NonModal) this).getValue().hash();
        } else {
            if (!(this instanceof Modal)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Modal) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivTooltipMode divTooltipMode, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTooltipMode == null) {
            return false;
        }
        if (this instanceof NonModal) {
            DivTooltipModeNonModal value = ((NonModal) this).getValue();
            Object value2 = divTooltipMode.value();
            return value.equals(value2 instanceof DivTooltipModeNonModal ? (DivTooltipModeNonModal) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Modal)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTooltipModeModal value3 = ((Modal) this).getValue();
        Object value4 = divTooltipMode.value();
        return value3.equals(value4 instanceof DivTooltipModeModal ? (DivTooltipModeModal) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof NonModal) {
            return ((NonModal) this).getValue();
        }
        if (this instanceof Modal) {
            return ((Modal) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipModeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTooltipMode.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTooltipMode fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTooltipModeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipModeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
