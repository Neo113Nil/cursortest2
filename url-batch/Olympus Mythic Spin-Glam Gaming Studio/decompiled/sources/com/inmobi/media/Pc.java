package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Pc extends AbstractC3984f1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pc(CoroutineScope coroutineScope, C4493y9 c4493y9) {
        super(coroutineScope, c4493y9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = Pc.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC3984f1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeAdSessionManager", "initializeAdSession");
        }
        X4.a(this.a, new Oc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z), X0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }

    @Override // com.inmobi.media.AbstractC3984f1
    public final void a() {
        if (this.e == null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
        } else {
            X4.a(this.a, new C4169m2(this, null));
        }
    }
}
