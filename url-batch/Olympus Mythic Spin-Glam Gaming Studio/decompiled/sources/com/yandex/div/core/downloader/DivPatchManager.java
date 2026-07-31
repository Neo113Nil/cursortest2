package com.yandex.div.core.downloader;

import android.view.View;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivPatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPatchManager.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J*\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0012J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/core/downloader/DivPatchManager;", "", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divViewCreator", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/Div2Builder;", "(Lcom/yandex/div/core/downloader/DivPatchCache;Ljavax/inject/Provider;)V", "buildViewsForId", "", "Landroid/view/View;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "id", "", "createPatchedDivData", "Lcom/yandex/div2/DivData;", "oldDivData", "divDataTag", "Lcom/yandex/div/DivDataTag;", DivActionHandler.DivActionReason.PATCH, "Lcom/yandex/div2/DivPatch;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "createViewsForId", "", "Lcom/yandex/div2/Div;", "putPatch", "Lcom/yandex/div/core/downloader/DivPatchMap;", "tag", "removePatch", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes15.dex */
public class DivPatchManager {

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final Provider divViewCreator;

    public DivPatchManager(@NotNull DivPatchCache divPatchCache, @NotNull Provider provider) {
        this.divPatchCache = divPatchCache;
        this.divViewCreator = provider;
    }

    private DivPatchMap putPatch(DivDataTag tag, DivPatch patch) {
        return this.divPatchCache.putPatch(tag, patch);
    }

    @Nullable
    public List<View> buildViewsForId(@NotNull BindingContext context, @NotNull String id) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id);
        if (patchDivListById == null) {
            return null;
        }
        List<Div> list = patchDivListById;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Div2Builder) this.divViewCreator.get()).buildView((Div) it.next(), context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    @Nullable
    public Map<Div, View> createViewsForId(@NotNull BindingContext context, @NotNull String id) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(context.getDivView().getDataTag(), id);
        if (patchDivListById == null) {
            return null;
        }
        List<Div> list = patchDivListById;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, ((Div2Builder) this.divViewCreator.get()).createView((Div) obj, context, context.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }

    @Nullable
    public DivData createPatchedDivData(@NotNull DivData oldDivData, @NotNull DivDataTag divDataTag, @NotNull DivPatch patch, @NotNull ExpressionResolver resolver) {
        List<DivData.State> applyPatch = new DivPatchApply(putPatch(divDataTag, patch)).applyPatch(oldDivData.states, resolver);
        if (applyPatch == null) {
            removePatch(divDataTag);
            return null;
        }
        return new DivData(null, oldDivData.logId, applyPatch, oldDivData.timers, null, oldDivData.variableTriggers, oldDivData.variables, null, 145, null);
    }

    public void removePatch(@NotNull DivDataTag tag) {
        this.divPatchCache.removePatch(tag);
    }
}
