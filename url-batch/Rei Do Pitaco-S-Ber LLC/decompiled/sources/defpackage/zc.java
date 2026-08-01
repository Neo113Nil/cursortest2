package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zc implements yc, ad {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public zc(zc zcVar) {
        ClipData clipData = zcVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = zcVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            l8.l("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            l8.l("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = zcVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = zcVar.j;
            this.k = zcVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.yc
    public bd build() {
        return new bd(new zc(this));
    }

    @Override // defpackage.ad
    public ClipData d() {
        return this.g;
    }

    @Override // defpackage.ad
    public int l() {
        return this.i;
    }

    @Override // defpackage.ad
    public ContentInfo m() {
        return null;
    }

    @Override // defpackage.yc
    public void q(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.ad
    public int r() {
        return this.h;
    }

    @Override // defpackage.yc
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    public String toString() {
        String str;
        switch (this.f) {
            case 1:
                Uri uri = this.j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.g.getDescription());
                sb.append(", source=");
                int i = this.h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yc
    public void x(int i) {
        this.i = i;
    }

    public /* synthetic */ zc() {
    }
}
