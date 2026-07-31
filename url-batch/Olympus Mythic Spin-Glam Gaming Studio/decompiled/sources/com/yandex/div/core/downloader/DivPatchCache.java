package com.yandex.div.core.downloader;

import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div2.Div;
import com.yandex.div2.DivPatch;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPatchCache.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/downloader/DivPatchCache;", "", "()V", "patches", "Landroidx/collection/ArrayMap;", "Lcom/yandex/div/DivDataTag;", "Lcom/yandex/div/core/downloader/DivPatchMap;", "getPatch", "tag", "getPatchDivListById", "", "Lcom/yandex/div2/Div;", "id", "", "putPatch", DivActionHandler.DivActionReason.PATCH, "Lcom/yandex/div2/DivPatch;", "removePatch", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes15.dex */
public class DivPatchCache {

    @NotNull
    private final ArrayMap<DivDataTag, DivPatchMap> patches = new ArrayMap<>();

    @Nullable
    public List<Div> getPatchDivListById(@NotNull DivDataTag tag, @NotNull String id) {
        DivPatchMap divPatchMap = (DivPatchMap) this.patches.get(tag);
        if (divPatchMap == null) {
            return null;
        }
        return divPatchMap.getPatches().get(id);
    }

    @Nullable
    public DivPatchMap getPatch(@NotNull DivDataTag tag) {
        return (DivPatchMap) this.patches.get(tag);
    }

    @NotNull
    public DivPatchMap putPatch(@NotNull DivDataTag tag, @NotNull DivPatch patch) {
        DivPatchMap divPatchMap = new DivPatchMap(patch);
        this.patches.put(tag, divPatchMap);
        return divPatchMap;
    }

    public void removePatch(@NotNull DivDataTag tag) {
        this.patches.remove(tag);
    }
}
