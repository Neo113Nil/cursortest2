package o;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: o.Lq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305Lq extends AbstractC0330Mq {
    public static final Object b = new Object();
    public static final C0305Lq c = new C0305Lq();

    public static AlertDialog d(Activity activity, int i, DialogInterfaceOnClickListenerC1999u20 dialogInterfaceOnClickListenerC1999u20, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC1604o20.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_enable_button) : resources.getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_update_button) : resources.getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC1999u20);
        }
        String c2 = AbstractC1604o20.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", AbstractC2188wx.g(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0199Ho) {
                AbstractC0588Wo supportFragmentManager = ((AbstractActivityC0199Ho) activity).getSupportFragmentManager();
                C1566nU c1566nU = new C1566nU();
                AbstractC1473m3.o(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c1566nU.n0 = alertDialog;
                if (onCancelListener != null) {
                    c1566nU.o0 = onCancelListener;
                }
                c1566nU.k0 = false;
                c1566nU.l0 = true;
                supportFragmentManager.getClass();
                Q7 q7 = new Q7(supportFragmentManager);
                q7.f88o = true;
                q7.e(0, c1566nU, str);
                q7.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0039Bk dialogFragmentC0039Bk = new DialogFragmentC0039Bk();
        AbstractC1473m3.o(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0039Bk.h = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0039Bk.i = onCancelListener;
        }
        dialogFragmentC0039Bk.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d = d(googleApiActivity, i, new DialogInterfaceOnClickListenerC1999u20(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d == null) {
            return;
        }
        e(googleApiActivity, d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", AbstractC1888sN.h(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new HandlerC1736q20(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e = i == 6 ? AbstractC1604o20.e(context, "common_google_play_services_resolution_required_title") : AbstractC1604o20.c(context, i);
        if (e == null) {
            e = context.getResources().getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_notification_ticker);
        }
        String d = (i == 6 || i == 19) ? AbstractC1604o20.d(context, "common_google_play_services_resolution_required_text", AbstractC1604o20.a(context)) : AbstractC1604o20.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1473m3.n(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C1091gF c1091gF = new C1091gF(context, null);
        c1091gF.m = true;
        c1091gF.s.flags |= 16;
        c1091gF.e = C1091gF.b(e);
        C0959eF c0959eF = new C0959eF();
        c0959eF.i = C1091gF.b(d);
        c1091gF.d(c0959eF);
        PackageManager packageManager = context.getPackageManager();
        if (EB.w == null) {
            EB.w = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (EB.w.booleanValue()) {
            c1091gF.s.icon = context.getApplicationInfo().icon;
            c1091gF.j = 2;
            if (EB.B(context)) {
                c1091gF.b.add(new C0697aF(resources.getString(com.devanos.nilufar.usmonova.R.string.common_open_on_phone), pendingIntent));
            } else {
                c1091gF.g = pendingIntent;
            }
        } else {
            c1091gF.s.icon = R.drawable.stat_sys_warning;
            c1091gF.s.tickerText = C1091gF.b(resources.getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_notification_ticker));
            c1091gF.s.when = System.currentTimeMillis();
            c1091gF.g = pendingIntent;
            c1091gF.f = C1091gF.b(d);
        }
        if (PX.d0()) {
            if (!PX.d0()) {
                throw new IllegalStateException();
            }
            synchronized (b) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.devanos.nilufar.usmonova.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(K7.D(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c1091gF.q = "com.google.android.gms.availability";
        }
        Notification a = c1091gF.a();
        if (i == 1 || i == 2 || i == 3) {
            AbstractC0434Qq.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a);
    }

    public final void g(Activity activity, InterfaceC0313Lz interfaceC0313Lz, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d = d(activity, i, new DialogInterfaceOnClickListenerC1999u20(super.a(i, activity, "d"), interfaceC0313Lz, 1), onCancelListener);
        if (d == null) {
            return;
        }
        e(activity, d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
