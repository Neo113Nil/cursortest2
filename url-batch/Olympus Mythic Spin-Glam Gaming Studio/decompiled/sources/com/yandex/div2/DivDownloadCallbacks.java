package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacks.kt */
/* loaded from: classes14.dex */
public final class DivDownloadCallbacks implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List onFailActions;
    public final List onSuccessActions;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDownloadCallbacks$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDownloadCallbacks invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDownloadCallbacks.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivDownloadCallbacks(List list, List list2) {
        this.onFailActions = list;
        this.onSuccessActions = list2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivDownloadCallbacks.class).hashCode();
        List list = this.onFailActions;
        int i2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List list2 = this.onSuccessActions;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        }
        int i4 = i3 + i2;
        this._hash = Integer.valueOf(i4);
        return i4;
    }

    public final boolean equals(DivDownloadCallbacks divDownloadCallbacks, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDownloadCallbacks == null) {
            return false;
        }
        List list = this.onFailActions;
        if (list != null) {
            List list2 = divDownloadCallbacks.onFailActions;
            if (list2 == null || list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj).equals((DivAction) list2.get(i), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i = i2;
            }
        } else if (divDownloadCallbacks.onFailActions != null) {
            return false;
        }
        List list3 = this.onSuccessActions;
        List list4 = divDownloadCallbacks.onSuccessActions;
        if (list3 != null) {
            if (list4 == null || list3.size() != list4.size()) {
                return false;
            }
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((DivAction) obj2).equals((DivAction) list4.get(i3), expressionResolver, expressionResolver2)) {
                    return false;
                }
                i3 = i4;
            }
        } else if (list4 != null) {
            return false;
        }
        return true;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDownloadCallbacksJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDownloadCallbacksJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDownloadCallbacks.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivDownloadCallbacks fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDownloadCallbacksJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDownloadCallbacksJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
