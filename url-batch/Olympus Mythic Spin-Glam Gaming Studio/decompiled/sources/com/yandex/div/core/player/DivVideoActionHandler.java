package com.yandex.div.core.player;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivVideo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVideoActionHandler.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\fJ\"\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/player/DivVideoActionHandler;", "", "videoViewMapper", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "(Lcom/yandex/div/core/player/DivVideoViewMapper;)V", "findDivVideoWithId", "Lcom/yandex/div2/DivVideo;", "div", "Lcom/yandex/div2/DivBase;", "id", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleAction", "", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "divId", "action", "expressionResolver", "searchDivDataForVideo", "divData", "Lcom/yandex/div2/DivData;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public final class DivVideoActionHandler {

    @NotNull
    public static final String PAUSE_COMMAND = "pause";

    @NotNull
    public static final String START_COMMAND = "start";

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoActionHandler(@NotNull DivVideoViewMapper divVideoViewMapper) {
        this.videoViewMapper = divVideoViewMapper;
    }

    public final boolean handleAction(@NotNull Div2View div2View, @NotNull String divId, @NotNull String action, @NotNull ExpressionResolver expressionResolver) {
        DivVideo searchDivDataForVideo;
        DivPlayer player;
        DivData divData = div2View.getDivData();
        if (divData == null || (searchDivDataForVideo = searchDivDataForVideo(divData, divId, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(searchDivDataForVideo)) == null) {
            return false;
        }
        if (Intrinsics.areEqual(action, "start")) {
            player.play();
            return true;
        }
        if (Intrinsics.areEqual(action, "pause")) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + action);
        }
        return false;
    }

    private final DivVideo searchDivDataForVideo(DivData divData, String id, ExpressionResolver resolver) {
        Iterator it = divData.states.iterator();
        while (it.hasNext()) {
            DivVideo findDivVideoWithId = findDivVideoWithId(((DivData.State) it.next()).div.value(), id, resolver);
            if (findDivVideoWithId != null) {
                return findDivVideoWithId;
            }
        }
        return null;
    }

    private final DivVideo findDivVideoWithId(DivBase div, String id, ExpressionResolver resolver) {
        DivBase value;
        DivVideo findDivVideoWithId;
        if (div instanceof DivVideo) {
            if (Intrinsics.areEqual(div.getId(), id)) {
                return (DivVideo) div;
            }
            return null;
        }
        if (div instanceof DivGallery) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((DivGallery) div, resolver)) {
                DivVideo findDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult.getDiv().value(), id, divItemBuilderResult.getExpressionResolver());
                if (findDivVideoWithId2 != null) {
                    return findDivVideoWithId2;
                }
            }
            return null;
        }
        if (div instanceof DivContainer) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((DivContainer) div, resolver)) {
                DivVideo findDivVideoWithId3 = findDivVideoWithId(divItemBuilderResult2.getDiv().value(), id, divItemBuilderResult2.getExpressionResolver());
                if (findDivVideoWithId3 != null) {
                    return findDivVideoWithId3;
                }
            }
            return null;
        }
        if (div instanceof DivGrid) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((DivGrid) div).iterator();
            while (it.hasNext()) {
                DivVideo findDivVideoWithId4 = findDivVideoWithId(((Div) it.next()).value(), id, resolver);
                if (findDivVideoWithId4 != null) {
                    return findDivVideoWithId4;
                }
            }
            return null;
        }
        if (div instanceof DivPager) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((DivPager) div, resolver)) {
                DivVideo findDivVideoWithId5 = findDivVideoWithId(divItemBuilderResult3.getDiv().value(), id, divItemBuilderResult3.getExpressionResolver());
                if (findDivVideoWithId5 != null) {
                    return findDivVideoWithId5;
                }
            }
            return null;
        }
        if (div instanceof DivTabs) {
            Iterator it2 = ((DivTabs) div).items.iterator();
            while (it2.hasNext()) {
                DivVideo findDivVideoWithId6 = findDivVideoWithId(((DivTabs.Item) it2.next()).div.value(), id, resolver);
                if (findDivVideoWithId6 != null) {
                    return findDivVideoWithId6;
                }
            }
            return null;
        }
        if (div instanceof DivCustom) {
            List list = ((DivCustom) div).items;
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    DivVideo findDivVideoWithId7 = findDivVideoWithId(((Div) it3.next()).value(), id, resolver);
                    if (findDivVideoWithId7 != null) {
                        return findDivVideoWithId7;
                    }
                }
            }
            return null;
        }
        if (div instanceof DivState) {
            Iterator it4 = ((DivState) div).states.iterator();
            while (it4.hasNext()) {
                Div div2 = ((DivState.State) it4.next()).div;
                if (div2 != null && (value = div2.value()) != null && (findDivVideoWithId = findDivVideoWithId(value, id, resolver)) != null) {
                    return findDivVideoWithId;
                }
            }
        }
        return null;
    }
}
