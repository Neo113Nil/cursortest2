package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Moloco;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class w implements j<Boolean> {
    public static final int d = 8;

    @NotNull
    public final String b = "SDKInitStateSignalProvider";
    public boolean c = Moloco.isInitialized();

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        StringBuilder sb;
        boolean z = this.c;
        boolean isInitialized = Moloco.isInitialized();
        boolean z2 = z != isInitialized;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = this.b;
        if (z2) {
            sb = new StringBuilder();
            sb.append("[CBT] sdkInitialized updated from ");
            sb.append(z);
            sb.append(" to ");
            sb.append(isInitialized);
        } else {
            sb = new StringBuilder();
            sb.append("[CBT] sdkInitialized didn't change (before: ");
            sb.append(z);
            sb.append(", after: ");
            sb.append(isInitialized);
            sb.append(')');
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, str, sb.toString(), false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }
}
