package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.d8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3937d8 implements Xg {
    public final String a;

    public C3937d8(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.a = content;
    }

    @Override // com.inmobi.media.Xg
    public final Object a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Xg
    public final Object b() {
        return StringsKt.trim(this.a).toString();
    }

    @Override // com.inmobi.media.Xg
    public final void a() {
        if (URLUtil.isValidUrl(StringsKt.trim(this.a).toString())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new Zg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(hashMap));
    }
}
