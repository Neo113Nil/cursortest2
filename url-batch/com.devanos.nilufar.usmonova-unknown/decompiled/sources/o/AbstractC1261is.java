package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1261is {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1392ks.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i = iconCompat.a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.b;
                    if (i2 >= 28) {
                        str = AbstractC1392ks.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str2 = iconCompat.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.b, false));
                    break;
                } else {
                    createWithBitmap = AbstractC1326js.b((Bitmap) iconCompat.b);
                    break;
                }
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = AbstractC1458ls.a(iconCompat.e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                    }
                    Uri e4 = iconCompat.e();
                    String scheme = e4.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e4);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e4, e5);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException e6) {
                            Log.w("IconCompat", "Unable to load image from path: " + e4, e6);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = AbstractC1326js.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
