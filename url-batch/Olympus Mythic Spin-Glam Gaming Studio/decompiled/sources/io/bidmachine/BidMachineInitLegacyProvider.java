package io.bidmachine;

import android.content.Context;
import io.bidmachine.internal.AbstractC6009d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/BidMachineInitLegacyProvider;", "Lio/bidmachine/internal/d;", "<init>", "()V", "Landroid/content/Context;", "context", "", "preInitialize", "(Landroid/content/Context;)V", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class BidMachineInitLegacyProvider extends AbstractC6009d {
    @Override // io.bidmachine.internal.AbstractC6009d
    public void preInitialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k.j(context);
    }
}
