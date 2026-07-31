package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "", "view", "Landroid/view/View;", "onAttachAction", "Lkotlin/Function0;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "cancel", "onAttach", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SingleTimeOnAttachCallback {

    @Nullable
    private Function0 onAttachAction;

    public SingleTimeOnAttachCallback(@NotNull View view, @Nullable Function0 function0) {
        this.onAttachAction = function0;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }

    public final void onAttach() {
        Function0 function0 = this.onAttachAction;
        if (function0 != null) {
            function0.mo4828invoke();
        }
        this.onAttachAction = null;
    }

    public final void cancel() {
        this.onAttachAction = null;
    }
}
