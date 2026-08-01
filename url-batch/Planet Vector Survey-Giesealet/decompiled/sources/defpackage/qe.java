package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qe {
    public static final float[] a;
    public static final float[] b;
    public static final tw0 c;
    public static final tw0 d;
    public static final dl0 e;
    public static final dl0 f;
    public static final dl0 g;
    public static final dl0 h;
    public static final dl0 i;
    public static final dl0 j;
    public static final dl0 k;
    public static final dl0 l;
    public static final dl0 m;
    public static final dl0 n;
    public static final dl0 o;
    public static final dl0 p;
    public static final dl0 q;
    public static final dl0 r;
    public static final u00 s;
    public static final u00 t;
    public static final dl0 u;
    public static final dl0 v;
    public static final dl0 w;
    public static final ta0 x;
    public static final me[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        tw0 tw0Var = new tw0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        tw0 tw0Var2 = new tw0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        tw0 tw0Var3 = new tw0(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = tw0Var3;
        tw0 tw0Var4 = new tw0(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = tw0Var4;
        y01 y01Var = x40.g;
        dl0 dl0Var = new dl0("sRGB IEC61966-2.1", fArr, y01Var, tw0Var, 0);
        e = dl0Var;
        dl0 dl0Var2 = new dl0("sRGB IEC61966-2.1 (Linear)", fArr, y01Var, 1.0d, 0.0f, 1.0f, 1);
        f = dl0Var2;
        dl0 dl0Var3 = new dl0("scRGB-nl IEC 61966-2-2:2003", fArr, y01Var, null, new g8(3), new g8(4), -0.799f, 2.399f, tw0Var, 2);
        g = dl0Var3;
        dl0 dl0Var4 = new dl0("scRGB IEC 61966-2-2:2003", fArr, y01Var, 1.0d, -0.5f, 7.499f, 3);
        h = dl0Var4;
        dl0 dl0Var5 = new dl0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, y01Var, new tw0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = dl0Var5;
        dl0 dl0Var6 = new dl0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, y01Var, new tw0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = dl0Var6;
        dl0 dl0Var7 = new dl0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new y01(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = dl0Var7;
        dl0 dl0Var8 = new dl0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, y01Var, tw0Var, 7);
        l = dl0Var8;
        dl0 dl0Var9 = new dl0("NTSC (1953)", fArr2, x40.d, new tw0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = dl0Var9;
        dl0 dl0Var10 = new dl0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, y01Var, new tw0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = dl0Var10;
        dl0 dl0Var11 = new dl0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, y01Var, 2.2d, 0.0f, 1.0f, 10);
        o = dl0Var11;
        dl0 dl0Var12 = new dl0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, x40.e, new tw0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = dl0Var12;
        y01 y01Var2 = x40.f;
        dl0 dl0Var13 = new dl0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, y01Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = dl0Var13;
        dl0 dl0Var14 = new dl0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, y01Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = dl0Var14;
        u00 u00Var = new u00(14, 1, 12884901889L, "Generic XYZ");
        s = u00Var;
        u00 u00Var2 = new u00(15, 0, 12884901890L, "Generic L*a*b*");
        t = u00Var2;
        dl0 dl0Var15 = new dl0("None", fArr, y01Var, tw0Var2, 16);
        u = dl0Var15;
        dl0 dl0Var16 = new dl0("Hybrid Log Gamma encoding", fArr3, y01Var, null, new g8(5), new g8(6), 0.0f, 1.0f, tw0Var3, 17);
        v = dl0Var16;
        dl0 dl0Var17 = new dl0("Perceptual Quantizer encoding", fArr3, y01Var, null, new g8(7), new g8(8), 0.0f, 1.0f, tw0Var4, 18);
        w = dl0Var17;
        ta0 ta0Var = new ta0("Oklab", 12884901890L, 19);
        x = ta0Var;
        y = new me[]{dl0Var, dl0Var2, dl0Var3, dl0Var4, dl0Var5, dl0Var6, dl0Var7, dl0Var8, dl0Var9, dl0Var10, dl0Var11, dl0Var12, dl0Var13, dl0Var14, u00Var, u00Var2, dl0Var15, dl0Var16, dl0Var17, ta0Var};
    }

    public static double a(tw0 tw0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = tw0Var.b;
        double d6 = tw0Var.c;
        double d7 = tw0Var.d;
        double d8 = tw0Var.e;
        double d9 = tw0Var.f;
        double d10 = d5 * d4;
        return (tw0Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(tw0 tw0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / tw0Var.b;
        double d5 = 1.0d / tw0Var.c;
        double d6 = 1.0d / tw0Var.d;
        double d7 = tw0Var.e;
        double d8 = tw0Var.f;
        double d9 = (d2 * d3) / (tw0Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(tw0 tw0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = tw0Var.b;
        double d6 = tw0Var.d;
        double pow = (Math.pow(d4, d6) * tw0Var.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * tw0Var.f) + tw0Var.e), tw0Var.g) * d3;
    }

    public static double d(tw0 tw0Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -tw0Var.b;
        double d6 = tw0Var.e;
        double d7 = 1.0d / tw0Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-tw0Var.f)) + tw0Var.c), 1.0d / tw0Var.d) * d3;
    }
}
