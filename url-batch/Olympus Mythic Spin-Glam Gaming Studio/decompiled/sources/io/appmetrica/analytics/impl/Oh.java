package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes8.dex */
public final class Oh extends AbstractC5845z6 {
    public final AbstractC5577oo d;

    public Oh(@NonNull Context context, @NonNull AbstractC5577oo abstractC5577oo, @NonNull InterfaceC5819y6 interfaceC5819y6, @Nullable ICrashTransformer iCrashTransformer) {
        this(abstractC5577oo, interfaceC5819y6, iCrashTransformer, new C5382ha(context));
    }

    public Oh(AbstractC5577oo abstractC5577oo, InterfaceC5819y6 interfaceC5819y6, ICrashTransformer iCrashTransformer, C5382ha c5382ha) {
        super(interfaceC5819y6, iCrashTransformer, c5382ha);
        this.d = abstractC5577oo;
    }
}
