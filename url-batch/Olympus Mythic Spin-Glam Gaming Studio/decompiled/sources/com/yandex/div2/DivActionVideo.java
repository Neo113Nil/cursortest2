package com.yandex.div2;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionVideo;
import com.yandex.div2.DivActionVideoJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionVideo.kt */
/* loaded from: classes11.dex */
public final class DivActionVideo implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression action;
    public final Expression id;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionVideo$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionVideo invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionVideo.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionVideo(Expression expression, Expression expression2) {
        this.action = expression;
        this.id = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionVideo.class).hashCode() + this.action.hashCode() + this.id.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionVideo divActionVideo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionVideo != null && this.action.evaluate(expressionResolver) == divActionVideo.action.evaluate(expressionResolver2) && Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionVideo.id.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionVideoJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionVideoJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionVideo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionVideo fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionVideoJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionVideoJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivActionVideo.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivActionVideo$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, "PAUSE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Action {
        START("start"),
        PAUSE("pause");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivActionVideo.Action action) {
                return DivActionVideo.Action.INSTANCE.toString(action);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivActionVideo.Action invoke(@NotNull String str) {
                return DivActionVideo.Action.INSTANCE.fromString(str);
            }
        };

        Action(String str) {
            this.value = str;
        }

        /* compiled from: DivActionVideo.kt */
        /* renamed from: com.yandex.div2.DivActionVideo$Action$Converter, reason: from kotlin metadata */
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
                Action action2 = Action.PAUSE;
                if (Intrinsics.areEqual(str, action2.value)) {
                    return action2;
                }
                return null;
            }
        }
    }
}
