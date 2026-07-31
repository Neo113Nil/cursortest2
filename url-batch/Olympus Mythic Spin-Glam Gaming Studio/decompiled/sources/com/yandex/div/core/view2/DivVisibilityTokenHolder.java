package com.yandex.div.core.view2;

import androidx.annotation.AnyThread;
import com.safedk.android.analytics.brandsafety.m;
import com.yandex.div2.DivSightAction;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVisibilityTokenHolder.kt */
@AnyThread
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0004\u0012\u00020\u000e0\u0010R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "", "()V", "tokens", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "Lcom/yandex/div/core/view2/CompositeLogId;", "Lcom/yandex/div2/DivSightAction;", m.l, "", "logIds", "getLogId", "logId", "remove", "", "emptyTokenCallback", "Lkotlin/Function1;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivVisibilityTokenHolder {

    @NotNull
    private final ConcurrentLinkedQueue<Map<CompositeLogId, DivSightAction>> tokens = new ConcurrentLinkedQueue<>();

    public final void remove(@NotNull CompositeLogId logId, @NotNull Function1 emptyTokenCallback) {
        Object obj;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(logId) != null) {
                    break;
                }
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            emptyTokenCallback.invoke(map);
            this.tokens.remove(map);
        }
    }

    public final boolean add(@NotNull Map<CompositeLogId, DivSightAction> logIds) {
        return this.tokens.add(logIds);
    }

    @Nullable
    public final CompositeLogId getLogId(@NotNull CompositeLogId logId) {
        Object obj;
        Set keySet;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(logId)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map == null || (keySet = map.keySet()) == null) {
            return null;
        }
        CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) keySet.toArray(new CompositeLogId[0]);
        if (compositeLogIdArr == null) {
            return null;
        }
        for (CompositeLogId compositeLogId : compositeLogIdArr) {
            if (Intrinsics.areEqual(compositeLogId, logId)) {
                return compositeLogId;
            }
        }
        return null;
    }
}
