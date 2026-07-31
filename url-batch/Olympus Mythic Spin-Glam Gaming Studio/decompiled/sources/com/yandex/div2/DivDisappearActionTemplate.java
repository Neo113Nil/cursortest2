package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDisappearActionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDisappearActionTemplate.kt */
/* loaded from: classes14.dex */
public final class DivDisappearActionTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DISAPPEAR_DURATION_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression LOG_LIMIT_DEFAULT_VALUE;
    private static final Expression VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
    public final Field disappearDuration;
    public final Field downloadCallbacks;
    public final Field isEnabled;
    public final Field logId;
    public final Field logLimit;
    public final Field payload;
    public final Field referer;
    public final Field scopeId;
    public final Field typed;
    public final Field url;
    public final Field visibilityPercentage;

    public DivDisappearActionTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.disappearDuration = field;
        this.downloadCallbacks = field2;
        this.isEnabled = field3;
        this.logId = field4;
        this.logLimit = field5;
        this.payload = field6;
        this.referer = field7;
        this.scopeId = field8;
        this.typed = field9;
        this.url = field10;
        this.visibilityPercentage = field11;
    }

    public /* synthetic */ DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divDisappearActionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z, JSONObject jSONObject) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivDisappearAction resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivDisappearActionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDisappearActionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDisappearActionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDisappearActionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DISAPPEAR_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        LOG_LIMIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        VISIBILITY_PERCENTAGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivDisappearActionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivDisappearActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
