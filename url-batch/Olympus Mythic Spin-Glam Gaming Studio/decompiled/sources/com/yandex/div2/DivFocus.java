package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFocus;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFocus.kt */
/* loaded from: classes12.dex */
public final class DivFocus implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List background;
    public final DivBorder border;
    public final NextFocusIds nextFocusIds;
    public final List onBlur;
    public final List onFocus;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFocus$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFocus invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFocus.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivFocus(List list, DivBorder divBorder, NextFocusIds nextFocusIds, List list2, List list3) {
        this.background = list;
        this.border = divBorder;
        this.nextFocusIds = nextFocusIds;
        this.onBlur = list2;
        this.onFocus = list3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        int i2;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFocus.class).hashCode();
        List list = this.background;
        int i3 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivBackground) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i4 = hashCode + i;
        DivBorder divBorder = this.border;
        int hash = i4 + (divBorder != null ? divBorder.hash() : 0);
        NextFocusIds nextFocusIds = this.nextFocusIds;
        int hash2 = hash + (nextFocusIds != null ? nextFocusIds.hash() : 0);
        List list2 = this.onBlur;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i5 = hash2 + i2;
        List list3 = this.onFocus;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                i3 += ((DivAction) it3.next()).hash();
            }
        }
        int i6 = i5 + i3;
        this._hash = Integer.valueOf(i6);
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f3, code lost:
    
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00af, code lost:
    
        if (r8.onBlur == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(DivFocus divFocus, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        if (divFocus == null) {
            return false;
        }
        List list = this.background;
        if (list != null) {
            List list2 = divFocus.background;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivBackground) obj).equals((DivBackground) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divFocus.background != null) {
            return false;
        }
        DivBorder divBorder = this.border;
        if (!(divBorder != null ? divBorder.equals(divFocus.border, expressionResolver, expressionResolver2) : divFocus.border == null)) {
            return false;
        }
        NextFocusIds nextFocusIds = this.nextFocusIds;
        if (!(nextFocusIds != null ? nextFocusIds.equals(divFocus.nextFocusIds, expressionResolver, expressionResolver2) : divFocus.nextFocusIds == null)) {
            return false;
        }
        List list3 = this.onBlur;
        if (list3 != null) {
            List list4 = divFocus.onBlur;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i3 = 0;
                    for (Object obj2 : list3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj2).equals((DivAction) list4.get(i3), expressionResolver, expressionResolver2)) {
                            i3 = i4;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        if (!z) {
            return false;
        }
        List list5 = this.onFocus;
        List list6 = divFocus.onFocus;
        if (list5 != null) {
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i5 = 0;
                    for (Object obj3 : list5) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((DivAction) obj3).equals((DivAction) list6.get(i5), expressionResolver, expressionResolver2)) {
                            i5 = i6;
                        }
                    }
                    z2 = true;
                }
                z2 = false;
                break;
            }
            return false;
        }
        return z2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFocusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFocus.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFocus fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFocusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivFocus.kt */
    public static final class NextFocusIds implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression down;
        public final Expression forward;
        public final Expression left;
        public final Expression right;
        public final Expression up;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFocus$NextFocusIds$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFocus.NextFocusIds invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFocus.NextFocusIds.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public NextFocusIds(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
            this.down = expression;
            this.forward = expression2;
            this.left = expression3;
            this.right = expression4;
            this.up = expression5;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(NextFocusIds.class).hashCode();
            Expression expression = this.down;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.forward;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.left;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.right;
            int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression expression5 = this.up;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this._hash = Integer.valueOf(hashCode6);
            return hashCode6;
        }

        public final boolean equals(NextFocusIds nextFocusIds, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (nextFocusIds == null) {
                return false;
            }
            Expression expression = this.down;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = nextFocusIds.down;
            if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression3 = this.forward;
            String str2 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = nextFocusIds.forward;
            if (!Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression5 = this.left;
            String str3 = expression5 != null ? (String) expression5.evaluate(expressionResolver) : null;
            Expression expression6 = nextFocusIds.left;
            if (!Intrinsics.areEqual(str3, expression6 != null ? (String) expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression7 = this.right;
            String str4 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
            Expression expression8 = nextFocusIds.right;
            if (!Intrinsics.areEqual(str4, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression expression9 = this.up;
            String str5 = expression9 != null ? (String) expression9.evaluate(expressionResolver) : null;
            Expression expression10 = nextFocusIds.up;
            return Intrinsics.areEqual(str5, expression10 != null ? (String) expression10.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivFocusNextFocusIdsJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusNextFocusIdsJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivFocus.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NextFocusIds fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivFocusNextFocusIdsJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFocusNextFocusIdsJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
