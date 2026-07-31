package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Attribute.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020)H\u0007J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020)H×\u0001J\t\u0010.\u001a\u00020\u0003H×\u0001J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u00064"}, d2 = {"Lio/intercom/android/sdk/models/Attribute;", "Landroid/os/Parcelable;", NotificationsService.IDENTIFIER_KEY, "", "name", "type", MetricTracker.Action.SUBMITTED, "", "customBotControlId", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "", "multiline", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getName", "getType", "getSubmitted", "()Z", "getCustomBotControlId", "getOptions", "()Ljava/util/List;", "getMultiline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValue", "hasValue", "getRenderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/intercom/android/sdk/models/Attribute;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Attribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @SerializedName("custom_bot_control_id")
    private final String customBotControlId;

    @SerializedName(NotificationsService.IDENTIFIER_KEY)
    private final String identifier;

    @SerializedName("multiline")
    private final Boolean multiline;

    @SerializedName("name")
    private final String name;

    @SerializedName(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS)
    private final List<String> options;

    @SerializedName(MetricTracker.Action.SUBMITTED)
    private final boolean submitted;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final String value;

    /* compiled from: Attribute.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z3 = false;
                z2 = false;
            }
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = z2;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new Attribute(readString, readString2, readString3, z3, readString4, createStringArrayList, valueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i) {
            return new Attribute[i];
        }
    }

    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attribute.identifier;
        }
        if ((i & 2) != 0) {
            str2 = attribute.name;
        }
        if ((i & 4) != 0) {
            str3 = attribute.type;
        }
        if ((i & 8) != 0) {
            z = attribute.submitted;
        }
        if ((i & 16) != 0) {
            str4 = attribute.customBotControlId;
        }
        if ((i & 32) != 0) {
            list = attribute.options;
        }
        if ((i & 64) != 0) {
            bool = attribute.multiline;
        }
        if ((i & 128) != 0) {
            str5 = attribute.value;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return attribute.copy(str, str2, str3, z, str7, list2, bool2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSubmitted() {
        return this.submitted;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final List<String> component6() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getMultiline() {
        return this.multiline;
    }

    /* renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Attribute copy(String identifier, String name, String type, boolean submitted, String customBotControlId, List<String> options, Boolean multiline, String value) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Attribute(identifier, name, type, submitted, customBotControlId, options, multiline, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) other;
        return Intrinsics.areEqual(this.identifier, attribute.identifier) && Intrinsics.areEqual(this.name, attribute.name) && Intrinsics.areEqual(this.type, attribute.type) && this.submitted == attribute.submitted && Intrinsics.areEqual(this.customBotControlId, attribute.customBotControlId) && Intrinsics.areEqual(this.options, attribute.options) && Intrinsics.areEqual(this.multiline, attribute.multiline) && Intrinsics.areEqual(this.value, attribute.value);
    }

    public int hashCode() {
        int hashCode = ((((((this.identifier.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.submitted)) * 31;
        String str = this.customBotControlId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Attribute(identifier=" + this.identifier + ", name=" + this.name + ", type=" + this.type + ", submitted=" + this.submitted + ", customBotControlId=" + this.customBotControlId + ", options=" + this.options + ", multiline=" + this.multiline + ", value=" + this.value + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int i;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeInt(this.submitted ? 1 : 0);
        dest.writeString(this.customBotControlId);
        dest.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            i = 0;
        } else {
            dest.writeInt(1);
            i = bool.booleanValue();
        }
        dest.writeInt(i);
        dest.writeString(this.value);
    }

    public Attribute(String identifier, String name, String type, boolean z, String str, List<String> list, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.identifier = identifier;
        this.name = name;
        this.type = type;
        this.submitted = z;
        this.customBotControlId = str;
        this.options = list;
        this.multiline = bool;
        this.value = str2;
    }

    public /* synthetic */ Attribute(String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final Boolean getMultiline() {
        return this.multiline;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        String str = this.value;
        return !(str == null || str.length() == 0);
    }

    public final String getRenderType() {
        String str = this.type;
        switch (str.hashCode()) {
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    List<String> list = this.options;
                    if (list != null && !list.isEmpty()) {
                        return AttributeType.LIST;
                    }
                    String str2 = this.identifier;
                    int hashCode = str2.hashCode();
                    if (hashCode != 75849770) {
                        if (hashCode != 96619420) {
                            if (hashCode != 106642798 || !str2.equals("phone")) {
                                return "text";
                            }
                        } else if (!str2.equals("email")) {
                            return "text";
                        }
                    } else if (!str2.equals(AttributeType.WEBSITE)) {
                        return "text";
                    }
                    return this.identifier;
                }
                return "unknown";
            case 3076014:
                return !str.equals(AttributeType.DATE) ? "unknown" : AttributeType.DATE;
            case 64711720:
                return !str.equals("boolean") ? "unknown" : "boolean";
            case 97526364:
                if (str.equals("float")) {
                    return "float";
                }
                return "unknown";
            case 1958052158:
                if (str.equals("integer")) {
                    return AttributeType.NUMBER;
                }
                return "unknown";
            default:
                return "unknown";
        }
    }
}
