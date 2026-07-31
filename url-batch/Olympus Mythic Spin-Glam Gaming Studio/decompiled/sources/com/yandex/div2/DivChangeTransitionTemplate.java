package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionTemplate.kt */
/* loaded from: classes11.dex */
public abstract class DivChangeTransitionTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivChangeTransitionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivChangeTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivChangeTransitionTemplate.Companion.invoke$default(DivChangeTransitionTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivChangeTransitionTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    public static final class Set extends DivChangeTransitionTemplate {
        private final DivChangeSetTransitionTemplate value;

        public Set(DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) {
            super(null);
            this.value = divChangeSetTransitionTemplate;
        }

        public final DivChangeSetTransitionTemplate getValue() {
            return this.value;
        }
    }

    private DivChangeTransitionTemplate() {
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    public static final class Bounds extends DivChangeTransitionTemplate {
        private final DivChangeBoundsTransitionTemplate value;

        public Bounds(DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) {
            super(null);
            this.value = divChangeBoundsTransitionTemplate;
        }

        public final DivChangeBoundsTransitionTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Set) {
            return ((Set) this).getValue();
        }
        if (this instanceof Bounds) {
            return ((Bounds) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivChangeTransitionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivChangeTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivChangeTransitionJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Set) {
            return "set";
        }
        if (this instanceof Bounds) {
            return "change_bounds";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivChangeTransitionTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivChangeTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivChangeTransitionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeTransitionJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
