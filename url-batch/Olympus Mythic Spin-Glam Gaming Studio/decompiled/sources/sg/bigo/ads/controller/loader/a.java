package sg.bigo.ads.controller.loader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.aj.i;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.d.c;

/* loaded from: classes6.dex */
public final class a {
    public static int a(b[] bVarArr) {
        b bVar = (b) l.b(bVarArr);
        if (bVar != null) {
            return bVar.x();
        }
        return 0;
    }

    public static void a(@NonNull Ad ad, String str) {
        b[] a = a(ad);
        if (l.a(a)) {
            return;
        }
        for (b bVar : a) {
            bVar.a(str);
        }
    }

    public static void a(b[] bVarArr, int i) {
        if (l.a(bVarArr)) {
            return;
        }
        for (b bVar : bVarArr) {
            if (bVar != null) {
                bVar.b(i);
            }
        }
    }

    public static void a(b[] bVarArr, int i, int i2, boolean z) {
        if (l.a(bVarArr)) {
            return;
        }
        for (b bVar : bVarArr) {
            if (bVar != null) {
                bVar.a(i, i2, z);
            }
        }
    }

    @Nullable
    public static b[] a(@NonNull Ad ad) {
        if (ad instanceof i) {
            return ((i) ad).a();
        }
        if (ad instanceof c) {
            return new b[]{((c) ad).f()};
        }
        return null;
    }

    @Nullable
    public static b[] a(@NonNull g... gVarArr) {
        if (l.a(gVarArr)) {
            return null;
        }
        b[] bVarArr = new b[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            bVarArr[i] = gVarArr[i].a;
        }
        return bVarArr;
    }
}
