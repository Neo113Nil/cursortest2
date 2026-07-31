package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivData.kt */
/* loaded from: classes10.dex */
public final class DivData implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List functions;
    public final String logId;
    public final List parsingErrors;
    public final List states;
    public final List timers;
    public final Expression transitionAnimationSelector;
    public final List variableTriggers;
    public final List variables;
    public static final Companion Companion = new Companion(null);
    private static final Expression TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivTransitionSelector.NONE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivData$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivData invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivData.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivData(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6) {
        this.functions = list;
        this.logId = str;
        this.states = list2;
        this.timers = list3;
        this.transitionAnimationSelector = expression;
        this.variableTriggers = list4;
        this.variables = list5;
        this.parsingErrors = list6;
    }

    public /* synthetic */ DivData(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, str, list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE : expression, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : list6);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        int i3;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivData.class).hashCode();
        List list = this.functions;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivFunction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = hashCode + i + this.logId.hashCode();
        Iterator it2 = this.states.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += ((State) it2.next()).hash();
        }
        int i6 = hashCode2 + i5;
        List list2 = this.timers;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                i2 += ((DivTimer) it3.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int hashCode3 = i6 + i2 + this.transitionAnimationSelector.hashCode();
        List list3 = this.variableTriggers;
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                i3 += ((DivTrigger) it4.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i7 = hashCode3 + i3;
        List list4 = this.variables;
        if (list4 != null) {
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                i4 += ((DivVariable) it5.next()).hash();
            }
        }
        int i8 = i7 + i4;
        this._hash = Integer.valueOf(i8);
        return i8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDataJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivData fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDataJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivData.kt */
    public static final class State implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Div div;
        public final long stateId;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivData$State$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivData.State invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivData.State.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public State(Div div, long j) {
            this.div = div;
            this.stateId = j;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(State.class).hashCode() + this.div.hash() + Long.hashCode(this.stateId);
            this._hash = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivDataStateJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivData.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final State fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivDataStateJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
