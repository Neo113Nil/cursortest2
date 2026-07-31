package com.composables.core;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/composables/core/ModalSheetProperties;", "", "dismissOnBackPress", "", "dismissOnClickOutside", "<init>", "(ZZ)V", "getDismissOnBackPress", "()Z", "getDismissOnClickOutside", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModalSheetProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModalSheetProperties() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    public static /* synthetic */ ModalSheetProperties copy$default(ModalSheetProperties modalSheetProperties, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = modalSheetProperties.dismissOnBackPress;
        }
        if ((i & 2) != 0) {
            z2 = modalSheetProperties.dismissOnClickOutside;
        }
        return modalSheetProperties.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final ModalSheetProperties copy(boolean dismissOnBackPress, boolean dismissOnClickOutside) {
        return new ModalSheetProperties(dismissOnBackPress, dismissOnClickOutside);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalSheetProperties)) {
            return false;
        }
        ModalSheetProperties modalSheetProperties = (ModalSheetProperties) other;
        return this.dismissOnBackPress == modalSheetProperties.dismissOnBackPress && this.dismissOnClickOutside == modalSheetProperties.dismissOnClickOutside;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside);
    }

    public String toString() {
        return "ModalSheetProperties(dismissOnBackPress=" + this.dismissOnBackPress + ", dismissOnClickOutside=" + this.dismissOnClickOutside + ")";
    }

    public ModalSheetProperties(boolean z, boolean z2) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
    }

    public /* synthetic */ ModalSheetProperties(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }
}
