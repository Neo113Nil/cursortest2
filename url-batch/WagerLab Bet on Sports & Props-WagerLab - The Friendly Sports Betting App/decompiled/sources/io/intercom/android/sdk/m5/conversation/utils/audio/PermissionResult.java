package io.intercom.android.sdk.m5.conversation.utils.audio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: AudioPermissionHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "", "Granted", "Denied", "PermanentlyDenied", "NotRequired", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$Denied;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$Granted;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$NotRequired;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$PermanentlyDenied;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PermissionResult {

    /* compiled from: AudioPermissionHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$Granted;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Granted implements PermissionResult {
        public static final int $stable = 0;
        public static final Granted INSTANCE = new Granted();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Granted)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1546814521;
        }

        public String toString() {
            return "Granted";
        }

        private Granted() {
        }
    }

    /* compiled from: AudioPermissionHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$Denied;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Denied implements PermissionResult {
        public static final int $stable = 0;
        public static final Denied INSTANCE = new Denied();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Denied)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1394334449;
        }

        public String toString() {
            return "Denied";
        }

        private Denied() {
        }
    }

    /* compiled from: AudioPermissionHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$PermanentlyDenied;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermanentlyDenied implements PermissionResult {
        public static final int $stable = 0;
        public static final PermanentlyDenied INSTANCE = new PermanentlyDenied();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermanentlyDenied)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1189886910;
        }

        public String toString() {
            return "PermanentlyDenied";
        }

        private PermanentlyDenied() {
        }
    }

    /* compiled from: AudioPermissionHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult$NotRequired;", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotRequired implements PermissionResult {
        public static final int $stable = 0;
        public static final NotRequired INSTANCE = new NotRequired();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotRequired)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1685989730;
        }

        public String toString() {
            return "NotRequired";
        }

        private NotRequired() {
        }
    }
}
