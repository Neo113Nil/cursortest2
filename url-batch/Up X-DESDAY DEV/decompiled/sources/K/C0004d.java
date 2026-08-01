package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o0.AbstractC0281a;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004d implements InterfaceC0003c, InterfaceC0005e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    /* renamed from: b, reason: collision with root package name */
    public Object f396b;

    /* renamed from: c, reason: collision with root package name */
    public int f397c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f398e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f399f;

    public /* synthetic */ C0004d() {
        this.f395a = 0;
    }

    @Override // K.InterfaceC0003c
    public void a(Bundle bundle) {
        this.f399f = bundle;
    }

    public void b(x0 x0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((k0) it.next()).f428a.c() & 8) != 0) {
                ((View) this.f398e).setTranslationY(AbstractC0281a.c(this.d, 0, r3.f428a.b()));
                return;
            }
        }
    }

    @Override // K.InterfaceC0003c
    public void c(Uri uri) {
        this.f398e = uri;
    }

    @Override // K.InterfaceC0005e
    public int d() {
        return this.f397c;
    }

    @Override // K.InterfaceC0005e
    public ClipData h() {
        return (ClipData) this.f396b;
    }

    @Override // K.InterfaceC0003c
    public C0006f i() {
        return new C0006f(new C0004d(this));
    }

    @Override // K.InterfaceC0005e
    public int l() {
        return this.d;
    }

    @Override // K.InterfaceC0005e
    public ContentInfo p() {
        return null;
    }

    @Override // K.InterfaceC0003c
    public void r(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.f395a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f396b).getDescription());
                sb.append(", source=");
                int i = this.f397c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f398e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f399f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0004d(View view) {
        this.f395a = 2;
        this.f399f = new int[2];
        this.f398e = view;
    }

    public C0004d(C0004d c0004d) {
        this.f395a = 1;
        ClipData clipData = (ClipData) c0004d.f396b;
        clipData.getClass();
        this.f396b = clipData;
        int i = c0004d.f397c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f397c = i;
            int i2 = c0004d.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.f398e = (Uri) c0004d.f398e;
                this.f399f = (Bundle) c0004d.f399f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
