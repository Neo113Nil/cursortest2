package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC0270a;
import m0.C0271b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0270a abstractC0270a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1294a;
        if (abstractC0270a.e(1)) {
            i = ((C0271b) abstractC0270a).f3199e.readInt();
        }
        iconCompat.f1294a = i;
        byte[] bArr = iconCompat.f1296c;
        if (abstractC0270a.e(2)) {
            Parcel parcel = ((C0271b) abstractC0270a).f3199e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1296c = bArr;
        iconCompat.d = abstractC0270a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1297e;
        if (abstractC0270a.e(4)) {
            i2 = ((C0271b) abstractC0270a).f3199e.readInt();
        }
        iconCompat.f1297e = i2;
        int i3 = iconCompat.f1298f;
        if (abstractC0270a.e(5)) {
            i3 = ((C0271b) abstractC0270a).f3199e.readInt();
        }
        iconCompat.f1298f = i3;
        iconCompat.f1299g = (ColorStateList) abstractC0270a.f(iconCompat.f1299g, 6);
        String str = iconCompat.i;
        if (abstractC0270a.e(7)) {
            str = ((C0271b) abstractC0270a).f3199e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1300j;
        if (abstractC0270a.e(8)) {
            str2 = ((C0271b) abstractC0270a).f3199e.readString();
        }
        iconCompat.f1300j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1294a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1295b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1295b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1296c;
                    iconCompat.f1295b = bArr3;
                    iconCompat.f1294a = 3;
                    iconCompat.f1297e = 0;
                    iconCompat.f1298f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1296c, Charset.forName("UTF-16"));
                iconCompat.f1295b = str3;
                if (iconCompat.f1294a == 2 && iconCompat.f1300j == null) {
                    iconCompat.f1300j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1295b = iconCompat.f1296c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0270a abstractC0270a) {
        abstractC0270a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1294a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1295b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1295b;
                break;
            case 2:
                iconCompat.f1296c = ((String) iconCompat.f1295b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1296c = (byte[]) iconCompat.f1295b;
                break;
            case 4:
            case 6:
                iconCompat.f1296c = iconCompat.f1295b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1294a;
        if (-1 != i) {
            abstractC0270a.h(1);
            ((C0271b) abstractC0270a).f3199e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1296c;
        if (bArr != null) {
            abstractC0270a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0271b) abstractC0270a).f3199e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0270a.h(3);
            ((C0271b) abstractC0270a).f3199e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1297e;
        if (i2 != 0) {
            abstractC0270a.h(4);
            ((C0271b) abstractC0270a).f3199e.writeInt(i2);
        }
        int i3 = iconCompat.f1298f;
        if (i3 != 0) {
            abstractC0270a.h(5);
            ((C0271b) abstractC0270a).f3199e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1299g;
        if (colorStateList != null) {
            abstractC0270a.h(6);
            ((C0271b) abstractC0270a).f3199e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0270a.h(7);
            ((C0271b) abstractC0270a).f3199e.writeString(str);
        }
        String str2 = iconCompat.f1300j;
        if (str2 != null) {
            abstractC0270a.h(8);
            ((C0271b) abstractC0270a).f3199e.writeString(str2);
        }
    }
}
