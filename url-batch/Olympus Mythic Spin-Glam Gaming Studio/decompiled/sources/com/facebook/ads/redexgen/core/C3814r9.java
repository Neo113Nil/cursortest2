package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3814r9 {
    public final InterfaceC3818rD A00;
    public final String A01;
    public final Collection<C3827rN> A02;
    public final Collection<C3827rN> A03;
    public final List<Rect> A04;

    public C3814r9(String str, InterfaceC3818rD interfaceC3818rD, List<Rect> rects, Collection<C3827rN> collection, Collection<C3827rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3818rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
