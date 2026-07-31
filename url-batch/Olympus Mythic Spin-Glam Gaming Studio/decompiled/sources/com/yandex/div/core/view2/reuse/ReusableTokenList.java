package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.safedk.android.analytics.brandsafety.m;
import com.yandex.div2.Div;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReusableTokenList.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0007R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "", "()V", "reusable", "Ljava/util/HashMap;", "", "Ljava/util/LinkedList;", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "Lkotlin/collections/HashMap;", "viewIndexShift", "", m.l, "", "token", "asList", "", "clear", "contains", "", "div", "Lcom/yandex/div2/Div;", "hash", "count", "get", "getUniqueViewForDiv", "Landroid/view/View;", "isEmpty", "pop", "remove", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReusableTokenList {

    @NotNull
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();

    @NotNull
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final int count() {
        return this.reusable.size();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    @NotNull
    public final List<ExistingToken> asList() {
        return CollectionsKt.flatten(this.reusable.values());
    }

    public final boolean contains(int hash) {
        return this.reusable.containsKey(Integer.valueOf(hash));
    }

    public final boolean contains(@NotNull Div div) {
        return this.reusable.containsKey(Integer.valueOf(div.propertiesHash()));
    }

    public final void add(@NotNull ExistingToken token) {
        int divHash = token.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> hashMap = this.reusable;
        Integer valueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = hashMap.get(valueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            hashMap.put(valueOf, linkedList);
        }
        linkedList.add(token);
    }

    @Nullable
    public final ExistingToken pop(int hash) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(hash));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken pop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(hash));
        if (linkedList2 == null || linkedList2.isEmpty()) {
            this.reusable.remove(Integer.valueOf(hash));
        }
        return pop;
    }

    @Nullable
    public final ExistingToken pop(@NotNull Div div) {
        return pop(div.propertiesHash());
    }

    @Nullable
    public final ExistingToken get(@NotNull Div div) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(div.propertiesHash()));
        if (linkedList != null) {
            return (ExistingToken) CollectionsKt.firstOrNull((List) linkedList);
        }
        return null;
    }

    @Nullable
    public final View getUniqueViewForDiv(@NotNull Div div) {
        ExistingToken existingToken;
        int propertiesHash = div.propertiesHash();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer valueOf = Integer.valueOf(propertiesHash);
        Integer num = map.get(valueOf);
        if (num == null) {
            num = 0;
            map.put(valueOf, num);
        }
        int intValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(propertiesHash));
        if (linkedList == null || (existingToken = (ExistingToken) CollectionsKt.getOrNull(linkedList, intValue)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(propertiesHash), Integer.valueOf(intValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final boolean remove(@NotNull ExistingToken token) {
        Object obj;
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(token.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ExistingToken) obj).getView(), token.getView())) {
                break;
            }
        }
        return TypeIntrinsics.asMutableCollection(linkedList).remove(obj);
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }
}
