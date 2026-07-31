package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class cc {
    private final int a;
    private final String b;

    private cc() {
        this.a = -1;
        this.b = "none";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static cc a(String str) {
        char c;
        int i = 1;
        str.getClass();
        switch (str.hashCode()) {
            case 3387192:
                if (str.equals("none")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = -1;
                break;
            case 1:
                break;
            case 2:
                i = 0;
                break;
            default:
                return null;
        }
        return new cc(str, i);
    }

    public static cc b() {
        return new cc();
    }

    public String toString() {
        return this.b;
    }

    private cc(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
