package io.intercom.android.sdk.m5.conversation.ui.components.row;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleMessageRow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;", "", "message", "", "onRetryMessageClicked", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getMessage", "()Ljava/lang/String;", "getOnRetryMessageClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FailedMessage {
    public static final int $stable = 0;
    private final String message;
    private final Function0<Unit> onRetryMessageClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedMessage copy$default(FailedMessage failedMessage, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = failedMessage.message;
        }
        if ((i & 2) != 0) {
            function0 = failedMessage.onRetryMessageClicked;
        }
        return failedMessage.copy(str, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final Function0<Unit> component2() {
        return this.onRetryMessageClicked;
    }

    public final FailedMessage copy(String message, Function0<Unit> onRetryMessageClicked) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRetryMessageClicked, "onRetryMessageClicked");
        return new FailedMessage(message, onRetryMessageClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedMessage)) {
            return false;
        }
        FailedMessage failedMessage = (FailedMessage) other;
        return Intrinsics.areEqual(this.message, failedMessage.message) && Intrinsics.areEqual(this.onRetryMessageClicked, failedMessage.onRetryMessageClicked);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.onRetryMessageClicked.hashCode();
    }

    public String toString() {
        return "FailedMessage(message=" + this.message + ", onRetryMessageClicked=" + this.onRetryMessageClicked + ')';
    }

    public FailedMessage(String message, Function0<Unit> onRetryMessageClicked) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onRetryMessageClicked, "onRetryMessageClicked");
        this.message = message;
        this.onRetryMessageClicked = onRetryMessageClicked;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Function0<Unit> getOnRetryMessageClicked() {
        return this.onRetryMessageClicked;
    }
}
