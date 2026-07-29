package o;

/* renamed from: o.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640oc {
    public static final float[] a;
    public static final float[] b;
    public static final C2285yO c;
    public static final C2285yO d;
    public static final PF e;
    public static final AbstractC1508mc[] f;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        C1634oW c1634oW = new C1634oW(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1634oW c1634oW2 = new C1634oW(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        H00 h00 = AbstractC0022At.g;
        C2285yO c2285yO = new C2285yO("sRGB IEC61966-2.1", fArr, h00, c1634oW, 0);
        c = c2285yO;
        C2285yO c2285yO2 = new C2285yO("sRGB IEC61966-2.1 (Linear)", fArr, h00, 1.0d, 0.0f, 1.0f, 1);
        C2285yO c2285yO3 = new C2285yO("scRGB-nl IEC 61966-2-2:2003", fArr, h00, null, new C1574nc(0), new C1574nc(1), -0.799f, 2.399f, c1634oW, 2);
        C2285yO c2285yO4 = new C2285yO("scRGB IEC 61966-2-2:2003", fArr, h00, 1.0d, -0.5f, 7.499f, 3);
        C2285yO c2285yO5 = new C2285yO("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, h00, new C1634oW(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        C2285yO c2285yO6 = new C2285yO("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, h00, new C1634oW(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        C2285yO c2285yO7 = new C2285yO("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new H00(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        C2285yO c2285yO8 = new C2285yO("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, h00, c1634oW, 7);
        C2285yO c2285yO9 = new C2285yO("NTSC (1953)", fArr2, AbstractC0022At.d, new C1634oW(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        C2285yO c2285yO10 = new C2285yO("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, h00, new C1634oW(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        C2285yO c2285yO11 = new C2285yO("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, h00, 2.2d, 0.0f, 1.0f, 10);
        C2285yO c2285yO12 = new C2285yO("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC0022At.e, new C1634oW(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        H00 h002 = AbstractC0022At.f;
        C2285yO c2285yO13 = new C2285yO("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, h002, 1.0d, -65504.0f, 65504.0f, 12);
        C2285yO c2285yO14 = new C2285yO("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, h002, 1.0d, -65504.0f, 65504.0f, 13);
        C1530my c1530my = new C1530my(14, 1, AbstractC1310jc.b, "Generic XYZ");
        long j = AbstractC1310jc.c;
        C1530my c1530my2 = new C1530my(15, 0, j, "Generic L*a*b*");
        C2285yO c2285yO15 = new C2285yO("None", fArr, h00, c1634oW2, 16);
        d = c2285yO15;
        PF pf = new PF(j, "Oklab", 17);
        e = pf;
        f = new AbstractC1508mc[]{c2285yO, c2285yO2, c2285yO3, c2285yO4, c2285yO5, c2285yO6, c2285yO7, c2285yO8, c2285yO9, c2285yO10, c2285yO11, c2285yO12, c2285yO13, c2285yO14, c1530my, c1530my2, c2285yO15, pf};
    }
}
