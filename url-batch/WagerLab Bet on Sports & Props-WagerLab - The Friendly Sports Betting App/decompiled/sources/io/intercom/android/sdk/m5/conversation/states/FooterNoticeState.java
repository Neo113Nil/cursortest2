package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "", "title", "", "subtitle", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAvatars", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FooterNoticeState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> avatars;
    private final String subtitle;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterNoticeState copy$default(FooterNoticeState footerNoticeState, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerNoticeState.title;
        }
        if ((i & 2) != 0) {
            str2 = footerNoticeState.subtitle;
        }
        if ((i & 4) != 0) {
            list = footerNoticeState.avatars;
        }
        return footerNoticeState.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<AvatarWrapper> component3() {
        return this.avatars;
    }

    public final FooterNoticeState copy(String title, String subtitle, List<AvatarWrapper> avatars) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        return new FooterNoticeState(title, subtitle, avatars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterNoticeState)) {
            return false;
        }
        FooterNoticeState footerNoticeState = (FooterNoticeState) other;
        return Intrinsics.areEqual(this.title, footerNoticeState.title) && Intrinsics.areEqual(this.subtitle, footerNoticeState.subtitle) && Intrinsics.areEqual(this.avatars, footerNoticeState.avatars);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.avatars.hashCode();
    }

    public String toString() {
        return "FooterNoticeState(title=" + this.title + ", subtitle=" + this.subtitle + ", avatars=" + this.avatars + ')';
    }

    public FooterNoticeState(String title, String subtitle, List<AvatarWrapper> avatars) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.title = title;
        this.subtitle = subtitle;
        this.avatars = avatars;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }
}
