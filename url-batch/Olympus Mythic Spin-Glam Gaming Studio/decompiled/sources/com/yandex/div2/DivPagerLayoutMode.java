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

/* compiled from: DivPagerLayoutMode.kt */
/* loaded from: classes12.dex */
public abstract class DivPagerLayoutMode implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPagerLayoutMode$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPagerLayoutMode invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPagerLayoutMode.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivPagerLayoutMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class PageSize extends DivPagerLayoutMode {
        private final DivPageSize value;

        public PageSize(DivPageSize divPageSize) {
            super(null);
            this.value = divPageSize;
        }

        public final DivPageSize getValue() {
            return this.value;
        }
    }

    private DivPagerLayoutMode() {
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class NeighbourPageSize extends DivPagerLayoutMode {
        private final DivNeighbourPageSize value;

        public NeighbourPageSize(DivNeighbourPageSize divNeighbourPageSize) {
            super(null);
            this.value = divNeighbourPageSize;
        }

        public final DivNeighbourPageSize getValue() {
            return this.value;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class PageContentSize extends DivPagerLayoutMode {
        private final DivPageContentSize value;

        public PageContentSize(DivPageContentSize divPageContentSize) {
            super(null);
            this.value = divPageContentSize;
        }

        public final DivPageContentSize getValue() {
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
        if (this instanceof PageSize) {
            propertiesHash = ((PageSize) this).getValue().propertiesHash();
        } else if (this instanceof NeighbourPageSize) {
            propertiesHash = ((NeighbourPageSize) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof PageContentSize)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((PageContentSize) this).getValue().propertiesHash();
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
        if (this instanceof PageSize) {
            hash = ((PageSize) this).getValue().hash();
        } else if (this instanceof NeighbourPageSize) {
            hash = ((NeighbourPageSize) this).getValue().hash();
        } else {
            if (!(this instanceof PageContentSize)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((PageContentSize) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivPagerLayoutMode divPagerLayoutMode, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPagerLayoutMode == null) {
            return false;
        }
        if (this instanceof PageSize) {
            DivPageSize value = ((PageSize) this).getValue();
            Object value2 = divPagerLayoutMode.value();
            return value.equals(value2 instanceof DivPageSize ? (DivPageSize) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof NeighbourPageSize) {
            DivNeighbourPageSize value3 = ((NeighbourPageSize) this).getValue();
            Object value4 = divPagerLayoutMode.value();
            return value3.equals(value4 instanceof DivNeighbourPageSize ? (DivNeighbourPageSize) value4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof PageContentSize)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPageContentSize value5 = ((PageContentSize) this).getValue();
        Object value6 = divPagerLayoutMode.value();
        return value5.equals(value6 instanceof DivPageContentSize ? (DivPageContentSize) value6 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof PageSize) {
            return ((PageSize) this).getValue();
        }
        if (this instanceof NeighbourPageSize) {
            return ((NeighbourPageSize) this).getValue();
        }
        if (this instanceof PageContentSize) {
            return ((PageContentSize) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPagerLayoutModeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerLayoutModeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPagerLayoutMode fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPagerLayoutModeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerLayoutModeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
