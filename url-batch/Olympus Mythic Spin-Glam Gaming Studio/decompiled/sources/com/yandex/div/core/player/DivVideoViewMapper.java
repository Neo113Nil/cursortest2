package com.yandex.div.core.player;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVideoViewMapper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/player/DivVideoViewMapper;", "", "()V", "currentViews", "Ljava/util/WeakHashMap;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div2/DivVideo;", "addView", "", "view", "div", "getPlayer", "Lcom/yandex/div/core/player/DivPlayer;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes15.dex */
public final class DivVideoViewMapper {

    @NotNull
    private final WeakHashMap<DivVideoView, DivVideo> currentViews = new WeakHashMap<>();

    public final void addView(@NotNull DivVideoView view, @NotNull DivVideo div) {
        this.currentViews.put(view, div);
    }

    @Nullable
    public final DivPlayer getPlayer(@NotNull DivVideo div) {
        Set<Map.Entry<DivVideoView, DivVideo>> entrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getValue(), div) || Intrinsics.areEqual(((DivVideo) entry.getValue()).getId(), div.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) CollectionsKt.firstOrNull((List) arrayList2);
    }
}
