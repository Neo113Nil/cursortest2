package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4365td implements InterfaceC4219no {
    public final C4113jo a;
    public final Pe b;

    public C4365td(C4113jo viewableConfig, Pe nativeViewabilityViewHolder) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (((r3 == null || !r2.b) ? false : com.inmobi.media.AbstractC4403uo.a(r3, r2.c)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r6 != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
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
        if (te.b.a || te.a.a) {
            Vn vn = te.a;
            ImageView imageView = pe.b;
            boolean z2 = true;
            if (vn.a) {
                if ((imageView == null || !vn.b) ? false : AbstractC4403uo.a(imageView, vn.c)) {
                    z = true;
                    if (!z) {
                        Vn vn2 = te.b;
                        MediaView mediaView = this.b.c;
                        if (vn2.a) {
                        }
                        z2 = false;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        C4113jo c4113jo = this.a;
        if (AbstractC4403uo.a(viewGroup, rect, c4113jo.a, c4113jo.b) && AbstractC4403uo.a(viewGroup, rect, this.a.a, this.b.d)) {
            return EnumC4192mo.b;
        }
        return EnumC4192mo.a;
    }
}
