package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivImageBackgroundJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivImageBackground.kt */
/* loaded from: classes13.dex */
public final class DivImageBackground implements JSONSerializable, Hashable {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression alpha;
    public final Expression contentAlignmentHorizontal;
    public final Expression contentAlignmentVertical;
    public final List filters;
    public final Expression imageUrl;
    public final Expression preloadRequired;
    public final Expression scale;

    public DivImageBackground(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, Expression expression5, Expression expression6) {
        this.alpha = expression;
        this.contentAlignmentHorizontal = expression2;
        this.contentAlignmentVertical = expression3;
        this.filters = list;
        this.imageUrl = expression4;
        this.preloadRequired = expression5;
        this.scale = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivImageBackground.class).hashCode() + this.alpha.hashCode() + this.contentAlignmentHorizontal.hashCode() + this.contentAlignmentVertical.hashCode();
        List list = this.filters;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((DivFilter) it.next()).hash();
            }
        }
        int hashCode2 = hashCode + i + this.imageUrl.hashCode() + this.preloadRequired.hashCode() + this.scale.hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivImageBackground divImageBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divImageBackground == null || ((Number) this.alpha.evaluate(expressionResolver)).doubleValue() != ((Number) divImageBackground.alpha.evaluate(expressionResolver2)).doubleValue() || this.contentAlignmentHorizontal.evaluate(expressionResolver) != divImageBackground.contentAlignmentHorizontal.evaluate(expressionResolver2) || this.contentAlignmentVertical.evaluate(expressionResolver) != divImageBackground.contentAlignmentVertical.evaluate(expressionResolver2)) {
            return false;
        }
        List list = this.filters;
        if (list != null) {
            List list2 = divImageBackground.filters;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivFilter) obj).equals((DivFilter) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divImageBackground.filters != null) {
            return false;
        }
        return Intrinsics.areEqual(this.imageUrl.evaluate(expressionResolver), divImageBackground.imageUrl.evaluate(expressionResolver2)) && ((Boolean) this.preloadRequired.evaluate(expressionResolver)).booleanValue() == ((Boolean) divImageBackground.preloadRequired.evaluate(expressionResolver2)).booleanValue() && this.scale.evaluate(expressionResolver) == divImageBackground.scale.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivImageBackgroundJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivImageBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivImageBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivImageBackgroundJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivImageBackground$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivImageBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivImageBackground.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
