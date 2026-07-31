package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitRequestJsonParser;
import com.yandex.div2.DivActionSubmitTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionSubmitTemplate.kt */
/* loaded from: classes10.dex */
public final class DivActionSubmitTemplate implements JSONSerializable, JsonTemplate {
    public final Field containerId;
    public final Field onFailActions;
    public final Field onSuccessActions;
    public final Field request;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmitTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSubmitTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSubmitTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionSubmitTemplate(Field field, Field field2, Field field3, Field field4) {
        this.containerId = field;
        this.onFailActions = field2;
        this.onSuccessActions = field3;
        this.request = field4;
    }

    public /* synthetic */ DivActionSubmitTemplate(ParsingEnvironment parsingEnvironment, DivActionSubmitTemplate divActionSubmitTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionSubmitTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionSubmitTemplate(ParsingEnvironment parsingEnvironment, DivActionSubmitTemplate divActionSubmitTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionSubmit resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionSubmitJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSubmitJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSubmitTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivActionSubmitTemplate.kt */
    public static final class RequestTemplate implements JSONSerializable, JsonTemplate {
        public final Field headers;
        public final Field method;
        public final Field url;
        public static final Companion Companion = new Companion(null);
        private static final Expression METHOD_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivActionSubmit.Request.Method.POST, null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivActionSubmitTemplate.RequestTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionSubmitTemplate.RequestTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public RequestTemplate(Field field, Field field2, Field field3) {
            this.headers = field;
            this.method = field2;
            this.url = field3;
        }

        public /* synthetic */ RequestTemplate(ParsingEnvironment parsingEnvironment, RequestTemplate requestTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : requestTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RequestTemplate(ParsingEnvironment parsingEnvironment, RequestTemplate requestTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivActionSubmit.Request resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionSubmitRequestJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivActionSubmitRequestJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivActionSubmitTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* compiled from: DivActionSubmitTemplate.kt */
        public static final class HeaderTemplate implements JSONSerializable, JsonTemplate {
            public final Field name;
            public final Field value;
            public static final Companion Companion = new Companion(null);
            private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSubmitTemplate$RequestTemplate$HeaderTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivActionSubmitTemplate.RequestTemplate.HeaderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivActionSubmitTemplate.RequestTemplate.HeaderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            public HeaderTemplate(Field field, Field field2) {
                this.name = field;
                this.value = field2;
            }

            public /* synthetic */ HeaderTemplate(ParsingEnvironment parsingEnvironment, HeaderTemplate headerTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(parsingEnvironment, (i & 2) != 0 ? null : headerTemplate, (i & 4) != 0 ? false : z, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public HeaderTemplate(ParsingEnvironment parsingEnvironment, HeaderTemplate headerTemplate, boolean z, JSONObject jSONObject) {
                this(r1.nullField(false), r1.nullField(false));
                Field.Companion companion = Field.INSTANCE;
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }

            @Override // com.yandex.div.json.JsonTemplate
            public DivActionSubmit.Request.Header resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivActionSubmitRequestHeaderJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestHeaderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((DivActionSubmitRequestHeaderJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSubmitRequestHeaderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            /* compiled from: DivActionSubmitTemplate.kt */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }
    }
}
