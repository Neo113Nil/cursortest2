package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivItemChangeActionHandler.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J-\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0082\bJ\u0016\u0010 \u001a\u00020\u001e*\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u001eH\u0002¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/items/DivItemChangeActionHandler;", "", "()V", "canHandle", "", "authority", "", "direction", "Lcom/yandex/div/core/view2/items/Direction;", "handleAction", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "view", "Lcom/yandex/div/core/DivViewFacade;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleNextItem", "animated", "viewController", "Lcom/yandex/div/core/view2/items/DivViewWithItemsController;", "handlePreviousItem", "handleScrollBackward", "handleScrollForward", "handleScrollTo", "handleScrollToTheEnd", "handleScrollToTheStart", "handleSetCurrentItem", "withOverflowAndStep", "actionOnViewController", "Lkotlin/Function2;", "", "", "getStepParam", "default", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DivItemChangeActionHandler {

    @NotNull
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean canHandle(@Nullable String authority) {
        if (authority != null) {
            switch (authority.hashCode()) {
                case -1789088446:
                    if (authority.equals("set_next_item")) {
                        return true;
                    }
                    break;
                case -1509135083:
                    if (!authority.equals("scroll_backward")) {
                    }
                    break;
                case -1348467885:
                    if (!authority.equals("scroll_forward")) {
                    }
                    break;
                case -1280379330:
                    if (!authority.equals("set_previous_item")) {
                    }
                    break;
                case -770388272:
                    if (!authority.equals("scroll_to_start")) {
                    }
                    break;
                case -88123690:
                    if (!authority.equals("set_current_item")) {
                    }
                    break;
                case 633820873:
                    if (authority.equals("scroll_to_end")) {
                    }
                    break;
                case 1099321339:
                    if (!authority.equals("scroll_to_position")) {
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final boolean handleAction(@NotNull Uri uri, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.INSTANCE;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController create = companion.create(queryParameter, view, resolver, divItemChangeActionHandler.direction(authority));
        if (create == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean parseBoolean = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority == null) {
            return false;
        }
        switch (authority.hashCode()) {
            case -1789088446:
                if (authority.equals("set_next_item")) {
                    break;
                }
                break;
            case -1509135083:
                if (authority.equals("scroll_backward")) {
                    break;
                }
                break;
            case -1348467885:
                if (authority.equals("scroll_forward")) {
                    break;
                }
                break;
            case -1280379330:
                if (authority.equals("set_previous_item")) {
                    break;
                }
                break;
            case -770388272:
                if (authority.equals("scroll_to_start")) {
                    break;
                }
                break;
            case -88123690:
                if (authority.equals("set_current_item")) {
                    break;
                }
                break;
            case 633820873:
                if (authority.equals("scroll_to_end")) {
                    break;
                }
                break;
            case 1099321339:
                if (authority.equals("scroll_to_position")) {
                    break;
                }
                break;
        }
        return false;
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        String queryParameter = uri.getQueryParameter("item");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            viewController.setCurrentItem(Integer.parseInt(queryParameter), animated);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter + " is not a number");
            }
            return false;
        }
    }

    private final boolean handleScrollTo(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollTo(getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollToTheEnd(boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollToEnd(animated);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollToStart(animated);
        return true;
    }

    static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i);
    }

    private final int getStepParam(Uri uri, int i) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return i;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            KAssert kAssert = KAssert.INSTANCE;
            if (!Assert.isEnabled()) {
                return i;
            }
            Assert.fail(queryParameter + " is not a number");
            return i;
        }
    }

    private final boolean handleNextItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean animated, DivViewWithItemsController viewController) {
        viewController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), animated);
        return true;
    }

    private final boolean withOverflowAndStep(Uri uri, Function2 actionOnViewController) {
        actionOnViewController.invoke(uri.getQueryParameter("overflow"), Integer.valueOf(getStepParam$default(this, uri, 0, 1, null)));
        return true;
    }

    private final Direction direction(String authority) {
        return Intrinsics.areEqual(authority, "set_previous_item") ? Direction.PREVIOUS : Intrinsics.areEqual(authority, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }
}
