package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class GX extends AbstractC2219xO {
    public static Font u(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int v = v(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int v2 = v(fontStyle, font2.getStyle());
            if (v2 < v) {
                font = font2;
                v = v2;
            }
        }
        return font;
    }

    public static int v(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // o.AbstractC2219xO
    public final Typeface f(Context context, C1192ho c1192ho, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C1257io c1257io : c1192ho.a) {
                try {
                    Font build = new Font.Builder(resources, c1257io.f).setWeight(c1257io.b).setSlant(c1257io.c ? 1 : 0).setTtcIndex(c1257io.e).setFontVariationSettings(c1257io.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(u(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // o.AbstractC2219xO
    public final Typeface g(Context context, C1718po[] c1718poArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c1718poArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                C1718po c1718po = c1718poArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c1718po.a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c1718po.c).setSlant(c1718po.d ? 1 : 0).setTtcIndex(c1718po.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(u(build2, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // o.AbstractC2219xO
    public final Typeface h(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o.AbstractC2219xO
    public final Typeface i(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.AbstractC2219xO
    public final C1718po l(C1718po[] c1718poArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
