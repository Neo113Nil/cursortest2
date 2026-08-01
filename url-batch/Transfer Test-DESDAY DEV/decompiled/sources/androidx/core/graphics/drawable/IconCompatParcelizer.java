package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q0.AbstractC0323a;
import q0.C0324b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0323a abstractC0323a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1443a;
        if (abstractC0323a.e(1)) {
            i = ((C0324b) abstractC0323a).f3470e.readInt();
        }
        iconCompat.f1443a = i;
        byte[] bArr = iconCompat.f1445c;
        if (abstractC0323a.e(2)) {
            Parcel parcel = ((C0324b) abstractC0323a).f3470e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1445c = bArr;
        iconCompat.d = abstractC0323a.f(iconCompat.d, 3);
        int i2 = iconCompat.f1446e;
        if (abstractC0323a.e(4)) {
            i2 = ((C0324b) abstractC0323a).f3470e.readInt();
        }
        iconCompat.f1446e = i2;
        int i3 = iconCompat.f1447f;
        if (abstractC0323a.e(5)) {
            i3 = ((C0324b) abstractC0323a).f3470e.readInt();
        }
        iconCompat.f1447f = i3;
        iconCompat.f1448g = (ColorStateList) abstractC0323a.f(iconCompat.f1448g, 6);
        String str = iconCompat.i;
        if (abstractC0323a.e(7)) {
            str = ((C0324b) abstractC0323a).f3470e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1449j;
        if (abstractC0323a.e(8)) {
            str2 = ((C0324b) abstractC0323a).f3470e.readString();
        }
        iconCompat.f1449j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1443a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1444b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1444b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1445c;
                    iconCompat.f1444b = bArr3;
                    iconCompat.f1443a = 3;
                    iconCompat.f1446e = 0;
                    iconCompat.f1447f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1445c, Charset.forName("UTF-16"));
                iconCompat.f1444b = str3;
                if (iconCompat.f1443a == 2 && iconCompat.f1449j == null) {
                    iconCompat.f1449j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1444b = iconCompat.f1445c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0323a abstractC0323a) {
        abstractC0323a.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1443a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1444b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1444b;
                break;
            case 2:
                iconCompat.f1445c = ((String) iconCompat.f1444b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1445c = (byte[]) iconCompat.f1444b;
                break;
            case 4:
            case 6:
                iconCompat.f1445c = iconCompat.f1444b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1443a;
        if (-1 != i) {
            abstractC0323a.h(1);
            ((C0324b) abstractC0323a).f3470e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1445c;
        if (bArr != null) {
            abstractC0323a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0324b) abstractC0323a).f3470e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC0323a.h(3);
            ((C0324b) abstractC0323a).f3470e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1446e;
        if (i2 != 0) {
            abstractC0323a.h(4);
            ((C0324b) abstractC0323a).f3470e.writeInt(i2);
        }
        int i3 = iconCompat.f1447f;
        if (i3 != 0) {
            abstractC0323a.h(5);
            ((C0324b) abstractC0323a).f3470e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1448g;
        if (colorStateList != null) {
            abstractC0323a.h(6);
            ((C0324b) abstractC0323a).f3470e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0323a.h(7);
            ((C0324b) abstractC0323a).f3470e.writeString(str);
        }
        String str2 = iconCompat.f1449j;
        if (str2 != null) {
            abstractC0323a.h(8);
            ((C0324b) abstractC0323a).f3470e.writeString(str2);
        }
    }
}
