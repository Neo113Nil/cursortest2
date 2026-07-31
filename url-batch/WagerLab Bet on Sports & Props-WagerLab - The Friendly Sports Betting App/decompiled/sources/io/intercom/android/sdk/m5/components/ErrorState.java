package io.intercom.android.sdk.m5.components;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomErrorScreen.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState;", "", "<init>", "()V", "iconId", "", "getIconId", "()I", "messageResId", "getMessageResId", "additionalMessageResId", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "WithCTA", "WithoutCTA", "Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ErrorState {
    public static final int $stable = 0;

    public /* synthetic */ ErrorState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    private ErrorState() {
    }

    /* compiled from: IntercomErrorScreen.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u0003H×\u0001J\t\u0010!\u001a\u00020\"H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "iconId", "", "messageResId", "additionalMessageResId", "ctaResId", "onCtaClick", "Lkotlin/Function0;", "", "<init>", "(IILjava/lang/Integer;ILkotlin/jvm/functions/Function0;)V", "getIconId", "()I", "getMessageResId", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCtaResId", "getOnCtaClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "(IILjava/lang/Integer;ILkotlin/jvm/functions/Function0;)Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;
        private final Function0<Unit> onCtaClick;

        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int i, int i2, Integer num, int i3, Function0 function0, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = withCTA.iconId;
            }
            if ((i4 & 2) != 0) {
                i2 = withCTA.messageResId;
            }
            if ((i4 & 4) != 0) {
                num = withCTA.additionalMessageResId;
            }
            if ((i4 & 8) != 0) {
                i3 = withCTA.ctaResId;
            }
            if ((i4 & 16) != 0) {
                function0 = withCTA.onCtaClick;
            }
            Function0 function02 = function0;
            Integer num2 = num;
            return withCTA.copy(i, i2, num2, i3, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIconId() {
            return this.iconId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCtaResId() {
            return this.ctaResId;
        }

        public final Function0<Unit> component5() {
            return this.onCtaClick;
        }

        public final WithCTA copy(int iconId, int messageResId, Integer additionalMessageResId, int ctaResId, Function0<Unit> onCtaClick) {
            Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
            return new WithCTA(iconId, messageResId, additionalMessageResId, ctaResId, onCtaClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithCTA)) {
                return false;
            }
            WithCTA withCTA = (WithCTA) other;
            return this.iconId == withCTA.iconId && this.messageResId == withCTA.messageResId && Intrinsics.areEqual(this.additionalMessageResId, withCTA.additionalMessageResId) && this.ctaResId == withCTA.ctaResId && Intrinsics.areEqual(this.onCtaClick, withCTA.onCtaClick);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.ctaResId)) * 31) + this.onCtaClick.hashCode();
        }

        public String toString() {
            return "WithCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ", ctaResId=" + this.ctaResId + ", onCtaClick=" + this.onCtaClick + ')';
        }

        public /* synthetic */ WithCTA(int i, int i2, Integer num, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? R.drawable.intercom_ic_warning : i, (i4 & 2) != 0 ? R.string.intercom_spaces_error_title : i2, (i4 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num, (i4 & 8) != 0 ? R.string.intercom_reload : i3, function0);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        public final Function0<Unit> getOnCtaClick() {
            return this.onCtaClick;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithCTA(int i, int i2, Integer num, int i3, Function0<Unit> onCtaClick) {
            super(null);
            Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
            this.iconId = i;
            this.messageResId = i2;
            this.additionalMessageResId = num;
            this.ctaResId = i3;
            this.onCtaClick = onCtaClick;
        }
    }

    /* compiled from: IntercomErrorScreen.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "iconId", "", "messageResId", "additionalMessageResId", "<init>", "(IILjava/lang/Integer;)V", "getIconId", "()I", "getMessageResId", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithoutCTA extends ErrorState {
        public static final int $stable = 0;
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public WithoutCTA() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int i, int i2, Integer num, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = withoutCTA.iconId;
            }
            if ((i3 & 2) != 0) {
                i2 = withoutCTA.messageResId;
            }
            if ((i3 & 4) != 0) {
                num = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(i, i2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIconId() {
            return this.iconId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final WithoutCTA copy(int iconId, int messageResId, Integer additionalMessageResId) {
            return new WithoutCTA(iconId, messageResId, additionalMessageResId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithoutCTA)) {
                return false;
            }
            WithoutCTA withoutCTA = (WithoutCTA) other;
            return this.iconId == withoutCTA.iconId && this.messageResId == withoutCTA.messageResId && Intrinsics.areEqual(this.additionalMessageResId, withoutCTA.additionalMessageResId);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageResId)) * 31;
            Integer num = this.additionalMessageResId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "WithoutCTA(iconId=" + this.iconId + ", messageResId=" + this.messageResId + ", additionalMessageResId=" + this.additionalMessageResId + ')';
        }

        public /* synthetic */ WithoutCTA(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.drawable.intercom_ic_warning : i, (i3 & 2) != 0 ? R.string.intercom_spaces_error_title : i2, (i3 & 4) != 0 ? Integer.valueOf(R.string.intercom_spaces_error_description) : num);
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getIconId() {
            return this.iconId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public int getMessageResId() {
            return this.messageResId;
        }

        @Override // io.intercom.android.sdk.m5.components.ErrorState
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public WithoutCTA(int i, int i2, Integer num) {
            super(null);
            this.iconId = i;
            this.messageResId = i2;
            this.additionalMessageResId = num;
        }
    }
}
