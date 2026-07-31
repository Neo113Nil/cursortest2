package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivRadialGradientCenterTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientCenterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientCenterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientCenterTemplate.Companion.invoke$default(DivRadialGradientCenterTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivRadialGradientCenterTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class Fixed extends DivRadialGradientCenterTemplate {
        private final DivRadialGradientFixedCenterTemplate value;

        public Fixed(DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) {
            super(null);
            this.value = divRadialGradientFixedCenterTemplate;
        }

        public final DivRadialGradientFixedCenterTemplate getValue() {
            return this.value;
        }
    }

    private DivRadialGradientCenterTemplate() {
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class Relative extends DivRadialGradientCenterTemplate {
        private final DivRadialGradientRelativeCenterTemplate value;

        public Relative(DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) {
            super(null);
            this.value = divRadialGradientRelativeCenterTemplate;
        }

        public final DivRadialGradientRelativeCenterTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof Relative) {
            return ((Relative) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientCenterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientCenterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradientCenter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientCenterJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientCenterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Fixed) {
            return "fixed";
        }
        if (this instanceof Relative) {
            return Constants.PATH_TYPE_RELATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivRadialGradientCenterTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivRadialGradientCenterTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivRadialGradientCenterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientCenterJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
