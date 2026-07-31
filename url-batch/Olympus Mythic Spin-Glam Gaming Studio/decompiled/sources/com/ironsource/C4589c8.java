package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4589c8 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    /* renamed from: com.ironsource.c8$a */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        static class C1356a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            C1356a() {
            }

            C1356a a(String str) {
                this.d = str;
                return this;
            }

            C1356a b(String str) {
                this.g = str;
                return this;
            }

            C1356a c(String str) {
                this.b = str;
                return this;
            }

            C1356a d(String str) {
                this.c = str;
                return this;
            }

            C1356a a(int i) {
                this.e = i;
                return this;
            }

            C1356a b(int i) {
                this.f = i;
                return this;
            }

            C1356a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            C1356a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }
        }

        public a(C1356a c1356a) {
            this.a = c1356a.b;
            this.b = c1356a.c;
            this.c = c1356a.d;
            this.g = new ArrayList<>(c1356a.a);
            this.d = c1356a.e;
            this.e = c1356a.f;
            this.f = c1356a.g;
        }

        boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static Qd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C1356a c1356a = new a.C1356a();
        c1356a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c1356a.a());
    }

    public static Qd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C1356a c1356a = new a.C1356a();
        c1356a.c(str).a(str2).d("POST").a(list);
        return b(c1356a.a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:46:0x0067 */
    public static com.ironsource.Qd b(com.ironsource.C4589c8.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4589c8.b(com.ironsource.c8$a):com.ironsource.Qd");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty(NetworkUtils.HEADER_CONTENT_LENGTH, Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }
}
