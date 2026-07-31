package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes12.dex */
public final class Oe extends C2 {
    public static final /* synthetic */ int i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oe(CoroutineScope coroutineScope, InterfaceC4466x9 interfaceC4466x9) {
        super(coroutineScope, interfaceC4466x9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC3984f1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z) {
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        X4.a(this.a, new Ne(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z), X0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }
}
