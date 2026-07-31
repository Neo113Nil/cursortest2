package com.sglib.easymobile.androidnative;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.loader.content.CursorLoader;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class AppUtil {
    public static ArrayList<AppLifecycleCallbacks> appLifecycleCallbacks = new ArrayList<>();
    private static boolean sIsAppFocus = true;

    public interface AppLifecycleCallbacks {
        void OnApplicationFocus(boolean z);

        void OnApplicationPause(boolean z);

        void OnApplicationQuit();
    }

    public static void OnApplicationFocus(boolean z) {
        if (z) {
            sIsAppFocus = true;
        }
        Iterator<AppLifecycleCallbacks> it = appLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().OnApplicationFocus(z);
            } catch (Exception e) {
                Helper.LogError("Exception invoking callback.", e);
            }
        }
    }

    public static void OnApplicationPause(boolean z) {
        if (z) {
            sIsAppFocus = false;
        }
        Iterator<AppLifecycleCallbacks> it = appLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().OnApplicationPause(z);
            } catch (Exception e) {
                Helper.LogError("Exception invoking callback.", e);
            }
        }
    }

    public static void OnApplicationQuit() {
        sIsAppFocus = false;
        Iterator<AppLifecycleCallbacks> it = appLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            try {
                it.next().OnApplicationQuit();
            } catch (Exception e) {
                Helper.LogError("Exception invoking callback.", e);
            }
        }
    }

    public static boolean IsAppInForeground() {
        return sIsAppFocus && IsAppRunning();
    }

    public static boolean IsAppRunning() {
        return UnityPlayer.currentActivity != null;
    }

    public static void AddAppLifecycleListener(AppLifecycleCallbacks appLifecycleCallbacks2) {
        if (appLifecycleCallbacks.contains(appLifecycleCallbacks2)) {
            return;
        }
        appLifecycleCallbacks.add(appLifecycleCallbacks2);
    }

    public static void RemoveAppLifecycleListener(AppLifecycleCallbacks appLifecycleCallbacks2) {
        appLifecycleCallbacks.remove(appLifecycleCallbacks2);
    }

    public static String GetApplicationName(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }

    public static String GetRealPathFromURI(Uri uri) {
        Cursor loadInBackground = new CursorLoader(UnityPlayer.currentActivity, uri, new String[]{"_data"}, null, null, null).loadInBackground();
        int columnIndexOrThrow = loadInBackground.getColumnIndexOrThrow("_data");
        loadInBackground.moveToFirst();
        String string = loadInBackground.getString(columnIndexOrThrow);
        loadInBackground.close();
        return string;
    }
}
