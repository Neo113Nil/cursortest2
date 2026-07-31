package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3570mt implements InterfaceC2325Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final /* synthetic */ int AIp(InterfaceC19582c interfaceC19582c, int i, boolean z) {
        return AbstractC2322Ha.A00(this, interfaceC19582c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final /* synthetic */ void AIr(C20254v c20254v, int i) {
        AbstractC2322Ha.A01(this, c20254v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final void A6e(C3778qI c3778qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final int AIq(InterfaceC19582c interfaceC19582c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC19582c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final void AIs(C20254v c20254v, int i, int i2) {
        c20254v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    public final void AIu(long j, int i, int i2, int i3, C2323Hb c2323Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2325Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
