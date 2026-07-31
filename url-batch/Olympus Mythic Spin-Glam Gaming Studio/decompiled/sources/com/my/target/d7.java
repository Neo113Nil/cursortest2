package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class d7 {
    public final String a;
    public final String b;
    public final ImageData c;
    public final b d;
    public final th e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final int d;

        public a(String str, String str2, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class b {
        public final ImageData a;
        public final List b;
        public final int c;

        public b(ImageData imageData, List list, int i) {
            this.a = imageData;
            this.b = list;
            this.c = i;
        }
    }

    public d7(String str, String str2, b bVar, th thVar) {
        this(str, str2, null, bVar, thVar);
    }

    public d7(String str, String str2, ImageData imageData, th thVar) {
        this(str, str2, imageData, null, thVar);
    }

    d7(String str, String str2, ImageData imageData, b bVar, th thVar) {
        this.a = str;
        this.b = str2;
        this.c = imageData;
        this.d = bVar;
        this.e = thVar;
    }
}
