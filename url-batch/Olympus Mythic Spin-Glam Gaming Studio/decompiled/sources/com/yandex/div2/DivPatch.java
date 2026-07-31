package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivPatch.kt */
/* loaded from: classes8.dex */
public final class DivPatch implements JSONSerializable, Hashable {
    private Integer _hash;
    public final List changes;
    public final Expression mode;
    public final List onAppliedActions;
    public final List onFailedActions;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Mode.PARTIAL, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPatch$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPatch invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPatch.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPatch(List list, Expression expression, List list2, List list3) {
        this.changes = list;
        this.mode = expression;
        this.onAppliedActions = list2;
        this.onFailedActions = list3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPatch.class).hashCode();
        Iterator it = this.changes.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Change) it.next()).hash();
        }
        int hashCode2 = hashCode + i3 + this.mode.hashCode();
        List list = this.onAppliedActions;
        if (list != null) {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((DivAction) it2.next()).hash();
            }
        } else {
            i = 0;
        }
        int i4 = hashCode2 + i;
        List list2 = this.onFailedActions;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                i2 += ((DivAction) it3.next()).hash();
            }
        }
        int i5 = i4 + i2;
        this._hash = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPatchJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPatch.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPatch fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPatchJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivPatch$Mode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TRANSACTIONAL", "PARTIAL", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivPatch$Mode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivPatch.Mode mode) {
                return DivPatch.Mode.INSTANCE.toString(mode);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivPatch$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivPatch.Mode invoke(@NotNull String str) {
                return DivPatch.Mode.INSTANCE.fromString(str);
            }
        };

        Mode(String str) {
            this.value = str;
        }

        /* compiled from: DivPatch.kt */
        /* renamed from: com.yandex.div2.DivPatch$Mode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Mode mode) {
                return mode.value;
            }

            public final Mode fromString(String str) {
                Mode mode = Mode.TRANSACTIONAL;
                if (Intrinsics.areEqual(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.PARTIAL;
                if (Intrinsics.areEqual(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }
        }
    }

    /* compiled from: DivPatch.kt */
    public static final class Change implements JSONSerializable, Hashable {
        private Integer _hash;
        private Integer _propertiesHash;
        public final String id;
        public final List items;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPatch$Change$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPatch.Change invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPatch.Change.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Change(String str, List list) {
            this.id = str;
            this.items = list;
        }

        @Override // com.yandex.div.data.Hashable
        public int propertiesHash() {
            Integer num = this._propertiesHash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Change.class).hashCode() + this.id.hashCode();
            this._propertiesHash = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int propertiesHash = propertiesHash();
            List list = this.items;
            int i = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i += ((Div) it.next()).hash();
                }
            }
            int i2 = propertiesHash + i;
            this._hash = Integer.valueOf(i2);
            return i2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivPatchChangeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivPatch.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Change fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivPatchChangeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPatchChangeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
