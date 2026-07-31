package com.composables.core;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRA\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/composables/core/SheetDetent;", "", NotificationsService.IDENTIFIER_KEY, "", "calculateDetentHeight", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Dp;", "Lkotlin/ParameterName;", "name", "containerHeight", "sheetHeight", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getIdentifier", "()Ljava/lang/String;", "getCalculateDetentHeight", "()Lkotlin/jvm/functions/Function2;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SheetDetent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SheetDetent FullyExpanded = new SheetDetent("fully-expanded", new Function2() { // from class: com.composables.core.SheetDetent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Dp FullyExpanded$lambda$0;
            FullyExpanded$lambda$0 = SheetDetent.FullyExpanded$lambda$0((Dp) obj, (Dp) obj2);
            return FullyExpanded$lambda$0;
        }
    });
    private static final SheetDetent Hidden = new SheetDetent(ViewProps.HIDDEN, new Function2() { // from class: com.composables.core.SheetDetent$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Dp Hidden$lambda$1;
            Hidden$lambda$1 = SheetDetent.Hidden$lambda$1((Dp) obj, (Dp) obj2);
            return Hidden$lambda$1;
        }
    });
    private final Function2<Dp, Dp, Dp> calculateDetentHeight;
    private final String identifier;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp FullyExpanded$lambda$0(Dp dp, Dp dp2) {
        return dp2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SheetDetent(String identifier, Function2<? super Dp, ? super Dp, Dp> calculateDetentHeight) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(calculateDetentHeight, "calculateDetentHeight");
        this.identifier = identifier;
        this.calculateDetentHeight = calculateDetentHeight;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Function2<Dp, Dp, Dp> getCalculateDetentHeight() {
        return this.calculateDetentHeight;
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/composables/core/SheetDetent$Companion;", "", "<init>", "()V", "FullyExpanded", "Lcom/composables/core/SheetDetent;", "getFullyExpanded", "()Lcom/composables/core/SheetDetent;", "Hidden", "getHidden", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SheetDetent getFullyExpanded() {
            return SheetDetent.FullyExpanded;
        }

        public final SheetDetent getHidden() {
            return SheetDetent.Hidden;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.identifier, ((SheetDetent) other).identifier);
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return "SheetDetent(identifier='" + this.identifier + "')";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp Hidden$lambda$1(Dp dp, Dp dp2) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(0));
    }
}
