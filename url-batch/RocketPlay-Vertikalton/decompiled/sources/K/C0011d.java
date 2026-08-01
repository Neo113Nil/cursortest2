package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t0.AbstractC0369a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011d implements InterfaceC0009c, InterfaceC0012e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f653a;

    /* renamed from: b, reason: collision with root package name */
    public Object f654b;

    /* renamed from: c, reason: collision with root package name */
    public int f655c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f656e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f657f;

    public /* synthetic */ C0011d() {
        this.f653a = 0;
    }

    @Override // K.InterfaceC0009c
    public void a(Bundle bundle) {
        this.f657f = bundle;
    }

    public void b(z0 z0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((m0) it.next()).f689a.c() & 8) != 0) {
                ((View) this.f656e).setTranslationY(AbstractC0369a.c(this.d, 0, r3.f689a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0009c
    public void c(Uri uri) {
        this.f656e = uri;
    }

    @Override // K.InterfaceC0012e
    public int d() {
        return this.f655c;
    }

    @Override // K.InterfaceC0012e
    public ClipData g() {
        return (ClipData) this.f654b;
    }

    @Override // K.InterfaceC0009c
    public C0013f h() {
        return new C0013f(new C0011d(this));
    }

    @Override // K.InterfaceC0012e
    public int l() {
        return this.d;
    }

    @Override // K.InterfaceC0012e
    public ContentInfo n() {
        return null;
    }

    @Override // K.InterfaceC0009c
    public void p(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f653a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f654b).getDescription());
                sb.append(", source=");
                int i = this.f655c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f656e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f657f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0011d(View view) {
        this.f653a = 2;
        this.f657f = new int[2];
        this.f656e = view;
    }

    public C0011d(C0011d c0011d) {
        this.f653a = 1;
        ClipData clipData = (ClipData) c0011d.f654b;
        clipData.getClass();
        this.f654b = clipData;
        int i = c0011d.f655c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f655c = i;
            int i2 = c0011d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f656e = (Uri) c0011d.f656e;
                this.f657f = (Bundle) c0011d.f657f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
