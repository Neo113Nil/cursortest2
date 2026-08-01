package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0277a;
import m0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0277a abstractC0277a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1295a;
        if (abstractC0277a.e(1)) {
            i = ((b) abstractC0277a).f3196e.readInt();
        }
        iconCompat.f1295a = i;
        byte[] bArr = iconCompat.f1297c;
        if (abstractC0277a.e(2)) {
            Parcel parcel = ((b) abstractC0277a).f3196e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1297c = bArr;
        iconCompat.d = abstractC0277a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1298e;
        if (abstractC0277a.e(4)) {
            i2 = ((b) abstractC0277a).f3196e.readInt();
        }
        iconCompat.f1298e = i2;
        int i3 = iconCompat.f1299f;
        if (abstractC0277a.e(5)) {
            i3 = ((b) abstractC0277a).f3196e.readInt();
        }
        iconCompat.f1299f = i3;
        iconCompat.f1300g = (ColorStateList) abstractC0277a.f(iconCompat.f1300g, 6);
        String str = iconCompat.i;
        if (abstractC0277a.e(7)) {
            str = ((b) abstractC0277a).f3196e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1301j;
        if (abstractC0277a.e(8)) {
            str2 = ((b) abstractC0277a).f3196e.readString();
        }
        iconCompat.f1301j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1295a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1296b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1296b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1297c;
                    iconCompat.f1296b = bArr3;
                    iconCompat.f1295a = 3;
                    iconCompat.f1298e = 0;
                    iconCompat.f1299f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1297c, Charset.forName("UTF-16"));
                iconCompat.f1296b = str3;
                if (iconCompat.f1295a == 2 && iconCompat.f1301j == null) {
                    iconCompat.f1301j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1296b = iconCompat.f1297c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0277a abstractC0277a) {
        abstractC0277a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1295a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1296b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1296b;
                break;
            case 2:
                iconCompat.f1297c = ((String) iconCompat.f1296b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1297c = (byte[]) iconCompat.f1296b;
                break;
            case 4:
            case 6:
                iconCompat.f1297c = iconCompat.f1296b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1295a;
        if (-1 != i) {
            abstractC0277a.h(1);
            ((b) abstractC0277a).f3196e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1297c;
        if (bArr != null) {
            abstractC0277a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0277a).f3196e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0277a.h(3);
            ((b) abstractC0277a).f3196e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1298e;
        if (i2 != 0) {
            abstractC0277a.h(4);
            ((b) abstractC0277a).f3196e.writeInt(i2);
        }
        int i3 = iconCompat.f1299f;
        if (i3 != 0) {
            abstractC0277a.h(5);
            ((b) abstractC0277a).f3196e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1300g;
        if (colorStateList != null) {
            abstractC0277a.h(6);
            ((b) abstractC0277a).f3196e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0277a.h(7);
            ((b) abstractC0277a).f3196e.writeString(str);
        }
        String str2 = iconCompat.f1301j;
        if (str2 != null) {
            abstractC0277a.h(8);
            ((b) abstractC0277a).f3196e.writeString(str2);
        }
    }
}
