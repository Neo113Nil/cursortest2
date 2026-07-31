package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSizeTemplate.kt */
/* loaded from: classes10.dex */
public abstract class DivSizeTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSizeTemplate.Companion.invoke$default(DivSizeTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivSizeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class Fixed extends DivSizeTemplate {
        private final DivFixedSizeTemplate value;

        public Fixed(DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.value = divFixedSizeTemplate;
        }

        public final DivFixedSizeTemplate getValue() {
            return this.value;
        }
    }

    private DivSizeTemplate() {
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class MatchParent extends DivSizeTemplate {
        private final DivMatchParentSizeTemplate value;

        public MatchParent(DivMatchParentSizeTemplate divMatchParentSizeTemplate) {
            super(null);
            this.value = divMatchParentSizeTemplate;
        }

        public final DivMatchParentSizeTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class WrapContent extends DivSizeTemplate {
        private final DivWrapContentSizeTemplate value;

        public WrapContent(DivWrapContentSizeTemplate divWrapContentSizeTemplate) {
            super(null);
            this.value = divWrapContentSizeTemplate;
        }

        public final DivWrapContentSizeTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof MatchParent) {
            return ((MatchParent) this).getValue();
        }
        if (this instanceof WrapContent) {
            return ((WrapContent) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSizeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSizeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Fixed) {
            return "fixed";
        }
        if (this instanceof MatchParent) {
            return "match_parent";
        }
        if (this instanceof WrapContent) {
            return "wrap_content";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivSizeTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivSizeTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivSizeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
