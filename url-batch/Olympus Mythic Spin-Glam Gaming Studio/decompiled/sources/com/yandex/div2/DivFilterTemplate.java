package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFilterTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivFilterTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFilterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFilterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilterTemplate.Companion.invoke$default(DivFilterTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivFilterTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivFilterTemplate.kt */
    public static final class Blur extends DivFilterTemplate {
        private final DivBlurTemplate value;

        public Blur(DivBlurTemplate divBlurTemplate) {
            super(null);
            this.value = divBlurTemplate;
        }

        public final DivBlurTemplate getValue() {
            return this.value;
        }
    }

    private DivFilterTemplate() {
    }

    /* compiled from: DivFilterTemplate.kt */
    public static final class RtlMirror extends DivFilterTemplate {
        private final DivFilterRtlMirrorTemplate value;

        public RtlMirror(DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate) {
            super(null);
            this.value = divFilterRtlMirrorTemplate;
        }

        public final DivFilterRtlMirrorTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Blur) {
            return ((Blur) this).getValue();
        }
        if (this instanceof RtlMirror) {
            return ((RtlMirror) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFilterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFilter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFilterJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Blur) {
            return "blur";
        }
        if (this instanceof RtlMirror) {
            return "rtl_mirror";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivFilterTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivFilterTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivFilterTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivFilterJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
