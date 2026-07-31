package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.intercom.android.sdk.models.EventParticipant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventData.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 72\u00020\u0001:\u00017Br\u0012\u000f\b\u0002\u0010\u0002\u001a\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010!\u001a\t\u0018\u00010\u0003¢\u0006\u0002\b\u0004HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jt\u0010)\u001a\u00020\u00002\u000f\b\u0002\u0010\u0002\u001a\t\u0018\u00010\u0003¢\u0006\u0002\b\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010*\u001a\u00020+H\u0007J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H×\u0003J\t\u00100\u001a\u00020+H×\u0001J\t\u00101\u001a\u00020\u0006H×\u0001J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+H\u0007R\u0017\u0010\u0002\u001a\t\u0018\u00010\u0003¢\u0006\u0002\b\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0012¨\u00068"}, d2 = {"Lio/intercom/android/sdk/models/EventData;", "Landroid/os/Parcelable;", "_participant", "Lio/intercom/android/sdk/models/EventParticipant$Builder;", "Lkotlinx/parcelize/RawValue;", "_eventAsPlainText", "", "_eventContent", "", "Lio/intercom/android/sdk/models/EventContent;", "_status", "customStateLabel", "customStatePrefix", "mergedConversationId", "description", "<init>", "(Lio/intercom/android/sdk/models/EventParticipant$Builder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomStateLabel", "()Ljava/lang/String;", "getCustomStatePrefix", "getMergedConversationId", "getDescription", "participant", "Lio/intercom/android/sdk/models/EventParticipant;", "getParticipant", "()Lio/intercom/android/sdk/models/EventParticipant;", "eventAsPlainText", "getEventAsPlainText", "eventContent", "getEventContent", "()Ljava/util/List;", "status", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EventData implements Parcelable {

    @SerializedName("eventAsPlainText")
    private final String _eventAsPlainText;

    @SerializedName("eventContent")
    private final List<EventContent> _eventContent;

    @SerializedName("participant")
    private final EventParticipant.Builder _participant;

    @SerializedName("status")
    private final String _status;

    @SerializedName("customStateLabel")
    private final String customStateLabel;

    @SerializedName("customStatePrefix")
    private final String customStatePrefix;
    private final String description;
    private final String mergedConversationId;
    public static final int $stable = 8;
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();
    public static final EventData NULL = new EventData(null, null, null, null, null, null, null, null, 255, null);

    /* compiled from: EventData.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EventParticipant.Builder builder = (EventParticipant.Builder) parcel.readValue(EventData.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(EventContent.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new EventData(builder, readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i) {
            return new EventData[i];
        }
    }

    public EventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    private final EventParticipant.Builder get_participant() {
        return this._participant;
    }

    /* renamed from: component2, reason: from getter */
    private final String get_eventAsPlainText() {
        return this._eventAsPlainText;
    }

    private final List<EventContent> component3() {
        return this._eventContent;
    }

    /* renamed from: component4, reason: from getter */
    private final String get_status() {
        return this._status;
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = eventData._participant;
        }
        if ((i & 2) != 0) {
            str = eventData._eventAsPlainText;
        }
        if ((i & 4) != 0) {
            list = eventData._eventContent;
        }
        if ((i & 8) != 0) {
            str2 = eventData._status;
        }
        if ((i & 16) != 0) {
            str3 = eventData.customStateLabel;
        }
        if ((i & 32) != 0) {
            str4 = eventData.customStatePrefix;
        }
        if ((i & 64) != 0) {
            str5 = eventData.mergedConversationId;
        }
        if ((i & 128) != 0) {
            str6 = eventData.description;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return eventData.copy(builder, str, list, str2, str9, str10, str7, str8);
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final EventData copy(EventParticipant.Builder _participant, String _eventAsPlainText, List<EventContent> _eventContent, String _status, String customStateLabel, String customStatePrefix, String mergedConversationId, String description) {
        return new EventData(_participant, _eventAsPlainText, _eventContent, _status, customStateLabel, customStatePrefix, mergedConversationId, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) other;
        return Intrinsics.areEqual(this._participant, eventData._participant) && Intrinsics.areEqual(this._eventAsPlainText, eventData._eventAsPlainText) && Intrinsics.areEqual(this._eventContent, eventData._eventContent) && Intrinsics.areEqual(this._status, eventData._status) && Intrinsics.areEqual(this.customStateLabel, eventData.customStateLabel) && Intrinsics.areEqual(this.customStatePrefix, eventData.customStatePrefix) && Intrinsics.areEqual(this.mergedConversationId, eventData.mergedConversationId) && Intrinsics.areEqual(this.description, eventData.description);
    }

    public int hashCode() {
        EventParticipant.Builder builder = this._participant;
        int hashCode = (builder == null ? 0 : builder.hashCode()) * 31;
        String str = this._eventAsPlainText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EventContent> list = this._eventContent;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this._status;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customStateLabel;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStatePrefix;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mergedConversationId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "EventData(_participant=" + this._participant + ", _eventAsPlainText=" + this._eventAsPlainText + ", _eventContent=" + this._eventContent + ", _status=" + this._status + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", mergedConversationId=" + this.mergedConversationId + ", description=" + this.description + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this._participant);
        dest.writeString(this._eventAsPlainText);
        List<EventContent> list = this._eventContent;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<EventContent> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this._status);
        dest.writeString(this.customStateLabel);
        dest.writeString(this.customStatePrefix);
        dest.writeString(this.mergedConversationId);
        dest.writeString(this.description);
    }

    public EventData(EventParticipant.Builder builder, String str, List<EventContent> list, String str2, String str3, String str4, String str5, String str6) {
        this._participant = builder;
        this._eventAsPlainText = str;
        this._eventContent = list;
        this._status = str2;
        this.customStateLabel = str3;
        this.customStatePrefix = str4;
        this.mergedConversationId = str5;
        this.description = str6;
    }

    public /* synthetic */ EventData(EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : builder, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }

    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EventParticipant getParticipant() {
        EventParticipant build;
        EventParticipant.Builder builder = this._participant;
        if (builder != null && (build = builder.build()) != null) {
            return build;
        }
        EventParticipant NULL2 = EventParticipant.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL2, "NULL");
        return NULL2;
    }

    public final String getEventAsPlainText() {
        String str = this._eventAsPlainText;
        return str == null ? "" : str;
    }

    public final List<EventContent> getEventContent() {
        List<EventContent> list = this._eventContent;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final String getStatus() {
        String str = this._status;
        return str == null ? "" : str;
    }
}
