package com.yandex.div.core.player;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div2.Div;
import com.yandex.div2.DivVideo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayerViewsVisibilityChangeListener.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\tH\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/player/PlayerViewsVisibilityChangeListener;", "Lcom/yandex/div/core/DivVisibilityChangeListener;", "()V", "lastVisibleVideoReferences", "", "Ljava/lang/ref/WeakReference;", "Lcom/yandex/div/core/player/DivPlayerView;", "lastVisibleViews", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lcom/yandex/div2/Div;", "findPlayerView", "view", "onViewsVisibilityChanged", "", "visibleViews", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerViewsVisibilityChangeListener implements DivVisibilityChangeListener {

    @NotNull
    private Set<? extends WeakReference<DivPlayerView>> lastVisibleVideoReferences = SetsKt.emptySet();

    @NotNull
    private WeakHashMap<View, Div> lastVisibleViews = new WeakHashMap<>();

    @Override // com.yandex.div.core.DivVisibilityChangeListener
    public void onViewsVisibilityChanged(@Nullable Map<View, Div> visibleViews) {
        if (Intrinsics.areEqual(visibleViews, this.lastVisibleViews)) {
            return;
        }
        if (visibleViews == null || visibleViews.isEmpty()) {
            Iterator<T> it = this.lastVisibleVideoReferences.iterator();
            while (it.hasNext()) {
                DivPlayerView divPlayerView = (DivPlayerView) ((WeakReference) it.next()).get();
                if (divPlayerView != null) {
                    divPlayerView.setVisibleOnScreen(false);
                }
            }
            this.lastVisibleVideoReferences = SetsKt.emptySet();
            this.lastVisibleViews = new WeakHashMap<>();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, Div> entry : visibleViews.entrySet()) {
            if (entry.getValue().value() instanceof DivVideo) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        HashSet hashSet = new HashSet();
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            DivPlayerView findPlayerView = findPlayerView((View) it2.next());
            if (findPlayerView != null) {
                hashSet.add(findPlayerView);
            }
        }
        Set<? extends WeakReference<DivPlayerView>> set = this.lastVisibleVideoReferences;
        HashSet hashSet2 = new HashSet();
        Iterator<T> it3 = set.iterator();
        while (it3.hasNext()) {
            DivPlayerView divPlayerView2 = (DivPlayerView) ((WeakReference) it3.next()).get();
            if (divPlayerView2 != null) {
                hashSet2.add(divPlayerView2);
            }
        }
        if (!Intrinsics.areEqual(hashSet, hashSet2)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (!hashSet2.contains((DivPlayerView) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((DivPlayerView) it4.next()).setVisibleOnScreen(true);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : hashSet2) {
                if (!hashSet.contains((DivPlayerView) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((DivPlayerView) it5.next()).setVisibleOnScreen(false);
            }
            HashSet hashSet3 = new HashSet();
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                hashSet3.add(new WeakReference((DivPlayerView) it6.next()));
            }
            this.lastVisibleVideoReferences = hashSet3;
        }
        this.lastVisibleViews = new WeakHashMap<>(visibleViews);
    }

    private final DivPlayerView findPlayerView(View view) {
        if (view instanceof DivPlayerView) {
            return (DivPlayerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            DivPlayerView findPlayerView = findPlayerView(viewGroup.getChildAt(i));
            if (findPlayerView != null) {
                return findPlayerView;
            }
        }
        return null;
    }
}
