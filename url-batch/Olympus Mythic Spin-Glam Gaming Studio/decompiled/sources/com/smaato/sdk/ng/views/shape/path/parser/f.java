package com.smaato.sdk.ng.views.shape.path.parser;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* loaded from: classes6.dex */
class f {
    private static final String a = SvgToPath.n;

    public static Path a(String str) {
        char c;
        int i;
        char c2;
        float f;
        Path path;
        RectF rectF;
        float f2;
        float f3;
        String str2 = str;
        int length = str.length();
        e eVar = new e(str2);
        eVar.f();
        Path path2 = new Path();
        RectF rectF2 = new RectF();
        float f4 = 0.0f;
        char c3 = 'x';
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (true) {
            int i2 = eVar.c;
            if (i2 >= length) {
                return path2;
            }
            char charAt = str2.charAt(i2);
            if (Character.isDigit(charAt) || charAt == '.' || charAt == '-') {
                if (c3 == 'M') {
                    c3 = 'L';
                } else if (c3 == 'm') {
                    c = 'l';
                }
                c = c3;
            } else {
                eVar.a();
                c = charAt;
            }
            boolean z = true;
            path2.computeBounds(rectF2, true);
            switch (c) {
                case 'A':
                case 'a':
                    float b = eVar.b();
                    float b2 = eVar.b();
                    float b3 = eVar.b();
                    int b4 = (int) eVar.b();
                    int b5 = (int) eVar.b();
                    float b6 = eVar.b();
                    float b7 = eVar.b();
                    if (c == 'a') {
                        b6 += f5;
                        b7 += f6;
                    }
                    i = length;
                    float f11 = b7;
                    float f12 = b6;
                    c2 = c;
                    f = 0.0f;
                    path = path2;
                    rectF = rectF2;
                    a(path2, f5, f6, f12, f11, b, b2, b3, b4 == 1, b5 == 1);
                    f6 = f11;
                    z = false;
                    f5 = f12;
                    break;
                case 'C':
                case 'c':
                    float b8 = eVar.b();
                    float b9 = eVar.b();
                    float b10 = eVar.b();
                    float b11 = eVar.b();
                    float b12 = eVar.b();
                    float b13 = eVar.b();
                    if (c == 'c') {
                        b8 += f5;
                        b10 += f5;
                        b12 += f5;
                        b9 += f6;
                        b11 += f6;
                        b13 += f6;
                    }
                    f9 = b10;
                    f10 = b11;
                    float f13 = b13;
                    float f14 = b12;
                    path2.cubicTo(b8, b9, f9, f10, f14, f13);
                    i = length;
                    f5 = f14;
                    f6 = f13;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    f = 0.0f;
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                case 'h':
                    float b14 = eVar.b();
                    if (c == 'h') {
                        path2.rLineTo(b14, f4);
                        f5 += b14;
                        i = length;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                        break;
                    } else {
                        path2.lineTo(b14, f6);
                        i = length;
                        f5 = b14;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                    }
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                case 'l':
                    float b15 = eVar.b();
                    float b16 = eVar.b();
                    if (c == 'l') {
                        path2.rLineTo(b15, b16);
                        f5 += b15;
                        f6 += b16;
                        i = length;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                        break;
                    } else {
                        path2.lineTo(b15, b16);
                        i = length;
                        f5 = b15;
                        f6 = b16;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                    }
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                case 'm':
                    float b17 = eVar.b();
                    float b18 = eVar.b();
                    if (c == 'm') {
                        path2.rMoveTo(b17, b18);
                        f5 += b17;
                        f6 += b18;
                    } else {
                        path2.moveTo(b17, b18);
                        f5 = b17;
                        f6 = b18;
                    }
                    i = length;
                    f7 = f5;
                    f8 = f6;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    z = false;
                    break;
                case 'Q':
                case 'q':
                    float b19 = eVar.b();
                    float b20 = eVar.b();
                    float b21 = eVar.b();
                    float b22 = eVar.b();
                    if (c == 'q') {
                        b21 += f5;
                        b22 += f6;
                        b19 += f5;
                        b20 += f6;
                    }
                    f9 = b19;
                    f10 = b20;
                    f2 = b21;
                    f3 = b22;
                    path2.cubicTo(f5, f6, f9, f10, f2, f3);
                    i = length;
                    f5 = f2;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    f6 = f3;
                    break;
                case 'S':
                case 's':
                    float b23 = eVar.b();
                    float b24 = eVar.b();
                    float b25 = eVar.b();
                    float b26 = eVar.b();
                    if (c == 's') {
                        b23 += f5;
                        b25 += f5;
                        b24 += f6;
                        b26 += f6;
                    }
                    float f15 = b23;
                    float f16 = b24;
                    float f17 = b25;
                    float f18 = b26;
                    path2.cubicTo((f5 * 2.0f) - f9, (f6 * 2.0f) - f10, f15, f16, f17, f18);
                    i = length;
                    f9 = f15;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    f10 = f16;
                    f5 = f17;
                    f6 = f18;
                    break;
                case 'T':
                case 't':
                    float b27 = eVar.b();
                    float b28 = eVar.b();
                    if (c == 't') {
                        b27 += f5;
                        b28 += f6;
                    }
                    f2 = b27;
                    f3 = b28;
                    f9 = (f5 * 2.0f) - f9;
                    f10 = (2.0f * f6) - f10;
                    path2.cubicTo(f5, f6, f9, f10, f2, f3);
                    i = length;
                    f5 = f2;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    f6 = f3;
                    break;
                case 'V':
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    float b29 = eVar.b();
                    if (c == 'v') {
                        path2.rLineTo(f4, b29);
                        f6 += b29;
                        i = length;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                        break;
                    } else {
                        path2.lineTo(f5, b29);
                        i = length;
                        f6 = b29;
                        f = f4;
                        c2 = c;
                        path = path2;
                        rectF = rectF2;
                        z = false;
                    }
                case 'Z':
                case INVALID_ADS_ENDPOINT_VALUE:
                    path2.close();
                    i = length;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    f5 = f7;
                    f6 = f8;
                    z = false;
                    break;
                default:
                    Log.w(a, "Invalid path command: " + c);
                    eVar.a();
                    i = length;
                    f = f4;
                    c2 = c;
                    path = path2;
                    rectF = rectF2;
                    z = false;
                    break;
            }
            if (!z) {
                f9 = f5;
                f10 = f6;
            }
            eVar.f();
            str2 = str;
            f4 = f;
            length = i;
            c3 = c2;
            path2 = path;
            rectF2 = rectF;
        }
    }

