package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.Weight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/EventLabelSegment;", "", "text", "", "weight", "Lio/intercom/android/sdk/models/Weight;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Weight;)V", "getText", "()Ljava/lang/String;", "getWeight", "()Lio/intercom/android/sdk/models/Weight;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EventLabelSegment {
    public static final int $stable = 0;
    private final String text;
    private final Weight weight;

    public static /* synthetic */ EventLabelSegment copy$default(EventLabelSegment eventLabelSegment, String str, Weight weight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventLabelSegment.text;
        }
        if ((i & 2) != 0) {
            weight = eventLabelSegment.weight;
        }
        return eventLabelSegment.copy(str, weight);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Weight getWeight() {
        return this.weight;
    }

    public final EventLabelSegment copy(String text, Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new EventLabelSegment(text, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventLabelSegment)) {
            return false;
        }
        EventLabelSegment eventLabelSegment = (EventLabelSegment) other;
        return Intrinsics.areEqual(this.text, eventLabelSegment.text) && this.weight == eventLabelSegment.weight;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Weight weight = this.weight;
        return hashCode + (weight == null ? 0 : weight.hashCode());
    }

    public String toString() {
        return "EventLabelSegment(text=" + this.text + ", weight=" + this.weight + ')';
    }

    public EventLabelSegment(String text, Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.weight = weight;
    }

    public /* synthetic */ EventLabelSegment(String str, Weight weight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : weight);
    }

    public final String getText() {
        return this.text;
    }

    public final Weight getWeight() {
        return this.weight;
    }
}
