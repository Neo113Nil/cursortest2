package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5484l9 {
    public final C5432j9 a;
    public final C5458k9 b;
    public final IBinaryDataHelper c;

    public C5484l9(Context context, C5351g5 c5351g5) {
        this(new C5458k9(), new C5432j9(), Ka.k().B().a(context, c5351g5));
    }

    public C5484l9(C5458k9 c5458k9, C5432j9 c5432j9, IBinaryDataHelper iBinaryDataHelper) {
        this.b = c5458k9;
        this.a = c5432j9;
        this.c = iBinaryDataHelper;
    }
}
