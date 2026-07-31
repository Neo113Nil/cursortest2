package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionChange.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange;", "", "<init>", "()V", "UserConsentChange", "PrivacyFsmChange", "Lcom/unity3d/ads/core/data/model/SessionChange$PrivacyFsmChange;", "Lcom/unity3d/ads/core/data/model/SessionChange$UserConsentChange;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SessionChange {
    public /* synthetic */ SessionChange(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SessionChange.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange$UserConsentChange;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "value", "Lcom/google/protobuf/ByteString;", "<init>", "(Lcom/google/protobuf/ByteString;)V", "getValue", "()Lcom/google/protobuf/ByteString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserConsentChange extends SessionChange {

        @NotNull
        private final ByteString value;

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ByteString getValue() {
            return this.value;
        }

        @NotNull
        public final UserConsentChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new UserConsentChange(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserConsentChange) && Intrinsics.areEqual(this.value, ((UserConsentChange) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }
    }

    private SessionChange() {
    }

    /* compiled from: SessionChange.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/model/SessionChange$PrivacyFsmChange;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "value", "Lcom/google/protobuf/ByteString;", "<init>", "(Lcom/google/protobuf/ByteString;)V", "getValue", "()Lcom/google/protobuf/ByteString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrivacyFsmChange extends SessionChange {

        @NotNull
        private final ByteString value;

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ByteString getValue() {
            return this.value;
        }

        @NotNull
        public final PrivacyFsmChange copy(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new PrivacyFsmChange(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrivacyFsmChange) && Intrinsics.areEqual(this.value, ((PrivacyFsmChange) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(@NotNull ByteString value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final ByteString getValue() {
            return this.value;
        }
    }
}
