package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC21298z {
    void A59(C3778qI c3778qI, int i, int[] iArr) throws C21248s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C3757px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i) throws C21258t, C21288y;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C21288y;

    void AJG(C3784qQ c3784qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC21268v interfaceC21268v);

    void AJd(C3757px c3757px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C3778qI c3778qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
