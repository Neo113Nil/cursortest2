package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v0.AbstractC0341a;

/* renamed from: K.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006e implements InterfaceC0005d, InterfaceC0007f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a;

    /* renamed from: b, reason: collision with root package name */
    public Object f392b;

    /* renamed from: c, reason: collision with root package name */
    public int f393c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f394e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f395f;

    public /* synthetic */ C0006e() {
        this.f391a = 0;
    }

    @Override // K.InterfaceC0005d
    public void a(Bundle bundle) {
        this.f395f = bundle;
    }

    public void b(z0 z0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((m0) it.next()).f427a.c() & 8) != 0) {
                ((View) this.f394e).setTranslationY(AbstractC0341a.c(this.d, 0, r3.f427a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0005d
    public void d(Uri uri) {
        this.f394e = uri;
    }

    @Override // K.InterfaceC0007f
    public int e() {
        return this.f393c;
    }

    @Override // K.InterfaceC0007f
    public ClipData i() {
        return (ClipData) this.f392b;
    }

    @Override // K.InterfaceC0005d
    public C0008g j() {
        return new C0008g(new C0006e(this));
    }

    @Override // K.InterfaceC0007f
    public int m() {
        return this.d;
    }

    @Override // K.InterfaceC0007f
    public ContentInfo r() {
        return null;
    }

    public String toString() {
        String str;
        switch (this.f391a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f392b).getDescription());
                sb.append(", source=");
                int i = this.f393c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f394e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f395f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0005d
    public void u(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0006e(View view) {
        this.f391a = 2;
        this.f395f = new int[2];
        this.f394e = view;
    }

    public C0006e(C0006e c0006e) {
        this.f391a = 1;
        ClipData clipData = (ClipData) c0006e.f392b;
        clipData.getClass();
        this.f392b = clipData;
        int i = c0006e.f393c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f393c = i;
            int i2 = c0006e.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f394e = (Uri) c0006e.f394e;
                this.f395f = (Bundle) c0006e.f395f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
