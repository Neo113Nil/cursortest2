package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3726pR implements AnonymousClass24 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C3728pT> A01;
    public static final C3726pR A03 = new C3726pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = C5C.A0h(0);
    public static final String A05 = C5C.A0h(1);
    public static final AnonymousClass23<C3726pR> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C3726pR A00;
            A00 = C3726pR.A00(bundle);
            return A00;
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C3726pR(List<C3728pT> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C3728pT[]) list.toArray(new C3728pT[0]));
        this.A00 = j;
    }

    public static final C3726pR A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = AnonymousClass44.A01(C3728pT.A0I, cues);
        }
        return new C3726pR(A01, bundle.getLong(A05));
    }
}
