package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionJsonParser;
import com.yandex.div2.DivActionTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionTemplate.kt */
/* loaded from: classes9.dex */
public final class DivActionTemplate implements JSONSerializable, JsonTemplate {
    public final Field downloadCallbacks;
    public final Field isEnabled;
    public final Field logId;
    public final Field logUrl;
    public final Field menuItems;
    public final Field payload;
    public final Field referer;
    public final Field scopeId;
    public final Field target;
    public final Field typed;
    public final Field url;
    public static final Companion Companion = new Companion(null);
    private static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.downloadCallbacks = field;
        this.isEnabled = field2;
        this.logId = field3;
        this.logUrl = field4;
        this.menuItems = field5;
        this.payload = field6;
        this.referer = field7;
        this.scopeId = field8;
        this.target = field9;
        this.typed = field10;
        this.url = field11;
    }

    public /* synthetic */ DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionTemplate(ParsingEnvironment parsingEnvironment, DivActionTemplate divActionTemplate, boolean z, JSONObject jSONObject) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAction resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivActionTemplate.kt */
    public static final class MenuItemTemplate implements JSONSerializable, JsonTemplate {
        public final Field action;
        public final Field actions;
        public final Field text;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionTemplate$MenuItemTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivActionTemplate.MenuItemTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivActionTemplate.MenuItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public MenuItemTemplate(Field field, Field field2, Field field3) {
            this.action = field;
            this.actions = field2;
            this.text = field3;
        }

        public /* synthetic */ MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : menuItemTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MenuItemTemplate(ParsingEnvironment parsingEnvironment, MenuItemTemplate menuItemTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivAction.MenuItem resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionMenuItemJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionMenuItemJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivActionMenuItemJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionMenuItemJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivActionTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
