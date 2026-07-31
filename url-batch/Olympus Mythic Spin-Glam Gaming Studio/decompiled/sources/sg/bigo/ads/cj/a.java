package sg.bigo.ads.cj;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes11.dex */
public final class a {
    @Nullable
    public static sg.bigo.ads.api.core.b a(@NonNull sg.bigo.ads.ai.n nVar, sg.bigo.ads.api.core.h hVar) {
        String[] strArr = {"slot"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb.append(strArr[0]);
            sb.append("=? ");
        }
        Cursor a = sg.bigo.ads.au.a.a("tb_addata", sb.toString(), new String[]{String.valueOf(nVar.l())}, null, 1);
        if (a != null) {
            if (a.moveToNext()) {
                long j = a.getLong(a.getColumnIndex("log_id"));
                String string = a.getString(a.getColumnIndex("ad_data"));
                long j2 = a.getLong(a.getColumnIndex(SDKConstants.PARAM_TOURNAMENTS_END_TIME));
                b a2 = b.a(j, hVar, nVar, string);
                if (a2 != null) {
                    a2.ah();
                    a2.a(j2);
                    return a2;
                }
            }
            a.close();
        }
        return null;
    }

    public static boolean a(@NonNull String str) {
        int b = sg.bigo.ads.au.a.b("tb_addata", "slot = '" + str + "'", null);
        u.a();
        return b > 0;
    }
}
