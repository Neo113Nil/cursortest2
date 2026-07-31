package com.yandex.div.core.view2;

import androidx.core.view.ViewCompat;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewIdProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/DivViewIdProvider;", "", "()V", "cache", "", "", "", "getViewId", "id", TimerController.RESET_COMMAND, "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes5.dex */
public final class DivViewIdProvider {

    @NotNull
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    public final int getViewId(@Nullable String id) {
        if (id == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer num = map.get(id);
        if (num == null) {
            num = Integer.valueOf(ViewCompat.generateViewId());
            map.put(id, num);
        }
        return num.intValue();
    }

    public final void reset() {
        this.cache.clear();
    }
}
