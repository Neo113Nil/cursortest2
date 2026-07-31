package com.yandex.div2;

import com.android.volley.toolbox.HttpClientStack;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C4701ic;
import com.safedk.android.a.g;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitRequestJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionSubmit.kt */
/* loaded from: classes13.dex */
public final class DivActionSubmit implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression containerId;
    public final List onFailActions;
    public final List onSuccessActions;
    public final Request request;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmit$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSubmit invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSubmit.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionSubmit(Expression expression, List list, List list2, Request request) {
        this.containerId = expression;
        this.onFailActions = list;
        this.onSuccessActions = list2;
        this.request = request;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionSubmit.class).hashCode() + this.containerId.hashCode();
        List list = this.onFailActions;
        int i2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List list2 = this.onSuccessActions;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        }
        int hash = i3 + i2 + this.request.hash();
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivActionSubmit divActionSubmit, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionSubmit == null || !Intrinsics.areEqual(this.containerId.evaluate(expressionResolver), divActionSubmit.containerId.evaluate(expressionResolver2))) {
            return false;
        }
        List list = this.onFailActions;
        if (list != null) {
            List list2 = divActionSubmit.onFailActions;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divActionSubmit.onFailActions != null) {
            return false;
        }
        List list3 = this.onSuccessActions;
        if (list3 != null) {
            List list4 = divActionSubmit.onSuccessActions;
            if (list4 == null || list3.size() != list4.size()) {
                return false;
            }
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj2).equals((DivAction) list4.get(i3), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i3 = i4;
            }
        } else if (divActionSubmit.onSuccessActions != null) {
            return false;
        }
        return this.request.equals(divActionSubmit.request, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSubmitJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSubmit.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionSubmit fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionSubmitJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivActionSubmit.kt */
    public static final class Request implements JSONSerializable, Hashable {
        private Integer _hash;
        public final List headers;
        public final Expression method;
        public final Expression url;
        public static final Companion Companion = new Companion(null);
        private static final Expression METHOD_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Method.POST, null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmit$Request$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivActionSubmit.Request invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivActionSubmit.Request.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Request(List list, Expression expression, Expression expression2) {
            this.headers = list;
            this.method = expression;
            this.url = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Request.class).hashCode();
            List list = this.headers;
            int i = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i += ((Header) it.next()).hash();
                }
            }
            int hashCode2 = hashCode + i + this.method.hashCode() + this.url.hashCode();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(Request request, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (request == null) {
                return false;
            }
            List list = this.headers;
            if (list != null) {
                List list2 = request.headers;
                if (list2 == null || list.size() != list2.size()) {
                    return false;
                }
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((Header) obj).equals((Header) list2.get(i), expressionResolver, expressionResolver2)) {
                        return false;
                    }
                    i = i2;
                }
            } else if (request.headers != null) {
                return false;
            }
            return this.method.evaluate(expressionResolver) == request.method.evaluate(expressionResolver2) && Intrinsics.areEqual(this.url.evaluate(expressionResolver), request.url.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivActionSubmitRequestJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivActionSubmit.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Request fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivActionSubmitRequestJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }

        /* compiled from: DivActionSubmit.kt */
        public static final class Header implements JSONSerializable, Hashable {
            private Integer _hash;
            public final Expression name;
            public final Expression value;
            public static final Companion Companion = new Companion(null);
            private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmit$Request$Header$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivActionSubmit.Request.Header invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivActionSubmit.Request.Header.Companion.fromJson(parsingEnvironment, jSONObject);
                }
            };

            public Header(Expression expression, Expression expression2) {
                this.name = expression;
                this.value = expression2;
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this._hash;
                if (num != null) {
                    return num.intValue();
                }
                int hashCode = Reflection.getOrCreateKotlinClass(Header.class).hashCode() + this.name.hashCode() + this.value.hashCode();
                this._hash = Integer.valueOf(hashCode);
                return hashCode;
            }

            public final boolean equals(Header header, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return header != null && Intrinsics.areEqual(this.name.evaluate(expressionResolver), header.name.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.value.evaluate(expressionResolver), header.value.evaluate(expressionResolver2));
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((DivActionSubmitRequestHeaderJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestHeaderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            /* compiled from: DivActionSubmit.kt */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Header fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return ((DivActionSubmitRequestHeaderJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestHeaderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
                }
            }
        }

        /* compiled from: DivActionSubmit.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivActionSubmit$Request$Method;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", C4701ic.a, "POST", g.f, HttpClientStack.HttpPatch.METHOD_NAME, "DELETE", "HEAD", "OPTIONS", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Method {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH(DivActionHandler.DivActionReason.PATCH),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);


            @NotNull
            private final String value;

            /* renamed from: Converter, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$TO_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@NotNull DivActionSubmit.Request.Method method) {
                    return DivActionSubmit.Request.Method.INSTANCE.toString(method);
                }
            };

            @NotNull
            public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DivActionSubmit.Request.Method invoke(@NotNull String str) {
                    return DivActionSubmit.Request.Method.INSTANCE.fromString(str);
                }
            };

            Method(String str) {
                this.value = str;
            }

            /* compiled from: DivActionSubmit.kt */
            /* renamed from: com.yandex.div2.DivActionSubmit$Request$Method$Converter, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final String toString(Method method) {
                    return method.value;
                }

                public final Method fromString(String str) {
                    Method method = Method.GET;
                    if (Intrinsics.areEqual(str, method.value)) {
                        return method;
                    }
                    Method method2 = Method.POST;
                    if (Intrinsics.areEqual(str, method2.value)) {
                        return method2;
                    }
                    Method method3 = Method.PUT;
                    if (Intrinsics.areEqual(str, method3.value)) {
                        return method3;
                    }
                    Method method4 = Method.PATCH;
                    if (Intrinsics.areEqual(str, method4.value)) {
                        return method4;
                    }
                    Method method5 = Method.DELETE;
                    if (Intrinsics.areEqual(str, method5.value)) {
                        return method5;
                    }
                    Method method6 = Method.HEAD;
                    if (Intrinsics.areEqual(str, method6.value)) {
                        return method6;
                    }
                    Method method7 = Method.OPTIONS;
                    if (Intrinsics.areEqual(str, method7.value)) {
                        return method7;
                    }
                    return null;
                }
            }
        }
    }
}
