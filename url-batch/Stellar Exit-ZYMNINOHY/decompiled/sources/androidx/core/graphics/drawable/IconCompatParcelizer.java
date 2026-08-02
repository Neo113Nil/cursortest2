package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q.b;
import q.c;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f417a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f1183e.readInt();
        }
        iconCompat.f417a = i2;
        byte[] bArr = iconCompat.f419c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1183e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f419c = bArr;
        iconCompat.f420d = bVar.f(iconCompat.f420d, 3);
        int i3 = iconCompat.f421e;
        if (bVar.e(4)) {
            i3 = ((c) bVar).f1183e.readInt();
        }
        iconCompat.f421e = i3;
        int i4 = iconCompat.f422f;
        if (bVar.e(5)) {
            i4 = ((c) bVar).f1183e.readInt();
        }
        iconCompat.f422f = i4;
        iconCompat.f423g = (ColorStateList) bVar.f(iconCompat.f423g, 6);
        String str = iconCompat.f425i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1183e.readString();
        }
        iconCompat.f425i = str;
        String str2 = iconCompat.f426j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1183e.readString();
        }
        iconCompat.f426j = str2;
        iconCompat.f424h = PorterDuff.Mode.valueOf(iconCompat.f425i);
        switch (iconCompat.f417a) {
            case -1:
                Parcelable parcelable = iconCompat.f420d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f418b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f420d;
                if (parcelable2 != null) {
                    iconCompat.f418b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f419c;
                    iconCompat.f418b = bArr3;
                    iconCompat.f417a = 3;
                    iconCompat.f421e = 0;
                    iconCompat.f422f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f419c, Charset.forName("UTF-16"));
                iconCompat.f418b = str3;
                if (iconCompat.f417a == 2 && iconCompat.f426j == null) {
                    iconCompat.f426j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f418b = iconCompat.f419c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f425i = iconCompat.f424h.name();
        switch (iconCompat.f417a) {
            case -1:
                iconCompat.f420d = (Parcelable) iconCompat.f418b;
                break;
            case 1:
            case 5:
                iconCompat.f420d = (Parcelable) iconCompat.f418b;
                break;
            case 2:
                iconCompat.f419c = ((String) iconCompat.f418b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f419c = (byte[]) iconCompat.f418b;
                break;
            case 4:
            case 6:
                iconCompat.f419c = iconCompat.f418b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f417a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f1183e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f419c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f1183e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f420d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1183e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f421e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f1183e.writeInt(i3);
        }
        int i4 = iconCompat.f422f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f1183e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f423g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1183e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f425i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1183e.writeString(str);
        }
        String str2 = iconCompat.f426j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1183e.writeString(str2);
        }
    }
}
