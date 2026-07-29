package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: o.ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378ke implements InterfaceC1312je, InterfaceC1444le {
    public final /* synthetic */ int h;
    public Object i;
    public int j;
    public int k;
    public Object l;
    public Cloneable m;

    public /* synthetic */ C1378ke(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1444le
    public int B() {
        return this.k;
    }

    @Override // o.InterfaceC1444le
    public ContentInfo D() {
        return null;
    }

    @Override // o.InterfaceC1312je
    public void I(Uri uri) {
        this.l = uri;
    }

    @Override // o.InterfaceC1312je
    public void U(int i) {
        this.k = i;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.lang.Cloneable] */
    public int a(int i) {
        int i2 = this.j + 1;
        int[] iArr = (int[]) this.i;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            P6.c0(0, 0, 14, iArr, iArr2);
            P6.c0(0, 0, 14, (int[]) this.l, iArr3);
            this.i = iArr2;
            this.l = iArr3;
        }
        int i4 = this.j;
        this.j = i4 + 1;
        int length2 = ((int[]) this.m).length;
        if (this.k >= length2) {
            int i5 = length2 * 2;
            ?? r2 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                r2[i6] = i7;
                i6 = i7;
            }
            P6.c0(0, 0, 14, (int[]) this.m, r2);
            this.m = r2;
        }
        int i8 = this.k;
        int[] iArr4 = (int[]) this.m;
        this.k = iArr4[i8];
        int[] iArr5 = (int[]) this.i;
        iArr5[i4] = i;
        ((int[]) this.l)[i4] = i8;
        iArr4[i8] = i4;
        int i9 = iArr5[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr5[i10] <= i9) {
                break;
            }
            b(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    public void b(int i, int i2) {
        int[] iArr = (int[]) this.i;
        int[] iArr2 = (int[]) this.l;
        int[] iArr3 = (int[]) this.m;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    @Override // o.InterfaceC1312je
    /* renamed from: build */
    public C1510me mo8build() {
        return new C1510me(new C1378ke(this));
    }

    @Override // o.InterfaceC1444le
    public int d() {
        return this.j;
    }

    @Override // o.InterfaceC1444le
    public ClipData f() {
        return (ClipData) this.i;
    }

    @Override // o.InterfaceC1312je
    public void setExtras(Bundle bundle) {
        this.m = bundle;
    }

    public String toString() {
        String str;
        switch (this.h) {
            case 1:
                Uri uri = (Uri) this.l;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.i).getDescription());
                sb.append(", source=");
                int i = this.j;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.k;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1888sN.l(sb, ((Bundle) this.m) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C1378ke(C1378ke c1378ke) {
        this.h = 1;
        ClipData clipData = (ClipData) c1378ke.i;
        clipData.getClass();
        this.i = clipData;
        int i = c1378ke.j;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.j = i;
        int i2 = c1378ke.k;
        if ((i2 & 1) == i2) {
            this.k = i2;
            this.l = (Uri) c1378ke.l;
            this.m = (Bundle) c1378ke.m;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
