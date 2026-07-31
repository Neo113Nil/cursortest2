package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeSetTransitionJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeSetTransition.kt */
/* loaded from: classes10.dex */
public final class DivChangeSetTransition implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public final List items;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivChangeSetTransition$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivChangeSetTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivChangeSetTransition.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivChangeSetTransition(List list) {
        this.items = list;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivChangeSetTransition.class).hashCode();
        this._propertiesHash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DivChangeTransition) it.next()).hash();
        }
        int i2 = propertiesHash + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    public final boolean equals(DivChangeSetTransition divChangeSetTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divChangeSetTransition == null) {
            return false;
        }
        List list = this.items;
        List list2 = divChangeSetTransition.items;
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((DivChangeTransition) obj).equals((DivChangeTransition) list2.get(i), expressionResolver, expressionResolver2)) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivChangeSetTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeSetTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivChangeSetTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivChangeSetTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivChangeSetTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeSetTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
