package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;

/* renamed from: o.gF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091gF {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public L l;
    public Bundle n;
    public String q;
    public final boolean r;
    public final Notification s;
    public final ArrayList t;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f167o = 0;
    public int p = 0;

    public C1091gF(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
        this.r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        C1334k c1334k = new C1334k(this);
        C1091gF c1091gF = (C1091gF) c1334k.k;
        L l = c1091gF.l;
        if (l != null) {
            l.C0(c1334k);
        }
        Notification.Builder builder = (Notification.Builder) c1334k.j;
        Notification build = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (l != null) {
            c1091gF.l.getClass();
        }
        if (l != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", l.D0());
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void d(L l) {
        if (this.l != l) {
            this.l = l;
            if (((C1091gF) l.h) != this) {
                l.h = this;
                d(l);
            }
        }
    }
}
