package com.yandex.div.core.view2;

import com.yandex.div.core.view2.DivImagePreloader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivImagePreloader.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"NO_CALLBACK", "Lcom/yandex/div/core/view2/DivImagePreloader$Callback;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DivImagePreloaderKt {

    @NotNull
    private static final DivImagePreloader.Callback NO_CALLBACK = new DivImagePreloader.Callback() { // from class: com.yandex.div.core.view2.DivImagePreloaderKt$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.view2.DivImagePreloader.Callback
        public final void finish(boolean z) {
            DivImagePreloaderKt.NO_CALLBACK$lambda$0(z);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z) {
    }
}
