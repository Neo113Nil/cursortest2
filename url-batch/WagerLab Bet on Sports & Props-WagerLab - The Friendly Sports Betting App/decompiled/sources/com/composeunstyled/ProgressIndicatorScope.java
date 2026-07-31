package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/composeunstyled/ProgressIndicatorScope;", "", "<init>", "()V", "<set-?>", "", "progress", "getProgress", "()F", "setProgress$core_release", "(F)V", "progress$delegate", "Landroidx/compose/runtime/MutableState;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressIndicatorScope {
    public static final int $stable = 0;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final MutableState progress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final void setProgress$core_release(float f) {
        this.progress.setValue(Float.valueOf(f));
    }
}
