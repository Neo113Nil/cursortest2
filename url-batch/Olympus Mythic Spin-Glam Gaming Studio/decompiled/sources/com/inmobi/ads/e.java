package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3868ah;
import com.inmobi.media.C4441wa;
import com.inmobi.media.C4467xa;
import com.inmobi.media.Xb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements PreloadManager {
    public final C4441wa a;
    public final /* synthetic */ InMobiInterstitial b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.b = inMobiInterstitial;
        this.a = new C4441wa(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.b.getMAdManager$media_release().i();
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
            this.b.getMPubListener$media_release().a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        C3868ah c3868ah;
        C3868ah c3868ah2;
        Context context;
        this.b.b = true;
        c3868ah = this.b.d;
        c3868ah.getClass();
        Intrinsics.checkNotNullParameter("Preload", "<set-?>");
        c3868ah.h = "Preload";
        C4467xa mAdManager$media_release = this.b.getMAdManager$media_release();
        c3868ah2 = this.b.d;
        context = this.b.a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(c3868ah2, context, true, "intHtml");
        this.b.getMAdManager$media_release().b(this.a);
    }
}
