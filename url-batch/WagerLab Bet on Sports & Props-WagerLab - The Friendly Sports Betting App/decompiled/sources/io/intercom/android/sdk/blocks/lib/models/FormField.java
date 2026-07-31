package io.intercom.android.sdk.blocks.lib.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketTypeV2.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\bHÇ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/FormField;", "", "id", "", "name", "value", "type", "required", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lio/intercom/android/sdk/blocks/lib/models/Options;", NotificationsService.IDENTIFIER_KEY, "isControllingAttribute", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/blocks/lib/models/Options;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getValue", "getType", "getRequired", "()Z", "getOptions", "()Lio/intercom/android/sdk/blocks/lib/models/Options;", "getIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FormField {
    public static final int $stable = 8;

    @SerializedName("id")
    private final String id;

    @SerializedName(NotificationsService.IDENTIFIER_KEY)
    private final String identifier;

    @SerializedName("is_controlling_attribute")
    private final boolean isControllingAttribute;

    @SerializedName("name")
    private final String name;

    @SerializedName(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS)
    private final Options options;

    @SerializedName("required")
    private final boolean required;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final String value;

    public static /* synthetic */ FormField copy$default(FormField formField, String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formField.id;
        }
        if ((i & 2) != 0) {
            str2 = formField.name;
        }
        if ((i & 4) != 0) {
            str3 = formField.value;
        }
        if ((i & 8) != 0) {
            str4 = formField.type;
        }
        if ((i & 16) != 0) {
            z = formField.required;
        }
        if ((i & 32) != 0) {
            options = formField.options;
        }
        if ((i & 64) != 0) {
            str5 = formField.identifier;
        }
        if ((i & 128) != 0) {
            z2 = formField.isControllingAttribute;
        }
        String str6 = str5;
        boolean z3 = z2;
        boolean z4 = z;
        Options options2 = options;
        return formField.copy(str, str2, str3, str4, z4, options2, str6, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component6, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsControllingAttribute() {
        return this.isControllingAttribute;
    }

    public final FormField copy(String id, String name, String value, String type, boolean required, Options options, String identifier, boolean isControllingAttribute) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FormField(id, name, value, type, required, options, identifier, isControllingAttribute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) other;
        return Intrinsics.areEqual(this.id, formField.id) && Intrinsics.areEqual(this.name, formField.name) && Intrinsics.areEqual(this.value, formField.value) && Intrinsics.areEqual(this.type, formField.type) && this.required == formField.required && Intrinsics.areEqual(this.options, formField.options) && Intrinsics.areEqual(this.identifier, formField.identifier) && this.isControllingAttribute == formField.isControllingAttribute;
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.value;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31;
        Options options = this.options;
        int hashCode3 = (hashCode2 + (options == null ? 0 : options.hashCode())) * 31;
        String str2 = this.identifier;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isControllingAttribute);
    }

    public String toString() {
        return "FormField(id=" + this.id + ", name=" + this.name + ", value=" + this.value + ", type=" + this.type + ", required=" + this.required + ", options=" + this.options + ", identifier=" + this.identifier + ", isControllingAttribute=" + this.isControllingAttribute + ')';
    }

    public FormField(String id, String name, String str, String type, boolean z, Options options, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.name = name;
        this.value = str;
        this.type = type;
        this.required = z;
        this.options = options;
        this.identifier = str2;
        this.isControllingAttribute = z2;
    }

    public /* synthetic */ FormField(String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, z, (i & 32) != 0 ? null : options, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean isControllingAttribute() {
        return this.isControllingAttribute;
    }
}
