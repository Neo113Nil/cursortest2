package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenMessengerResponse.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/PrivacyNotice;", "", "isDismissed", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PrivacyNotice {
    public static final int $stable = 0;

    @SerializedName("is_dismissed")
    private final boolean isDismissed;

    @SerializedName("paragraph")
    private final String text;

    public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = privacyNotice.isDismissed;
        }
        if ((i & 2) != 0) {
            str = privacyNotice.text;
        }
        return privacyNotice.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final PrivacyNotice copy(boolean isDismissed, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new PrivacyNotice(isDismissed, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyNotice)) {
            return false;
        }
        PrivacyNotice privacyNotice = (PrivacyNotice) other;
        return this.isDismissed == privacyNotice.isDismissed && Intrinsics.areEqual(this.text, privacyNotice.text);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isDismissed) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "PrivacyNotice(isDismissed=" + this.isDismissed + ", text=" + this.text + ')';
    }

    public PrivacyNotice(boolean z, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.isDismissed = z;
        this.text = text;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final String getText() {
        return this.text;
    }
}