    private static void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9 = (d - d3) / 2.0d;
        double d10 = (d2 - d4) / 2.0d;
        double radians = Math.toRadians(d7 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = (cos * d9) + (sin * d10);
        double d12 = ((-sin) * d9) + (d10 * cos);
        double abs = Math.abs(d5);
        double abs2 = Math.abs(d6);
        double d13 = abs * abs;
        double d14 = abs2 * abs2;
        double d15 = d11 * d11;
        double d16 = d12 * d12;
        double d17 = (d15 / d13) + (d16 / d14);
        if (d17 > 1.0d) {
            abs *= Math.sqrt(d17);
            abs2 *= Math.sqrt(d17);
            d13 = abs * abs;
            d14 = abs2 * abs2;
        }
        double d18 = z == z2 ? -1.0d : 1.0d;
        double d19 = d13 * d14;
        double d20 = d13 * d16;
        double d21 = d14 * d15;
        double d22 = ((d19 - d20) - d21) / (d20 + d21);
        if (d22 < 0.0d) {
            d22 = 0.0d;
        }
        double sqrt = d18 * Math.sqrt(d22);
        double d23 = ((abs * d12) / abs2) * sqrt;
        double d24 = sqrt * (-((abs2 * d11) / abs));
        double d25 = ((d + d3) / 2.0d) + ((cos * d23) - (sin * d24));
        double d26 = ((d2 + d4) / 2.0d) + (sin * d23) + (cos * d24);
        double d27 = (d11 - d23) / abs;
        double d28 = (d12 - d24) / abs2;
        double d29 = ((-d11) - d23) / abs;
        double d30 = ((-d12) - d24) / abs2;
        double d31 = (d27 * d27) + (d28 * d28);
        double degrees = Math.toDegrees((d28 < 0.0d ? -1.0d : 1.0d) * Math.acos(d27 / Math.sqrt(d31)));
        double degrees2 = Math.toDegrees(((d27 * d30) - (d28 * d29) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d27 * d29) + (d28 * d30)) / Math.sqrt(d31 * ((d29 * d29) + (d30 * d30)))));
        if (z2 || degrees2 <= 0.0d) {
            d8 = 360.0d;
            if (z2 && degrees2 < 0.0d) {
                degrees2 += 360.0d;
            }
        } else {
            d8 = 360.0d;
            degrees2 -= 360.0d;
        }
        path.addArc(new RectF((float) (d25 - abs), (float) (d26 - abs2), (float) (d25 + abs), (float) (d26 + abs2)), (float) (degrees % d8), (float) (degrees2 % d8));
    }
}
