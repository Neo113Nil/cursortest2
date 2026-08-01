package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class iw implements ww, a10 {
    public static iw g;
    public final /* synthetic */ int f;

    public iw(View view, int i) {
        this.f = i;
        switch (i) {
            case 13:
                if (Build.VERSION.SDK_INT < 30) {
                    new iw(view, 12);
                    break;
                } else {
                    new m20(view, 12);
                    break;
                }
        }
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = z60.a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = z60.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static ArrayList d(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bx) obj) != bx.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(wa.Y(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((bx) obj2).f);
        }
        return arrayList2;
    }

    public static byte[] e(List list) {
        list.getClass();
        m8 m8Var = new m8();
        ArrayList d = d(list);
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            String str = (String) obj;
            m8Var.w(str.length());
            m8Var.A(str);
        }
        return m8Var.q(m8Var.g);
    }

    public static Path f(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static boolean g() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // defpackage.ww
    public void b() {
        switch (this.f) {
            case 3:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.ww
    public void c(int i, Object obj) {
        String str;
        switch (this.f) {
            case 3:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public boolean h(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 14:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ iw(int i) {
        this.f = i;
    }

    private final void i() {
    }

    private final void j(int i, Object obj) {
    }

    @Override // defpackage.a10
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.a10
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
