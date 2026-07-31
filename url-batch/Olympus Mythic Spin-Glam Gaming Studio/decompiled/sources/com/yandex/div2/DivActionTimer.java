package com.yandex.div2;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionTimer;
import com.yandex.div2.DivActionTimerJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionTimer.kt */
/* loaded from: classes15.dex */
public final class DivActionTimer implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression action;
    public final Expression id;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionTimer$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionTimer invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTimer.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionTimer(Expression expression, Expression expression2) {
        this.action = expression;
        this.id = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionTimer.class).hashCode() + this.action.hashCode() + this.id.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionTimer divActionTimer, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionTimer != null && this.action.evaluate(expressionResolver) == divActionTimer.action.evaluate(expressionResolver2) && Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionTimer.id.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionTimerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTimerJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionTimer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionTimer fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionTimerJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionTimerJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivActionTimer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/yandex/div2/DivActionTimer$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "STOP", "PAUSE", "RESUME", "CANCEL", "RESET", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Action {
        START("start"),
        STOP("stop"),
        PAUSE("pause"),
        RESUME("resume"),
        CANCEL("cancel"),
        RESET(TimerController.RESET_COMMAND);


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivActionTimer.Action action) {
                return DivActionTimer.Action.INSTANCE.toString(action);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivActionTimer.Action invoke(@NotNull String str) {
                return DivActionTimer.Action.INSTANCE.fromString(str);
            }
        };

        Action(String str) {
            this.value = str;
        }

        /* compiled from: DivActionTimer.kt */
        /* renamed from: com.yandex.div2.DivActionTimer$Action$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Action action) {
                return action.value;
            }

            public final Action fromString(String str) {
                Action action = Action.START;
                if (Intrinsics.areEqual(str, action.value)) {
                    return action;
                }
                Action action2 = Action.STOP;
                if (Intrinsics.areEqual(str, action2.value)) {
                    return action2;
                }
                Action action3 = Action.PAUSE;
                if (Intrinsics.areEqual(str, action3.value)) {
                    return action3;
                }
                Action action4 = Action.RESUME;
                if (Intrinsics.areEqual(str, action4.value)) {
                    return action4;
                }
                Action action5 = Action.CANCEL;
                if (Intrinsics.areEqual(str, action5.value)) {
                    return action5;
                }
                Action action6 = Action.RESET;
                if (Intrinsics.areEqual(str, action6.value)) {
                    return action6;
                }
                return null;
            }
        }
    }
}
