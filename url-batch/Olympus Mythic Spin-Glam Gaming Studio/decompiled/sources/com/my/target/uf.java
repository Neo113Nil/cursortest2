package com.my.target;

import com.ironsource.X3;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.qrcta.Position;
import com.my.target.common.models.qrcta.QrIcon;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class uf {
    private static final Position a = Position.newPosition(1, 1);

    public static QrIcon a(JSONObject jSONObject) {
        ImageData a2 = c6.a(jSONObject);
        if (a2 == null) {
            return null;
        }
        return QrIcon.newQrIconImage(a2, b(jSONObject.optJSONObject(X3.i.L)));
    }

    private static Position b(JSONObject jSONObject) {
        Position a2;
        return (jSONObject == null || (a2 = pe.a(jSONObject)) == null) ? a : a2;
    }
}
