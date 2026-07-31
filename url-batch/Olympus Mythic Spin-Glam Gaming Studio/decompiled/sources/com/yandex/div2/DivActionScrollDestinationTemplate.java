package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationTemplate.kt */
/* loaded from: classes11.dex */
public abstract class DivActionScrollDestinationTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollDestinationTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionScrollDestinationTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollDestinationTemplate.Companion.invoke$default(DivActionScrollDestinationTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivActionScrollDestinationTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class Offset extends DivActionScrollDestinationTemplate {
        private final OffsetDestinationTemplate value;

        public Offset(OffsetDestinationTemplate offsetDestinationTemplate) {
            super(null);
            this.value = offsetDestinationTemplate;
        }

        public final OffsetDestinationTemplate getValue() {
            return this.value;
        }
    }

    private DivActionScrollDestinationTemplate() {
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class Index extends DivActionScrollDestinationTemplate {
        private final IndexDestinationTemplate value;

        public Index(IndexDestinationTemplate indexDestinationTemplate) {
            super(null);
            this.value = indexDestinationTemplate;
        }

        public final IndexDestinationTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class Start extends DivActionScrollDestinationTemplate {
        private final StartDestinationTemplate value;

        public Start(StartDestinationTemplate startDestinationTemplate) {
            super(null);
            this.value = startDestinationTemplate;
        }

        public final StartDestinationTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class End extends DivActionScrollDestinationTemplate {
        private final EndDestinationTemplate value;

        public End(EndDestinationTemplate endDestinationTemplate) {
            super(null);
            this.value = endDestinationTemplate;
        }

        public final EndDestinationTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Offset) {
            return ((Offset) this).getValue();
        }
        if (this instanceof Index) {
            return ((Index) this).getValue();
        }
        if (this instanceof Start) {
            return ((Start) this).getValue();
        }
        if (this instanceof End) {
            return ((End) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollDestinationJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollDestinationJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionScrollDestination resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionScrollDestinationJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollDestinationJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Offset) {
            return "offset";
        }
        if (this instanceof Index) {
            return "index";
        }
        if (this instanceof Start) {
            return "start";
        }
        if (this instanceof End) {
            return "end";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivActionScrollDestinationTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivActionScrollDestinationTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivActionScrollDestinationJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollDestinationJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
