package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1058cL {
    public final InterfaceC1062cP A00;
    public final String A01;
    public final Collection<C1072ca> A02;
    public final Collection<C1072ca> A03;
    public final List<Rect> A04;

    public C1058cL(String str, InterfaceC1062cP interfaceC1062cP, List<Rect> rects, Collection<C1072ca> collection, Collection<C1072ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1062cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
