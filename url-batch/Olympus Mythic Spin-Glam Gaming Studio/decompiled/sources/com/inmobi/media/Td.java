package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Td implements InterfaceC4219no {
    public final C4113jo a;
    public final Pe b;

    public Td(C4113jo viewableConfig, Pe nativeViewabilityViewHolder) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (com.inmobi.media.AbstractC4403uo.a(r0, r1, r8.a.a, r8.b.d) != false) goto L31;
     */
    @Override // com.inmobi.media.InterfaceC4219no
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC4192mo a() {
        boolean z;
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC4192mo.a;
        }
        Pe pe = this.b;
        Te te = pe.e;
        Vn vn = te.b;
        boolean z2 = true;
        if (vn.a) {
            MediaView mediaView = pe.c;
            if (mediaView != null && vn.b) {
                z = AbstractC4403uo.a(mediaView, vn.c);
            }
            z = false;
        } else {
            Vn vn2 = te.a;
            if (vn2.a) {
                ImageView imageView = pe.b;
                if (imageView != null && vn2.b) {
                    z = AbstractC4403uo.a(imageView, vn2.c);
                }
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            C4113jo c4113jo = this.a;
            if (AbstractC4403uo.a(viewGroup, rect, c4113jo.a, c4113jo.b)) {
            }
        }
        z2 = false;
        return z2 ? EnumC4192mo.b : EnumC4192mo.a;
    }
}
