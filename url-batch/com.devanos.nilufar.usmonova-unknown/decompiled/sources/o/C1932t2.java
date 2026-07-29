package o;

import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ServiceStarter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1932t2 implements Deferred.DeferredHandler, InterfaceC0821c8, InterfaceC2357zU {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C1932t2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public C1967ta a(C0950e6 c0950e6) {
        C2033ua c2033ua = (C2033ua) this.i;
        URL url = (URL) c0950e6.i;
        String B = AbstractC0868ct.B("CctTransportBackend");
        if (Log.isLoggable(B, 4)) {
            Log.i(B, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c2033ua.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c0950e6.k;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c2033ua.a.encode((C1806r7) c0950e6.j, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String B2 = AbstractC0868ct.B("CctTransportBackend");
                    if (Log.isLoggable(B2, 4)) {
                        Log.i(B2, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC0868ct.q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0868ct.q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C1967ta(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C1967ta(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C1967ta c1967ta = new C1967ta(responseCode, null, C2334z7.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c1967ta;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            AbstractC0868ct.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C1967ta(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            AbstractC0868ct.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C1967ta(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            AbstractC0868ct.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C1967ta(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (IOException e4) {
            e = e4;
            AbstractC0868ct.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C1967ta(400, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void b() {
        InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) this.i;
        synchronized (AbstractC2025uS.b) {
            AbstractC2025uS.g = AbstractC0720ac.x0(AbstractC2025uS.g, interfaceC2312yp);
        }
    }

    public boolean c(C1590ns c1590ns, int i, Bundle bundle) {
        InterfaceC1312je interfaceC1312je;
        C1541n5 c1541n5 = (C1541n5) this.i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC0514Ts) c1590ns.i).g();
                Parcelable parcelable = (Parcelable) ((InterfaceC0514Ts) c1590ns.i).c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InterfaceC0514Ts interfaceC0514Ts = (InterfaceC0514Ts) c1590ns.i;
        ClipData clipData = new ClipData(interfaceC0514Ts.b(), new ClipData.Item(interfaceC0514Ts.e()));
        if (i2 >= 31) {
            interfaceC1312je = new Y1(clipData, 2);
        } else {
            C1378ke c1378ke = new C1378ke(0);
            c1378ke.i = clipData;
            c1378ke.j = 2;
            interfaceC1312je = c1378ke;
        }
        interfaceC1312je.I(interfaceC0514Ts.h());
        interfaceC1312je.setExtras(bundle);
        return AZ.f(c1541n5, interfaceC1312je.mo8build()) == null;
    }

    @Override // o.InterfaceC2357zU
    public Object execute() {
        SQLiteDatabase b;
        int i = this.h;
        boolean z = false;
        Object obj = this.i;
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                C1495mP c1495mP = (C1495mP) ((InterfaceC0082Db) obj);
                c1495mP.getClass();
                int i2 = C0160Gb.e;
                C1334k c1334k = new C1334k(4, z);
                c1334k.i = null;
                c1334k.j = new ArrayList();
                c1334k.k = null;
                c1334k.l = "";
                HashMap hashMap = new HashMap();
                b = c1495mP.b();
                b.beginTransaction();
                try {
                    C0160Gb c0160Gb = (C0160Gb) C1495mP.v(b.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0165Gg(c1495mP, hashMap, c1334k, 3));
                    b.setTransactionSuccessful();
                    return c0160Gb;
                } finally {
                }
            case 8:
                C1495mP c1495mP2 = (C1495mP) ((InterfaceC0480Sk) obj);
                long a = c1495mP2.i.a() - c1495mP2.k.d;
                b = c1495mP2.b();
                b.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a)};
                    Cursor rawQuery = b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            c1495mP2.m(rawQuery.getInt(0), EnumC0824cB.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = b.delete("events", "timestamp_ms < ?", strArr);
                    b.setTransactionSuccessful();
                    b.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 9:
                C1495mP c1495mP3 = (C1495mP) ((AY) obj).i;
                b = c1495mP3.b();
                b.beginTransaction();
                try {
                    b.compileStatement("DELETE FROM log_event_dropped").execute();
                    b.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c1495mP3.i.a()).execute();
                    b.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                M10 m10 = (M10) obj;
                Iterator it = ((Iterable) ((C1495mP) m10.b).j(new C1574nc(17))).iterator();
                while (it.hasNext()) {
                    m10.c.a((F7) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.h) {
            case 0:
                ((AndroidAppCheckTokenProvider) this.i).lambda$new$0(provider);
                break;
            default:
                ((AndroidAuthTokenProvider) this.i).lambda$new$0(provider);
                break;
        }
    }

    @Override // o.InterfaceC0821c8
    public void u0(Object obj) {
        C1932t2 c1932t2 = (C1932t2) this.i;
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        ((C0260Jx) c1932t2.i).a(z);
    }
}
