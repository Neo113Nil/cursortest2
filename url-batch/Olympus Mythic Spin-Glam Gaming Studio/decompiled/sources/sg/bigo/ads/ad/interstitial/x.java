package sg.bigo.ads.ad.interstitial;

/* loaded from: classes14.dex */
public final class x {
    public boolean a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int o;
    public int p;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 0;
    public int n = 0;

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 10;
        }
        return 5;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 3 ? 5 : 10;
        }
        return 3;
    }
}
