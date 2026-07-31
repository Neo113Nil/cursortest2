package com.yandex.div.core.util;

import android.util.Log;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* compiled from: SearchUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aH\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0080\b¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "findNearest", "T", "Lcom/yandex/div2/DivBase;", "rootDiv", "Lcom/yandex/div2/Div;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "seeker", "matchCondition", "Lkotlin/Function1;", "", "(Lcom/yandex/div2/Div;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div2/DivBase;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div2/DivBase;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchUtilKt {

    @NotNull
    private static final String TAG = "SearchUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.yandex.div.core.util.SearchRoute] */
    public static final /* synthetic */ <T extends DivBase> T findNearest(Div div, ExpressionResolver expressionResolver, DivBase divBase, Function1 function1) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ArrayList<SearchRoute> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DivTreeWalk walk = DivTreeWalkKt.walk(div, expressionResolver);
        Intrinsics.needClassReification();
        DivTreeWalk onEnter = walk.onEnter(new Function1() { // from class: com.yandex.div.core.util.SearchUtilKt$findNearest$visitor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Div div2) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SearchRoute) it.next()).onEnter();
                }
                SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                if (searchRoute != null) {
                    searchRoute.onEnter();
                }
                return Boolean.TRUE;
            }
        });
        Intrinsics.needClassReification();
        Iterator withIndex = CollectionsKt.withIndex(onEnter.onLeave(new Function1() { // from class: com.yandex.div.core.util.SearchUtilKt$findNearest$visitor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Div) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@NotNull Div div2) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SearchRoute) it.next()).onLeave();
                }
                SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                if (searchRoute != null) {
                    searchRoute.onLeave();
                }
            }
        }).iterator());
        while (withIndex.hasNext()) {
            DivBase value = ((DivItemBuilderResult) ((IndexedValue) withIndex.next()).getValue()).getDiv().value();
            if (value == divBase) {
                for (SearchRoute searchRoute : arrayList) {
                    if (((DivBase) searchRoute.getItem()) != null) {
                        linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.getMovedDistance()));
                    }
                }
                arrayList.clear();
                ref$ObjectRef.element = new SearchRoute(null);
            }
            Intrinsics.reifiedOperationMarker(3, "T");
            if (value != null && ((Boolean) function1.invoke(value)).booleanValue()) {
                T t = ref$ObjectRef.element;
                if (t != 0) {
                    linkedHashMap.put(value, Integer.valueOf(((SearchRoute) t).getMovedDistance()));
                } else {
                    arrayList.add(new SearchRoute(value));
                }
            }
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) linkedHashMap.values());
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() == intValue) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap2.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        if (keySet.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Distance clash when searching for the nearest ");
            Intrinsics.reifiedOperationMarker(4, "T");
            sb.append(Reflection.getOrCreateKotlinClass(DivBase.class).getSimpleName());
            sb.append(". First found is taken");
            Log.w(TAG, sb.toString());
        }
        return (T) CollectionsKt.first(keySet);
    }
}
