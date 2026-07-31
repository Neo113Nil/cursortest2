package com.my.target;

import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public final class hk {
    private final b a;
    private final a b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        public final List a;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        /* renamed from: com.my.target.hk$a$a, reason: collision with other inner class name */
        public static final class C1683a {
            public final String a;
            public final int b;
            public final int c;

            public C1683a(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }

            public String toString() {
                return "Frame{url='" + this.a + "', width='" + this.b + "', height='" + this.c + "'}";
            }
        }

        public a(List list) {
            this.a = list;
        }

        public String toString() {
            return "Assets{firstFrame=" + this.a + '}';
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public String toString() {
            return "Text{title='" + this.a + "', body='" + this.b + "', domain='" + this.c + "'}";
        }
    }

    private hk(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public static hk a(b bVar, a aVar) {
        return new hk(bVar, aVar);
    }

    public b b() {
        return this.a;
    }

    public String toString() {
        return "YandexAdInfoExtension{text=" + this.a + ", assets=" + this.b + '}';
    }

    public a a() {
        return this.b;
    }
}
