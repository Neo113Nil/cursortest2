package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class R9 {

    class a extends GZIPOutputStream {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, int i) throws IOException {
            super(outputStream);
            this.a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i);
        }
    }

    public static byte[] a(String str, int i) throws Exception {
        byte[] bArr = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (OutOfMemoryError e) {
            C4782n4.d().a(e);
            String str2 = "Error while compressing:" + e.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return bArr;
        }
    }

    private static void b(String str) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.Y().q().a(new C4966x5(EnumC4984y5.TROUBLESHOOTING_FAILED_TO_GZIP, jsonObjectInit));
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (OutOfMemoryError e2) {
            C4782n4.d().a(e2);
            String str = "Error while decompressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }
}
