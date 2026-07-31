package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _Sequences.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class DivViewsKt$withDivViewCanvasClipping$$inlined$filterIsInstance$1 extends Lambda implements Function1 {
    public static final DivViewsKt$withDivViewCanvasClipping$$inlined$filterIsInstance$1 INSTANCE = new DivViewsKt$withDivViewCanvasClipping$$inlined$filterIsInstance$1();

    public DivViewsKt$withDivViewCanvasClipping$$inlined$filterIsInstance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@Nullable Object obj) {
        return Boolean.valueOf(obj instanceof Div2View);
    }
}
