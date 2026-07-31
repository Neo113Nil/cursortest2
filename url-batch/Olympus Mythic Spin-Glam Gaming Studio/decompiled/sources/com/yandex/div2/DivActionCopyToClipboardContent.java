package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardContent.kt */
/* loaded from: classes14.dex */
public abstract class DivActionCopyToClipboardContent implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionCopyToClipboardContent$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionCopyToClipboardContent invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboardContent.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivActionCopyToClipboardContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionCopyToClipboardContent.kt */
    public static final class ContentTextCase extends DivActionCopyToClipboardContent {
        private final ContentText value;

        public ContentTextCase(ContentText contentText) {
            super(null);
            this.value = contentText;
        }

        public final ContentText getValue() {
            return this.value;
        }
    }

    private DivActionCopyToClipboardContent() {
    }

    /* compiled from: DivActionCopyToClipboardContent.kt */
    public static final class ContentUrlCase extends DivActionCopyToClipboardContent {
        private final ContentUrl value;

        public ContentUrlCase(ContentUrl contentUrl) {
            super(null);
            this.value = contentUrl;
        }

        public final ContentUrl getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof ContentTextCase) {
            propertiesHash = ((ContentTextCase) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof ContentUrlCase)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((ContentUrlCase) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof ContentTextCase) {
            hash = ((ContentTextCase) this).getValue().hash();
        } else {
            if (!(this instanceof ContentUrlCase)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((ContentUrlCase) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivActionCopyToClipboardContent divActionCopyToClipboardContent, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboardContent == null) {
            return false;
        }
        if (this instanceof ContentTextCase) {
            ContentText value = ((ContentTextCase) this).getValue();
            Object value2 = divActionCopyToClipboardContent.value();
            return value.equals(value2 instanceof ContentText ? (ContentText) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof ContentUrlCase)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentUrl value3 = ((ContentUrlCase) this).getValue();
        Object value4 = divActionCopyToClipboardContent.value();
        return value3.equals(value4 instanceof ContentUrl ? (ContentUrl) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof ContentTextCase) {
            return ((ContentTextCase) this).getValue();
        }
        if (this instanceof ContentUrlCase) {
            return ((ContentUrlCase) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionCopyToClipboardContentJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardContentJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionCopyToClipboardContent.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionCopyToClipboardContent fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionCopyToClipboardContentJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardContentJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
