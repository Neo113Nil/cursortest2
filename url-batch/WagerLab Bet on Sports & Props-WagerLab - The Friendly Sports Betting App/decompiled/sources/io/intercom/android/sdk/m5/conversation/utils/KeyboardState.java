package io.intercom.android.sdk.m5.conversation.utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KeyboardState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "", "isAnimating", "", "bottomDiff", "", "isVisible", "isDismissed", "keyboardHeight", "<init>", "(ZIZZI)V", "()Z", "getBottomDiff", "()I", "getKeyboardHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class KeyboardState {
    public static final int $stable = 0;
    private final int bottomDiff;
    private final boolean isAnimating;
    private final boolean isDismissed;
    private final boolean isVisible;
    private final int keyboardHeight;

    public KeyboardState() {
        this(false, 0, false, false, 0, 31, null);
    }

    public static /* synthetic */ KeyboardState copy$default(KeyboardState keyboardState, boolean z, int i, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = keyboardState.isAnimating;
        }
        if ((i3 & 2) != 0) {
            i = keyboardState.bottomDiff;
        }
        if ((i3 & 4) != 0) {
            z2 = keyboardState.isVisible;
        }
        if ((i3 & 8) != 0) {
            z3 = keyboardState.isDismissed;
        }
        if ((i3 & 16) != 0) {
            i2 = keyboardState.keyboardHeight;
        }
        int i4 = i2;
        boolean z4 = z2;
        return keyboardState.copy(z, i, z4, z3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    /* renamed from: component5, reason: from getter */
    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public final KeyboardState copy(boolean isAnimating, int bottomDiff, boolean isVisible, boolean isDismissed, int keyboardHeight) {
        return new KeyboardState(isAnimating, bottomDiff, isVisible, isDismissed, keyboardHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardState)) {
            return false;
        }
        KeyboardState keyboardState = (KeyboardState) other;
        return this.isAnimating == keyboardState.isAnimating && this.bottomDiff == keyboardState.bottomDiff && this.isVisible == keyboardState.isVisible && this.isDismissed == keyboardState.isDismissed && this.keyboardHeight == keyboardState.keyboardHeight;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isAnimating) * 31) + Integer.hashCode(this.bottomDiff)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Boolean.hashCode(this.isDismissed)) * 31) + Integer.hashCode(this.keyboardHeight);
    }

    public String toString() {
        return "KeyboardState(isAnimating=" + this.isAnimating + ", bottomDiff=" + this.bottomDiff + ", isVisible=" + this.isVisible + ", isDismissed=" + this.isDismissed + ", keyboardHeight=" + this.keyboardHeight + ')';
    }

    public KeyboardState(boolean z, int i, boolean z2, boolean z3, int i2) {
        this.isAnimating = z;
        this.bottomDiff = i;
        this.isVisible = z2;
        this.isDismissed = z3;
        this.keyboardHeight = i2;
    }

    public /* synthetic */ KeyboardState(boolean z, int i, boolean z2, boolean z3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? 0 : i2);
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }
}
