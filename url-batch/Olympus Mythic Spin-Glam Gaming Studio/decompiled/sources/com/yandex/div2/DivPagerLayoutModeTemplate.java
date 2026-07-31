package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeTemplate.kt */
/* loaded from: classes13.dex */
public abstract class DivPagerLayoutModeTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPagerLayoutModeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPagerLayoutModeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPagerLayoutModeTemplate.Companion.invoke$default(DivPagerLayoutModeTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivPagerLayoutModeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class PageSize extends DivPagerLayoutModeTemplate {
        private final DivPageSizeTemplate value;

        public PageSize(DivPageSizeTemplate divPageSizeTemplate) {
            super(null);
            this.value = divPageSizeTemplate;
        }

        public final DivPageSizeTemplate getValue() {
            return this.value;
        }
    }

    private DivPagerLayoutModeTemplate() {
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class NeighbourPageSize extends DivPagerLayoutModeTemplate {
        private final DivNeighbourPageSizeTemplate value;

        public NeighbourPageSize(DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) {
            super(null);
            this.value = divNeighbourPageSizeTemplate;
        }

        public final DivNeighbourPageSizeTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class PageContentSize extends DivPagerLayoutModeTemplate {
        private final DivPageContentSizeTemplate value;

        public PageContentSize(DivPageContentSizeTemplate divPageContentSizeTemplate) {
            super(null);
            this.value = divPageContentSizeTemplate;
        }

        public final DivPageContentSizeTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof PageSize) {
            return ((PageSize) this).getValue();
        }
        if (this instanceof NeighbourPageSize) {
            return ((NeighbourPageSize) this).getValue();
        }
        if (this instanceof PageContentSize) {
            return ((PageContentSize) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPagerLayoutModeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerLayoutModeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPagerLayoutMode resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPagerLayoutModeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerLayoutModeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof PageSize) {
            return "percentage";
        }
        if (this instanceof NeighbourPageSize) {
            return "fixed";
        }
        if (this instanceof PageContentSize) {
            return "wrap_content";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivPagerLayoutModeTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivPagerLayoutModeTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivPagerLayoutModeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerLayoutModeJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
