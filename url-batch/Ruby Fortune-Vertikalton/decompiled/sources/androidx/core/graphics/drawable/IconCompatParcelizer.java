package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0276a;
import m0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0276a abstractC0276a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1289a;
        if (abstractC0276a.e(1)) {
            i = ((b) abstractC0276a).f3190e.readInt();
        }
        iconCompat.f1289a = i;
        byte[] bArr = iconCompat.f1291c;
        if (abstractC0276a.e(2)) {
            Parcel parcel = ((b) abstractC0276a).f3190e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1291c = bArr;
        iconCompat.d = abstractC0276a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1292e;
        if (abstractC0276a.e(4)) {
            i2 = ((b) abstractC0276a).f3190e.readInt();
        }
        iconCompat.f1292e = i2;
        int i3 = iconCompat.f1293f;
        if (abstractC0276a.e(5)) {
            i3 = ((b) abstractC0276a).f3190e.readInt();
        }
        iconCompat.f1293f = i3;
        iconCompat.f1294g = (ColorStateList) abstractC0276a.f(iconCompat.f1294g, 6);
        String str = iconCompat.i;
        if (abstractC0276a.e(7)) {
            str = ((b) abstractC0276a).f3190e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1295j;
        if (abstractC0276a.e(8)) {
            str2 = ((b) abstractC0276a).f3190e.readString();
        }
        iconCompat.f1295j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1289a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1290b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1290b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1291c;
                    iconCompat.f1290b = bArr3;
                    iconCompat.f1289a = 3;
                    iconCompat.f1292e = 0;
                    iconCompat.f1293f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1291c, Charset.forName("UTF-16"));
                iconCompat.f1290b = str3;
                if (iconCompat.f1289a == 2 && iconCompat.f1295j == null) {
                    iconCompat.f1295j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1290b = iconCompat.f1291c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0276a abstractC0276a) {
        abstractC0276a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1289a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1290b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1290b;
                break;
            case 2:
                iconCompat.f1291c = ((String) iconCompat.f1290b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1291c = (byte[]) iconCompat.f1290b;
                break;
            case 4:
            case 6:
                iconCompat.f1291c = iconCompat.f1290b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1289a;
        if (-1 != i) {
            abstractC0276a.h(1);
            ((b) abstractC0276a).f3190e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1291c;
        if (bArr != null) {
            abstractC0276a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0276a).f3190e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0276a.h(3);
            ((b) abstractC0276a).f3190e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1292e;
        if (i2 != 0) {
            abstractC0276a.h(4);
            ((b) abstractC0276a).f3190e.writeInt(i2);
        }
        int i3 = iconCompat.f1293f;
        if (i3 != 0) {
            abstractC0276a.h(5);
            ((b) abstractC0276a).f3190e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1294g;
        if (colorStateList != null) {
            abstractC0276a.h(6);
            ((b) abstractC0276a).f3190e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0276a.h(7);
            ((b) abstractC0276a).f3190e.writeString(str);
        }
        String str2 = iconCompat.f1295j;
        if (str2 != null) {
            abstractC0276a.h(8);
            ((b) abstractC0276a).f3190e.writeString(str2);
        }
    }
}
