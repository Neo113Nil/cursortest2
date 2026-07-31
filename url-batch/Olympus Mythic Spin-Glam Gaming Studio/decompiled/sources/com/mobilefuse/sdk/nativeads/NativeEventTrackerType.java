package com.mobilefuse.sdk.nativeads;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: NativeAdMarkup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", POBOMSDKLogConstants.MSG_OMSDK_IMPRESSION_EVENT, "VIEWABLE_MRC_50", "VIEWABLE_MRC_100", "VIEWABLE_VIDEO_50", "UNKNOWN", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public enum NativeEventTrackerType {
    IMPRESSION(1),
    VIEWABLE_MRC_50(2),
    VIEWABLE_MRC_100(3),
    VIEWABLE_VIDEO_50(4),
    UNKNOWN(500);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    NativeEventTrackerType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: NativeAdMarkup.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType$Companion;", "", "()V", "fromInt", "Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType;", "value", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NativeEventTrackerType fromInt(int value) {
            try {
                for (NativeEventTrackerType nativeEventTrackerType : NativeEventTrackerType.values()) {
                    if (nativeEventTrackerType.getValue() == value) {
                        return nativeEventTrackerType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                return NativeEventTrackerType.UNKNOWN;
            }
        }
    }
}
