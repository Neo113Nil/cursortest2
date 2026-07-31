package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchJsonParser;
import com.yandex.div2.DivPatchTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPatchTemplate.kt */
/* loaded from: classes10.dex */
public final class DivPatchTemplate implements JSONSerializable, JsonTemplate {
    public final Field changes;
    public final Field mode;
    public final Field onAppliedActions;
    public final Field onFailedActions;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivPatch.Mode.PARTIAL, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPatchTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPatchTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPatchTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivPatchTemplate(Field field, Field field2, Field field3, Field field4) {
        this.changes = field;
        this.mode = field2;
        this.onAppliedActions = field3;
        this.onFailedActions = field4;
    }

    public /* synthetic */ DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPatchTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPatch resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPatchJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPatchJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPatchTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivPatchTemplate.kt */
    public static final class ChangeTemplate implements JSONSerializable, JsonTemplate {
        public final Field id;
        public final Field items;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPatchTemplate.ChangeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPatchTemplate.ChangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public ChangeTemplate(Field field, Field field2) {
            this.id = field;
            this.items = field2;
        }

        public /* synthetic */ ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : changeTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivPatch.Change resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPatchChangeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivPatchChangeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivPatchTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
