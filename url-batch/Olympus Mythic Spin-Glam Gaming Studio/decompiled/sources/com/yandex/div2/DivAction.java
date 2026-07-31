package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivAction.kt */
/* loaded from: classes8.dex */
public final class DivAction implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivDownloadCallbacks downloadCallbacks;
    public final Expression isEnabled;
    public final Expression logId;
    public final Expression logUrl;
    public final List menuItems;
    public final JSONObject payload;
    public final Expression referer;
    public final String scopeId;
    public final Expression target;
    public final DivActionTyped typed;
    public final Expression url;
    public static final Companion Companion = new Companion(null);
    private static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAction$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAction invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAction.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivAction(DivDownloadCallbacks divDownloadCallbacks, Expression expression, Expression expression2, Expression expression3, List list, JSONObject jSONObject, Expression expression4, String str, Expression expression5, DivActionTyped divActionTyped, Expression expression6) {
        this.downloadCallbacks = divDownloadCallbacks;
        this.isEnabled = expression;
        this.logId = expression2;
        this.logUrl = expression3;
        this.menuItems = list;
        this.payload = jSONObject;
        this.referer = expression4;
        this.scopeId = str;
        this.target = expression5;
        this.typed = divActionTyped;
        this.url = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivAction.class).hashCode();
        DivDownloadCallbacks divDownloadCallbacks = this.downloadCallbacks;
        int hash = hashCode + (divDownloadCallbacks != null ? divDownloadCallbacks.hash() : 0) + this.isEnabled.hashCode() + this.logId.hashCode();
        Expression expression = this.logUrl;
        int hashCode2 = hash + (expression != null ? expression.hashCode() : 0);
        List list = this.menuItems;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((MenuItem) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i2 = hashCode2 + i;
        JSONObject jSONObject = this.payload;
        int hashCode3 = i2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression2 = this.referer;
        int hashCode4 = hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.scopeId;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        Expression expression3 = this.target;
        int hashCode6 = hashCode5 + (expression3 != null ? expression3.hashCode() : 0);
        DivActionTyped divActionTyped = this.typed;
        int hash2 = hashCode6 + (divActionTyped != null ? divActionTyped.hash() : 0);
        Expression expression4 = this.url;
        int hashCode7 = hash2 + (expression4 != null ? expression4.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode7);
        return hashCode7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a3, code lost:
    
        if (r9.menuItems == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivAction divAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        if (divAction == null) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacks = this.downloadCallbacks;
        if (!(divDownloadCallbacks != null ? divDownloadCallbacks.equals(divAction.downloadCallbacks, expressionResolver, expressionResolver2) : divAction.downloadCallbacks == null) || ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() != ((Boolean) divAction.isEnabled.evaluate(expressionResolver2)).booleanValue() || !Intrinsics.areEqual(this.logId.evaluate(expressionResolver), divAction.logId.evaluate(expressionResolver2))) {
            return false;
        }
        Expression expression = this.logUrl;
        Uri uri = expression != null ? (Uri) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divAction.logUrl;
        if (!Intrinsics.areEqual(uri, expression2 != null ? (Uri) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List list = this.menuItems;
        if (list != null) {
            List list2 = divAction.menuItems;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((MenuItem) obj).equals((MenuItem) list2.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        if (!z || !Intrinsics.areEqual(this.payload, divAction.payload)) {
            return false;
        }
        Expression expression3 = this.referer;
        Uri uri2 = expression3 != null ? (Uri) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divAction.referer;
        if (!Intrinsics.areEqual(uri2, expression4 != null ? (Uri) expression4.evaluate(expressionResolver2) : null) || !Intrinsics.areEqual(this.scopeId, divAction.scopeId)) {
            return false;
        }
        Expression expression5 = this.target;
        Target target = expression5 != null ? (Target) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divAction.target;
        if (target != (expression6 != null ? (Target) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivActionTyped divActionTyped = this.typed;
        if (!(divActionTyped != null ? divActionTyped.equals(divAction.typed, expressionResolver, expressionResolver2) : divAction.typed == null)) {
            return false;
        }
        Expression expression7 = this.url;
        Uri uri3 = expression7 != null ? (Uri) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divAction.url;
        return Intrinsics.areEqual(uri3, expression8 != null ? (Uri) expression8.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAction.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAction fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivAction.kt */
    public static final class MenuItem implements JSONSerializable, Hashable {
        private Integer _hash;
        public final DivAction action;
        public final List actions;
        public final Expression text;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAction$MenuItem$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAction.MenuItem invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAction.MenuItem.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public MenuItem(DivAction divAction, List list, Expression expression) {
            this.action = divAction;
            this.actions = list;
            this.text = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(MenuItem.class).hashCode();
            DivAction divAction = this.action;
            int i = 0;
            int hash = hashCode + (divAction != null ? divAction.hash() : 0);
            List list = this.actions;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            }
            int hashCode2 = hash + i + this.text.hashCode();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
        
            if (r8.actions == null) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(MenuItem menuItem, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z;
            if (menuItem == null) {
                return false;
            }
            DivAction divAction = this.action;
            if (!(divAction != null ? divAction.equals(menuItem.action, expressionResolver, expressionResolver2) : menuItem.action == null)) {
                return false;
            }
            List list = this.actions;
            if (list != null) {
                List list2 = menuItem.actions;
                if (list2 != null) {
                    if (list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                                i = i2;
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                }
                return false;
            }
            return z && Intrinsics.areEqual(this.text.evaluate(expressionResolver), menuItem.text.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivActionMenuItemJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionMenuItemJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivAction.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final MenuItem fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivActionMenuItemJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionMenuItemJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivAction$Target;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SELF", "BLANK", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Target {
        SELF("_self"),
        BLANK("_blank");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAction$Target$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivAction.Target target) {
                return DivAction.Target.INSTANCE.toString(target);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAction$Target$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivAction.Target invoke(@NotNull String str) {
                return DivAction.Target.INSTANCE.fromString(str);
            }
        };

        Target(String str) {
            this.value = str;
        }

        /* compiled from: DivAction.kt */
        /* renamed from: com.yandex.div2.DivAction$Target$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Target target) {
                return target.value;
            }

            public final Target fromString(String str) {
                Target target = Target.SELF;
                if (Intrinsics.areEqual(str, target.value)) {
                    return target;
                }
                Target target2 = Target.BLANK;
                if (Intrinsics.areEqual(str, target2.value)) {
                    return target2;
                }
                return null;
            }
        }
    }
}
