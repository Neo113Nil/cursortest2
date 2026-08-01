package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q0.AbstractC0334a;
import q0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0334a abstractC0334a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1828a;
        if (abstractC0334a.e(1)) {
            i = ((b) abstractC0334a).f3855e.readInt();
        }
        iconCompat.f1828a = i;
        byte[] bArr = iconCompat.f1830c;
        if (abstractC0334a.e(2)) {
            Parcel parcel = ((b) abstractC0334a).f3855e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1830c = bArr;
        iconCompat.d = abstractC0334a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1831e;
        if (abstractC0334a.e(4)) {
            i2 = ((b) abstractC0334a).f3855e.readInt();
        }
        iconCompat.f1831e = i2;
        int i3 = iconCompat.f1832f;
        if (abstractC0334a.e(5)) {
            i3 = ((b) abstractC0334a).f3855e.readInt();
        }
        iconCompat.f1832f = i3;
        iconCompat.f1833g = (ColorStateList) abstractC0334a.f(iconCompat.f1833g, 6);
        String str = iconCompat.i;
        if (abstractC0334a.e(7)) {
            str = ((b) abstractC0334a).f3855e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1834j;
        if (abstractC0334a.e(8)) {
            str2 = ((b) abstractC0334a).f3855e.readString();
        }
        iconCompat.f1834j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1828a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1829b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1829b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1830c;
                    iconCompat.f1829b = bArr3;
                    iconCompat.f1828a = 3;
                    iconCompat.f1831e = 0;
                    iconCompat.f1832f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1830c, Charset.forName("UTF-16"));
                iconCompat.f1829b = str3;
                if (iconCompat.f1828a == 2 && iconCompat.f1834j == null) {
                    iconCompat.f1834j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1829b = iconCompat.f1830c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0334a abstractC0334a) {
        abstractC0334a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1828a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1829b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1829b;
                break;
            case 2:
                iconCompat.f1830c = ((String) iconCompat.f1829b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1830c = (byte[]) iconCompat.f1829b;
                break;
            case 4:
            case 6:
                iconCompat.f1830c = iconCompat.f1829b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1828a;
        if (-1 != i) {
            abstractC0334a.h(1);
            ((b) abstractC0334a).f3855e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1830c;
        if (bArr != null) {
            abstractC0334a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0334a).f3855e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0334a.h(3);
            ((b) abstractC0334a).f3855e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1831e;
        if (i2 != 0) {
            abstractC0334a.h(4);
            ((b) abstractC0334a).f3855e.writeInt(i2);
        }
        int i3 = iconCompat.f1832f;
        if (i3 != 0) {
            abstractC0334a.h(5);
            ((b) abstractC0334a).f3855e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1833g;
        if (colorStateList != null) {
            abstractC0334a.h(6);
            ((b) abstractC0334a).f3855e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0334a.h(7);
            ((b) abstractC0334a).f3855e.writeString(str);
        }
        String str2 = iconCompat.f1834j;
        if (str2 != null) {
            abstractC0334a.h(8);
            ((b) abstractC0334a).f3855e.writeString(str2);
        }
    }
}
