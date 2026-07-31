package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.X3;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class h {
    private static final String[] a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    private static Set<String> b = new HashSet();

    @VisibleForTesting
    static class a extends AsyncTask<String, Void, Boolean> {
        private final Context a;
        private final InterfaceC1879a b;

        /* renamed from: sg.bigo.ads.core.mraid.h$a$a, reason: collision with other inner class name */
        interface InterfaceC1879a {
            void a();
        }

        public a(@NonNull Context context, @NonNull InterfaceC1879a interfaceC1879a) {
            this.a = context.getApplicationContext();
            this.b = interfaceC1879a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(@NonNull String[] strArr) {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            Throwable th;
            Boolean bool;
            sg.bigo.ads.bo.c<sg.bigo.ads.bt.a> a;
            sg.bigo.ads.bt.a aVar;
            InputStream inputStream;
            File file;
            if (strArr != null && strArr.length != 0) {
                byte b = 0;
                if (strArr[0] != null) {
                    File e = q.e();
                    e.mkdirs();
                    String str = strArr[0];
                    BufferedInputStream bufferedInputStream = null;
                    try {
                        sg.bigo.ads.bs.a aVar2 = new sg.bigo.ads.bs.a(new sg.bigo.ads.bs.d(str), this.a);
                        aVar2.l = sg.bigo.ads.bp.e.a();
                        a = sg.bigo.ads.bo.g.a(aVar2);
                        aVar = a.a;
                    } catch (Exception unused) {
                        fileOutputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    if (aVar != null && (inputStream = aVar.b) != null) {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
                        try {
                            file = new File(e, a(str, a.a.c));
                            fileOutputStream2 = new FileOutputStream(file);
                        } catch (Exception unused2) {
                            fileOutputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = null;
                            bufferedInputStream = bufferedInputStream2;
                            a(bufferedInputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                        try {
                            a(bufferedInputStream2, fileOutputStream2);
                            b bVar = new b(file.toString(), b);
                            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.a, bVar);
                            bVar.c = mediaScannerConnection;
                            mediaScannerConnection.connect();
                            bool = Boolean.TRUE;
                            a(bufferedInputStream2);
                        } catch (Exception unused3) {
                            bufferedInputStream = bufferedInputStream2;
                            try {
                                bool = Boolean.FALSE;
                                a(bufferedInputStream);
                                a(fileOutputStream2);
                                return bool;
                            } catch (Throwable th4) {
                                th = th4;
                                Throwable th5 = th;
                                fileOutputStream = fileOutputStream2;
                                th = th5;
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedInputStream = bufferedInputStream2;
                            Throwable th52 = th;
                            fileOutputStream = fileOutputStream2;
                            th = th52;
                            a(bufferedInputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                        a(fileOutputStream2);
                        return bool;
                    }
                    Boolean bool2 = Boolean.FALSE;
                    a((Closeable) null);
                    a((Closeable) null);
                    return bool2;
                }
            }
            return Boolean.FALSE;
        }

        @Nullable
        private static String a(@NonNull String str, @Nullable sg.bigo.ads.common.utils.i<List<String>> iVar) {
            if (iVar == null) {
                return null;
            }
            String name = new File(String.valueOf(str.hashCode())).getName();
            List<String> a = iVar.a("content-type");
            if (a == null || a.isEmpty()) {
                return name;
            }
            if (a.get(0) == null) {
                return name;
            }
            for (String str2 : a.get(0).split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }

        private static void a(Closeable closeable) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (Exception unused) {
                sg.bigo.ads.bn.a.a(0, "MraidBridge", "Unable to close stream. Ignoring.");
            }
        }

        private static void a(InputStream inputStream, OutputStream outputStream) {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null || !bool2.booleanValue()) {
                this.b.a();
            }
        }
    }

    static class b implements MediaScannerConnection.MediaScannerConnectionClient {
        private final String a;
        private final String b;
        private MediaScannerConnection c;

        private b(String str) {
            this.a = str;
            this.b = null;
        }

        /* synthetic */ b(String str, byte b) {
            this(str);
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.a, this.b);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    interface c {
        void a(d dVar);
    }

    private static Date a(String str) {
        Date date = null;
        for (String str2 : a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    static void a(Context context, Map<String, String> map) {
        String str;
        if (!d(context)) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "unsupported action createCalendarEvent for devices pre-ICS");
            throw new d("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        }
        try {
            HashMap hashMap = new HashMap();
            if (!map.containsKey("description") || !map.containsKey("start")) {
                throw new IllegalArgumentException("Missing start and description fields");
            }
            hashMap.put("title", map.get("description"));
            if (!map.containsKey("start") || map.get("start") == null) {
                throw new IllegalArgumentException("Invalid calendar event: start is null.");
            }
            Date a2 = a(map.get("start"));
            if (a2 == null) {
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            hashMap.put("beginTime", Long.valueOf(a2.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date a3 = a(map.get("end"));
                if (a3 == null) {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
                hashMap.put("endTime", Long.valueOf(a3.getTime()));
            }
            if (map.containsKey("location")) {
                hashMap.put("eventLocation", map.get("location"));
            }
            if (map.containsKey("summary")) {
                hashMap.put("description", map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                hashMap.put("availability", Integer.valueOf(map.get("transparency").equals(X3.i.T) ? 1 : 0));
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                if ("daily".equals(str2)) {
                    sb.append("FREQ=DAILY;");
                    if (parseInt != -1) {
                        str = "INTERVAL=" + parseInt + ";";
                        sb.append(str);
                    }
                } else if ("weekly".equals(str2)) {
                    sb.append("FREQ=WEEKLY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                    if (map.containsKey("daysInWeek")) {
                        String b2 = b(map.get("daysInWeek"));
                        if (b2 == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        str = "BYDAY=" + b2 + ";";
                        sb.append(str);
                    }
                } else {
                    if (!"monthly".equals(str2)) {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                    sb.append("FREQ=MONTHLY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                    if (map.containsKey("daysInMonth")) {
                        String c2 = c(map.get("daysInMonth"));
                        if (c2 == null) {
                            throw new IllegalArgumentException();
                        }
                        str = "BYMONTHDAY=" + c2 + ";";
                        sb.append(str);
                    }
                }
            }
            hashMap.put("rrule", sb.toString());
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (String str3 : hashMap.keySet()) {
                Object obj = hashMap.get(str3);
                if (obj instanceof Long) {
                    type.putExtra(str3, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str3, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str3, (String) obj);
                }
            }
            type.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, type);
        } catch (ActivityNotFoundException unused) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "no calendar app installed");
            throw new d("Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "create calendar: invalid parameters " + e.getMessage());
            throw new d(e);
        } catch (Exception e2) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "could not create calendar event");
            throw new d(e2);
        }
    }

    private static <P> void a(@NonNull final AsyncTask<P, ?, ?> asyncTask, @Nullable final P... pArr) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.bigo.ads.core.mraid.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
                }
            });
        }
    }

    static boolean a(@NonNull Activity activity) {
        return (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    static boolean a(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(context, intent);
    }

    private static boolean a(@NonNull Context context, @NonNull Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    private static boolean a(@NonNull Context context, @NonNull String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private static String b(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(StringUtils.COMMA);
        for (String str3 : split) {
            int parseInt = Integer.parseInt(str3);
            if (parseInt == 7) {
                parseInt = 0;
            }
            if (!zArr[parseInt]) {
                StringBuilder sb2 = new StringBuilder();
                switch (parseInt) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week ".concat(String.valueOf(parseInt)));
                }
                sb2.append(str2);
                sb2.append(StringUtils.COMMA);
                sb.append(sb2.toString());
                zArr[parseInt] = true;
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    static boolean b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(context, intent);
    }

    private static String c(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(StringUtils.COMMA);
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            int i = parseInt + 31;
            if (!zArr[i]) {
                StringBuilder sb2 = new StringBuilder();
                if (parseInt == 0 || parseInt < -31 || parseInt > 31) {
                    throw new IllegalArgumentException("invalid day of month ".concat(String.valueOf(parseInt)));
                }
                sb2.append(String.valueOf(parseInt));
                sb2.append(StringUtils.COMMA);
                sb.append(sb2.toString());
                zArr[i] = true;
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static boolean c(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    static boolean d(Context context) {
        return a(context, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    final void a(final Context context, String str, final c cVar) {
        if (b.contains(str)) {
            return;
        }
        b.add(str);
        a(new a(context, new a.InterfaceC1879a() { // from class: sg.bigo.ads.core.mraid.h.1
            @Override // sg.bigo.ads.core.mraid.h.a.InterfaceC1879a
            public final void a() {
                Toast.makeText(context, "Image failed to download.", 0).show();
                sg.bigo.ads.bn.a.a(0, "MraidBridge", "Error downloading and saving image file.");
                cVar.a(new d("Error downloading and saving image file."));
            }
        }), str);
    }
}
