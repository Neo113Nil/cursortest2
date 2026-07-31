package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceResolutionJsonParser;
import com.yandex.div2.DivVideoSourceTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideoSourceTemplate.kt */
/* loaded from: classes.dex */
public final class DivVideoSourceTemplate implements JSONSerializable, JsonTemplate {
    public final Field bitrate;
    public final Field mimeType;
    public final Field resolution;
    public final Field url;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVideoSourceTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivVideoSourceTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivVideoSourceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivVideoSourceTemplate(Field field, Field field2, Field field3, Field field4) {
        this.bitrate = field;
        this.mimeType = field2;
        this.resolution = field3;
        this.url = field4;
    }

    public /* synthetic */ DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divVideoSourceTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivVideoSourceTemplate(ParsingEnvironment parsingEnvironment, DivVideoSourceTemplate divVideoSourceTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivVideoSource resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivVideoSourceJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVideoSourceJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    public static final class ResolutionTemplate implements JSONSerializable, JsonTemplate {
        public final Field height;
        public final Field width;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVideoSourceTemplate$ResolutionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivVideoSourceTemplate.ResolutionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivVideoSourceTemplate.ResolutionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public ResolutionTemplate(Field field, Field field2) {
            this.height = field;
            this.width = field2;
        }

        public /* synthetic */ ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : resolutionTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ResolutionTemplate(ParsingEnvironment parsingEnvironment, ResolutionTemplate resolutionTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivVideoSource.Resolution resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivVideoSourceResolutionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceResolutionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivVideoSourceResolutionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoSourceResolutionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivVideoSourceTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
