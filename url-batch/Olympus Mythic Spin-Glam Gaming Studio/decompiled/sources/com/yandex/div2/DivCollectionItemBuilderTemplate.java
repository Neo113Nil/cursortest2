package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivCollectionItemBuilderJsonParser;
import com.yandex.div2.DivCollectionItemBuilderPrototypeJsonParser;
import com.yandex.div2.DivCollectionItemBuilderTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderTemplate.kt */
/* loaded from: classes9.dex */
public final class DivCollectionItemBuilderTemplate implements JSONSerializable, JsonTemplate {
    public final Field data;
    public final Field dataElementName;
    public final Field prototypes;
    public static final Companion Companion = new Companion(null);
    private static final String DATA_ELEMENT_NAME_DEFAULT_VALUE = "it";
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCollectionItemBuilderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCollectionItemBuilderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivCollectionItemBuilderTemplate(Field field, Field field2, Field field3) {
        this.data = field;
        this.dataElementName = field2;
        this.prototypes = field3;
    }

    public /* synthetic */ DivCollectionItemBuilderTemplate(ParsingEnvironment parsingEnvironment, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCollectionItemBuilderTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCollectionItemBuilderTemplate(ParsingEnvironment parsingEnvironment, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCollectionItemBuilder resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCollectionItemBuilderJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCollectionItemBuilderJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class PrototypeTemplate implements JSONSerializable, JsonTemplate {
        public final Field div;
        public final Field id;
        public final Field selector;
        public static final Companion Companion = new Companion(null);
        private static final Expression SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$PrototypeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivCollectionItemBuilderTemplate.PrototypeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivCollectionItemBuilderTemplate.PrototypeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public PrototypeTemplate(Field field, Field field2, Field field3) {
            this.div = field;
            this.id = field2;
            this.selector = field3;
        }

        public /* synthetic */ PrototypeTemplate(ParsingEnvironment parsingEnvironment, PrototypeTemplate prototypeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : prototypeTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PrototypeTemplate(ParsingEnvironment parsingEnvironment, PrototypeTemplate prototypeTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivCollectionItemBuilder.Prototype resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCollectionItemBuilderPrototypeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderPrototypeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivCollectionItemBuilderPrototypeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderPrototypeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivCollectionItemBuilderTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
