package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivImageBackgroundJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundTemplate.kt */
/* loaded from: classes15.dex */
public final class DivImageBackgroundTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    public final Field alpha;
    public final Field contentAlignmentHorizontal;
    public final Field contentAlignmentVertical;
    public final Field filters;
    public final Field imageUrl;
    public final Field preloadRequired;
    public final Field scale;

    public DivImageBackgroundTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.alpha = field;
        this.contentAlignmentHorizontal = field2;
        this.contentAlignmentVertical = field3;
        this.filters = field4;
        this.imageUrl = field5;
        this.preloadRequired = field6;
        this.scale = field7;
    }

    public /* synthetic */ DivImageBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divImageBackgroundTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivImageBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z, JSONObject jSONObject) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivImageBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivImageBackgroundJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivImageBackgroundJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivImageBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivImageBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
