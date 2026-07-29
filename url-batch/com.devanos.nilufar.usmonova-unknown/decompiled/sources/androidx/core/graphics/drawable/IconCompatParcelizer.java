package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o.AbstractC1243iZ;
import o.C1161hJ;
import o.C1307jZ;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1243iZ abstractC1243iZ) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (abstractC1243iZ.e(1)) {
            i = ((C1307jZ) abstractC1243iZ).e.readInt();
        }
        iconCompat.a = i;
        byte[] bArr = iconCompat.c;
        if (abstractC1243iZ.e(2)) {
            Parcel parcel = ((C1307jZ) abstractC1243iZ).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = abstractC1243iZ.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (abstractC1243iZ.e(4)) {
            i2 = ((C1307jZ) abstractC1243iZ).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (abstractC1243iZ.e(5)) {
            i3 = ((C1307jZ) abstractC1243iZ).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) abstractC1243iZ.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (abstractC1243iZ.e(7)) {
            str = ((C1307jZ) abstractC1243iZ).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (abstractC1243iZ.e(8)) {
            str2 = ((C1307jZ) abstractC1243iZ).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1243iZ abstractC1243iZ) {
        abstractC1243iZ.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            abstractC1243iZ.h(1);
            ((C1307jZ) abstractC1243iZ).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC1243iZ.h(2);
            Parcel parcel = ((C1307jZ) abstractC1243iZ).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC1243iZ.h(3);
            ((C1307jZ) abstractC1243iZ).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC1243iZ.h(4);
            ((C1307jZ) abstractC1243iZ).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            abstractC1243iZ.h(5);
            ((C1307jZ) abstractC1243iZ).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC1243iZ.h(6);
            ((C1307jZ) abstractC1243iZ).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC1243iZ.h(7);
            ((C1307jZ) abstractC1243iZ).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC1243iZ.h(8);
            ((C1307jZ) abstractC1243iZ).e.writeString(str2);
        }
    }
}
