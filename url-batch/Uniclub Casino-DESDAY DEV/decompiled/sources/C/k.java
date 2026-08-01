package C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends q1.d {
    public static Font b0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int c02 = c0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int c03 = c0(fontStyle, font2.getStyle());
            if (c03 < c02) {
                font = font2;
                c02 = c03;
            }
        }
        return font;
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // q1.d
    public final Typeface i(Context context, B.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (B.h hVar : gVar.f18a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f23f).setWeight(hVar.f20b).setSlant(hVar.f21c ? 1 : 0).setTtcIndex(hVar.f22e).setFontVariationSettings(hVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(b0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // q1.d
    public final Typeface j(Context context, H.k[] kVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = kVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                H.k kVar = kVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f222a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f224c).setSlant(kVar.d ? 1 : 0).setTtcIndex(kVar.f223b).build();
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
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(b0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // q1.d
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // q1.d
    public final H.k o(int i, H.k[] kVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
