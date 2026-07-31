package com.inmobi.media;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4100jb {
    public final C4152lb a;
    public final C3909c6 b;
    public final LinkedHashSet c;
    public String d;
    public boolean e;

    public C4100jb(C4152lb c4152lb, C3909c6 embeddedBrowserViewClient) {
        Intrinsics.checkNotNullParameter(embeddedBrowserViewClient, "embeddedBrowserViewClient");
        this.a = c4152lb;
        this.b = embeddedBrowserViewClient;
        this.c = new LinkedHashSet();
    }

    public final void a(int i, boolean z, String str, Integer num) {
        try {
            if (this.e) {
                return;
            }
            C4152lb c4152lb = this.a;
            if (c4152lb != null) {
                c4152lb.f = "IN_CUSTOM";
            }
            switch (i) {
                case 1:
                    if (z) {
                        this.d = str;
                        C3909c6 c3909c6 = this.b;
                        Za funnelState = Za.h;
                        c3909c6.getClass();
                        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
                        AbstractC3914cb.a(funnelState, c4152lb, (Integer) null, c3909c6.i);
                        break;
                    }
                    break;
                case 2:
                    if (z) {
                        this.d = str;
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C3909c6 c3909c62 = this.b;
                            Za funnelState2 = Za.h;
                            C4152lb c4152lb2 = this.a;
                            c3909c62.getClass();
                            Intrinsics.checkNotNullParameter(funnelState2, "funnelState");
                            AbstractC3914cb.a(funnelState2, c4152lb2, (Integer) 8006, c3909c62.i);
                        }
                        this.b.g.mo4828invoke();
                        C3909c6 c3909c63 = this.b;
                        Za funnelState3 = Za.i;
                        C4152lb c4152lb3 = this.a;
                        c3909c63.getClass();
                        Intrinsics.checkNotNullParameter(funnelState3, "funnelState");
                        AbstractC3914cb.a(funnelState3, c4152lb3, (Integer) null, c3909c63.i);
                        break;
                    }
                    break;
                case 3:
                    if (z || (str != null && Intrinsics.areEqual(str, this.d))) {
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C3909c6 c3909c64 = this.b;
                            Za funnelState4 = Za.h;
                            C4152lb c4152lb4 = this.a;
                            c3909c64.getClass();
                            Intrinsics.checkNotNullParameter(funnelState4, "funnelState");
                            AbstractC3914cb.a(funnelState4, c4152lb4, (Integer) 8006, c3909c64.i);
                        }
                        C3909c6 c3909c65 = this.b;
                        Za funnelState5 = Za.j;
                        C4152lb c4152lb5 = this.a;
                        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        c3909c65.getClass();
                        Intrinsics.checkNotNullParameter(funnelState5, "funnelState");
                        AbstractC3914cb.a(funnelState5, c4152lb5, valueOf, c3909c65.i);
                        break;
                    }
                case 4:
                    if (z) {
                        this.d = str;
                        break;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.e = true;
                    switch (i) {
                        case 5:
                            r3 = 8200;
                            break;
                        case 6:
                            r3 = 8300;
                            break;
                        case 7:
                            r3 = 8400;
                            break;
                        case 8:
                            r3 = 8600;
                            break;
                        case 9:
                            r3 = 8500;
                            break;
                    }
                    int i2 = 4;
                    if (!this.c.contains(4)) {
                        i2 = 0;
                    }
                    int i3 = r3 + i2;
                    C3909c6 c3909c66 = this.b;
                    Za funnelState6 = Za.j;
                    C4152lb c4152lb6 = this.a;
                    Integer valueOf2 = Integer.valueOf(i3);
                    c3909c66.getClass();
                    Intrinsics.checkNotNullParameter(funnelState6, "funnelState");
                    AbstractC3914cb.a(funnelState6, c4152lb6, valueOf2, c3909c66.i);
                    break;
            }
            this.c.add(Integer.valueOf(i));
        } catch (Exception e) {
            e.toString();
        }
    }
}
