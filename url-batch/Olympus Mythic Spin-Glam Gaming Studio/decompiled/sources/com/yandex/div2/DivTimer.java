package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTimerJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTimer.kt */
/* loaded from: classes11.dex */
public final class DivTimer implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression duration;
    public final List endActions;
    public final String id;
    public final List tickActions;
    public final Expression tickInterval;
    public final String valueVariable;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTimer$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTimer invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTimer.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivTimer(Expression expression, List list, String str, List list2, Expression expression2, String str2) {
        this.duration = expression;
        this.endActions = list;
        this.id = str;
        this.tickActions = list2;
        this.tickInterval = expression2;
        this.valueVariable = str2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTimer.class).hashCode() + this.duration.hashCode();
        List list = this.endActions;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = hashCode + i + this.id.hashCode();
        List list2 = this.tickActions;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i3 = hashCode2 + i2;
        Expression expression = this.tickInterval;
        int hashCode3 = i3 + (expression != null ? expression.hashCode() : 0);
        String str = this.valueVariable;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTimerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTimerJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTimer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTimer fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTimerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTimerJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
