package yads;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class nf1 implements qk {
    public final um2 a;
    public final int b;

    public nf1(int i, um2 um2Var) {
        this.b = i;
        this.a = um2Var;
    }

    public final qk a(Class cls) {
        i41 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            qk qkVar = (qk) listIterator.next();
            if (qkVar.getClass() == cls) {
                return qkVar;
            }
        }
        return null;
    }

    @Override // yads.qk
    public final int getType() {
        return this.b;
    }

    public static nf1 a(int i, xb2 xb2Var) {
        String str;
        qk e43Var;
        String str2;
        String str3;
        int i2 = 4;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = xb2Var.c;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (xb2Var.c - xb2Var.b > 8) {
            int c = xb2Var.c();
            int c2 = xb2Var.b + xb2Var.c();
            xb2Var.d(c2);
            if (c == 1414744396) {
                e43Var = a(xb2Var.c(), xb2Var);
            } else {
                uk ukVar = null;
                if (c != 1718776947) {
                    if (c == 1751742049) {
                        int c3 = xb2Var.c();
                        xb2Var.e(xb2Var.b + 8);
                        int c4 = xb2Var.c();
                        int c5 = xb2Var.c();
                        xb2Var.e(xb2Var.b + i2);
                        xb2Var.c();
                        xb2Var.e(xb2Var.b + 12);
                        ukVar = new uk(c3, c4, c5);
                    } else if (c == 1752331379) {
                        int c6 = xb2Var.c();
                        xb2Var.e(xb2Var.b + 12);
                        xb2Var.c();
                        int c7 = xb2Var.c();
                        int c8 = xb2Var.c();
                        xb2Var.e(xb2Var.b + i2);
                        int c9 = xb2Var.c();
                        int c10 = xb2Var.c();
                        xb2Var.e(xb2Var.b + 8);
                        e43Var = new vk(c6, c7, c8, c9, c10);
                    } else if (c == 1852994675) {
                        e43Var = new h43(xb2Var.a(xb2Var.c - xb2Var.b, zt.c));
                    }
                    e43Var = ukVar;
                } else if (i5 == 2) {
                    xb2Var.e(xb2Var.b + i2);
                    int c11 = xb2Var.c();
                    int c12 = xb2Var.c();
                    xb2Var.e(xb2Var.b + i2);
                    int c13 = xb2Var.c();
                    switch (c13) {
                        case 808802372:
                        case 877677894:
                        case 1145656883:
                        case 1145656920:
                        case 1482049860:
                        case 1684633208:
                        case 2021026148:
                            str2 = "video/mp4v-es";
                            str3 = str2;
                            break;
                        case 826496577:
                        case 828601953:
                        case 875967048:
                            str2 = "video/avc";
                            str3 = str2;
                            break;
                        case 842289229:
                            str2 = "video/mp42";
                            str3 = str2;
                            break;
                        case 859066445:
                            str2 = "video/mp43";
                            str3 = str2;
                            break;
                        case 1196444237:
                        case 1735420525:
                            str2 = "video/mjpeg";
                            str3 = str2;
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str3 == null) {
                        mf1.a(c13, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                        e43Var = ukVar;
                    } else {
                        iw0 iw0Var = new iw0();
                        iw0Var.p = c11;
                        iw0Var.q = c12;
                        iw0Var.k = str3;
                        e43Var = new e43(new jw0(iw0Var));
                    }
                } else {
                    if (i5 == 1) {
                        int f = xb2Var.f();
                        if (f == 1) {
                            str = "audio/raw";
                        } else if (f == 85) {
                            str = "audio/mpeg";
                        } else if (f == 255) {
                            str = "audio/mp4a-latm";
                        } else if (f != 8192) {
                            str = f != 8193 ? null : "audio/vnd.dts";
                        } else {
                            str = "audio/ac3";
                        }
                        if (str == null) {
                            mf1.a(f, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                        } else {
                            int f2 = xb2Var.f();
                            int c14 = xb2Var.c();
                            xb2Var.e(xb2Var.b + 6);
                            int b = sb3.b(xb2Var.p());
                            int f3 = xb2Var.f();
                            byte[] bArr = new byte[f3];
                            xb2Var.a(bArr, i4, f3);
                            iw0 iw0Var2 = new iw0();
                            iw0Var2.k = str;
                            iw0Var2.x = f2;
                            iw0Var2.y = c14;
                            if ("audio/raw".equals(str) && b != 0) {
                                iw0Var2.z = b;
                            }
                            if ("audio/mp4a-latm".equals(str) && f3 > 0) {
                                iw0Var2.m = l41.a(bArr);
                            }
                            e43Var = new e43(new jw0(iw0Var2));
                        }
                    } else {
                        gh1.d("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + sb3.c(i5));
                    }
                    e43Var = ukVar;
                }
            }
            if (e43Var != null) {
                if (e43Var.getType() == 1752331379) {
                    vk vkVar = (vk) e43Var;
                    int i7 = vkVar.a;
                    if (i7 == 1935960438) {
                        i5 = 2;
                    } else if (i7 == 1935963489) {
                        i5 = 1;
                    } else if (i7 != 1937012852) {
                        gh1.d("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(vkVar.a));
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i8 = i6 + 1;
                if (objArr.length < i8) {
                    objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i8));
                }
                objArr[i6] = e43Var;
                i6 = i8;
            }
            xb2Var.e(c2);
            xb2Var.d(i3);
            i2 = 4;
            i4 = 0;
        }
        return new nf1(i, l41.b(i6, objArr));
    }
}
