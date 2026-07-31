package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundTemplate.kt */
/* loaded from: classes11.dex */
public abstract class DivTextRangeBackgroundTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeBackgroundTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBackgroundTemplate.Companion.invoke$default(DivTextRangeBackgroundTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTextRangeBackgroundTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class Solid extends DivTextRangeBackgroundTemplate {
        private final DivSolidBackgroundTemplate value;

        public Solid(DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.value = divSolidBackgroundTemplate;
        }

        public final DivSolidBackgroundTemplate getValue() {
            return this.value;
        }
    }

    private DivTextRangeBackgroundTemplate() {
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class Cloud extends DivTextRangeBackgroundTemplate {
        private final DivCloudBackgroundTemplate value;

        public Cloud(DivCloudBackgroundTemplate divCloudBackgroundTemplate) {
            super(null);
            this.value = divCloudBackgroundTemplate;
        }

        public final DivCloudBackgroundTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof Cloud) {
            return ((Cloud) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBackgroundJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextRangeBackground resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextRangeBackgroundJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBackgroundJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Solid) {
            return "solid";
        }
        if (this instanceof Cloud) {
            return "cloud";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTextRangeBackgroundTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTextRangeBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivTextRangeBackgroundJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBackgroundJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
