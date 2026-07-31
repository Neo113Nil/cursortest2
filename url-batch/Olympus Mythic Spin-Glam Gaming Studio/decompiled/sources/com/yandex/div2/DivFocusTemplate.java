package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFocusTemplate.kt */
/* loaded from: classes10.dex */
public final class DivFocusTemplate implements JSONSerializable, JsonTemplate {
    public final Field background;
    public final Field border;
    public final Field nextFocusIds;
    public final Field onBlur;
    public final Field onFocus;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFocusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFocusTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFocusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivFocusTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.background = field;
        this.border = field2;
        this.nextFocusIds = field3;
        this.onBlur = field4;
        this.onFocus = field5;
    }

    public /* synthetic */ DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFocusTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivFocusTemplate(ParsingEnvironment parsingEnvironment, DivFocusTemplate divFocusTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFocus resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFocusJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFocusJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFocusTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivFocusTemplate.kt */
    public static final class NextFocusIdsTemplate implements JSONSerializable, JsonTemplate {
        public final Field down;
        public final Field forward;
        public final Field left;
        public final Field right;
        public final Field up;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFocusTemplate$NextFocusIdsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFocusTemplate.NextFocusIdsTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFocusTemplate.NextFocusIdsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public NextFocusIdsTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.down = field;
            this.forward = field2;
            this.left = field3;
            this.right = field4;
            this.up = field5;
        }

        public /* synthetic */ NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : nextFocusIdsTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public NextFocusIdsTemplate(ParsingEnvironment parsingEnvironment, NextFocusIdsTemplate nextFocusIdsTemplate, boolean z, JSONObject jSONObject) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivFocus.NextFocusIds resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFocusNextFocusIdsJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusNextFocusIdsJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivFocusNextFocusIdsJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusNextFocusIdsJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivFocusTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
