package o;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: o.dF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894dF extends L {
    public IconCompat i;
    public IconCompat j;
    public boolean k;

    @Override // o.L
    public final void C0(C1334k c1334k) {
        Bitmap a;
        Notification.Builder builder = (Notification.Builder) c1334k.j;
        Context context = (Context) c1334k.i;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.i;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0828cF.a(bigContentTitle, AbstractC1261is.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.i;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a);
            }
        }
        if (this.k) {
            IconCompat iconCompat3 = this.j;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0763bF.a(bigContentTitle, AbstractC1261is.c(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0828cF.c(bigContentTitle, false);
            AbstractC0828cF.b(bigContentTitle, null);
        }
    }

    @Override // o.L
    public final String D0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
