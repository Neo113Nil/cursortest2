package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDisappearActionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDisappearAction.kt */
/* loaded from: classes15.dex */
public final class DivDisappearAction implements JSONSerializable, Hashable, DivSightAction {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DISAPPEAR_DURATION_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression LOG_LIMIT_DEFAULT_VALUE;
    private static final Expression VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression disappearDuration;
    private final DivDownloadCallbacks downloadCallbacks;
    private final Expression isEnabled;
    private final Expression logId;
    private final Expression logLimit;
    private final JSONObject payload;
    private final Expression referer;
    private final String scopeId;
    private final DivActionTyped typed;
    private final Expression url;
    public final Expression visibilityPercentage;

    public DivDisappearAction(Expression expression, DivDownloadCallbacks divDownloadCallbacks, Expression expression2, Expression expression3, Expression expression4, JSONObject jSONObject, Expression expression5, String str, DivActionTyped divActionTyped, Expression expression6, Expression expression7) {
        this.disappearDuration = expression;
        this.downloadCallbacks = divDownloadCallbacks;
        this.isEnabled = expression2;
        this.logId = expression3;
        this.logLimit = expression4;
        this.payload = jSONObject;
        this.referer = expression5;
        this.scopeId = str;
        this.typed = divActionTyped;
        this.url = expression6;
        this.visibilityPercentage = expression7;
    }

    @Override // com.yandex.div2.DivSightAction
    public DivDownloadCallbacks getDownloadCallbacks() {
        return this.downloadCallbacks;
    }

    @Override // com.yandex.div2.DivSightAction
    public Expression isEnabled() {
        return this.isEnabled;
    }

    @Override // com.yandex.div2.DivSightAction
    public Expression getLogId() {
        return this.logId;
    }

    @Override // com.yandex.div2.DivSightAction
    public Expression getLogLimit() {
        return this.logLimit;
    }

    @Override // com.yandex.div2.DivSightAction
    public JSONObject getPayload() {
        return this.payload;
    }

    @Override // com.yandex.div2.DivSightAction
    public Expression getReferer() {
        return this.referer;
    }

    @Override // com.yandex.div2.DivSightAction
    public String getScopeId() {
        return this.scopeId;
    }

    @Override // com.yandex.div2.DivSightAction
    public DivActionTyped getTyped() {
        return this.typed;
    }

    @Override // com.yandex.div2.DivSightAction
    public Expression getUrl() {
        return this.url;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivDisappearAction.class).hashCode() + this.disappearDuration.hashCode();
        DivDownloadCallbacks downloadCallbacks = getDownloadCallbacks();
        int hash = hashCode + (downloadCallbacks != null ? downloadCallbacks.hash() : 0) + isEnabled().hashCode() + getLogId().hashCode() + getLogLimit().hashCode();
        JSONObject payload = getPayload();
        int hashCode2 = hash + (payload != null ? payload.hashCode() : 0);
        Expression referer = getReferer();
        int hashCode3 = hashCode2 + (referer != null ? referer.hashCode() : 0);
        String scopeId = getScopeId();
        int hashCode4 = hashCode3 + (scopeId != null ? scopeId.hashCode() : 0);
        DivActionTyped typed = getTyped();
        int hash2 = hashCode4 + (typed != null ? typed.hash() : 0);
        Expression url = getUrl();
        int hashCode5 = hash2 + (url != null ? url.hashCode() : 0) + this.visibilityPercentage.hashCode();
        this._hash = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    public final boolean equals(DivDisappearAction divDisappearAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDisappearAction == null || ((Number) this.disappearDuration.evaluate(expressionResolver)).longValue() != ((Number) divDisappearAction.disappearDuration.evaluate(expressionResolver2)).longValue()) {
            return false;
        }
        DivDownloadCallbacks downloadCallbacks = getDownloadCallbacks();
        if (!(downloadCallbacks != null ? downloadCallbacks.equals(divDisappearAction.getDownloadCallbacks(), expressionResolver, expressionResolver2) : divDisappearAction.getDownloadCallbacks() == null) || ((Boolean) isEnabled().evaluate(expressionResolver)).booleanValue() != ((Boolean) divDisappearAction.isEnabled().evaluate(expressionResolver2)).booleanValue() || !Intrinsics.areEqual(getLogId().evaluate(expressionResolver), divDisappearAction.getLogId().evaluate(expressionResolver2)) || ((Number) getLogLimit().evaluate(expressionResolver)).longValue() != ((Number) divDisappearAction.getLogLimit().evaluate(expressionResolver2)).longValue() || !Intrinsics.areEqual(getPayload(), divDisappearAction.getPayload())) {
            return false;
        }
        Expression referer = getReferer();
        Uri uri = referer != null ? (Uri) referer.evaluate(expressionResolver) : null;
        Expression referer2 = divDisappearAction.getReferer();
        if (!Intrinsics.areEqual(uri, referer2 != null ? (Uri) referer2.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(getScopeId(), divDisappearAction.getScopeId())) {
            return false;
        }
        DivActionTyped typed = getTyped();
        if (!(typed != null ? typed.equals(divDisappearAction.getTyped(), expressionResolver, expressionResolver2) : divDisappearAction.getTyped() == null)) {
            return false;
        }
        Expression url = getUrl();
        Uri uri2 = url != null ? (Uri) url.evaluate(expressionResolver) : null;
        Expression url2 = divDisappearAction.getUrl();
        return Intrinsics.areEqual(uri2, url2 != null ? (Uri) url2.evaluate(expressionResolver2) : null) && ((Number) this.visibilityPercentage.evaluate(expressionResolver)).longValue() == ((Number) divDisappearAction.visibilityPercentage.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDisappearActionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDisappearActionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDisappearAction.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivDisappearAction fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDisappearActionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDisappearActionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DISAPPEAR_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        LOG_LIMIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        VISIBILITY_PERCENTAGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivDisappearAction$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivDisappearAction invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivDisappearAction.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
