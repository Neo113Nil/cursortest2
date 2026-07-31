package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.DivActionScrollByJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionScrollByTemplate.kt */
/* loaded from: classes4.dex */
public final class DivActionScrollByTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ANIMATED_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression ITEM_COUNT_DEFAULT_VALUE;
    private static final Expression OFFSET_DEFAULT_VALUE;
    private static final Expression OVERFLOW_DEFAULT_VALUE;
    public final Field animated;
    public final Field id;
    public final Field itemCount;
    public final Field offset;
    public final Field overflow;

    public DivActionScrollByTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.animated = field;
        this.id = field2;
        this.itemCount = field3;
        this.offset = field4;
        this.overflow = field5;
    }

    public /* synthetic */ DivActionScrollByTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollByTemplate divActionScrollByTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionScrollByTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionScrollByTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollByTemplate divActionScrollByTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionScrollBy resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionScrollByJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollByJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollByJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollByJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionScrollByTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        ITEM_COUNT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        OVERFLOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivActionScrollBy.Overflow.CLAMP, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollByTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivActionScrollByTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionScrollByTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
