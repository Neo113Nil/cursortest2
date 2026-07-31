package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.ts.TsExtractor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;

/* compiled from: FocusInteropUtils.android.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u001a%\u0010\u0011\u001a\u00020\u0012*\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"toFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "androidDirection", "", "toAndroidFocusDirection", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "Landroidx/compose/ui/input/key/KeyEvent;", "toFocusDirection-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "toLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "androidLayoutDirection", "calculateBoundingRectRelativeTo", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "requestInteropFocus", "", "direction", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FocusInteropUtils_androidKt {
    public static final FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
        }
        if (i == 2) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
        }
        if (i == 17) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5299getLeftdhqQ8s());
        }
        if (i == 33) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5303getUpdhqQ8s());
        }
        if (i == 66) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5302getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5296getDowndhqQ8s());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m5304toAndroidFocusDirection3ESFkO8(int i) {
        if (FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5303getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5296getDowndhqQ8s())) {
            return Integer.valueOf(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        }
        if (FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5299getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5302getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5300getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m5292equalsimpl0(i, FocusDirection.INSTANCE.m5301getPreviousdhqQ8s()) ? 1 : null;
    }

    /* renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final FocusDirection m5305toFocusDirectionZmokQxo(KeyEvent keyEvent) {
        long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(keyEvent);
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6655getNavigatePreviousEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6653getNavigateNextEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6731getTabEK5gGoQ())) {
            return FocusDirection.m5289boximpl(KeyEvent_androidKt.m6809isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m5301getPreviousdhqQ8s() : FocusDirection.INSTANCE.m5300getNextdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5302getRightdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5299getLeftdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6684getPageUpEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5303getUpdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6683getPageDownEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5296getDowndhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6567getDirectionCenterEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6581getEnterEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6673getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5297getEnterdhqQ8s());
        }
        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6510getBackEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
            return FocusDirection.m5289boximpl(FocusDirection.INSTANCE.m5298getExitdhqQ8s());
        }
        return null;
    }

    public static final LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }

    public static final Rect calculateBoundingRectRelativeTo(View view, View view2) {
        view.getLocationInWindow(FocusInteropUtils.INSTANCE.getTempCoordinates());
        int i = FocusInteropUtils.INSTANCE.getTempCoordinates()[0];
        int i2 = FocusInteropUtils.INSTANCE.getTempCoordinates()[1];
        view2.getLocationInWindow(FocusInteropUtils.INSTANCE.getTempCoordinates());
        float f = i - FocusInteropUtils.INSTANCE.getTempCoordinates()[0];
        float f2 = i2 - FocusInteropUtils.INSTANCE.getTempCoordinates()[1];
        return new Rect(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final boolean requestInteropFocus(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
