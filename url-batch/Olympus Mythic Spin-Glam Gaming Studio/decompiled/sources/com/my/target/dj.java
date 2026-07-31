package com.my.target;

import com.my.target.common.models.LoudnessMetadata;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class dj extends fb {
    private final boolean e;
    private int f;
    private final LoudnessMetadata g;

    private dj(String str, int i, int i2, LoudnessMetadata loudnessMetadata) {
        super(str);
        this.b = i;
        this.c = i2;
        this.e = !this.a.endsWith(".m3u8");
        this.g = loudnessMetadata;
    }

    public static dj a(List list, int i) {
        Iterator it = list.iterator();
        dj djVar = null;
        int i2 = 0;
        while (it.hasNext()) {
            dj djVar2 = (dj) it.next();
            int height = djVar2.getHeight();
            if (djVar == null || ((height <= i && i2 > i) || ((height <= i && height > i2) || (height > i && height < i2)))) {
                djVar = djVar2;
                i2 = height;
            }
        }
        mi.a("VideoData: Accepted videoData quality = " + i2 + "p");
        return djVar;
    }

    public LoudnessMetadata b() {
        return this.g;
    }

    public boolean c() {
        return this.e;
    }

    public static dj a(String str, int i, int i2) {
        return a(str, i, i2, null);
    }

    public static dj a(String str, int i, int i2, LoudnessMetadata loudnessMetadata) {
        return new dj(str, i, i2, loudnessMetadata);
    }

    public void a(int i) {
        this.f = i;
    }
}
