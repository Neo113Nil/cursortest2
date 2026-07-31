package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3911c8 implements Xg {
    public final String a;

    public C3911c8(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.a = content;
    }

    @Override // com.inmobi.media.Xg
    public final Object a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Xg
    public final Object b() {
        return this.a;
    }

    @Override // com.inmobi.media.Xg
    public final void a() {
        if (this.a.length() != 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new Zg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(hashMap));
    }
}
