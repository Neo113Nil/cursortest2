package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.Attribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "", "attribute", "Lio/intercom/android/sdk/models/Attribute;", "partId", "", "isFormDisabled", "", "<init>", "(Lio/intercom/android/sdk/models/Attribute;Ljava/lang/String;Z)V", "getAttribute", "()Lio/intercom/android/sdk/models/Attribute;", "getPartId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AttributeData {
    public static final int $stable = 8;
    private final Attribute attribute;
    private final boolean isFormDisabled;
    private final String partId;

    public static /* synthetic */ AttributeData copy$default(AttributeData attributeData, Attribute attribute, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            attribute = attributeData.attribute;
        }
        if ((i & 2) != 0) {
            str = attributeData.partId;
        }
        if ((i & 4) != 0) {
            z = attributeData.isFormDisabled;
        }
        return attributeData.copy(attribute, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Attribute getAttribute() {
        return this.attribute;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartId() {
        return this.partId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFormDisabled() {
        return this.isFormDisabled;
    }

    public final AttributeData copy(Attribute attribute, String partId, boolean isFormDisabled) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        return new AttributeData(attribute, partId, isFormDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) other;
        return Intrinsics.areEqual(this.attribute, attributeData.attribute) && Intrinsics.areEqual(this.partId, attributeData.partId) && this.isFormDisabled == attributeData.isFormDisabled;
    }

    public int hashCode() {
        return (((this.attribute.hashCode() * 31) + this.partId.hashCode()) * 31) + Boolean.hashCode(this.isFormDisabled);
    }

    public String toString() {
        return "AttributeData(attribute=" + this.attribute + ", partId=" + this.partId + ", isFormDisabled=" + this.isFormDisabled + ')';
    }

    public AttributeData(Attribute attribute, String partId, boolean z) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        this.attribute = attribute;
        this.partId = partId;
        this.isFormDisabled = z;
    }

    public final Attribute getAttribute() {
        return this.attribute;
    }

    public final String getPartId() {
        return this.partId;
    }

    public final boolean isFormDisabled() {
        return this.isFormDisabled;
    }
}
