package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
/* loaded from: classes15.dex */
public final class DivAbsoluteEdgeInsetsTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression BOTTOM_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression LEFT_DEFAULT_VALUE;
    private static final Expression RIGHT_DEFAULT_VALUE;
    private static final Expression TOP_DEFAULT_VALUE;
    public final Field bottom;
    public final Field left;
    public final Field right;
    public final Field top;

    public DivAbsoluteEdgeInsetsTemplate(Field field, Field field2, Field field3, Field field4) {
        this.bottom = field;
        this.left = field2;
        this.right = field3;
        this.top = field4;
    }

    public /* synthetic */ DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divAbsoluteEdgeInsetsTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAbsoluteEdgeInsets resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAbsoluteEdgeInsetsJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAbsoluteEdgeInsetsJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAbsoluteEdgeInsetsJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAbsoluteEdgeInsetsJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BOTTOM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LEFT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        RIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TOP_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAbsoluteEdgeInsetsTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAbsoluteEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
