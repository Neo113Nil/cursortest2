package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiEffect.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "", "<init>", "()V", "ShowUploadSizeLimitDialog", "LockScreenOrientation", "UnlockScreenOrientation", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$LockScreenOrientation;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$ShowUploadSizeLimitDialog;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$UnlockScreenOrientation;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ConversationUiEffect {
    public static final int $stable = 0;

    public /* synthetic */ ConversationUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationUiEffect() {
    }

    /* compiled from: ConversationUiEffect.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$ShowUploadSizeLimitDialog;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "uploadSizeLimitMB", "", "<init>", "(Ljava/lang/String;)V", "getUploadSizeLimitMB", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowUploadSizeLimitDialog extends ConversationUiEffect {
        public static final int $stable = 0;
        private final String uploadSizeLimitMB;

        public static /* synthetic */ ShowUploadSizeLimitDialog copy$default(ShowUploadSizeLimitDialog showUploadSizeLimitDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showUploadSizeLimitDialog.uploadSizeLimitMB;
            }
            return showUploadSizeLimitDialog.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        public final ShowUploadSizeLimitDialog copy(String uploadSizeLimitMB) {
            Intrinsics.checkNotNullParameter(uploadSizeLimitMB, "uploadSizeLimitMB");
            return new ShowUploadSizeLimitDialog(uploadSizeLimitMB);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowUploadSizeLimitDialog) && Intrinsics.areEqual(this.uploadSizeLimitMB, ((ShowUploadSizeLimitDialog) other).uploadSizeLimitMB);
        }

        public int hashCode() {
            return this.uploadSizeLimitMB.hashCode();
        }

        public String toString() {
            return "ShowUploadSizeLimitDialog(uploadSizeLimitMB=" + this.uploadSizeLimitMB + ')';
        }

        public final String getUploadSizeLimitMB() {
            return this.uploadSizeLimitMB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUploadSizeLimitDialog(String uploadSizeLimitMB) {
            super(null);
            Intrinsics.checkNotNullParameter(uploadSizeLimitMB, "uploadSizeLimitMB");
            this.uploadSizeLimitMB = uploadSizeLimitMB;
        }
    }

    /* compiled from: ConversationUiEffect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$LockScreenOrientation;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;
        public static final LockScreenOrientation INSTANCE = new LockScreenOrientation();

        private LockScreenOrientation() {
            super(null);
        }
    }

    /* compiled from: ConversationUiEffect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect$UnlockScreenOrientation;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnlockScreenOrientation extends ConversationUiEffect {
        public static final int $stable = 0;
        public static final UnlockScreenOrientation INSTANCE = new UnlockScreenOrientation();

        private UnlockScreenOrientation() {
            super(null);
        }
    }
}
